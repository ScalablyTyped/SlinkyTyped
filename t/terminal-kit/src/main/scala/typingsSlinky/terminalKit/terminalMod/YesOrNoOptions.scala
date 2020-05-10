package typingsSlinky.terminalKit.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YesOrNoOptions extends js.Object {
  var echoNo: js.UndefOr[String] = js.native
  var echoYes: js.UndefOr[String] = js.native
  var no: String | js.Array[String] = js.native
  var yes: String | js.Array[String] = js.native
}

object YesOrNoOptions {
  @scala.inline
  def apply(no: String | js.Array[String], yes: String | js.Array[String]): YesOrNoOptions = {
    val __obj = js.Dynamic.literal(no = no.asInstanceOf[js.Any], yes = yes.asInstanceOf[js.Any])
    __obj.asInstanceOf[YesOrNoOptions]
  }
  @scala.inline
  implicit class YesOrNoOptionsOps[Self <: YesOrNoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNo(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYes(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEchoNo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoNo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEchoNo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoNo")(js.undefined)
        ret
    }
    @scala.inline
    def withEchoYes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoYes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEchoYes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoYes")(js.undefined)
        ret
    }
  }
  
}

