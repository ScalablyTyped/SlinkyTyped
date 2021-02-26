package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a Stopped event on a BluetoothLEAdvertisementWatcher . */
@js.native
trait BluetoothLEAdvertisementWatcherStoppedEventArgs extends StObject {
  
  /** Gets the error status for Stopped event. */
  var error: BluetoothError = js.native
}
object BluetoothLEAdvertisementWatcherStoppedEventArgs {
  
  @scala.inline
  def apply(error: BluetoothError): BluetoothLEAdvertisementWatcherStoppedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementWatcherStoppedEventArgs]
  }
  
  @scala.inline
  implicit class BluetoothLEAdvertisementWatcherStoppedEventArgsMutableBuilder[Self <: BluetoothLEAdvertisementWatcherStoppedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: BluetoothError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
