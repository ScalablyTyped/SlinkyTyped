package typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemTypeClass extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "WorkItemTypeClass")
@js.native
object WorkItemTypeClass extends js.Object {
  @js.native
  sealed trait Custom extends WorkItemTypeClass
  
  @js.native
  sealed trait Derived extends WorkItemTypeClass
  
  @js.native
  sealed trait System extends WorkItemTypeClass
  
  /* 2 */ val Custom: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemTypeClass.Custom with Double = js.native
  /* 1 */ val Derived: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemTypeClass.Derived with Double = js.native
  /* 0 */ val System: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemTypeClass.System with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemTypeClass with Double] = js.native
}

