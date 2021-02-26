package typingsSlinky.winrtUwp.Windows.ApplicationModel.Background

import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFilter
import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothSignalStrengthFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that is registered to scan for Bluetooth LE advertisement in the background. */
@js.native
trait BluetoothLEAdvertisementWatcherTrigger extends StObject {
  
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
  implicit class BluetoothLEAdvertisementWatcherTriggerMutableBuilder[Self <: BluetoothLEAdvertisementWatcherTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertisementFilter(value: BluetoothLEAdvertisementFilter): Self = StObject.set(x, "advertisementFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxOutOfRangeTimeout(value: Double): Self = StObject.set(x, "maxOutOfRangeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSamplingInterval(value: Double): Self = StObject.set(x, "maxSamplingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinOutOfRangeTimeout(value: Double): Self = StObject.set(x, "minOutOfRangeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSamplingInterval(value: Double): Self = StObject.set(x, "minSamplingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalStrengthFilter(value: BluetoothSignalStrengthFilter): Self = StObject.set(x, "signalStrengthFilter", value.asInstanceOf[js.Any])
  }
}
