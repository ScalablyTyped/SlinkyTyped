package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEachMember extends js.Object {
  var eachMember: Double = js.native
  var noDelivery: Double = js.native
  var none: Double = js.native
  var notSet: Double = js.native
  var preferredEmailAddress: Double = js.native
}

object AnonEachMember {
  @scala.inline
  def apply(
    eachMember: Double,
    noDelivery: Double,
    none: Double,
    notSet: Double,
    preferredEmailAddress: Double
  ): AnonEachMember = {
    val __obj = js.Dynamic.literal(eachMember = eachMember.asInstanceOf[js.Any], noDelivery = noDelivery.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], preferredEmailAddress = preferredEmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEachMember]
  }
  @scala.inline
  implicit class AnonEachMemberOps[Self <: AnonEachMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEachMember(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoDelivery(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDelivery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotSet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferredEmailAddress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

