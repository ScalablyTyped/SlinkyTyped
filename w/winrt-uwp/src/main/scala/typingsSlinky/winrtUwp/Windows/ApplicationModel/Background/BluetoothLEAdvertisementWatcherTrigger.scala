package typingsSlinky.winrtUwp.Windows.ApplicationModel.Background

import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFilter
import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothSignalStrengthFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that is registered to scan for Bluetooth LE advertisement in the background. */
@js.native
trait BluetoothLEAdvertisementWatcherTrigger extends js.Object {
  /** Gets or sets the configuration of Bluetooth LE advertisement filtering that uses payload section-based filtering. */
  var advertisementFilter: BluetoothLEAdvertisementFilter = js.native
  /** Gets the maximum out of range timeout supported for the SignalStrengthFilter property of this trigger. */
  var maxOutOfRangeTimeout: Double = js.native
  /** Gets the maximum sampling interval supported for the SignalStrengthFilter property of this trigger. The maximum sampling interval is used to deactivate the sampling filter and only trigger received events based on the device coming in and out of range. */
  var maxSamplingInterval: Double = js.native
  /** Gets the minimum out of range timeout supported for the SignalStrengthFilter property of this trigger. */
  var minOutOfRangeTimeout: Double = js.native
  /** Gets the minimum sampling interval supported for the SignalStrengthFilter property of this trigger. The minimum sampling interval for the background watcher cannot be zero unlike its foreground counterpart. */
  var minSamplingInterval: Double = js.native
  /** Gets or sets the configuration of Bluetooth LE advertisement filtering that uses signal strength-based filtering. */
  var signalStrengthFilter: BluetoothSignalStrengthFilter = js.native
}

object BluetoothLEAdvertisementWatcherTrigger {
  @scala.inline
  def apply(
    advertisementFilter: BluetoothLEAdvertisementFilter,
    maxOutOfRangeTimeout: Double,
    maxSamplingInterval: Double,
    minOutOfRangeTimeout: Double,
    minSamplingInterval: Double,
    signalStrengthFilter: BluetoothSignalStrengthFilter
  ): BluetoothLEAdvertisementWatcherTrigger = {
    val __obj = js.Dynamic.literal(advertisementFilter = advertisementFilter.asInstanceOf[js.Any], maxOutOfRangeTimeout = maxOutOfRangeTimeout.asInstanceOf[js.Any], maxSamplingInterval = maxSamplingInterval.asInstanceOf[js.Any], minOutOfRangeTimeout = minOutOfRangeTimeout.asInstanceOf[js.Any], minSamplingInterval = minSamplingInterval.asInstanceOf[js.Any], signalStrengthFilter = signalStrengthFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementWatcherTrigger]
  }
  @scala.inline
  implicit class BluetoothLEAdvertisementWatcherTriggerOps[Self <: BluetoothLEAdvertisementWatcherTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertisementFilter(value: BluetoothLEAdvertisementFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisementFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxOutOfRangeTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOutOfRangeTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSamplingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSamplingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinOutOfRangeTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOutOfRangeTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinSamplingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSamplingInterval")(value.asInstanceOf[js.Any])
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

