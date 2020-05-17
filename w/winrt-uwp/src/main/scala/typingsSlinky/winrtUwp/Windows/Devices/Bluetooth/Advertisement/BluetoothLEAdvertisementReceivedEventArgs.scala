package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a Received event on a BluetoothLEAdvertisementWatcher . */
@js.native
trait BluetoothLEAdvertisementReceivedEventArgs extends js.Object {
  /** Gets the Bluetooth LE advertisement payload data received. */
  var advertisement: BluetoothLEAdvertisement = js.native
  /** Gets the type of the received Bluetooth LE advertisement packet. */
  var advertisementType: BluetoothLEAdvertisementType = js.native
  /** Gets the Bluetooth address of the device sending the Bluetooth LE advertisement. */
  var bluetoothAddress: Double = js.native
  /** Gets the received signal strength indicator (RSSI) value, in dBm, for this received Bluetooth LE advertisement event. */
  var rawSignalStrengthInDBm: Double = js.native
  /** Gets the timestamp when the Received event occurred. */
  var timestamp: js.Date = js.native
}

object BluetoothLEAdvertisementReceivedEventArgs {
  @scala.inline
  def apply(
    advertisement: BluetoothLEAdvertisement,
    advertisementType: BluetoothLEAdvertisementType,
    bluetoothAddress: Double,
    rawSignalStrengthInDBm: Double,
    timestamp: js.Date
  ): BluetoothLEAdvertisementReceivedEventArgs = {
    val __obj = js.Dynamic.literal(advertisement = advertisement.asInstanceOf[js.Any], advertisementType = advertisementType.asInstanceOf[js.Any], bluetoothAddress = bluetoothAddress.asInstanceOf[js.Any], rawSignalStrengthInDBm = rawSignalStrengthInDBm.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementReceivedEventArgs]
  }
  @scala.inline
  implicit class BluetoothLEAdvertisementReceivedEventArgsOps[Self <: BluetoothLEAdvertisementReceivedEventArgs] (val x: Self) extends AnyVal {
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
    def withAdvertisementType(value: BluetoothLEAdvertisementType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBluetoothAddress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawSignalStrengthInDBm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawSignalStrengthInDBm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

