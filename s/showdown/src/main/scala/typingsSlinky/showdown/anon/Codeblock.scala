package typingsSlinky.showdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Codeblock extends js.Object {
  var codeblock: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
}

object Codeblock {
  @scala.inline
  def apply(): Codeblock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Codeblock]
  }
  @scala.inline
  implicit class CodeblockOps[Self <: Codeblock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeblock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeblock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeblock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeblock")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

