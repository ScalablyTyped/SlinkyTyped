package typingsSlinky.webpack

import typingsSlinky.webpack.mod.compilation.ModuleTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonJavascript extends js.Object {
  var javascript: ModuleTemplate = js.native
  var webassembly: ModuleTemplate = js.native
}

object AnonJavascript {
  @scala.inline
  def apply(javascript: ModuleTemplate, webassembly: ModuleTemplate): AnonJavascript = {
    val __obj = js.Dynamic.literal(javascript = javascript.asInstanceOf[js.Any], webassembly = webassembly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJavascript]
  }
  @scala.inline
  implicit class AnonJavascriptOps[Self <: AnonJavascript] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJavascript(value: ModuleTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javascript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebassembly(value: ModuleTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webassembly")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

