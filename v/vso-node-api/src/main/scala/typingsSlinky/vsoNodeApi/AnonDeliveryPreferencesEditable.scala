package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeliveryPreferencesEditable extends js.Object {
  var deliveryPreferencesEditable: Double = js.native
  var isGroup: Double = js.native
  var isTeam: Double = js.native
  var isUser: Double = js.native
  var none: Double = js.native
  var supportsEachMemberDelivery: Double = js.native
  var supportsNoDelivery: Double = js.native
  var supportsPreferredEmailAddressDelivery: Double = js.native
}

object AnonDeliveryPreferencesEditable {
  @scala.inline
  def apply(
    deliveryPreferencesEditable: Double,
    isGroup: Double,
    isTeam: Double,
    isUser: Double,
    none: Double,
    supportsEachMemberDelivery: Double,
    supportsNoDelivery: Double,
    supportsPreferredEmailAddressDelivery: Double
  ): AnonDeliveryPreferencesEditable = {
    val __obj = js.Dynamic.literal(deliveryPreferencesEditable = deliveryPreferencesEditable.asInstanceOf[js.Any], isGroup = isGroup.asInstanceOf[js.Any], isTeam = isTeam.asInstanceOf[js.Any], isUser = isUser.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], supportsEachMemberDelivery = supportsEachMemberDelivery.asInstanceOf[js.Any], supportsNoDelivery = supportsNoDelivery.asInstanceOf[js.Any], supportsPreferredEmailAddressDelivery = supportsPreferredEmailAddressDelivery.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeliveryPreferencesEditable]
  }
  @scala.inline
  implicit class AnonDeliveryPreferencesEditableOps[Self <: AnonDeliveryPreferencesEditable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryPreferencesEditable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryPreferencesEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGroup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTeam(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTeam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUser(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsEachMemberDelivery(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsEachMemberDelivery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsNoDelivery(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsNoDelivery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsPreferredEmailAddressDelivery(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsPreferredEmailAddressDelivery")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

