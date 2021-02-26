package typingsSlinky.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpecialTargets extends StObject
@JSImport("xstate/lib/types", "SpecialTargets")
@js.native
object SpecialTargets extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SpecialTargets with String] = js.native
  
  @js.native
  sealed trait Internal extends SpecialTargets
  /* "#_internal" */ val Internal: typingsSlinky.xstate.typesMod.SpecialTargets.Internal with String = js.native
  
  @js.native
  sealed trait Parent extends SpecialTargets
  /* "#_parent" */ val Parent: typingsSlinky.xstate.typesMod.SpecialTargets.Parent with String = js.native
}
