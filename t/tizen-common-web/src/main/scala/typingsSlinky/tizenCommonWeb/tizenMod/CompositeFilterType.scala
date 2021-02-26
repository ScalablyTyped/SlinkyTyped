package typingsSlinky.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompositeFilterType extends StObject
@JSImport("tizen-common-web/tizen", "CompositeFilterType")
@js.native
object CompositeFilterType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CompositeFilterType with String] = js.native
  
  @js.native
  sealed trait INTERSECTION extends CompositeFilterType
  /* "INTERSECTION" */ val INTERSECTION: typingsSlinky.tizenCommonWeb.tizenMod.CompositeFilterType.INTERSECTION with String = js.native
  
  @js.native
  sealed trait UNION extends CompositeFilterType
  /* "UNION" */ val UNION: typingsSlinky.tizenCommonWeb.tizenMod.CompositeFilterType.UNION with String = js.native
}
