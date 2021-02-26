package typingsSlinky.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GroupMemberPermission extends StObject
@JSImport("vso-node-api/interfaces/DashboardInterfaces", "GroupMemberPermission")
@js.native
object GroupMemberPermission extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupMemberPermission with Double] = js.native
  
  @js.native
  sealed trait Edit extends GroupMemberPermission
  /* 1 */ val Edit: typingsSlinky.vsoNodeApi.dashboardInterfacesMod.GroupMemberPermission.Edit with Double = js.native
  
  @js.native
  sealed trait Manage extends GroupMemberPermission
  /* 2 */ val Manage: typingsSlinky.vsoNodeApi.dashboardInterfacesMod.GroupMemberPermission.Manage with Double = js.native
  
  @js.native
  sealed trait ManagePermissions extends GroupMemberPermission
  /* 3 */ val ManagePermissions: typingsSlinky.vsoNodeApi.dashboardInterfacesMod.GroupMemberPermission.ManagePermissions with Double = js.native
  
  @js.native
  sealed trait None extends GroupMemberPermission
  /* 0 */ val None: typingsSlinky.vsoNodeApi.dashboardInterfacesMod.GroupMemberPermission.None with Double = js.native
}
