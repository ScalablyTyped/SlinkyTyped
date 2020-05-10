package typingsSlinky.twilioSync.servicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notifications extends js.Object {
  var connectionState: js.Any = js.native
  def updateToken(token: String): js.Promise[Notifications] = js.native
}

object Notifications {
  @scala.inline
  def apply(connectionState: js.Any, updateToken: String => js.Promise[Notifications]): Notifications = {
    val __obj = js.Dynamic.literal(connectionState = connectionState.asInstanceOf[js.Any], updateToken = js.Any.fromFunction1(updateToken))
    __obj.asInstanceOf[Notifications]
  }
  @scala.inline
  implicit class NotificationsOps[Self <: Notifications] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateToken(value: String => js.Promise[Notifications]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateToken")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

