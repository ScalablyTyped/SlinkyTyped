package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality to determine the Bluetooth Class Of Device (Bluetooth COD) information for a device. */
@js.native
trait BluetoothClassOfDevice extends js.Object {
  /** Gets the Major Class code of the Bluetooth device. */
  var majorClass: BluetoothMajorClass = js.native
  /** Gets the Minor Class code of the device. */
  var minorClass: BluetoothMinorClass = js.native
  /** Gets the Bluetooth Class Of Device information, represented as an integer value. */
  var rawValue: Double = js.native
  /** Gets the service capabilities of the device. */
  var serviceCapabilities: BluetoothServiceCapabilities = js.native
}

object BluetoothClassOfDevice {
  @scala.inline
  def apply(
    majorClass: BluetoothMajorClass,
    minorClass: BluetoothMinorClass,
    rawValue: Double,
    serviceCapabilities: BluetoothServiceCapabilities
  ): BluetoothClassOfDevice = {
    val __obj = js.Dynamic.literal(majorClass = majorClass.asInstanceOf[js.Any], minorClass = minorClass.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], serviceCapabilities = serviceCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothClassOfDevice]
  }
  @scala.inline
  implicit class BluetoothClassOfDeviceOps[Self <: BluetoothClassOfDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMajorClass(value: BluetoothMajorClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorClass(value: BluetoothMinorClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceCapabilities(value: BluetoothServiceCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

