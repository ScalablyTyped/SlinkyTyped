package typingsSlinky.webBluetooth

import typingsSlinky.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothRemoteGATTDescriptor extends StObject {
  
  val characteristic: BluetoothRemoteGATTCharacteristic = js.native
  
  def readValue(): js.Promise[js.typedarray.DataView] = js.native
  
  val uuid: String = js.native
  
  val value: js.UndefOr[js.typedarray.DataView] = js.native
  
  def writeValue(value: BufferSource): js.Promise[Unit] = js.native
}
object BluetoothRemoteGATTDescriptor {
  
  @scala.inline
  def apply(
    characteristic: BluetoothRemoteGATTCharacteristic,
    readValue: () => js.Promise[js.typedarray.DataView],
    uuid: String,
    writeValue: BufferSource => js.Promise[Unit]
  ): BluetoothRemoteGATTDescriptor = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], readValue = js.Any.fromFunction0(readValue), uuid = uuid.asInstanceOf[js.Any], writeValue = js.Any.fromFunction1(writeValue))
    __obj.asInstanceOf[BluetoothRemoteGATTDescriptor]
  }
  
  @scala.inline
  implicit class BluetoothRemoteGATTDescriptorMutableBuilder[Self <: BluetoothRemoteGATTDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristic(value: BluetoothRemoteGATTCharacteristic): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadValue(value: () => js.Promise[js.typedarray.DataView]): Self = StObject.set(x, "readValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.typedarray.DataView): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWriteValue(value: BufferSource => js.Promise[Unit]): Self = StObject.set(x, "writeValue", js.Any.fromFunction1(value))
  }
}
