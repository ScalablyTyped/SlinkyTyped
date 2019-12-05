package typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BoardColumnType extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "BoardColumnType")
@js.native
object BoardColumnType extends js.Object {
  @js.native
  sealed trait InProgress extends BoardColumnType
  
  @js.native
  sealed trait Incoming extends BoardColumnType
  
  @js.native
  sealed trait Outgoing extends BoardColumnType
  
  /* 1 */ val InProgress: typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardColumnType.InProgress with Double = js.native
  /* 0 */ val Incoming: typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardColumnType.Incoming with Double = js.native
  /* 2 */ val Outgoing: typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod.BoardColumnType.Outgoing with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BoardColumnType with Double] = js.native
}

