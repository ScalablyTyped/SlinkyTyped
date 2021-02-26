package typingsSlinky.styledComponents.styledComponentsMod

import typingsSlinky.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseThemedCssFunction[T /* <: js.Object */] extends StObject {
  
  def apply(first: TemplateStringsArray, interpolations: SimpleInterpolation*): FlattenSimpleInterpolation = js.native
  def apply(first: CSSObject, interpolations: SimpleInterpolation*): FlattenSimpleInterpolation = js.native
  def apply(
    first: InterpolationFunction[ThemedStyledProps[js.Object, T]],
    interpolations: (Interpolation[ThemedStyledProps[js.Object, T]])*
  ): FlattenInterpolation[ThemedStyledProps[js.Object, T]] = js.native
}
