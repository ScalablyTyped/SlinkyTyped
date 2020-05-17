package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Background

import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice
import typingsSlinky.winrtUwp.Windows.Networking.Sockets.StreamSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the Bluetooth device that caused this trigger to fire. */
@js.native
trait RfcommConnectionTriggerDetails extends js.Object {
  /** Gets whether this is an incoming connection. */
  var incoming: Boolean = js.native
  /** Gets the BluetoothDevice object that represents the remote device. */
  var remoteDevice: BluetoothDevice = js.native
  /** Gets a reference to the underlying StreamSocket of this connection. */
  var socket: StreamSocket = js.native
}

object RfcommConnectionTriggerDetails {
  @scala.inline
  def apply(incoming: Boolean, remoteDevice: BluetoothDevice, socket: StreamSocket): RfcommConnectionTriggerDetails = {
    val __obj = js.Dynamic.literal(incoming = incoming.asInstanceOf[js.Any], remoteDevice = remoteDevice.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[RfcommConnectionTriggerDetails]
  }
  @scala.inline
  implicit class RfcommConnectionTriggerDetailsOps[Self <: RfcommConnectionTriggerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncoming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incoming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteDevice(value: BluetoothDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocket(value: StreamSocket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

