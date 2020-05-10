package typingsSlinky.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoNodeApi.systemMod.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamSettingsPatch extends js.Object {
  var backlogIteration: String = js.native
  var backlogVisibilities: StringDictionary[Boolean] = js.native
  var bugsBehavior: BugsBehavior = js.native
  var defaultIteration: String = js.native
  var defaultIterationMacro: String = js.native
  var workingDays: js.Array[DayOfWeek] = js.native
}

object TeamSettingsPatch {
  @scala.inline
  def apply(
    backlogIteration: String,
    backlogVisibilities: StringDictionary[Boolean],
    bugsBehavior: BugsBehavior,
    defaultIteration: String,
    defaultIterationMacro: String,
    workingDays: js.Array[DayOfWeek]
  ): TeamSettingsPatch = {
    val __obj = js.Dynamic.literal(backlogIteration = backlogIteration.asInstanceOf[js.Any], backlogVisibilities = backlogVisibilities.asInstanceOf[js.Any], bugsBehavior = bugsBehavior.asInstanceOf[js.Any], defaultIteration = defaultIteration.asInstanceOf[js.Any], defaultIterationMacro = defaultIterationMacro.asInstanceOf[js.Any], workingDays = workingDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamSettingsPatch]
  }
  @scala.inline
  implicit class TeamSettingsPatchOps[Self <: TeamSettingsPatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBacklogIteration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backlogIteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBacklogVisibilities(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backlogVisibilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBugsBehavior(value: BugsBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bugsBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultIteration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultIterationMacro(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIterationMacro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkingDays(value: js.Array[DayOfWeek]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingDays")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

