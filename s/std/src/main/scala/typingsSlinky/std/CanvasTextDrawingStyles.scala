package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasTextDrawingStyles extends StObject {
  
  var direction: CanvasDirection = js.native
  
  var font: java.lang.String = js.native
  
  var textAlign: CanvasTextAlign = js.native
  
  var textBaseline: CanvasTextBaseline = js.native
}
object CanvasTextDrawingStyles {
  
  @scala.inline
  def apply(
    direction: CanvasDirection,
    font: java.lang.String,
    textAlign: CanvasTextAlign,
    textBaseline: CanvasTextBaseline
  ): CanvasTextDrawingStyles = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasTextDrawingStyles]
  }
  
  @scala.inline
  implicit class CanvasTextDrawingStylesMutableBuilder[Self <: CanvasTextDrawingStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: CanvasDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: java.lang.String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: CanvasTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBaseline(value: CanvasTextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
  }
}
