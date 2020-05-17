package typingsSlinky.sharepoint.CUI.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandDispatcher extends js.Object {
  def executeCommand(commandId: String, properties: js.Any): js.Any = js.native
}

object CommandDispatcher {
  @scala.inline
  def apply(executeCommand: (String, js.Any) => js.Any): CommandDispatcher = {
    val __obj = js.Dynamic.literal(executeCommand = js.Any.fromFunction2(executeCommand))
    __obj.asInstanceOf[CommandDispatcher]
  }
  @scala.inline
  implicit class CommandDispatcherOps[Self <: CommandDispatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecuteCommand(value: (String, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeCommand")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

