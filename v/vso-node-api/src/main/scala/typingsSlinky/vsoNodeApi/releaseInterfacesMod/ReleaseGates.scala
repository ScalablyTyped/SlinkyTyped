package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseGates extends js.Object {
  var deploymentJobs: js.Array[DeploymentJob]
  var id: Double
  var lastModifiedOn: js.Date
  var runPlanId: String
  var stabilizationCompletedOn: js.Date
  var startedOn: js.Date
  var status: GateStatus
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
}

