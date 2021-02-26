package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseDefinitionQueryOrder extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseDefinitionQueryOrder")
@js.native
object ReleaseDefinitionQueryOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseDefinitionQueryOrder with Double] = js.native
  
  @js.native
  sealed trait IdAscending extends ReleaseDefinitionQueryOrder
  /* 0 */ val IdAscending: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionQueryOrder.IdAscending with Double = js.native
  
  @js.native
  sealed trait IdDescending extends ReleaseDefinitionQueryOrder
  /* 1 */ val IdDescending: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionQueryOrder.IdDescending with Double = js.native
  
  @js.native
  sealed trait NameAscending extends ReleaseDefinitionQueryOrder
  /* 2 */ val NameAscending: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionQueryOrder.NameAscending with Double = js.native
  
  @js.native
  sealed trait NameDescending extends ReleaseDefinitionQueryOrder
  /* 3 */ val NameDescending: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionQueryOrder.NameDescending with Double = js.native
}
