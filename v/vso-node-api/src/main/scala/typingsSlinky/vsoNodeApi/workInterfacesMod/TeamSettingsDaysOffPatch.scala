package typingsSlinky.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamSettingsDaysOffPatch extends js.Object {
  var daysOff: js.Array[DateRange] = js.native
}

object TeamSettingsDaysOffPatch {
  @scala.inline
  def apply(daysOff: js.Array[DateRange]): TeamSettingsDaysOffPatch = {
    val __obj = js.Dynamic.literal(daysOff = daysOff.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamSettingsDaysOffPatch]
  }
  @scala.inline
  implicit class TeamSettingsDaysOffPatchOps[Self <: TeamSettingsDaysOffPatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaysOff(value: js.Array[DateRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOff")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

