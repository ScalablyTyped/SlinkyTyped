package typingsSlinky.twilioChat.typingindicatorMod

import typingsSlinky.twilioChat.transportMod.Transport
import typingsSlinky.twilioNotifications.mod.Notifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypingIndicatorServices extends js.Object {
  var notificationClient: Notifications = js.native
  var transport: Transport = js.native
}

object TypingIndicatorServices {
  @scala.inline
  def apply(notificationClient: Notifications, transport: Transport): TypingIndicatorServices = {
    val __obj = js.Dynamic.literal(notificationClient = notificationClient.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypingIndicatorServices]
  }
  @scala.inline
  implicit class TypingIndicatorServicesOps[Self <: TypingIndicatorServices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotificationClient(value: Notifications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransport(value: Transport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

