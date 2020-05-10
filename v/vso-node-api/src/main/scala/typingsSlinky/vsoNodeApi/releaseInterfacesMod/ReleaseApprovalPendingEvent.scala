package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseApprovalPendingEvent extends js.Object {
  var approval: ReleaseApproval = js.native
  var approvalOptions: ApprovalOptions = js.native
  var completedApprovals: js.Array[ReleaseApproval] = js.native
  var definitionName: String = js.native
  var deployment: Deployment = js.native
  var environmentId: Double = js.native
  var environmentName: String = js.native
  var environments: js.Array[ReleaseEnvironment] = js.native
  var isMultipleRankApproval: Boolean = js.native
  var pendingApprovals: js.Array[ReleaseApproval] = js.native
  var releaseCreator: String = js.native
  var releaseName: String = js.native
  var title: String = js.native
  var webAccessUri: String = js.native
}

object ReleaseApprovalPendingEvent {
  @scala.inline
  def apply(
    approval: ReleaseApproval,
    approvalOptions: ApprovalOptions,
    completedApprovals: js.Array[ReleaseApproval],
    definitionName: String,
    deployment: Deployment,
    environmentId: Double,
    environmentName: String,
    environments: js.Array[ReleaseEnvironment],
    isMultipleRankApproval: Boolean,
    pendingApprovals: js.Array[ReleaseApproval],
    releaseCreator: String,
    releaseName: String,
    title: String,
    webAccessUri: String
  ): ReleaseApprovalPendingEvent = {
    val __obj = js.Dynamic.literal(approval = approval.asInstanceOf[js.Any], approvalOptions = approvalOptions.asInstanceOf[js.Any], completedApprovals = completedApprovals.asInstanceOf[js.Any], definitionName = definitionName.asInstanceOf[js.Any], deployment = deployment.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], isMultipleRankApproval = isMultipleRankApproval.asInstanceOf[js.Any], pendingApprovals = pendingApprovals.asInstanceOf[js.Any], releaseCreator = releaseCreator.asInstanceOf[js.Any], releaseName = releaseName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], webAccessUri = webAccessUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseApprovalPendingEvent]
  }
  @scala.inline
  implicit class ReleaseApprovalPendingEventOps[Self <: ReleaseApprovalPendingEvent] (val x: Self) extends AnyVal {
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
    def withDefinitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeployment(value: Deployment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironments(value: js.Array[ReleaseEnvironment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environments")(value.asInstanceOf[js.Any])
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
    def withReleaseCreator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseCreator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebAccessUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAccessUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

