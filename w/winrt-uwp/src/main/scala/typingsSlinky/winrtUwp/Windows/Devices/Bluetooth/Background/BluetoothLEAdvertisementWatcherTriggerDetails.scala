package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Background

import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementReceivedEventArgs
import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothError
import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothSignalStrengthFilter
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a BluetoothLEAdvertisementWatcher trigger. */
@js.native
trait BluetoothLEAdvertisementWatcherTriggerDetails extends js.Object {
  /** Gets a collection of Bluetooth LE advertisements. */
  var advertisements: IVectorView[BluetoothLEAdvertisementReceivedEventArgs] = js.native
  /** Gets the error status for the trigger. */
  var error: BluetoothError = js.native
  /** Gets the parameters used to configure received signal strength indicator (RSSI)-based filtering. */
  var signalStrengthFilter: BluetoothSignalStrengthFilter = js.native
}

object BluetoothLEAdvertisementWatcherTriggerDetails {
  @scala.inline
  def apply(
    advertisements: IVectorView[BluetoothLEAdvertisementReceivedEventArgs],
    error: BluetoothError,
    signalStrengthFilter: BluetoothSignalStrengthFilter
  ): BluetoothLEAdvertisementWatcherTriggerDetails = {
    val __obj = js.Dynamic.literal(advertisements = advertisements.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], signalStrengthFilter = signalStrengthFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementWatcherTriggerDetails]
  }
  @scala.inline
  implicit class BluetoothLEAdvertisementWatcherTriggerDetailsOps[Self <: BluetoothLEAdvertisementWatcherTriggerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertisements(value: IVectorView[BluetoothLEAdvertisementReceivedEventArgs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: BluetoothError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignalStrengthFilter(value: BluetoothSignalStrengthFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalStrengthFilter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

