package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgentQueue extends js.Object {
  var groupScopeId: String = js.native
  var id: Double = js.native
  var name: String = js.native
  var pool: TaskAgentPoolReference = js.native
  var projectId: String = js.native
  var provisioned: Boolean = js.native
}

object TaskAgentQueue {
  @scala.inline
  def apply(
    groupScopeId: String,
    id: Double,
    name: String,
    pool: TaskAgentPoolReference,
    projectId: String,
    provisioned: Boolean
  ): TaskAgentQueue = {
    val __obj = js.Dynamic.literal(groupScopeId = groupScopeId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], provisioned = provisioned.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentQueue]
  }
  @scala.inline
  implicit class TaskAgentQueueOps[Self <: TaskAgentQueue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupScopeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupScopeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPool(value: TaskAgentPoolReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvisioned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioned")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

