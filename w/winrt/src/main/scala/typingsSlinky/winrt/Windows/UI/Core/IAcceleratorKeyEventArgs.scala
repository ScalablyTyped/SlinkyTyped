package typingsSlinky.winrt.Windows.UI.Core

import typingsSlinky.winrt.Windows.System.VirtualKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAcceleratorKeyEventArgs extends ICoreWindowEventArgs {
  var eventType: CoreAcceleratorKeyEventType = js.native
  var keyStatus: CorePhysicalKeyStatus = js.native
  var virtualKey: VirtualKey = js.native
}

object IAcceleratorKeyEventArgs {
  @scala.inline
  def apply(
    eventType: CoreAcceleratorKeyEventType,
    handled: Boolean,
    keyStatus: CorePhysicalKeyStatus,
    virtualKey: VirtualKey
  ): IAcceleratorKeyEventArgs = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], keyStatus = keyStatus.asInstanceOf[js.Any], virtualKey = virtualKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAcceleratorKeyEventArgs]
  }
  @scala.inline
  implicit class IAcceleratorKeyEventArgsOps[Self <: IAcceleratorKeyEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventType(value: CoreAcceleratorKeyEventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
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

