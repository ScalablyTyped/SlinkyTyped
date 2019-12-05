package typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseDefinitionQueryOrder extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseDefinitionQueryOrder")
@js.native
object ReleaseDefinitionQueryOrder extends js.Object {
  @js.native
  sealed trait IdAscending extends ReleaseDefinitionQueryOrder
  
  @js.native
  sealed trait IdDescending extends ReleaseDefinitionQueryOrder
  
  @js.native
  sealed trait NameAscending extends ReleaseDefinitionQueryOrder
  
  @js.native
  sealed trait NameDescending extends ReleaseDefinitionQueryOrder
  
  /* 0 */ val IdAscending: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder.IdAscending with Double = js.native
  /* 1 */ val IdDescending: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder.IdDescending with Double = js.native
  /* 2 */ val NameAscending: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder.NameAscending with Double = js.native
  /* 3 */ val NameDescending: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder.NameDescending with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseDefinitionQueryOrder with Double] = js.native
}

