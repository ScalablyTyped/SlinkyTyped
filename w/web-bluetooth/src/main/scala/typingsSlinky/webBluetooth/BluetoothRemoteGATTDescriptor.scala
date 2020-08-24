package typingsSlinky.webBluetooth

import typingsSlinky.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothRemoteGATTDescriptor extends js.Object {
  val characteristic: BluetoothRemoteGATTCharacteristic = js.native
  val uuid: String = js.native
  val value: js.UndefOr[js.typedarray.DataView] = js.native
  def readValue(): js.Promise[js.typedarray.DataView] = js.native
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
  implicit class BluetoothRemoteGATTDescriptorOps[Self <: BluetoothRemoteGATTDescriptor] (val x: Self) extends AnyVal {
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
    def setCharacteristic(value: BluetoothRemoteGATTCharacteristic): Self = this.set("characteristic", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadValue(value: () => js.Promise[js.typedarray.DataView]): Self = this.set("readValue", js.Any.fromFunction0(value))
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setWriteValue(value: BufferSource => js.Promise[Unit]): Self = this.set("writeValue", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: js.typedarray.DataView): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

