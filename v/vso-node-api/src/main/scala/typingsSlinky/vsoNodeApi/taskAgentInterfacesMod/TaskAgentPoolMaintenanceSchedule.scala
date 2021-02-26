package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAgentPoolMaintenanceSchedule extends StObject {
  
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
  implicit class TaskAgentPoolMaintenanceScheduleMutableBuilder[Self <: TaskAgentPoolMaintenanceSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaysToBuild(value: TaskAgentPoolMaintenanceScheduleDays): Self = StObject.set(x, "daysToBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleJobId(value: String): Self = StObject.set(x, "scheduleJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartHours(value: Double): Self = StObject.set(x, "startHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMinutes(value: Double): Self = StObject.set(x, "startMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneId(value: String): Self = StObject.set(x, "timeZoneId", value.asInstanceOf[js.Any])
  }
}
