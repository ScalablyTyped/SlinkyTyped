package typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryOption extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "QueryOption")
@js.native
object QueryOption extends js.Object {
  @js.native
  sealed trait Doing extends QueryOption
  
  @js.native
  sealed trait Done extends QueryOption
  
  @js.native
  sealed trait Followed extends QueryOption
  
  /* 1 */ val Doing: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryOption.Doing with Double = js.native
  /* 2 */ val Done: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryOption.Done with Double = js.native
  /* 3 */ val Followed: typingsSlinky.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.QueryOption.Followed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryOption with Double] = js.native
}

