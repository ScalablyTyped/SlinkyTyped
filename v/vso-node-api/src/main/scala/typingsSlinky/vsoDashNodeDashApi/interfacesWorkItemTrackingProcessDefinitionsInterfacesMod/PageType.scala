package typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessDefinitionsInterfaces", "PageType")
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
  
  /* 4 */ val Attachments: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PageType.Attachments with Double = js.native
  /* 1 */ val Custom: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PageType.Custom with Double = js.native
  /* 2 */ val History: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PageType.History with Double = js.native
  /* 3 */ val Links: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PageType.Links with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageType with Double] = js.native
}

