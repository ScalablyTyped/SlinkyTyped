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
    def withCharacteristic(value: BluetoothRemoteGATTCharacteristic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadValue(value: () => js.Promise[js.typedarray.DataView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteValue(value: BufferSource => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: js.typedarray.DataView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

