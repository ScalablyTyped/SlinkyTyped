package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSubscriptionTemplate extends js.Object {
  var description: String = js.native
  var filter: ISubscriptionFilter = js.native
  var id: String = js.native
  var notificationEventInformation: NotificationEventType = js.native
  var `type`: SubscriptionTemplateType = js.native
}

object NotificationSubscriptionTemplate {
  @scala.inline
  def apply(
    description: String,
    filter: ISubscriptionFilter,
    id: String,
    notificationEventInformation: NotificationEventType,
    `type`: SubscriptionTemplateType
  ): NotificationSubscriptionTemplate = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], notificationEventInformation = notificationEventInformation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSubscriptionTemplate]
  }
  @scala.inline
  implicit class NotificationSubscriptionTemplateOps[Self <: NotificationSubscriptionTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: ISubscriptionFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationEventInformation(value: NotificationEventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationEventInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: SubscriptionTemplateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

