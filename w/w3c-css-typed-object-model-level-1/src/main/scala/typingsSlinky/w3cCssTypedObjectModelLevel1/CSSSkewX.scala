package typingsSlinky.w3cCssTypedObjectModelLevel1

import typingsSlinky.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSSkewX extends CSSTransformComponent {
  
  var ax: CSSNumericValue = js.native
}
object CSSSkewX {
  
  @scala.inline
  def apply(ax: CSSNumericValue, is2D: Boolean, toMatrix: () => DOMMatrix): CSSSkewX = {
    val __obj = js.Dynamic.literal(ax = ax.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSSkewX]
  }
  
  @scala.inline
  implicit class CSSSkewXMutableBuilder[Self <: CSSSkewX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAx(value: CSSNumericValue): Self = StObject.set(x, "ax", value.asInstanceOf[js.Any])
  }
}
