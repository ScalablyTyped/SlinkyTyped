package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOrchestrationContainer extends TaskOrchestrationItem {
  var children: js.Array[TaskOrchestrationItem] = js.native
  var continueOnError: Boolean = js.native
  var data: StringDictionary[String] = js.native
  var maxConcurrency: Double = js.native
  var parallel: Boolean = js.native
  var rollback: TaskOrchestrationContainer = js.native
}

object TaskOrchestrationContainer {
  @scala.inline
  def apply(
    children: js.Array[TaskOrchestrationItem],
    continueOnError: Boolean,
    data: StringDictionary[String],
    itemType: TaskOrchestrationItemType,
    maxConcurrency: Double,
    parallel: Boolean,
    rollback: TaskOrchestrationContainer
  ): TaskOrchestrationContainer = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], continueOnError = continueOnError.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], parallel = parallel.asInstanceOf[js.Any], rollback = rollback.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationContainer]
  }
  @scala.inline
  implicit class TaskOrchestrationContainerOps[Self <: TaskOrchestrationContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[TaskOrchestrationItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinueOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParallel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRollback(value: TaskOrchestrationContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollback")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

