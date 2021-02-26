package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAgentJobRequest extends StObject {
  
  var assignTime: js.Date = js.native
  
  var data: StringDictionary[String] = js.native
  
  var definition: TaskOrchestrationOwner = js.native
  
  var demands: js.Array[_] = js.native
  
  var finishTime: js.Date = js.native
  
  var hostId: String = js.native
  
  var jobId: String = js.native
  
  var jobName: String = js.native
  
  var lockedUntil: js.Date = js.native
  
  var matchedAgents: js.Array[TaskAgentReference] = js.native
  
  var owner: TaskOrchestrationOwner = js.native
  
  var planId: String = js.native
  
  var planType: String = js.native
  
  var queueTime: js.Date = js.native
  
  var receiveTime: js.Date = js.native
  
  var requestId: Double = js.native
  
  var reservedAgent: TaskAgentReference = js.native
  
  var result: TaskResult = js.native
  
  var scopeId: String = js.native
  
  var serviceOwner: String = js.native
}
object TaskAgentJobRequest {
  
  @scala.inline
  def apply(
    assignTime: js.Date,
    data: StringDictionary[String],
    definition: TaskOrchestrationOwner,
    demands: js.Array[_],
    finishTime: js.Date,
    hostId: String,
    jobId: String,
    jobName: String,
    lockedUntil: js.Date,
    matchedAgents: js.Array[TaskAgentReference],
    owner: TaskOrchestrationOwner,
    planId: String,
    planType: String,
    queueTime: js.Date,
    receiveTime: js.Date,
    requestId: Double,
    reservedAgent: TaskAgentReference,
    result: TaskResult,
    scopeId: String,
    serviceOwner: String
  ): TaskAgentJobRequest = {
    val __obj = js.Dynamic.literal(assignTime = assignTime.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], hostId = hostId.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], lockedUntil = lockedUntil.asInstanceOf[js.Any], matchedAgents = matchedAgents.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], planType = planType.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any], receiveTime = receiveTime.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], reservedAgent = reservedAgent.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], scopeId = scopeId.asInstanceOf[js.Any], serviceOwner = serviceOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentJobRequest]
  }
  
  @scala.inline
  implicit class TaskAgentJobRequestMutableBuilder[Self <: TaskAgentJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignTime(value: js.Date): Self = StObject.set(x, "assignTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: TaskOrchestrationOwner): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemands(value: js.Array[_]): Self = StObject.set(x, "demands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemandsVarargs(value: js.Any*): Self = StObject.set(x, "demands", js.Array(value :_*))
    
    @scala.inline
    def setFinishTime(value: js.Date): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostId(value: String): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUntil(value: js.Date): Self = StObject.set(x, "lockedUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedAgents(value: js.Array[TaskAgentReference]): Self = StObject.set(x, "matchedAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedAgentsVarargs(value: TaskAgentReference*): Self = StObject.set(x, "matchedAgents", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: TaskOrchestrationOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanType(value: String): Self = StObject.set(x, "planType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueTime(value: js.Date): Self = StObject.set(x, "queueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveTime(value: js.Date): Self = StObject.set(x, "receiveTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedAgent(value: TaskAgentReference): Self = StObject.set(x, "reservedAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: TaskResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeId(value: String): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceOwner(value: String): Self = StObject.set(x, "serviceOwner", value.asInstanceOf[js.Any])
  }
}
