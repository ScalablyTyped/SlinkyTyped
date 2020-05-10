package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSubscriberUpdateParameters extends js.Object {
  /**
    * New delivery preference for the subscriber (indicates how the subscriber should be notified).
    */
  var deliveryPreference: NotificationSubscriberDeliveryPreference = js.native
  /**
    * New preferred email address for the subscriber. Specify an empty string to clear the current address.
    */
  var preferredEmailAddress: String = js.native
}

object NotificationSubscriberUpdateParameters {
  @scala.inline
  def apply(deliveryPreference: NotificationSubscriberDeliveryPreference, preferredEmailAddress: String): NotificationSubscriberUpdateParameters = {
    val __obj = js.Dynamic.literal(deliveryPreference = deliveryPreference.asInstanceOf[js.Any], preferredEmailAddress = preferredEmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSubscriberUpdateParameters]
  }
  @scala.inline
  implicit class NotificationSubscriberUpdateParametersOps[Self <: NotificationSubscriberUpdateParameters] (val x: Self) extends AnyVal {
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
    def withPreferredEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

