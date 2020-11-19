package typingsSlinky.webBluetooth

import org.scalajs.dom.raw.Event
import typingsSlinky.std.BufferSource
import typingsSlinky.std.EventTarget
import typingsSlinky.webBluetooth.webBluetoothStrings.characteristicvaluechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothRemoteGATTCharacteristic
  extends EventTarget
     with CharacteristicEventHandlers {
  
  @JSName("addEventListener")
  def addEventListener_characteristicvaluechanged(
    `type`: characteristicvaluechanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_characteristicvaluechanged(
    `type`: characteristicvaluechanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  
  def getDescriptor(descriptor: BluetoothDescriptorUUID): js.Promise[BluetoothRemoteGATTDescriptor] = js.native
  
  def getDescriptors(): js.Promise[js.Array[BluetoothRemoteGATTDescriptor]] = js.native
  def getDescriptors(descriptor: BluetoothDescriptorUUID): js.Promise[js.Array[BluetoothRemoteGATTDescriptor]] = js.native
  
  val properties: BluetoothCharacteristicProperties = js.native
  
  def readValue(): js.Promise[js.typedarray.DataView] = js.native
  
  val service: js.UndefOr[BluetoothRemoteGATTService] = js.native
  
  def startNotifications(): js.Promise[BluetoothRemoteGATTCharacteristic] = js.native
  
  def stopNotifications(): js.Promise[BluetoothRemoteGATTCharacteristic] = js.native
  
  val uuid: String = js.native
  
  val value: js.UndefOr[js.typedarray.DataView] = js.native
  
  def writeValue(value: BufferSource): js.Promise[Unit] = js.native
  
  def writeValueWithResponse(value: BufferSource): js.Promise[Unit] = js.native
  
  def writeValueWithoutResponse(value: BufferSource): js.Promise[Unit] = js.native
}
