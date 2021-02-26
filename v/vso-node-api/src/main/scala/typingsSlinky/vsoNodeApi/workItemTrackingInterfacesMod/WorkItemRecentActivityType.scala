package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkItemRecentActivityType extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemRecentActivityType")
@js.native
object WorkItemRecentActivityType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemRecentActivityType with Double] = js.native
  
  @js.native
  sealed trait Deleted extends WorkItemRecentActivityType
  /* 2 */ val Deleted: typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemRecentActivityType.Deleted with Double = js.native
  
  @js.native
  sealed trait Edited extends WorkItemRecentActivityType
  /* 1 */ val Edited: typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemRecentActivityType.Edited with Double = js.native
  
  @js.native
  sealed trait Restored extends WorkItemRecentActivityType
  /* 3 */ val Restored: typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemRecentActivityType.Restored with Double = js.native
  
  @js.native
  sealed trait Visited extends WorkItemRecentActivityType
  /* 0 */ val Visited: typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemRecentActivityType.Visited with Double = js.native
}
