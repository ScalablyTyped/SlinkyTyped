package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationQueryCondition extends js.Object {
  var eventInitiator: String = js.native
  var eventType: String = js.native
  var subscriber: String = js.native
  var subscriptionId: String = js.native
}

object NotificationQueryCondition {
  @scala.inline
  def apply(eventInitiator: String, eventType: String, subscriber: String, subscriptionId: String): NotificationQueryCondition = {
    val __obj = js.Dynamic.literal(eventInitiator = eventInitiator.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], subscriber = subscriber.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationQueryCondition]
  }
  @scala.inline
  implicit class NotificationQueryConditionOps[Self <: NotificationQueryCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventInitiator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventInitiator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

