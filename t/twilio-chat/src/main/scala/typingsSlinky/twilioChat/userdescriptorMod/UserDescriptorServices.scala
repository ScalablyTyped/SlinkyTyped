package typingsSlinky.twilioChat.userdescriptorMod

import typingsSlinky.twilioChat.usersMod.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserDescriptorServices extends js.Object {
  var users: Users = js.native
}

object UserDescriptorServices {
  @scala.inline
  def apply(users: Users): UserDescriptorServices = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDescriptorServices]
  }
  @scala.inline
  implicit class UserDescriptorServicesOps[Self <: UserDescriptorServices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsers(value: Users): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

