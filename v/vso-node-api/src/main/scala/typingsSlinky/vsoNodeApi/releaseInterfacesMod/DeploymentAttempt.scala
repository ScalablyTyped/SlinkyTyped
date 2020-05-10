package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentAttempt extends js.Object {
  var attempt: Double = js.native
  var deploymentId: Double = js.native
  /**
    * Error log to show any unexpected error that occurred during executing deploy step
    */
  var errorLog: String = js.native
  /**
    * Specifies whether deployment has started or not
    */
  var hasStarted: Boolean = js.native
  var id: Double = js.native
  /**
    * All the issues related to the deployment
    */
  var issues: js.Array[Issue] = js.native
  var job: ReleaseTask = js.native
  var lastModifiedBy: IdentityRef = js.native
  var lastModifiedOn: js.Date = js.native
  var operationStatus: DeploymentOperationStatus = js.native
  var postDeploymentGates: ReleaseGates = js.native
  var preDeploymentGates: ReleaseGates = js.native
  var queuedOn: js.Date = js.native
  var reason: DeploymentReason = js.native
  var releaseDeployPhases: js.Array[ReleaseDeployPhase] = js.native
  var requestedBy: IdentityRef = js.native
  var requestedFor: IdentityRef = js.native
  var runPlanId: String = js.native
  var status: DeploymentStatus = js.native
  var tasks: js.Array[ReleaseTask] = js.native
}

object DeploymentAttempt {
  @scala.inline
  def apply(
    attempt: Double,
    deploymentId: Double,
    errorLog: String,
    hasStarted: Boolean,
    id: Double,
    issues: js.Array[Issue],
    job: ReleaseTask,
    lastModifiedBy: IdentityRef,
    lastModifiedOn: js.Date,
    operationStatus: DeploymentOperationStatus,
    postDeploymentGates: ReleaseGates,
    preDeploymentGates: ReleaseGates,
    queuedOn: js.Date,
    reason: DeploymentReason,
    releaseDeployPhases: js.Array[ReleaseDeployPhase],
    requestedBy: IdentityRef,
    requestedFor: IdentityRef,
    runPlanId: String,
    status: DeploymentStatus,
    tasks: js.Array[ReleaseTask]
  ): DeploymentAttempt = {
    val __obj = js.Dynamic.literal(attempt = attempt.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], errorLog = errorLog.asInstanceOf[js.Any], hasStarted = hasStarted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedOn = lastModifiedOn.asInstanceOf[js.Any], operationStatus = operationStatus.asInstanceOf[js.Any], postDeploymentGates = postDeploymentGates.asInstanceOf[js.Any], preDeploymentGates = preDeploymentGates.asInstanceOf[js.Any], queuedOn = queuedOn.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], releaseDeployPhases = releaseDeployPhases.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], requestedFor = requestedFor.asInstanceOf[js.Any], runPlanId = runPlanId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentAttempt]
  }
  @scala.inline
  implicit class DeploymentAttemptOps[Self <: DeploymentAttempt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttempt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorLog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasStarted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssues(value: js.Array[Issue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJob(value: ReleaseTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job")(value.asInstanceOf[js.Any])
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
    def withPostDeploymentGates(value: ReleaseGates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postDeploymentGates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreDeploymentGates(value: ReleaseGates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preDeploymentGates")(value.asInstanceOf[js.Any])
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
    def withReleaseDeployPhases(value: js.Array[ReleaseDeployPhase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDeployPhases")(value.asInstanceOf[js.Any])
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
    def withRunPlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runPlanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: DeploymentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTasks(value: js.Array[ReleaseTask]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

