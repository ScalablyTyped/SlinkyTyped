package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when receiving pending or local notifications
  * in <Titanium.App.iOS.UserNotificationCenter.getPendingNotifications> and
  * <Titanium.App.iOS.UserNotificationCenter.getDeliveredNotifications>.
  */
@js.native
trait UserNotificationCallbackResponse extends js.Object {
  /**
  	 * An array of identifiers used to create notifications.
  	 */
  var notifications: js.UndefOr[js.Array[UserNotificationDictionary]] = js.native
}

object UserNotificationCallbackResponse {
  @scala.inline
  def apply(): UserNotificationCallbackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserNotificationCallbackResponse]
  }
  @scala.inline
  implicit class UserNotificationCallbackResponseOps[Self <: UserNotificationCallbackResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotifications(value: js.Array[UserNotificationDictionary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(js.undefined)
        ret
    }
  }
  
}

