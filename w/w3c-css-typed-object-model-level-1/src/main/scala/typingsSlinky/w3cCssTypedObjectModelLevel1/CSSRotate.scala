package typingsSlinky.w3cCssTypedObjectModelLevel1

import typingsSlinky.std.DOMMatrix
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
  implicit class CSSRotateOps[Self <: CSSRotate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAngle(value: CSSNumericValue): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: CSSNumberish): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: CSSNumberish): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: CSSNumberish): Self = this.set("z", value.asInstanceOf[js.Any])
  }
}
