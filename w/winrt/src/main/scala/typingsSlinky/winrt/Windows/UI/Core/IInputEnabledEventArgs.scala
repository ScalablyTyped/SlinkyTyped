package typingsSlinky.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInputEnabledEventArgs extends ICoreWindowEventArgs {
  var inputEnabled: Boolean = js.native
}

object IInputEnabledEventArgs {
  @scala.inline
  def apply(handled: Boolean, inputEnabled: Boolean): IInputEnabledEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], inputEnabled = inputEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputEnabledEventArgs]
  }
  @scala.inline
  implicit class IInputEnabledEventArgsOps[Self <: IInputEnabledEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

