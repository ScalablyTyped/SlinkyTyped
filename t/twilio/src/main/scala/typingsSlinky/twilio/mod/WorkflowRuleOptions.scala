package typingsSlinky.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowRuleOptions extends js.Object {
  var expression: String = js.native
  var filter_friendly_name: js.UndefOr[String] = js.native
  var friendlyName: js.UndefOr[String] = js.native
  // Don't ask me why, but all of these are supported options.
  var friendly_name: js.UndefOr[String] = js.native
  var targets: js.Array[WorkflowRuleTargetOptions] = js.native
}

object WorkflowRuleOptions {
  @scala.inline
  def apply(expression: String, targets: js.Array[WorkflowRuleTargetOptions]): WorkflowRuleOptions = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowRuleOptions]
  }
  @scala.inline
  implicit class WorkflowRuleOptionsOps[Self <: WorkflowRuleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargets(value: js.Array[WorkflowRuleTargetOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter_friendly_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_friendly_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter_friendly_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_friendly_name")(js.undefined)
        ret
    }
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriendlyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(js.undefined)
        ret
    }
    @scala.inline
    def withFriendly_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendly_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriendly_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendly_name")(js.undefined)
        ret
    }
  }
  
}

