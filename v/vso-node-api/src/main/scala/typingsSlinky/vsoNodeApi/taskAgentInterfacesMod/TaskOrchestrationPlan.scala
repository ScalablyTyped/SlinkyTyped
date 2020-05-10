package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOrchestrationPlan extends TaskOrchestrationPlanReference {
  var environment: PlanEnvironment = js.native
  var finishTime: js.Date = js.native
  var implementation: TaskOrchestrationContainer = js.native
  var planGroup: String = js.native
  var requestedById: String = js.native
  var requestedForId: String = js.native
  var result: TaskResult = js.native
  var resultCode: String = js.native
  var startTime: js.Date = js.native
  var state: TaskOrchestrationPlanState = js.native
  var timeline: TimelineReference = js.native
}

object TaskOrchestrationPlan {
  @scala.inline
  def apply(
    artifactLocation: String,
    artifactUri: String,
    definition: TaskOrchestrationOwner,
    environment: PlanEnvironment,
    finishTime: js.Date,
    implementation: TaskOrchestrationContainer,
    owner: TaskOrchestrationOwner,
    planGroup: String,
    planId: String,
    planType: String,
    requestedById: String,
    requestedForId: String,
    result: TaskResult,
    resultCode: String,
    scopeIdentifier: String,
    startTime: js.Date,
    state: TaskOrchestrationPlanState,
    timeline: TimelineReference,
    version: Double
  ): TaskOrchestrationPlan = {
    val __obj = js.Dynamic.literal(artifactLocation = artifactLocation.asInstanceOf[js.Any], artifactUri = artifactUri.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], planGroup = planGroup.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], planType = planType.asInstanceOf[js.Any], requestedById = requestedById.asInstanceOf[js.Any], requestedForId = requestedForId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any], scopeIdentifier = scopeIdentifier.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationPlan]
  }
  @scala.inline
  implicit class TaskOrchestrationPlanOps[Self <: TaskOrchestrationPlan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironment(value: PlanEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImplementation(value: TaskOrchestrationContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlanGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedById(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedForId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedForId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: TaskResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: TaskOrchestrationPlanState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeline(value: TimelineReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

