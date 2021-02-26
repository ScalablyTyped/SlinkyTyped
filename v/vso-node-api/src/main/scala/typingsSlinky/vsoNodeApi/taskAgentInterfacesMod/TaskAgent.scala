package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAgent extends TaskAgentReference {
  
  /**
    * Gets the request which is currently assigned to this agent.
    */
  var assignedRequest: TaskAgentJobRequest = js.native
  
  /**
    * Gets or sets the authorization information for this agent.
    */
  var authorization: TaskAgentAuthorization = js.native
  
  /**
    * Gets the date on which this agent was created.
    */
  var createdOn: js.Date = js.native
  
  /**
    * Gets or sets the maximum job parallelism allowed on this host.
    */
  var maxParallelism: Double = js.native
  
  /**
    * Gets the pending update for this agent.
    */
  var pendingUpdate: TaskAgentUpdate = js.native
  
  var properties: js.Any = js.native
  
  /**
    * Gets the date on which the last connectivity status change occurred.
    */
  var statusChangedOn: js.Date = js.native
  
  var systemCapabilities: StringDictionary[String] = js.native
  
  var userCapabilities: StringDictionary[String] = js.native
}
object TaskAgent {
  
  @scala.inline
  def apply(
    _links: js.Any,
    assignedRequest: TaskAgentJobRequest,
    authorization: TaskAgentAuthorization,
    createdOn: js.Date,
    enabled: Boolean,
    id: Double,
    maxParallelism: Double,
    name: String,
    pendingUpdate: TaskAgentUpdate,
    properties: js.Any,
    status: TaskAgentStatus,
    statusChangedOn: js.Date,
    systemCapabilities: StringDictionary[String],
    userCapabilities: StringDictionary[String],
    version: String
  ): TaskAgent = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], assignedRequest = assignedRequest.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxParallelism = maxParallelism.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pendingUpdate = pendingUpdate.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusChangedOn = statusChangedOn.asInstanceOf[js.Any], systemCapabilities = systemCapabilities.asInstanceOf[js.Any], userCapabilities = userCapabilities.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgent]
  }
  
  @scala.inline
  implicit class TaskAgentMutableBuilder[Self <: TaskAgent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignedRequest(value: TaskAgentJobRequest): Self = StObject.set(x, "assignedRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorization(value: TaskAgentAuthorization): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxParallelism(value: Double): Self = StObject.set(x, "maxParallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUpdate(value: TaskAgentUpdate): Self = StObject.set(x, "pendingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusChangedOn(value: js.Date): Self = StObject.set(x, "statusChangedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemCapabilities(value: StringDictionary[String]): Self = StObject.set(x, "systemCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCapabilities(value: StringDictionary[String]): Self = StObject.set(x, "userCapabilities", value.asInstanceOf[js.Any])
  }
}
