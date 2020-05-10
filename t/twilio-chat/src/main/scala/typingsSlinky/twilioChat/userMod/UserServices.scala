package typingsSlinky.twilioChat.userMod

import typingsSlinky.twilioChat.sessionMod.Session
import typingsSlinky.twilioSync.mod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserServices extends js.Object {
  var session: Session = js.native
  var syncClient: SyncClient = js.native
}

object UserServices {
  @scala.inline
  def apply(session: Session, syncClient: SyncClient): UserServices = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserServices]
  }
  @scala.inline
  implicit class UserServicesOps[Self <: UserServices] (val x: Self) extends AnyVal {
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
    def withSyncClient(value: SyncClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncClient")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

