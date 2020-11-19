package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Background

import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus
import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about a BluetoothLEAdvertisementPublisher trigger. */
@js.native
trait BluetoothLEAdvertisementPublisherTriggerDetails extends js.Object {
  
  /** Gets the error status for the trigger. */
  var error: BluetoothError = js.native
  
  /** Gets the current status of the BluetoothLEAdvertisementPublisher . */
  var status: BluetoothLEAdvertisementPublisherStatus = js.native
}
object BluetoothLEAdvertisementPublisherTriggerDetails {
  
  @scala.inline
  def apply(error: BluetoothError, status: BluetoothLEAdvertisementPublisherStatus): BluetoothLEAdvertisementPublisherTriggerDetails = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementPublisherTriggerDetails]
  }
  
  @scala.inline
  implicit class BluetoothLEAdvertisementPublisherTriggerDetailsOps[Self <: BluetoothLEAdvertisementPublisherTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: BluetoothError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: BluetoothLEAdvertisementPublisherStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
