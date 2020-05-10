package typingsSlinky.webBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothCharacteristicProperties extends js.Object {
  val authenticatedSignedWrites: Boolean = js.native
  val broadcast: Boolean = js.native
  val indicate: Boolean = js.native
  @JSName("notify")
  val notify_FBluetoothCharacteristicProperties: Boolean = js.native
  val read: Boolean = js.native
  val reliableWrite: Boolean = js.native
  val writableAuxiliaries: Boolean = js.native
  val write: Boolean = js.native
  val writeWithoutResponse: Boolean = js.native
}

object BluetoothCharacteristicProperties {
  @scala.inline
  def apply(
    authenticatedSignedWrites: Boolean,
    broadcast: Boolean,
    indicate: Boolean,
    notify: Boolean,
    read: Boolean,
    reliableWrite: Boolean,
    writableAuxiliaries: Boolean,
    write: Boolean,
    writeWithoutResponse: Boolean
  ): BluetoothCharacteristicProperties = {
    val __obj = js.Dynamic.literal(authenticatedSignedWrites = authenticatedSignedWrites.asInstanceOf[js.Any], broadcast = broadcast.asInstanceOf[js.Any], indicate = indicate.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], reliableWrite = reliableWrite.asInstanceOf[js.Any], writableAuxiliaries = writableAuxiliaries.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any], writeWithoutResponse = writeWithoutResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothCharacteristicProperties]
  }
  @scala.inline
  implicit class BluetoothCharacteristicPropertiesOps[Self <: BluetoothCharacteristicProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticatedSignedWrites(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticatedSignedWrites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBroadcast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReliableWrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reliableWrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritableAuxiliaries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writableAuxiliaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteWithoutResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeWithoutResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

