package typingsSlinky.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskRoutingConfigurationOptions extends js.Object {
  var defaultFilter: js.UndefOr[WorkflowRuleOptions] = js.native
  var default_filter: js.UndefOr[WorkflowRuleOptions] = js.native
  var filters: js.Array[WorkflowRuleOptions] = js.native
}

object TaskRoutingConfigurationOptions {
  @scala.inline
  def apply(filters: js.Array[WorkflowRuleOptions]): TaskRoutingConfigurationOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskRoutingConfigurationOptions]
  }
  @scala.inline
  implicit class TaskRoutingConfigurationOptionsOps[Self <: TaskRoutingConfigurationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: js.Array[WorkflowRuleOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultFilter(value: WorkflowRuleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_filter(value: WorkflowRuleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_filter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_filter")(js.undefined)
        ret
    }
  }
  
}

