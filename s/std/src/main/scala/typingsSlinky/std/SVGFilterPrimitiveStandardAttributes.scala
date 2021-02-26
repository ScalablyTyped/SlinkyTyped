package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGFilterPrimitiveStandardAttributes extends StObject {
  
  val height: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  
  val result: org.scalajs.dom.raw.SVGAnimatedString = js.native
  
  val width: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  
  val x: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  
  val y: org.scalajs.dom.raw.SVGAnimatedLength = js.native
}
object SVGFilterPrimitiveStandardAttributes {
  
  @scala.inline
  def apply(
    height: org.scalajs.dom.raw.SVGAnimatedLength,
    result: org.scalajs.dom.raw.SVGAnimatedString,
    width: org.scalajs.dom.raw.SVGAnimatedLength,
    x: org.scalajs.dom.raw.SVGAnimatedLength,
    y: org.scalajs.dom.raw.SVGAnimatedLength
  ): org.scalajs.dom.raw.SVGFilterPrimitiveStandardAttributes = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.SVGFilterPrimitiveStandardAttributes]
  }
  
  @scala.inline
  implicit class SVGFilterPrimitiveStandardAttributesMutableBuilder[Self <: org.scalajs.dom.raw.SVGFilterPrimitiveStandardAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: org.scalajs.dom.raw.SVGAnimatedLength): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: org.scalajs.dom.raw.SVGAnimatedString): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: org.scalajs.dom.raw.SVGAnimatedLength): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: org.scalajs.dom.raw.SVGAnimatedLength): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: org.scalajs.dom.raw.SVGAnimatedLength): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
