package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOrchestrationPlanGroupReference extends js.Object {
  var planGroup: String = js.native
  var projectId: String = js.native
}

object TaskOrchestrationPlanGroupReference {
  @scala.inline
  def apply(planGroup: String, projectId: String): TaskOrchestrationPlanGroupReference = {
    val __obj = js.Dynamic.literal(planGroup = planGroup.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationPlanGroupReference]
  }
  @scala.inline
  implicit class TaskOrchestrationPlanGroupReferenceOps[Self <: TaskOrchestrationPlanGroupReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlanGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

