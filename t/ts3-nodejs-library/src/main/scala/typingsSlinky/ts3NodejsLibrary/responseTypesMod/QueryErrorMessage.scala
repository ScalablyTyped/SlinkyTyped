package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryErrorMessage extends js.Object {
  var extra_msg: js.UndefOr[String] = js.native
  var failed_permid: js.UndefOr[Double] = js.native
  var id: Double = js.native
  var msg: String = js.native
}

object QueryErrorMessage {
  @scala.inline
  def apply(id: Double, msg: String): QueryErrorMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryErrorMessage]
  }
  @scala.inline
  implicit class QueryErrorMessageOps[Self <: QueryErrorMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra_msg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra_msg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_msg")(js.undefined)
        ret
    }
    @scala.inline
    def withFailed_permid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed_permid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailed_permid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed_permid")(js.undefined)
        ret
    }
  }
  
}

