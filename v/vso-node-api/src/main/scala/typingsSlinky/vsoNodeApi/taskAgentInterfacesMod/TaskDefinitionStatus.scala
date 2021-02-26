package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskDefinitionStatus extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskDefinitionStatus")
@js.native
object TaskDefinitionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskDefinitionStatus with Double] = js.native
  
  @js.native
  sealed trait AlreadyUpToDate extends TaskDefinitionStatus
  /* 8 */ val AlreadyUpToDate: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.AlreadyUpToDate with Double = js.native
  
  @js.native
  sealed trait InlineUpdateReceived extends TaskDefinitionStatus
  /* 9 */ val InlineUpdateReceived: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.InlineUpdateReceived with Double = js.native
  
  @js.native
  sealed trait Installed extends TaskDefinitionStatus
  /* 3 */ val Installed: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.Installed with Double = js.native
  
  @js.native
  sealed trait Preinstalled extends TaskDefinitionStatus
  /* 1 */ val Preinstalled: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.Preinstalled with Double = js.native
  
  @js.native
  sealed trait ReceivedInstallOrUpdate extends TaskDefinitionStatus
  /* 2 */ val ReceivedInstallOrUpdate: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.ReceivedInstallOrUpdate with Double = js.native
  
  @js.native
  sealed trait ReceivedUninstall extends TaskDefinitionStatus
  /* 4 */ val ReceivedUninstall: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.ReceivedUninstall with Double = js.native
  
  @js.native
  sealed trait RequestedUpdate extends TaskDefinitionStatus
  /* 6 */ val RequestedUpdate: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.RequestedUpdate with Double = js.native
  
  @js.native
  sealed trait Uninstalled extends TaskDefinitionStatus
  /* 5 */ val Uninstalled: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.Uninstalled with Double = js.native
  
  @js.native
  sealed trait Updated extends TaskDefinitionStatus
  /* 7 */ val Updated: typingsSlinky.vsoNodeApi.taskAgentInterfacesMod.TaskDefinitionStatus.Updated with Double = js.native
}
