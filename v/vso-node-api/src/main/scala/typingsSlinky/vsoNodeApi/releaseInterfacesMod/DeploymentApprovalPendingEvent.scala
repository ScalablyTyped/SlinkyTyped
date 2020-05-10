package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentApprovalPendingEvent extends js.Object {
  var approval: ReleaseApproval = js.native
  var approvalOptions: ApprovalOptions = js.native
  var completedApprovals: js.Array[ReleaseApproval] = js.native
  var data: StringDictionary[js.Any] = js.native
  var deployment: Deployment = js.native
  var isMultipleRankApproval: Boolean = js.native
  var pendingApprovals: js.Array[ReleaseApproval] = js.native
  var project: ProjectReference = js.native
  var release: Release = js.native
}

object DeploymentApprovalPendingEvent {
  @scala.inline
  def apply(
    approval: ReleaseApproval,
    approvalOptions: ApprovalOptions,
    completedApprovals: js.Array[ReleaseApproval],
    data: StringDictionary[js.Any],
    deployment: Deployment,
    isMultipleRankApproval: Boolean,
    pendingApprovals: js.Array[ReleaseApproval],
    project: ProjectReference,
    release: Release
  ): DeploymentApprovalPendingEvent = {
    val __obj = js.Dynamic.literal(approval = approval.asInstanceOf[js.Any], approvalOptions = approvalOptions.asInstanceOf[js.Any], completedApprovals = completedApprovals.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deployment = deployment.asInstanceOf[js.Any], isMultipleRankApproval = isMultipleRankApproval.asInstanceOf[js.Any], pendingApprovals = pendingApprovals.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentApprovalPendingEvent]
  }
  @scala.inline
  implicit class DeploymentApprovalPendingEventOps[Self <: DeploymentApprovalPendingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproval(value: ReleaseApproval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApprovalOptions(value: ApprovalOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletedApprovals(value: js.Array[ReleaseApproval]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedApprovals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeployment(value: Deployment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMultipleRankApproval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultipleRankApproval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingApprovals(value: js.Array[ReleaseApproval]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingApprovals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: ProjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease(value: Release): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

