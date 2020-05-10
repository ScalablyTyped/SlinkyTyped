package typingsSlinky.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddControlNotificationOptions extends js.Object {
  /**
    * A collection of actions
    */
  var actions: js.UndefOr[js.Array[ControlNotificationAction]] = js.native
  /**
    * The message to display in the notification.
    * In the current release, only the first message specified in this array will be displayed.
    */
  var messages: js.Array[String] = js.native
  /**
    * Defines the type of notification.
    */
  var notificationLevel: js.UndefOr[NotificationLevel] = js.native
  /**
    * The ID to use to clear this notification when using the clearNotification method.
    */
  var uniqueId: String = js.native
}

object AddControlNotificationOptions {
  @scala.inline
  def apply(messages: js.Array[String], uniqueId: String): AddControlNotificationOptions = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddControlNotificationOptions]
  }
  @scala.inline
  implicit class AddControlNotificationOptionsOps[Self <: AddControlNotificationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActions(value: js.Array[ControlNotificationAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationLevel(value: NotificationLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationLevel")(js.undefined)
        ret
    }
  }
  
}

