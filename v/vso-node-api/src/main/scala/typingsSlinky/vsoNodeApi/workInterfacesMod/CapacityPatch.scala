package typingsSlinky.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityPatch extends js.Object {
  var activities: js.Array[Activity] = js.native
  var daysOff: js.Array[DateRange] = js.native
}

object CapacityPatch {
  @scala.inline
  def apply(activities: js.Array[Activity], daysOff: js.Array[DateRange]): CapacityPatch = {
    val __obj = js.Dynamic.literal(activities = activities.asInstanceOf[js.Any], daysOff = daysOff.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityPatch]
  }
  @scala.inline
  implicit class CapacityPatchOps[Self <: CapacityPatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivities(value: js.Array[Activity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDaysOff(value: js.Array[DateRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOff")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

