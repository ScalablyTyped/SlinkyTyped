package typingsSlinky.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkItemTypeClass extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessDefinitionsInterfaces", "WorkItemTypeClass")
@js.native
object WorkItemTypeClass extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemTypeClass with Double] = js.native
  
  @js.native
  sealed trait Custom extends WorkItemTypeClass
  /* 2 */ val Custom: typingsSlinky.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeClass.Custom with Double = js.native
  
  @js.native
  sealed trait Derived extends WorkItemTypeClass
  /* 1 */ val Derived: typingsSlinky.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeClass.Derived with Double = js.native
  
  @js.native
  sealed trait System extends WorkItemTypeClass
  /* 0 */ val System: typingsSlinky.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeClass.System with Double = js.native
}
