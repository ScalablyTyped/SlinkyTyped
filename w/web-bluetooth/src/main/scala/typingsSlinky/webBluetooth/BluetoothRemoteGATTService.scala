package typingsSlinky.webBluetooth

import org.scalajs.dom.raw.Event
import typingsSlinky.std.EventTarget
import typingsSlinky.webBluetooth.webBluetoothStrings.serviceadded
import typingsSlinky.webBluetooth.webBluetoothStrings.servicechanged
import typingsSlinky.webBluetooth.webBluetoothStrings.serviceremoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothRemoteGATTService
  extends EventTarget
     with CharacteristicEventHandlers
     with ServiceEventHandlers {
  val device: BluetoothDevice = js.native
  val isPrimary: Boolean = js.native
  val uuid: String = js.native
  @JSName("addEventListener")
  def addEventListener_serviceadded(`type`: serviceadded, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_serviceadded(
    `type`: serviceadded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_servicechanged(`type`: servicechanged, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_servicechanged(
    `type`: servicechanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_serviceremoved(`type`: serviceremoved, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_serviceremoved(
    `type`: serviceremoved,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  def getCharacteristic(characteristic: BluetoothCharacteristicUUID): js.Promise[BluetoothRemoteGATTCharacteristic] = js.native
  def getCharacteristics(): js.Promise[js.Array[BluetoothRemoteGATTCharacteristic]] = js.native
  def getCharacteristics(characteristic: BluetoothCharacteristicUUID): js.Promise[js.Array[BluetoothRemoteGATTCharacteristic]] = js.native
  def getIncludedService(service: BluetoothServiceUUID): js.Promise[BluetoothRemoteGATTService] = js.native
  def getIncludedServices(): js.Promise[js.Array[BluetoothRemoteGATTService]] = js.native
  def getIncludedServices(service: BluetoothServiceUUID): js.Promise[js.Array[BluetoothRemoteGATTService]] = js.native
}

