package typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "PageType")
@js.native
object PageType extends js.Object {
  @js.native
  sealed trait Attachments extends PageType
  
  @js.native
  sealed trait Custom extends PageType
  
  @js.native
  sealed trait History extends PageType
  
  @js.native
  sealed trait Links extends PageType
  
  /* 4 */ val Attachments: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.PageType.Attachments with Double = js.native
  /* 1 */ val Custom: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.PageType.Custom with Double = js.native
  /* 2 */ val History: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.PageType.History with Double = js.native
  /* 3 */ val Links: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.PageType.Links with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageType with Double] = js.native
}

