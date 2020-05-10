package typingsSlinky.socks.constantsMod

import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocksClientEstablishedEvent extends js.Object {
  var remoteHost: js.UndefOr[SocksRemoteHost] = js.native
  var socket: Socket = js.native
}

object SocksClientEstablishedEvent {
  @scala.inline
  def apply(socket: Socket): SocksClientEstablishedEvent = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksClientEstablishedEvent]
  }
  @scala.inline
  implicit class SocksClientEstablishedEventOps[Self <: SocksClientEstablishedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSocket(value: Socket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteHost(value: SocksRemoteHost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteHost")(js.undefined)
        ret
    }
  }
  
}

