package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EachMember extends js.Object {
  var eachMember: scala.Double = js.native
  var noDelivery: scala.Double = js.native
  var none: scala.Double = js.native
  var notSet: scala.Double = js.native
  var preferredEmailAddress: scala.Double = js.native
}

object EachMember {
  @scala.inline
  def apply(
    eachMember: scala.Double,
    noDelivery: scala.Double,
    none: scala.Double,
    notSet: scala.Double,
    preferredEmailAddress: scala.Double
  ): EachMember = {
    val __obj = js.Dynamic.literal(eachMember = eachMember.asInstanceOf[js.Any], noDelivery = noDelivery.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], preferredEmailAddress = preferredEmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EachMember]
  }
  @scala.inline
  implicit class EachMemberOps[Self <: EachMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEachMember(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoDelivery(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDelivery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotSet(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferredEmailAddress(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

