package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGFitToViewBox extends StObject {
  
  val preserveAspectRatio: org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio = js.native
  
  val viewBox: org.scalajs.dom.raw.SVGAnimatedRect = js.native
}
object SVGFitToViewBox {
  
  @scala.inline
  def apply(
    preserveAspectRatio: org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio,
    viewBox: org.scalajs.dom.raw.SVGAnimatedRect
  ): org.scalajs.dom.raw.SVGFitToViewBox = {
    val __obj = js.Dynamic.literal(preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.SVGFitToViewBox]
  }
  
  @scala.inline
  implicit class SVGFitToViewBoxMutableBuilder[Self <: org.scalajs.dom.raw.SVGFitToViewBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreserveAspectRatio(value: org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBox(value: org.scalajs.dom.raw.SVGAnimatedRect): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
  }
}
