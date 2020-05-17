package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Bluetooth LE advertisement byte pattern for filters to match. */
@js.native
trait BluetoothLEAdvertisementBytePattern extends js.Object {
  /** The Bluetooth LE advertisement data byte pattern to match. */
  var data: IBuffer = js.native
  /** The Bluetooth LE advertisement data type defined by the Bluetooth Special Interest Group (SIG) to match. */
  var dataType: Double = js.native
  /** The offset of byte pattern from beginning of advertisement data section. */
  var offset: Double = js.native
}

object BluetoothLEAdvertisementBytePattern {
  @scala.inline
  def apply(data: IBuffer, dataType: Double, offset: Double): BluetoothLEAdvertisementBytePattern = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementBytePattern]
  }
  @scala.inline
  implicit class BluetoothLEAdvertisementBytePatternOps[Self <: BluetoothLEAdvertisementBytePattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

