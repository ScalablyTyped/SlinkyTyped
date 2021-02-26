package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAgentReference extends StObject {
  
  var _links: js.Any = js.native
  
  /**
    * Gets or sets a value indicating whether or not this agent should be enabled for job execution.
    */
  var enabled: Boolean = js.native
  
  /**
    * Gets the identifier of the agent.
    */
  var id: Double = js.native
  
  /**
    * Gets the name of the agent.
    */
  var name: String = js.native
  
  /**
    * Gets the current connectivity status of the agent.
    */
  var status: TaskAgentStatus = js.native
  
  /**
    * Gets the version of the agent.
    */
  var version: String = js.native
}
object TaskAgentReference {
  
  @scala.inline
  def apply(
    _links: js.Any,
    enabled: Boolean,
    id: Double,
    name: String,
    status: TaskAgentStatus,
    version: String
  ): TaskAgentReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentReference]
  }
  
  @scala.inline
  implicit class TaskAgentReferenceMutableBuilder[Self <: TaskAgentReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: TaskAgentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
