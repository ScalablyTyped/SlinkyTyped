package typingsSlinky.winrtUwp.Windows.Networking.Proximity

import typingsSlinky.winrtUwp.Windows.Networking.Sockets.StreamSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains properties that the TriggeredConnectionStateChanged event passes to an application. */
@js.native
trait TriggeredConnectionStateChangedEventArgs extends js.Object {
  /** Gets the unique identifier for the connection in progress. */
  var id: Double = js.native
  /** Gets the StreamSocket instance for the connection. */
  var socket: StreamSocket = js.native
  /** Gets the state of the connection in progress. */
  var state: TriggeredConnectState = js.native
}

object TriggeredConnectionStateChangedEventArgs {
  @scala.inline
  def apply(id: Double, socket: StreamSocket, state: TriggeredConnectState): TriggeredConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggeredConnectionStateChangedEventArgs]
  }
  @scala.inline
  implicit class TriggeredConnectionStateChangedEventArgsOps[Self <: TriggeredConnectionStateChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocket(value: StreamSocket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: TriggeredConnectState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

