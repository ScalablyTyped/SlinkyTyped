package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentMachinesChangeEvent extends js.Object {
  var machineGroupReference: DeploymentGroupReference = js.native
  var machines: js.Array[DeploymentMachine] = js.native
}

object DeploymentMachinesChangeEvent {
  @scala.inline
  def apply(machineGroupReference: DeploymentGroupReference, machines: js.Array[DeploymentMachine]): DeploymentMachinesChangeEvent = {
    val __obj = js.Dynamic.literal(machineGroupReference = machineGroupReference.asInstanceOf[js.Any], machines = machines.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentMachinesChangeEvent]
  }
  @scala.inline
  implicit class DeploymentMachinesChangeEventOps[Self <: DeploymentMachinesChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMachineGroupReference(value: DeploymentGroupReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineGroupReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMachines(value: js.Array[DeploymentMachine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machines")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

