package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalOptions extends js.Object {
  var autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped: Boolean = js.native
  var enforceIdentityRevalidation: Boolean = js.native
  var executionOrder: ApprovalExecutionOrder = js.native
  var releaseCreatorCanBeApprover: Boolean = js.native
  var requiredApproverCount: Double = js.native
  var timeoutInMinutes: Double = js.native
}

object ApprovalOptions {
  @scala.inline
  def apply(
    autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped: Boolean,
    enforceIdentityRevalidation: Boolean,
    executionOrder: ApprovalExecutionOrder,
    releaseCreatorCanBeApprover: Boolean,
    requiredApproverCount: Double,
    timeoutInMinutes: Double
  ): ApprovalOptions = {
    val __obj = js.Dynamic.literal(autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped = autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped.asInstanceOf[js.Any], enforceIdentityRevalidation = enforceIdentityRevalidation.asInstanceOf[js.Any], executionOrder = executionOrder.asInstanceOf[js.Any], releaseCreatorCanBeApprover = releaseCreatorCanBeApprover.asInstanceOf[js.Any], requiredApproverCount = requiredApproverCount.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApprovalOptions]
  }
  @scala.inline
  implicit class ApprovalOptionsOps[Self <: ApprovalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnforceIdentityRevalidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceIdentityRevalidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionOrder(value: ApprovalExecutionOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseCreatorCanBeApprover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseCreatorCanBeApprover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiredApproverCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredApproverCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeoutInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

