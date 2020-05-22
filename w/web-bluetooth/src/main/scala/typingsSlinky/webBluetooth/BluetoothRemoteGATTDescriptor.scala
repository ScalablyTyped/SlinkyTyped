package typingsSlinky.webBluetooth

import typingsSlinky.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothRemoteGATTDescriptor extends js.Object {
  val characteristic: BluetoothRemoteGATTCharacteristic
  val uuid: String
  val value: js.UndefOr[js.typedarray.DataView] = js.undefined
  def readValue(): js.Promise[js.typedarray.DataView]
  def writeValue(value: BufferSource): js.Promise[Unit]
}

object BluetoothRemoteGATTDescriptor {
  @scala.inline
  def apply(
    characteristic: BluetoothRemoteGATTCharacteristic,
    readValue: () => js.Promise[js.typedarray.DataView],
    uuid: String,
    writeValue: BufferSource => js.Promise[Unit],
    value: js.typedarray.DataView = null
  ): BluetoothRemoteGATTDescriptor = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], readValue = js.Any.fromFunction0(readValue), uuid = uuid.asInstanceOf[js.Any], writeValue = js.Any.fromFunction1(writeValue))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothRemoteGATTDescriptor]
  }
}

