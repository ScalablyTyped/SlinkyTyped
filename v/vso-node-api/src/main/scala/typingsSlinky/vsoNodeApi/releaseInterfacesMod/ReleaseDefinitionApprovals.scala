package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseDefinitionApprovals extends js.Object {
  var approvalOptions: ApprovalOptions = js.native
  var approvals: js.Array[ReleaseDefinitionApprovalStep] = js.native
}

object ReleaseDefinitionApprovals {
  @scala.inline
  def apply(approvalOptions: ApprovalOptions, approvals: js.Array[ReleaseDefinitionApprovalStep]): ReleaseDefinitionApprovals = {
    val __obj = js.Dynamic.literal(approvalOptions = approvalOptions.asInstanceOf[js.Any], approvals = approvals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionApprovals]
  }
  @scala.inline
  implicit class ReleaseDefinitionApprovalsOps[Self <: ReleaseDefinitionApprovals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalOptions(value: ApprovalOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApprovals(value: js.Array[ReleaseDefinitionApprovalStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvals")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

