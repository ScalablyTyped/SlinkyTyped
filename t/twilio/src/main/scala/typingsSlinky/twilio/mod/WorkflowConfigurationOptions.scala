package typingsSlinky.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowConfigurationOptions extends js.Object {
  var taskRouting: js.UndefOr[TaskRoutingConfigurationOptions] = js.native
  var task_routing: js.UndefOr[TaskRoutingConfigurationOptions] = js.native
}

object WorkflowConfigurationOptions {
  @scala.inline
  def apply(): WorkflowConfigurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowConfigurationOptions]
  }
  @scala.inline
  implicit class WorkflowConfigurationOptionsOps[Self <: WorkflowConfigurationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTaskRouting(value: TaskRoutingConfigurationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskRouting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskRouting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskRouting")(js.undefined)
        ret
    }
    @scala.inline
    def withTask_routing(value: TaskRoutingConfigurationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task_routing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTask_routing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task_routing")(js.undefined)
        ret
    }
  }
  
}

