package typingsSlinky.winrt.Windows.UI.Popups

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUICommandFactory extends js.Object {
  def create(label: String): UICommand = js.native
  def createWithHandler(label: String, action: UICommandInvokedHandler): UICommand = js.native
  def createWithHandlerAndId(label: String, action: UICommandInvokedHandler, commandId: js.Any): UICommand = js.native
}

object IUICommandFactory {
  @scala.inline
  def apply(
    create: String => UICommand,
    createWithHandler: (String, UICommandInvokedHandler) => UICommand,
    createWithHandlerAndId: (String, UICommandInvokedHandler, js.Any) => UICommand
  ): IUICommandFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createWithHandler = js.Any.fromFunction2(createWithHandler), createWithHandlerAndId = js.Any.fromFunction3(createWithHandlerAndId))
    __obj.asInstanceOf[IUICommandFactory]
  }
  @scala.inline
  implicit class IUICommandFactoryOps[Self <: IUICommandFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: String => UICommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateWithHandler(value: (String, UICommandInvokedHandler) => UICommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWithHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateWithHandlerAndId(value: (String, UICommandInvokedHandler, js.Any) => UICommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWithHandlerAndId")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

