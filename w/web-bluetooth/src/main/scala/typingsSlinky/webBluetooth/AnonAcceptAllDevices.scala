package typingsSlinky.webBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAcceptAllDevices extends RequestDeviceOptions {
  var acceptAllDevices: Boolean = js.native
  var optionalServices: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.native
}

object AnonAcceptAllDevices {
  @scala.inline
  def apply(acceptAllDevices: Boolean): AnonAcceptAllDevices = {
    val __obj = js.Dynamic.literal(acceptAllDevices = acceptAllDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcceptAllDevices]
  }
  @scala.inline
  implicit class AnonAcceptAllDevicesOps[Self <: AnonAcceptAllDevices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptAllDevices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptAllDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionalServices(value: js.Array[BluetoothServiceUUID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalServices")(js.undefined)
        ret
    }
  }
  
}

