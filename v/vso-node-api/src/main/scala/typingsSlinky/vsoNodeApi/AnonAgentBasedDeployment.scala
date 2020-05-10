package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAgentBasedDeployment extends js.Object {
  var agentBasedDeployment: Double = js.native
  var machineGroupBasedDeployment: Double = js.native
  var runOnServer: Double = js.native
  var undefined: Double = js.native
}

object AnonAgentBasedDeployment {
  @scala.inline
  def apply(
    agentBasedDeployment: Double,
    machineGroupBasedDeployment: Double,
    runOnServer: Double,
    undefined: Double
  ): AnonAgentBasedDeployment = {
    val __obj = js.Dynamic.literal(agentBasedDeployment = agentBasedDeployment.asInstanceOf[js.Any], machineGroupBasedDeployment = machineGroupBasedDeployment.asInstanceOf[js.Any], runOnServer = runOnServer.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAgentBasedDeployment]
  }
  @scala.inline
  implicit class AnonAgentBasedDeploymentOps[Self <: AnonAgentBasedDeployment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentBasedDeployment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentBasedDeployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMachineGroupBasedDeployment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineGroupBasedDeployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunOnServer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOnServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndefined(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

