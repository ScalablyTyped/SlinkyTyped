package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOrchestrationPlanReference extends js.Object {
  /**
    * The type of the plan.
    */
  var orchestrationType: Double = js.native
  /**
    * The ID of the plan.
    */
  var planId: String = js.native
}

object TaskOrchestrationPlanReference {
  @scala.inline
  def apply(orchestrationType: Double, planId: String): TaskOrchestrationPlanReference = {
    val __obj = js.Dynamic.literal(orchestrationType = orchestrationType.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationPlanReference]
  }
  @scala.inline
  implicit class TaskOrchestrationPlanReferenceOps[Self <: TaskOrchestrationPlanReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrchestrationType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orchestrationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

