package typingsSlinky.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TeamDashboardPermission extends StObject
@JSImport("vso-node-api/interfaces/DashboardInterfaces", "TeamDashboardPermission")
@js.native
object TeamDashboardPermission extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TeamDashboardPermission with Double] = js.native
  
  @js.native
  sealed trait Create extends TeamDashboardPermission
  /* 2 */ val Create: typingsSlinky.vsoNodeApi.dashboardInterfacesMod.TeamDashboardPermission.Create with Double = js.native
  
  @js.native
  sealed trait Delete extends TeamDashboardPermission
  /* 8 */ val Delete: typingsSlinky.vsoNodeApi.dashboardInterfacesMod.TeamDashboardPermission.Delete with Double = js.native
  
  @js.native
  sealed trait Edit extends TeamDashboardPermission
  /* 4 */ val Edit: typingsSlinky.vsoNodeApi.dashboardInterfacesMod.TeamDashboardPermission.Edit with Double = js.native
  
  @js.native
  sealed trait ManagePermissions extends TeamDashboardPermission
  /* 16 */ val ManagePermissions: typingsSlinky.vsoNodeApi.dashboardInterfacesMod.TeamDashboardPermission.ManagePermissions with Double = js.native
  
  @js.native
  sealed trait None extends TeamDashboardPermission
  /* 0 */ val None: typingsSlinky.vsoNodeApi.dashboardInterfacesMod.TeamDashboardPermission.None with Double = js.native
  
  @js.native
  sealed trait Read extends TeamDashboardPermission
  /* 1 */ val Read: typingsSlinky.vsoNodeApi.dashboardInterfacesMod.TeamDashboardPermission.Read with Double = js.native
}
