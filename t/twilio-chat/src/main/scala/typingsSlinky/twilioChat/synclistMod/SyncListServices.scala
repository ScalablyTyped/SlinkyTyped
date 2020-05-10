package typingsSlinky.twilioChat.synclistMod

import typingsSlinky.twilioChat.networkMod.Network
import typingsSlinky.twilioChat.sessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncListServices extends js.Object {
  var network: Network = js.native
  var session: Session = js.native
}

object SyncListServices {
  @scala.inline
  def apply(network: Network, session: Session): SyncListServices = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncListServices]
  }
  @scala.inline
  implicit class SyncListServicesOps[Self <: SyncListServices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetwork(value: Network): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: Session): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

