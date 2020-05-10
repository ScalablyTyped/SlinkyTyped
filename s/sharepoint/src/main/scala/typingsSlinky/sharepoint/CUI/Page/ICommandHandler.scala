package typingsSlinky.sharepoint.CUI.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommandHandler extends js.Object {
  def canHandleCommand(commandId: String): Boolean = js.native
  def handleCommand(commandId: String, properties: js.Any, sequenceNumber: Double): Boolean = js.native
}

object ICommandHandler {
  @scala.inline
  def apply(canHandleCommand: String => Boolean, handleCommand: (String, js.Any, Double) => Boolean): ICommandHandler = {
    val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), handleCommand = js.Any.fromFunction3(handleCommand))
    __obj.asInstanceOf[ICommandHandler]
  }
  @scala.inline
  implicit class ICommandHandlerOps[Self <: ICommandHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanHandleCommand(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canHandleCommand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandleCommand(value: (String, js.Any, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleCommand")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

