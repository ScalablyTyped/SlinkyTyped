package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgentPoolMaintenanceSchedule extends js.Object {
  /**
    * Days for a build (flags enum for days of the week)
    */
  var daysToBuild: TaskAgentPoolMaintenanceScheduleDays = js.native
  /**
    * The Job Id of the Scheduled job that will queue the pool maintenance job.
    */
  var scheduleJobId: String = js.native
  /**
    * Local timezone hour to start
    */
  var startHours: Double = js.native
  /**
    * Local timezone minute to start
    */
  var startMinutes: Double = js.native
  /**
    * Time zone of the build schedule (string representation of the time zone id)
    */
  var timeZoneId: String = js.native
}

object TaskAgentPoolMaintenanceSchedule {
  @scala.inline
  def apply(
    daysToBuild: TaskAgentPoolMaintenanceScheduleDays,
    scheduleJobId: String,
    startHours: Double,
    startMinutes: Double,
    timeZoneId: String
  ): TaskAgentPoolMaintenanceSchedule = {
    val __obj = js.Dynamic.literal(daysToBuild = daysToBuild.asInstanceOf[js.Any], scheduleJobId = scheduleJobId.asInstanceOf[js.Any], startHours = startHours.asInstanceOf[js.Any], startMinutes = startMinutes.asInstanceOf[js.Any], timeZoneId = timeZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPoolMaintenanceSchedule]
  }
  @scala.inline
  implicit class TaskAgentPoolMaintenanceScheduleOps[Self <: TaskAgentPoolMaintenanceSchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaysToBuild(value: TaskAgentPoolMaintenanceScheduleDays): Self = {
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

