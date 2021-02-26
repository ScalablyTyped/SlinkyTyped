package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobAssignedEvent extends JobEvent {
  
  var request: TaskAgentJobRequest = js.native
}
object JobAssignedEvent {
  
  @scala.inline
  def apply(jobId: String, name: String, request: TaskAgentJobRequest): JobAssignedEvent = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobAssignedEvent]
  }
  
  @scala.inline
  implicit class JobAssignedEventMutableBuilder[Self <: JobAssignedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: TaskAgentJobRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
