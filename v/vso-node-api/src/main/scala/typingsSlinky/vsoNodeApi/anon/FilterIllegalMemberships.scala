package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterIllegalMemberships extends js.Object {
  var filterIllegalMemberships: scala.Double = js.native
  var none: scala.Double = js.native
}

object FilterIllegalMemberships {
  @scala.inline
  def apply(filterIllegalMemberships: scala.Double, none: scala.Double): FilterIllegalMemberships = {
    val __obj = js.Dynamic.literal(filterIllegalMemberships = filterIllegalMemberships.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterIllegalMemberships]
  }
  @scala.inline
  implicit class FilterIllegalMembershipsOps[Self <: FilterIllegalMemberships] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterIllegalMemberships(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterIllegalMemberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

