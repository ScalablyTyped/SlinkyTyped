package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseGates extends js.Object {
  var deploymentJobs: js.Array[DeploymentJob] = js.native
  var id: Double = js.native
  var lastModifiedOn: js.Date = js.native
  var runPlanId: String = js.native
  var stabilizationCompletedOn: js.Date = js.native
  var startedOn: js.Date = js.native
  var status: GateStatus = js.native
}

object ReleaseGates {
  @scala.inline
  def apply(
    deploymentJobs: js.Array[DeploymentJob],
    id: Double,
    lastModifiedOn: js.Date,
    runPlanId: String,
    stabilizationCompletedOn: js.Date,
    startedOn: js.Date,
    status: GateStatus
  ): ReleaseGates = {
    val __obj = js.Dynamic.literal(deploymentJobs = deploymentJobs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedOn = lastModifiedOn.asInstanceOf[js.Any], runPlanId = runPlanId.asInstanceOf[js.Any], stabilizationCompletedOn = stabilizationCompletedOn.asInstanceOf[js.Any], startedOn = startedOn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseGates]
  }
  @scala.inline
  implicit class ReleaseGatesOps[Self <: ReleaseGates] (val x: Self) extends AnyVal {
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
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunPlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runPlanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStabilizationCompletedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stabilizationCompletedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: GateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

