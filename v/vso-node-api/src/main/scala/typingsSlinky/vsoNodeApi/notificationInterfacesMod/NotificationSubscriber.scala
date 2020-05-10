package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSubscriber extends js.Object {
  /**
    * Indicates how the subscriber should be notified by default.
    */
  var deliveryPreference: NotificationSubscriberDeliveryPreference = js.native
  var flags: SubscriberFlags = js.native
  /**
    * Identifier of the subscriber.
    */
  var id: String = js.native
  /**
    * Preferred email address of the subscriber. A null or empty value indicates no preferred email address has been set.
    */
  var preferredEmailAddress: String = js.native
}

object NotificationSubscriber {
  @scala.inline
  def apply(
    deliveryPreference: NotificationSubscriberDeliveryPreference,
    flags: SubscriberFlags,
    id: String,
    preferredEmailAddress: String
  ): NotificationSubscriber = {
    val __obj = js.Dynamic.literal(deliveryPreference = deliveryPreference.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], preferredEmailAddress = preferredEmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSubscriber]
  }
  @scala.inline
  implicit class NotificationSubscriberOps[Self <: NotificationSubscriber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryPreference(value: NotificationSubscriberDeliveryPreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: SubscriberFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferredEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

