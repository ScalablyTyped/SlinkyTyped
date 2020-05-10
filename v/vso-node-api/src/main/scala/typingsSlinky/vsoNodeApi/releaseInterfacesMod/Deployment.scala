package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deployment extends js.Object {
  /**
    * Gets links to access the deployment.
    */
  var _links: js.Any = js.native
  /**
    * Gets attempt number.
    */
  var attempt: Double = js.native
  /**
    * Gets the date on which deployment is complete.
    */
  var completedOn: js.Date = js.native
  /**
    * Gets the list of condition associated with deployment.
    */
  var conditions: js.Array[Condition] = js.native
  /**
    * Gets release definition environment id.
    */
  var definitionEnvironmentId: Double = js.native
  /**
    * Gets status of the deployment.
    */
  var deploymentStatus: DeploymentStatus = js.native
  /**
    * Gets the unique identifier for deployment.
    */
  var id: Double = js.native
  /**
    * Gets the identity who last modified the deployment.
    */
  var lastModifiedBy: IdentityRef = js.native
  /**
    * Gets the date on which deployment is last modified.
    */
  var lastModifiedOn: js.Date = js.native
  /**
    * Gets operation status of deployment.
    */
  var operationStatus: DeploymentOperationStatus = js.native
  /**
    * Gets list of PostDeployApprovals.
    */
  var postDeployApprovals: js.Array[ReleaseApproval] = js.native
  /**
    * Gets list of PreDeployApprovals.
    */
  var preDeployApprovals: js.Array[ReleaseApproval] = js.native
  /**
    * Gets the date on which deployment is queued.
    */
  var queuedOn: js.Date = js.native
  /**
    * Gets reason of deployment.
    */
  var reason: DeploymentReason = js.native
  /**
    * Gets the reference of release.
    */
  var release: ReleaseReference = js.native
  /**
    * Gets releaseDefinitionReference which specifies the reference of the release definition to which the deployment is associated.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference = js.native
  /**
    * Gets releaseEnvironmentReference which specifies the reference of the release environment to which the deployment is associated.
    */
  var releaseEnvironment: ReleaseEnvironmentShallowReference = js.native
  /**
    * Gets the identity who requested.
    */
  var requestedBy: IdentityRef = js.native
  /**
    * Gets the identity for whom deployment is requested.
    */
  var requestedFor: IdentityRef = js.native
  /**
    * Gets the date on which deployment is scheduled.
    */
  var scheduledDeploymentTime: js.Date = js.native
  /**
    * Gets the date on which deployment is started.
    */
  var startedOn: js.Date = js.native
}

object Deployment {
  @scala.inline
  def apply(
    _links: js.Any,
    attempt: Double,
    completedOn: js.Date,
    conditions: js.Array[Condition],
    definitionEnvironmentId: Double,
    deploymentStatus: DeploymentStatus,
    id: Double,
    lastModifiedBy: IdentityRef,
    lastModifiedOn: js.Date,
    operationStatus: DeploymentOperationStatus,
    postDeployApprovals: js.Array[ReleaseApproval],
    preDeployApprovals: js.Array[ReleaseApproval],
    queuedOn: js.Date,
    reason: DeploymentReason,
    release: ReleaseReference,
    releaseDefinition: ReleaseDefinitionShallowReference,
    releaseEnvironment: ReleaseEnvironmentShallowReference,
    requestedBy: IdentityRef,
    requestedFor: IdentityRef,
    scheduledDeploymentTime: js.Date,
    startedOn: js.Date
  ): Deployment = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], attempt = attempt.asInstanceOf[js.Any], completedOn = completedOn.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], definitionEnvironmentId = definitionEnvironmentId.asInstanceOf[js.Any], deploymentStatus = deploymentStatus.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedOn = lastModifiedOn.asInstanceOf[js.Any], operationStatus = operationStatus.asInstanceOf[js.Any], postDeployApprovals = postDeployApprovals.asInstanceOf[js.Any], preDeployApprovals = preDeployApprovals.asInstanceOf[js.Any], queuedOn = queuedOn.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], releaseDefinition = releaseDefinition.asInstanceOf[js.Any], releaseEnvironment = releaseEnvironment.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], requestedFor = requestedFor.asInstanceOf[js.Any], scheduledDeploymentTime = scheduledDeploymentTime.asInstanceOf[js.Any], startedOn = startedOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployment]
  }
  @scala.inline
  implicit class DeploymentOps[Self <: Deployment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttempt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[Condition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionEnvironmentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionEnvironmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentStatus(value: DeploymentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationStatus(value: DeploymentOperationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostDeployApprovals(value: js.Array[ReleaseApproval]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postDeployApprovals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreDeployApprovals(value: js.Array[ReleaseApproval]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preDeployApprovals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueuedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: DeploymentReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease(value: ReleaseReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseEnvironment(value: ReleaseEnvironmentShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedFor(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduledDeploymentTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledDeploymentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedOn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

