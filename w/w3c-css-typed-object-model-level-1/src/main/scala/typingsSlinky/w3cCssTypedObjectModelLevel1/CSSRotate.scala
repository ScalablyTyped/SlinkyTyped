package typingsSlinky.w3cCssTypedObjectModelLevel1

import typingsSlinky.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSRotate extends CSSTransformComponent {
  
  var angle: CSSNumericValue = js.native
  
  var x: CSSNumberish = js.native
  
  var y: CSSNumberish = js.native
  
  var z: CSSNumberish = js.native
}
object CSSRotate {
  
  @scala.inline
  def apply(
    angle: CSSNumericValue,
    is2D: Boolean,
    toMatrix: () => DOMMatrix,
    x: CSSNumberish,
    y: CSSNumberish,
    z: CSSNumberish
  ): CSSRotate = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSRotate]
  }
  
  @scala.inline
  implicit class CSSRotateMutableBuilder[Self <: CSSRotate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: CSSNumericValue): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: CSSNumberish): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: CSSNumberish): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: CSSNumberish): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
