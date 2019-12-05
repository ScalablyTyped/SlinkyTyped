package typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReportingRevisionsExpand extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "ReportingRevisionsExpand")
@js.native
object ReportingRevisionsExpand extends js.Object {
  @js.native
  sealed trait Fields extends ReportingRevisionsExpand
  
  @js.native
  sealed trait None extends ReportingRevisionsExpand
  
  /* 1 */ val Fields: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.ReportingRevisionsExpand.Fields with Double = js.native
  /* 0 */ val None: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.ReportingRevisionsExpand.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReportingRevisionsExpand with Double] = js.native
}

