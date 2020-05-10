package typingsSlinky.twilioChat.userchannelsMod

import typingsSlinky.twilioChat.networkMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserChannelServices extends js.Object {
  var network: Network = js.native
}

object UserChannelServices {
  @scala.inline
  def apply(network: Network): UserChannelServices = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserChannelServices]
  }
  @scala.inline
  implicit class UserChannelServicesOps[Self <: UserChannelServices] (val x: Self) extends AnyVal {
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
  }
  
}

