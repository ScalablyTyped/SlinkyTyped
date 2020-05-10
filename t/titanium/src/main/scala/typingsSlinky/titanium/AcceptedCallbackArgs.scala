package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Network.Socket.TCP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument object passed to the [accepted](Titanium.Network.Socket.TCP.accepted)
  * callback when a listener accepts a connection.
  */
@js.native
trait AcceptedCallbackArgs extends js.Object {
  /**
  	 * Socket which represents the inbound connection.
  	 */
  var inbound: js.UndefOr[TCP] = js.native
  /**
  	 * Socket which received the connection.
  	 */
  var socket: js.UndefOr[TCP] = js.native
}

object AcceptedCallbackArgs {
  @scala.inline
  def apply(): AcceptedCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptedCallbackArgs]
  }
  @scala.inline
  implicit class AcceptedCallbackArgsOps[Self <: AcceptedCallbackArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInbound(value: TCP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inbound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInbound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inbound")(js.undefined)
        ret
    }
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

