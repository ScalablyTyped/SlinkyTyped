package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgentJobRequest extends js.Object {
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
  implicit class TaskAgentJobRequestOps[Self <: TaskAgentJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinition(value: TaskOrchestrationOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDemands(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockedUntil(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchedAgents(value: js.Array[TaskAgentReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedAgents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: TaskOrchestrationOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlanType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceiveTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReservedAgent(value: TaskAgentReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: TaskResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceOwner")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

