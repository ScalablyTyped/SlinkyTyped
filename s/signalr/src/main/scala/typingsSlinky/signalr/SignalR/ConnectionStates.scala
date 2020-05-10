package typingsSlinky.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionStates extends js.Object {
  var connected: Double = js.native
  var connecting: Double = js.native
  var disconnected: Double = js.native
  var reconnecting: Double = js.native
}

object ConnectionStates {
  @scala.inline
  def apply(connected: Double, connecting: Double, disconnected: Double, reconnecting: Double): ConnectionStates = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], connecting = connecting.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], reconnecting = reconnecting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStates]
  }
  @scala.inline
  implicit class ConnectionStatesOps[Self <: ConnectionStates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnecting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connecting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisconnected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReconnecting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnecting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

