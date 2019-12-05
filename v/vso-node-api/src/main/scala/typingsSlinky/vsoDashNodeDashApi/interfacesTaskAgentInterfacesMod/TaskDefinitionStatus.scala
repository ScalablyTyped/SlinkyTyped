package typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskDefinitionStatus extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskDefinitionStatus")
@js.native
object TaskDefinitionStatus extends js.Object {
  @js.native
  sealed trait AlreadyUpToDate extends TaskDefinitionStatus
  
  @js.native
  sealed trait InlineUpdateReceived extends TaskDefinitionStatus
  
  @js.native
  sealed trait Installed extends TaskDefinitionStatus
  
  @js.native
  sealed trait Preinstalled extends TaskDefinitionStatus
  
  @js.native
  sealed trait ReceivedInstallOrUpdate extends TaskDefinitionStatus
  
  @js.native
  sealed trait ReceivedUninstall extends TaskDefinitionStatus
  
  @js.native
  sealed trait RequestedUpdate extends TaskDefinitionStatus
  
  @js.native
  sealed trait Uninstalled extends TaskDefinitionStatus
  
  @js.native
  sealed trait Updated extends TaskDefinitionStatus
  
  /* 8 */ val AlreadyUpToDate: typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.AlreadyUpToDate with Double = js.native
  /* 9 */ val InlineUpdateReceived: typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.InlineUpdateReceived with Double = js.native
  /* 3 */ val Installed: typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.Installed with Double = js.native
  /* 1 */ val Preinstalled: typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.Preinstalled with Double = js.native
  /* 2 */ val ReceivedInstallOrUpdate: typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.ReceivedInstallOrUpdate with Double = js.native
  /* 4 */ val ReceivedUninstall: typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.ReceivedUninstall with Double = js.native
  /* 6 */ val RequestedUpdate: typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.RequestedUpdate with Double = js.native
  /* 5 */ val Uninstalled: typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.Uninstalled with Double = js.native
  /* 7 */ val Updated: typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.Updated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskDefinitionStatus with Double] = js.native
}

