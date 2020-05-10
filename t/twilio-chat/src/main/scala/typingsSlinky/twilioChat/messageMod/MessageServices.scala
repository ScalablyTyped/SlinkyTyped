package typingsSlinky.twilioChat.messageMod

import typingsSlinky.twilioChat.sessionMod.Session
import typingsSlinky.twilioMcsClient.mod.McsClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageServices extends js.Object {
  var mcsClient: McsClient = js.native
  var session: Session = js.native
}

object MessageServices {
  @scala.inline
  def apply(mcsClient: McsClient, session: Session): MessageServices = {
    val __obj = js.Dynamic.literal(mcsClient = mcsClient.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageServices]
  }
  @scala.inline
  implicit class MessageServicesOps[Self <: MessageServices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMcsClient(value: McsClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mcsClient")(value.asInstanceOf[js.Any])
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

