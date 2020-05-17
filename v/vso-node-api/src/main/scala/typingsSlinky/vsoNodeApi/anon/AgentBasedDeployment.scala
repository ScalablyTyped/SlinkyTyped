package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentBasedDeployment extends js.Object {
  var agentBasedDeployment: scala.Double = js.native
  var machineGroupBasedDeployment: scala.Double = js.native
  var runOnServer: scala.Double = js.native
  var undefined: scala.Double = js.native
}

object AgentBasedDeployment {
  @scala.inline
  def apply(
    agentBasedDeployment: scala.Double,
    machineGroupBasedDeployment: scala.Double,
    runOnServer: scala.Double,
    undefined: scala.Double
  ): AgentBasedDeployment = {
    val __obj = js.Dynamic.literal(agentBasedDeployment = agentBasedDeployment.asInstanceOf[js.Any], machineGroupBasedDeployment = machineGroupBasedDeployment.asInstanceOf[js.Any], runOnServer = runOnServer.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentBasedDeployment]
  }
  @scala.inline
  implicit class AgentBasedDeploymentOps[Self <: AgentBasedDeployment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentBasedDeployment(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentBasedDeployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMachineGroupBasedDeployment(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineGroupBasedDeployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunOnServer(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOnServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndefined(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

