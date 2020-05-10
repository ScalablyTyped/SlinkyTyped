package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Network.Socket.TCP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument object passed to the [connected](Titanium.Network.Socket.TCP.connected) callback when the socket connects.
  */
@js.native
trait ConnectedCallbackArgs extends js.Object {
  /**
  	 * Socket instance that has been connected.
  	 */
  var socket: js.UndefOr[TCP] = js.native
}

object ConnectedCallbackArgs {
  @scala.inline
  def apply(): ConnectedCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectedCallbackArgs]
  }
  @scala.inline
  implicit class ConnectedCallbackArgsOps[Self <: ConnectedCallbackArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSocket(value: TCP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(js.undefined)
        ret
    }
  }
  
}

