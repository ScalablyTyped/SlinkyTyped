package typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResultDetails extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "ResultDetails")
@js.native
object ResultDetails extends js.Object {
  @js.native
  sealed trait Iterations extends ResultDetails
  
  @js.native
  sealed trait None extends ResultDetails
  
  @js.native
  sealed trait WorkItems extends ResultDetails
  
  /* 1 */ val Iterations: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.ResultDetails.Iterations with Double = js.native
  /* 0 */ val None: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.ResultDetails.None with Double = js.native
  /* 2 */ val WorkItems: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.ResultDetails.WorkItems with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResultDetails with Double] = js.native
}

