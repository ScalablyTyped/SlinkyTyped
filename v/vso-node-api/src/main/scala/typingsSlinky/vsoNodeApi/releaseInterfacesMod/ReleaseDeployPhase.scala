package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseDeployPhase extends js.Object {
  var deploymentJobs: js.Array[DeploymentJob] = js.native
  var errorLog: String = js.native
  var id: Double = js.native
  var manualInterventions: js.Array[ManualIntervention] = js.native
  var name: String = js.native
  var phaseId: String = js.native
  var phaseType: DeployPhaseTypes = js.native
  var rank: Double = js.native
  var runPlanId: String = js.native
  var status: DeployPhaseStatus = js.native
}

object ReleaseDeployPhase {
  @scala.inline
  def apply(
    deploymentJobs: js.Array[DeploymentJob],
    errorLog: String,
    id: Double,
    manualInterventions: js.Array[ManualIntervention],
    name: String,
    phaseId: String,
    phaseType: DeployPhaseTypes,
    rank: Double,
    runPlanId: String,
    status: DeployPhaseStatus
  ): ReleaseDeployPhase = {
    val __obj = js.Dynamic.literal(deploymentJobs = deploymentJobs.asInstanceOf[js.Any], errorLog = errorLog.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], manualInterventions = manualInterventions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phaseId = phaseId.asInstanceOf[js.Any], phaseType = phaseType.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], runPlanId = runPlanId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDeployPhase]
  }
  @scala.inline
  implicit class ReleaseDeployPhaseOps[Self <: ReleaseDeployPhase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentJobs(value: js.Array[DeploymentJob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorLog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualInterventions(value: js.Array[ManualIntervention]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualInterventions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhaseId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhaseType(value: DeployPhaseTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunPlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runPlanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: DeployPhaseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

