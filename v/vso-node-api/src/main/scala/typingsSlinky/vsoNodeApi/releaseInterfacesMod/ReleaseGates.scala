package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeploymentJobsVarargs(value: DeploymentJob*): Self = this.set("deploymentJobs", js.Array(value :_*))
    
    @scala.inline
    def setDeploymentJobs(value: js.Array[DeploymentJob]): Self = this.set("deploymentJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedOn(value: js.Date): Self = this.set("lastModifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunPlanId(value: String): Self = this.set("runPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStabilizationCompletedOn(value: js.Date): Self = this.set("stabilizationCompletedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedOn(value: js.Date): Self = this.set("startedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: GateStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
