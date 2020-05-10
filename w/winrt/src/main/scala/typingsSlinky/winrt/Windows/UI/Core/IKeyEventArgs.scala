package typingsSlinky.winrt.Windows.UI.Core

import typingsSlinky.winrt.Windows.System.VirtualKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyEventArgs extends ICoreWindowEventArgs {
  var keyStatus: CorePhysicalKeyStatus = js.native
  var virtualKey: VirtualKey = js.native
}

object IKeyEventArgs {
  @scala.inline
  def apply(handled: Boolean, keyStatus: CorePhysicalKeyStatus, virtualKey: VirtualKey): IKeyEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], keyStatus = keyStatus.asInstanceOf[js.Any], virtualKey = virtualKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyEventArgs]
  }
  @scala.inline
  implicit class IKeyEventArgsOps[Self <: IKeyEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyStatus(value: CorePhysicalKeyStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualKey(value: VirtualKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

