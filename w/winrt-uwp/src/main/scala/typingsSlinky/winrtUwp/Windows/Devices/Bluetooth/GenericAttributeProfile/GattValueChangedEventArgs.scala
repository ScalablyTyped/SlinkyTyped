package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value received when registering to receive notifications or indications from a Bluetooth LE device. */
@js.native
trait GattValueChangedEventArgs extends js.Object {
  
  /** Gets the new Characteristic Value. */
  var characteristicValue: IBuffer = js.native
  
  /** Gets the time at which the system was notified of the Characteristic Value change. */
  var timestamp: js.Date = js.native
}
object GattValueChangedEventArgs {
  
  @scala.inline
  def apply(characteristicValue: IBuffer, timestamp: js.Date): GattValueChangedEventArgs = {
    val __obj = js.Dynamic.literal(characteristicValue = characteristicValue.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattValueChangedEventArgs]
  }
  
  @scala.inline
  implicit class GattValueChangedEventArgsOps[Self <: GattValueChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCharacteristicValue(value: IBuffer): Self = this.set("characteristicValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
