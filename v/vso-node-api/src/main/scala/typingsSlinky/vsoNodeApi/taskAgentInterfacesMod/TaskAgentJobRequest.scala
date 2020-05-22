package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentJobRequest extends js.Object {
  var assignTime: js.Date
  var data: StringDictionary[String]
  var definition: TaskOrchestrationOwner
  var demands: js.Array[_]
  var finishTime: js.Date
  var hostId: String
  var jobId: String
  var jobName: String
  var lockedUntil: js.Date
  var matchedAgents: js.Array[TaskAgentReference]
  var owner: TaskOrchestrationOwner
  var planId: String
  var planType: String
  var queueTime: js.Date
  var receiveTime: js.Date
  var requestId: Double
  var reservedAgent: TaskAgentReference
  var result: TaskResult
  var scopeId: String
  var serviceOwner: String
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
}

