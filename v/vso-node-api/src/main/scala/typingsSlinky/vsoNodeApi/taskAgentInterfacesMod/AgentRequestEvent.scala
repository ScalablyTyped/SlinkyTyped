package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentRequestEvent extends StObject {
  
  var eventType: String = js.native
  
  var planId: String = js.native
  
  var poolId: Double = js.native
  
  var reservedAgentId: Double = js.native
  
  var result: TaskResult = js.native
  
  var timeStamp: js.Date = js.native
}
object AgentRequestEvent {
  
  @scala.inline
  def apply(
    eventType: String,
    planId: String,
    poolId: Double,
    reservedAgentId: Double,
    result: TaskResult,
    timeStamp: js.Date
  ): AgentRequestEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], reservedAgentId = reservedAgentId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentRequestEvent]
  }
  
  @scala.inline
  implicit class AgentRequestEventMutableBuilder[Self <: AgentRequestEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolId(value: Double): Self = StObject.set(x, "poolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedAgentId(value: Double): Self = StObject.set(x, "reservedAgentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: TaskResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: js.Date): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
