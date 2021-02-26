package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentPoolEvent extends StObject {
  
  var eventType: String = js.native
  
  var pool: TaskAgentPool = js.native
}
object AgentPoolEvent {
  
  @scala.inline
  def apply(eventType: String, pool: TaskAgentPool): AgentPoolEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentPoolEvent]
  }
  
  @scala.inline
  implicit class AgentPoolEventMutableBuilder[Self <: AgentPoolEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPool(value: TaskAgentPool): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
  }
}
