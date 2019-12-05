package typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GetProcessExpandLevel extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "GetProcessExpandLevel")
@js.native
object GetProcessExpandLevel extends js.Object {
  @js.native
  sealed trait None extends GetProcessExpandLevel
  
  @js.native
  sealed trait Projects extends GetProcessExpandLevel
  
  /* 0 */ val None: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.GetProcessExpandLevel.None with Double = js.native
  /* 1 */ val Projects: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.GetProcessExpandLevel.Projects with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetProcessExpandLevel with Double] = js.native
}

