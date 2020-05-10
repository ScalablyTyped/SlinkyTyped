package typingsSlinky.winrt.Windows.Networking.Proximity

import typingsSlinky.winrt.Windows.Networking.Sockets.StreamSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITriggeredConnectionStateChangedEventArgs extends js.Object {
  var id: Double = js.native
  var socket: StreamSocket = js.native
  var state: TriggeredConnectState = js.native
}

object ITriggeredConnectionStateChangedEventArgs {
  @scala.inline
  def apply(id: Double, socket: StreamSocket, state: TriggeredConnectState): ITriggeredConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITriggeredConnectionStateChangedEventArgs]
  }
  @scala.inline
  implicit class ITriggeredConnectionStateChangedEventArgsOps[Self <: ITriggeredConnectionStateChangedEventArgs] (val x: Self) extends AnyVal {
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

