package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schedule extends StObject {
  
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
  implicit class ScheduleMutableBuilder[Self <: Schedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchFilters(value: js.Array[String]): Self = StObject.set(x, "branchFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchFiltersVarargs(value: String*): Self = StObject.set(x, "branchFilters", js.Array(value :_*))
    
    @scala.inline
    def setDaysToBuild(value: ScheduleDays): Self = StObject.set(x, "daysToBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleJobId(value: String): Self = StObject.set(x, "scheduleJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleOnlyWithChanges(value: Boolean): Self = StObject.set(x, "scheduleOnlyWithChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartHours(value: Double): Self = StObject.set(x, "startHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMinutes(value: Double): Self = StObject.set(x, "startMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneId(value: String): Self = StObject.set(x, "timeZoneId", value.asInstanceOf[js.Any])
  }
}
