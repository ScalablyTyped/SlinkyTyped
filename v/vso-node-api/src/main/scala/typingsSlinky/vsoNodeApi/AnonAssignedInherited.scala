package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAssignedInherited extends js.Object {
  var assigned: Double = js.native
  var inherited: Double = js.native
}

object AnonAssignedInherited {
  @scala.inline
  def apply(assigned: Double, inherited: Double): AnonAssignedInherited = {
    val __obj = js.Dynamic.literal(assigned = assigned.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssignedInherited]
  }
  @scala.inline
  implicit class AnonAssignedInheritedOps[Self <: AnonAssignedInherited] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssigned(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInherited(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherited")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

