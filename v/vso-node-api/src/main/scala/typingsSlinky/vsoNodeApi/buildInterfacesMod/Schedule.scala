package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schedule extends js.Object {
  var branchFilters: js.Array[String] = js.native
  /**
    * Days for a build (flags enum for days of the week)
    */
  var daysToBuild: ScheduleDays = js.native
  /**
    * The Job Id of the Scheduled job that will queue the scheduled build. Since a single trigger can have multiple schedules and we want a single job to process a single schedule (since each schedule has a list of branches to build), the schedule itself needs to define the Job Id. This value will be filled in when a definition is added or updated.  The UI does not provide it or use it.
    */
  var scheduleJobId: String = js.native
  /**
    * Flag to determine if this schedule should only build if the associated source has been changed.
    */
  var scheduleOnlyWithChanges: Boolean = js.native
  /**
    * Local timezone hour to start
    */
  var startHours: Double = js.native
  /**
    * Local timezone minute to start
    */
  var startMinutes: Double = js.native
  /**
    * Time zone of the build schedule (String representation of the time zone ID)
    */
  var timeZoneId: String = js.native
}

object Schedule {
  @scala.inline
  def apply(
    branchFilters: js.Array[String],
    daysToBuild: ScheduleDays,
    scheduleJobId: String,
    scheduleOnlyWithChanges: Boolean,
    startHours: Double,
    startMinutes: Double,
    timeZoneId: String
  ): Schedule = {
    val __obj = js.Dynamic.literal(branchFilters = branchFilters.asInstanceOf[js.Any], daysToBuild = daysToBuild.asInstanceOf[js.Any], scheduleJobId = scheduleJobId.asInstanceOf[js.Any], scheduleOnlyWithChanges = scheduleOnlyWithChanges.asInstanceOf[js.Any], startHours = startHours.asInstanceOf[js.Any], startMinutes = startMinutes.asInstanceOf[js.Any], timeZoneId = timeZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
  @scala.inline
  implicit class ScheduleOps[Self <: Schedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranchFilters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDaysToBuild(value: ScheduleDays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysToBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduleJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleJobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduleOnlyWithChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleOnlyWithChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

