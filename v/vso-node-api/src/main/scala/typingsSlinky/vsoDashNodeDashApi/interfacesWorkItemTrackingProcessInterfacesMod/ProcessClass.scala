package typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProcessClass extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "ProcessClass")
@js.native
object ProcessClass extends js.Object {
  @js.native
  sealed trait Custom extends ProcessClass
  
  @js.native
  sealed trait Derived extends ProcessClass
  
  @js.native
  sealed trait System extends ProcessClass
  
  /* 2 */ val Custom: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.ProcessClass.Custom with Double = js.native
  /* 1 */ val Derived: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.ProcessClass.Derived with Double = js.native
  /* 0 */ val System: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.ProcessClass.System with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessClass with Double] = js.native
}

