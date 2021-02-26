package typingsSlinky.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlanUserPermissions extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "PlanUserPermissions")
@js.native
object PlanUserPermissions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlanUserPermissions with Double] = js.native
  
  /**
    * Full control permission for this plan.
    */
  @js.native
  sealed trait AllPermissions extends PlanUserPermissions
  /* 15 */ val AllPermissions: typingsSlinky.vsoNodeApi.workInterfacesMod.PlanUserPermissions.AllPermissions with Double = js.native
  
  /**
    * Permission to delete this plan.
    */
  @js.native
  sealed trait Delete extends PlanUserPermissions
  /* 4 */ val Delete: typingsSlinky.vsoNodeApi.workInterfacesMod.PlanUserPermissions.Delete with Double = js.native
  
  /**
    * Permission to update this plan.
    */
  @js.native
  sealed trait Edit extends PlanUserPermissions
  /* 2 */ val Edit: typingsSlinky.vsoNodeApi.workInterfacesMod.PlanUserPermissions.Edit with Double = js.native
  
  /**
    * Permission to manage this plan.
    */
  @js.native
  sealed trait Manage extends PlanUserPermissions
  /* 8 */ val Manage: typingsSlinky.vsoNodeApi.workInterfacesMod.PlanUserPermissions.Manage with Double = js.native
  
  /**
    * None
    */
  @js.native
  sealed trait None extends PlanUserPermissions
  /* 0 */ val None: typingsSlinky.vsoNodeApi.workInterfacesMod.PlanUserPermissions.None with Double = js.native
  
  /**
    * Permission to view this plan.
    */
  @js.native
  sealed trait View extends PlanUserPermissions
  /* 1 */ val View: typingsSlinky.vsoNodeApi.workInterfacesMod.PlanUserPermissions.View with Double = js.native
}
