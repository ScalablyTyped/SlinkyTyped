package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentMachinesChangeEvent extends StObject {
  
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
  implicit class DeploymentMachinesChangeEventMutableBuilder[Self <: DeploymentMachinesChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMachineGroupReference(value: DeploymentGroupReference): Self = StObject.set(x, "machineGroupReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachines(value: js.Array[DeploymentMachine]): Self = StObject.set(x, "machines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachinesVarargs(value: DeploymentMachine*): Self = StObject.set(x, "machines", js.Array(value :_*))
  }
}
