package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryPreferencesEditable extends js.Object {
  var deliveryPreferencesEditable: scala.Double = js.native
  var isGroup: scala.Double = js.native
  var isTeam: scala.Double = js.native
  var isUser: scala.Double = js.native
  var none: scala.Double = js.native
  var supportsEachMemberDelivery: scala.Double = js.native
  var supportsNoDelivery: scala.Double = js.native
  var supportsPreferredEmailAddressDelivery: scala.Double = js.native
}

object DeliveryPreferencesEditable {
  @scala.inline
  def apply(
    deliveryPreferencesEditable: scala.Double,
    isGroup: scala.Double,
    isTeam: scala.Double,
    isUser: scala.Double,
    none: scala.Double,
    supportsEachMemberDelivery: scala.Double,
    supportsNoDelivery: scala.Double,
    supportsPreferredEmailAddressDelivery: scala.Double
  ): DeliveryPreferencesEditable = {
    val __obj = js.Dynamic.literal(deliveryPreferencesEditable = deliveryPreferencesEditable.asInstanceOf[js.Any], isGroup = isGroup.asInstanceOf[js.Any], isTeam = isTeam.asInstanceOf[js.Any], isUser = isUser.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], supportsEachMemberDelivery = supportsEachMemberDelivery.asInstanceOf[js.Any], supportsNoDelivery = supportsNoDelivery.asInstanceOf[js.Any], supportsPreferredEmailAddressDelivery = supportsPreferredEmailAddressDelivery.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryPreferencesEditable]
  }
  @scala.inline
  implicit class DeliveryPreferencesEditableOps[Self <: DeliveryPreferencesEditable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryPreferencesEditable(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryPreferencesEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGroup(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTeam(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTeam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUser(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsEachMemberDelivery(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsEachMemberDelivery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsNoDelivery(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsNoDelivery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsPreferredEmailAddressDelivery(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsPreferredEmailAddressDelivery")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

