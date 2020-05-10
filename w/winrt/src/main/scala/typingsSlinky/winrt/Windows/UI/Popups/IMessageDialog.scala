package typingsSlinky.winrt.Windows.UI.Popups

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessageDialog extends js.Object {
  var cancelCommandIndex: Double = js.native
  var commands: IVector[IUICommand] = js.native
  var content: String = js.native
  var defaultCommandIndex: Double = js.native
  var options: MessageDialogOptions = js.native
  var title: String = js.native
  def showAsync(): IAsyncOperation[IUICommand] = js.native
}

object IMessageDialog {
  @scala.inline
  def apply(
    cancelCommandIndex: Double,
    commands: IVector[IUICommand],
    content: String,
    defaultCommandIndex: Double,
    options: MessageDialogOptions,
    showAsync: () => IAsyncOperation[IUICommand],
    title: String
  ): IMessageDialog = {
    val __obj = js.Dynamic.literal(cancelCommandIndex = cancelCommandIndex.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], defaultCommandIndex = defaultCommandIndex.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], showAsync = js.Any.fromFunction0(showAsync), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageDialog]
  }
  @scala.inline
  implicit class IMessageDialogOps[Self <: IMessageDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelCommandIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelCommandIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommands(value: IVector[IUICommand]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultCommandIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCommandIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: MessageDialogOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowAsync(value: () => IAsyncOperation[IUICommand]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

