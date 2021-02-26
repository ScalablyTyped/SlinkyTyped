package typingsSlinky.typedoc.optionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParameterType extends StObject
@JSImport("typedoc/dist/lib/utils/options/declaration", "ParameterType")
@js.native
object ParameterType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParameterType with Double] = js.native
  
  @js.native
  sealed trait Array extends ParameterType
  /* 5 */ val Array: typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Array with Double = js.native
  
  @js.native
  sealed trait Boolean extends ParameterType
  /* 2 */ val Boolean: typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Boolean with Double = js.native
  
  @js.native
  sealed trait Map extends ParameterType
  /* 3 */ val Map: typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Map with Double = js.native
  
  @js.native
  sealed trait Mixed extends ParameterType
  /* 4 */ val Mixed: typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Mixed with Double = js.native
  
  @js.native
  sealed trait Number extends ParameterType
  /* 1 */ val Number: typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.Number with Double = js.native
  
  @js.native
  sealed trait String extends ParameterType
  /* 0 */ val String: typingsSlinky.typedoc.optionsDeclarationMod.ParameterType.String with Double = js.native
}
