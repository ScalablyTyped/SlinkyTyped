package typingsSlinky.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the DeviceSelected event on the DevicePicker object. */
@js.native
trait DeviceSelectedEventArgs extends js.Object {
  /** The device selected by the user in the picker. */
  var selectedDevice: DeviceInformation = js.native
}

object DeviceSelectedEventArgs {
  @scala.inline
  def apply(selectedDevice: DeviceInformation): DeviceSelectedEventArgs = {
    val __obj = js.Dynamic.literal(selectedDevice = selectedDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceSelectedEventArgs]
  }
  @scala.inline
  implicit class DeviceSelectedEventArgsOps[Self <: DeviceSelectedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedDevice(value: DeviceInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDevice")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

