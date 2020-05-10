package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleTrigger extends BuildTrigger {
  var schedules: js.Array[Schedule] = js.native
}

object ScheduleTrigger {
  @scala.inline
  def apply(schedules: js.Array[Schedule], triggerType: DefinitionTriggerType): ScheduleTrigger = {
    val __obj = js.Dynamic.literal(schedules = schedules.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleTrigger]
  }
  @scala.inline
  implicit class ScheduleTriggerOps[Self <: ScheduleTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchedules(value: js.Array[Schedule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

