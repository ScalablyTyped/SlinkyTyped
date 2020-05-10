package typingsSlinky.twilioChat.memberMod

import typingsSlinky.twilioChat.sessionMod.Session
import typingsSlinky.twilioChat.usersMod.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberServices extends js.Object {
  var session: Session = js.native
  var users: Users = js.native
}

object MemberServices {
  @scala.inline
  def apply(session: Session, users: Users): MemberServices = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberServices]
  }
  @scala.inline
  implicit class MemberServicesOps[Self <: MemberServices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSession(value: Session): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
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

