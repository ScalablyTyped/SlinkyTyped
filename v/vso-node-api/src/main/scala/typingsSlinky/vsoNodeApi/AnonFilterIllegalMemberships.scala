package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilterIllegalMemberships extends js.Object {
  var filterIllegalMemberships: Double = js.native
  var none: Double = js.native
}

object AnonFilterIllegalMemberships {
  @scala.inline
  def apply(filterIllegalMemberships: Double, none: Double): AnonFilterIllegalMemberships = {
    val __obj = js.Dynamic.literal(filterIllegalMemberships = filterIllegalMemberships.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilterIllegalMemberships]
  }
  @scala.inline
  implicit class AnonFilterIllegalMembershipsOps[Self <: AnonFilterIllegalMemberships] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterIllegalMemberships(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterIllegalMemberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

