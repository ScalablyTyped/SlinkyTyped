package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Groups parameters used to configure payload-based filtering of received Bluetooth LE advertisements. */
@js.native
trait BluetoothLEAdvertisementFilter extends js.Object {
  /** A BluetoothLEAdvertisement object that can be applied as filters to received Bluetooth LE advertisements. */
  var advertisement: BluetoothLEAdvertisement = js.native
  /** Gets a vector of byte patterns with offsets to match advertisement sections in a received Bluetooth LE advertisement. */
  var bytePatterns: IVector[BluetoothLEAdvertisementBytePattern] = js.native
}

object BluetoothLEAdvertisementFilter {
  @scala.inline
  def apply(
    advertisement: BluetoothLEAdvertisement,
    bytePatterns: IVector[BluetoothLEAdvertisementBytePattern]
  ): BluetoothLEAdvertisementFilter = {
    val __obj = js.Dynamic.literal(advertisement = advertisement.asInstanceOf[js.Any], bytePatterns = bytePatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementFilter]
  }
  @scala.inline
  implicit class BluetoothLEAdvertisementFilterOps[Self <: BluetoothLEAdvertisementFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertisement(value: BluetoothLEAdvertisement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytePatterns(value: IVector[BluetoothLEAdvertisementBytePattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytePatterns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

