package typingsSlinky.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCode extends js.Object {
  var code: Boolean = js.native
  var pre: Boolean = js.native
  var script: Boolean = js.native
  var style: Boolean = js.native
  var textarea: Boolean = js.native
}

object AnonCode {
  @scala.inline
  def apply(code: Boolean, pre: Boolean, script: Boolean, style: Boolean, textarea: Boolean): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
  @scala.inline
  implicit class AnonCodeOps[Self <: AnonCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPre(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextarea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textarea")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

