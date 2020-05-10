package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOrchestrationJob extends TaskOrchestrationItem {
  var demands: js.Array[_] = js.native
  var executeAs: IdentityRef = js.native
  var executionMode: String = js.native
  var executionTimeout: js.Any = js.native
  var instanceId: String = js.native
  var name: String = js.native
  var tasks: js.Array[TaskInstance] = js.native
  var variables: StringDictionary[String] = js.native
}

object TaskOrchestrationJob {
  @scala.inline
  def apply(
    demands: js.Array[_],
    executeAs: IdentityRef,
    executionMode: String,
    executionTimeout: js.Any,
    instanceId: String,
    itemType: TaskOrchestrationItemType,
    name: String,
    tasks: js.Array[TaskInstance],
    variables: StringDictionary[String]
  ): TaskOrchestrationJob = {
    val __obj = js.Dynamic.literal(demands = demands.asInstanceOf[js.Any], executeAs = executeAs.asInstanceOf[js.Any], executionMode = executionMode.asInstanceOf[js.Any], executionTimeout = executionTimeout.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationJob]
  }
  @scala.inline
  implicit class TaskOrchestrationJobOps[Self <: TaskOrchestrationJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDemands(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecuteAs(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionTimeout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTasks(value: js.Array[TaskInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

