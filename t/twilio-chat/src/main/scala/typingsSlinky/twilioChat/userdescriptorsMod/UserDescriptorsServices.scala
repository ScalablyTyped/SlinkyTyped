package typingsSlinky.twilioChat.userdescriptorsMod

import typingsSlinky.twilioChat.networkMod.Network
import typingsSlinky.twilioChat.usersMod.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserDescriptorsServices extends js.Object {
  var network: Network = js.native
  var users: Users = js.native
}

object UserDescriptorsServices {
  @scala.inline
  def apply(network: Network, users: Users): UserDescriptorsServices = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDescriptorsServices]
  }
  @scala.inline
  implicit class UserDescriptorsServicesOps[Self <: UserDescriptorsServices] (val x: Self) extends AnyVal {
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
    def withUsers(value: Users): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

