package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOrchestrationQueuedPlan extends js.Object {
  var assignTime: js.Date = js.native
  var definition: TaskOrchestrationOwner = js.native
  var owner: TaskOrchestrationOwner = js.native
  var planGroup: String = js.native
  var planId: String = js.native
  var poolId: Double = js.native
  var queuePosition: Double = js.native
  var queueTime: js.Date = js.native
  var scopeIdentifier: String = js.native
}

object TaskOrchestrationQueuedPlan {
  @scala.inline
  def apply(
    assignTime: js.Date,
    definition: TaskOrchestrationOwner,
    owner: TaskOrchestrationOwner,
    planGroup: String,
    planId: String,
    poolId: Double,
    queuePosition: Double,
    queueTime: js.Date,
    scopeIdentifier: String
  ): TaskOrchestrationQueuedPlan = {
    val __obj = js.Dynamic.literal(assignTime = assignTime.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], planGroup = planGroup.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], queuePosition = queuePosition.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any], scopeIdentifier = scopeIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationQueuedPlan]
  }
  @scala.inline
  implicit class TaskOrchestrationQueuedPlanOps[Self <: TaskOrchestrationQueuedPlan] (val x: Self) extends AnyVal {
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
    def withDefinition(value: TaskOrchestrationOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: TaskOrchestrationOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlanGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoolId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueuePosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

