package typingsSlinky.smartFoxServer.SFS2X

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IINVITATION_REPLY extends js.Object {
  var data: js.Object = js.native
  var invitee: SFSUser = js.native
  var reply: Double = js.native
}

object IINVITATION_REPLY {
  @scala.inline
  def apply(data: js.Object, invitee: SFSUser, reply: Double): IINVITATION_REPLY = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], invitee = invitee.asInstanceOf[js.Any], reply = reply.asInstanceOf[js.Any])
    __obj.asInstanceOf[IINVITATION_REPLY]
  }
  @scala.inline
  implicit class IINVITATION_REPLYOps[Self <: IINVITATION_REPLY] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvitee(value: SFSUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReply(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

