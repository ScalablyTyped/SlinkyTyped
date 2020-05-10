package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAssigned extends js.Object {
  var active: Double = js.native
  var assigned: Double = js.native
  var moving: Double = js.native
}

object AnonAssigned {
  @scala.inline
  def apply(active: Double, assigned: Double, moving: Double): AnonAssigned = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], assigned = assigned.asInstanceOf[js.Any], moving = moving.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssigned]
  }
  @scala.inline
  implicit class AnonAssignedOps[Self <: AnonAssigned] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssigned(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoving(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moving")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

