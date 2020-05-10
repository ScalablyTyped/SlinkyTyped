package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroup extends DeploymentGroupReference {
  var machineCount: Double = js.native
  var machines: js.Array[DeploymentMachine] = js.native
}

object DeploymentGroup {
  @scala.inline
  def apply(
    id: Double,
    machineCount: Double,
    machines: js.Array[DeploymentMachine],
    name: String,
    pool: TaskAgentPoolReference,
    project: ProjectReference
  ): DeploymentGroup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], machineCount = machineCount.asInstanceOf[js.Any], machines = machines.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroup]
  }
  @scala.inline
  implicit class DeploymentGroupOps[Self <: DeploymentGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMachineCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineCount")(value.asInstanceOf[js.Any])
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

