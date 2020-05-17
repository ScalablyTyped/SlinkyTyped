package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Bluetooth LE manufacturer-specific data section (one particular type of LE advertisement section) */
@js.native
trait BluetoothLEManufacturerData extends js.Object {
  /** The Bluetooth LE company identifier code as defined by the Bluetooth Special Interest Group (SIG). */
  var companyId: Double = js.native
  /** Bluetooth LE manufacturer-specific section data. */
  var data: IBuffer = js.native
}

object BluetoothLEManufacturerData {
  @scala.inline
  def apply(companyId: Double, data: IBuffer): BluetoothLEManufacturerData = {
    val __obj = js.Dynamic.literal(companyId = companyId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEManufacturerData]
  }
  @scala.inline
  implicit class BluetoothLEManufacturerDataOps[Self <: BluetoothLEManufacturerData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompanyId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

