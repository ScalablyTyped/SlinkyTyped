package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOrchestrationQueuedPlanGroup extends js.Object {
  var definition: TaskOrchestrationOwner = js.native
  var owner: TaskOrchestrationOwner = js.native
  var planGroup: String = js.native
  var plans: js.Array[TaskOrchestrationQueuedPlan] = js.native
  var project: ProjectReference = js.native
  var queuePosition: Double = js.native
}

object TaskOrchestrationQueuedPlanGroup {
  @scala.inline
  def apply(
    definition: TaskOrchestrationOwner,
    owner: TaskOrchestrationOwner,
    planGroup: String,
    plans: js.Array[TaskOrchestrationQueuedPlan],
    project: ProjectReference,
    queuePosition: Double
  ): TaskOrchestrationQueuedPlanGroup = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], planGroup = planGroup.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], queuePosition = queuePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationQueuedPlanGroup]
  }
  @scala.inline
  implicit class TaskOrchestrationQueuedPlanGroupOps[Self <: TaskOrchestrationQueuedPlanGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPlans(value: js.Array[TaskOrchestrationQueuedPlan]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: ProjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueuePosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuePosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

