package typingsSlinky.webdriverJsExtender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefineCommand extends js.Object {
  def defineCommand(name: String, method: String, path: String): Unit = js.native
}

object AnonDefineCommand {
  @scala.inline
  def apply(defineCommand: (String, String, String) => Unit): AnonDefineCommand = {
    val __obj = js.Dynamic.literal(defineCommand = js.Any.fromFunction3(defineCommand))
    __obj.asInstanceOf[AnonDefineCommand]
  }
  @scala.inline
  implicit class AnonDefineCommandOps[Self <: AnonDefineCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefineCommand(value: (String, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defineCommand")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

