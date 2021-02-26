package typingsSlinky.winrtUwp.Windows.ApplicationModel.Background

import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that is registered to advertise a Bluetooth LE advertisement in the background. */
@js.native
trait BluetoothLEAdvertisementPublisherTrigger extends StObject {
  
  /** Gets the Bluetooth LE advertisement to configure and publish in the background. */
  var advertisement: BluetoothLEAdvertisement = js.native
}
object BluetoothLEAdvertisementPublisherTrigger {
  
  @scala.inline
  def apply(advertisement: BluetoothLEAdvertisement): BluetoothLEAdvertisementPublisherTrigger = {
    val __obj = js.Dynamic.literal(advertisement = advertisement.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementPublisherTrigger]
  }
  
  @scala.inline
  implicit class BluetoothLEAdvertisementPublisherTriggerMutableBuilder[Self <: BluetoothLEAdvertisementPublisherTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertisement(value: BluetoothLEAdvertisement): Self = StObject.set(x, "advertisement", value.asInstanceOf[js.Any])
  }
}
