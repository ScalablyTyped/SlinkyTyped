package typingsSlinky.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Notification Item
  */
@js.native
trait INotificationItem extends js.Object {
  /*Collection of button actions to append (label, func, cssClass)*/
  var actions: js.Array[IButtonAction] = js.native
  /*Short headline*/
  var headline: String = js.native
  /*longer text for the notication, trimmed after 200 characters, which can then be exanded*/
  var message: String = js.native
  /*if set to true, the notification will not auto- close*/
  var sticky: Boolean = js.native
  /*Notification type, can be: "success", "warning", "error" or "info"*/
  var `type`: NotificationType = js.native
  /*url to open when notification is clicked*/
  var url: String = js.native
  /*path to custom view to load into the notification box*/
  var view: String = js.native
}

object INotificationItem {
  @scala.inline
  def apply(
    actions: js.Array[IButtonAction],
    headline: String,
    message: String,
    sticky: Boolean,
    `type`: NotificationType,
    url: String,
    view: String
  ): INotificationItem = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], headline = headline.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotificationItem]
  }
  @scala.inline
  implicit class INotificationItemOps[Self <: INotificationItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[IButtonAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSticky(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: NotificationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

