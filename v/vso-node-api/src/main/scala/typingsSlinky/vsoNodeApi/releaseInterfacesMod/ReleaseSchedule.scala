package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseSchedule extends js.Object {
  /**
    * Days of the week to release
    */
  var daysToRelease: ScheduleDays = js.native
  /**
    * Team Foundation Job Definition Job Id
    */
  var jobId: String = js.native
  /**
    * Local time zone hour to start
    */
  var startHours: Double = js.native
  /**
    * Local time zone minute to start
    */
  var startMinutes: Double = js.native
  /**
    * Time zone Id of release schedule, such as 'UTC'
    */
  var timeZoneId: String = js.native
}

object ReleaseSchedule {
  @scala.inline
  def apply(
    daysToRelease: ScheduleDays,
    jobId: String,
    startHours: Double,
    startMinutes: Double,
    timeZoneId: String
  ): ReleaseSchedule = {
    val __obj = js.Dynamic.literal(daysToRelease = daysToRelease.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], startHours = startHours.asInstanceOf[js.Any], startMinutes = startMinutes.asInstanceOf[js.Any], timeZoneId = timeZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseSchedule]
  }
  @scala.inline
  implicit class ReleaseScheduleOps[Self <: ReleaseSchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaysToRelease(value: ScheduleDays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysToRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
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

