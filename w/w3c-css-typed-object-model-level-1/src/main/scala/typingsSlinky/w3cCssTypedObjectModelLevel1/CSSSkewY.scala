package typingsSlinky.w3cCssTypedObjectModelLevel1

import typingsSlinky.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSSkewY extends CSSTransformComponent {
  
  var ay: CSSNumericValue = js.native
}
object CSSSkewY {
  
  @scala.inline
  def apply(ay: CSSNumericValue, is2D: Boolean, toMatrix: () => DOMMatrix): CSSSkewY = {
    val __obj = js.Dynamic.literal(ay = ay.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSSkewY]
  }
  
  @scala.inline
  implicit class CSSSkewYMutableBuilder[Self <: CSSSkewY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAy(value: CSSNumericValue): Self = StObject.set(x, "ay", value.asInstanceOf[js.Any])
  }
}
