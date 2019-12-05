package typingsSlinky.vsoDashNodeDashApi.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GroupMemberPermission extends js.Object

@JSImport("vso-node-api/interfaces/DashboardInterfaces", "GroupMemberPermission")
@js.native
object GroupMemberPermission extends js.Object {
  @js.native
  sealed trait Edit extends GroupMemberPermission
  
  @js.native
  sealed trait Manage extends GroupMemberPermission
  
  @js.native
  sealed trait ManagePermissions extends GroupMemberPermission
  
  @js.native
  sealed trait None extends GroupMemberPermission
  
  /* 1 */ val Edit: typingsSlinky.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.GroupMemberPermission.Edit with Double = js.native
  /* 2 */ val Manage: typingsSlinky.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.GroupMemberPermission.Manage with Double = js.native
  /* 3 */ val ManagePermissions: typingsSlinky.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.GroupMemberPermission.ManagePermissions with Double = js.native
  /* 0 */ val None: typingsSlinky.vsoDashNodeDashApi.interfacesDashboardInterfacesMod.GroupMemberPermission.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupMemberPermission with Double] = js.native
}

