package typingsSlinky.winrt.Windows.UI.Input.Inking

import typingsSlinky.winrt.Windows.Foundation.Size
import typingsSlinky.winrt.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInkDrawingAttributes extends StObject {
  
  var color: Color = js.native
  
  var fitToCurve: Boolean = js.native
  
  var ignorePressure: Boolean = js.native
  
  var penTip: PenTipShape = js.native
  
  var size: Size = js.native
}
object IInkDrawingAttributes {
  
  @scala.inline
  def apply(color: Color, fitToCurve: Boolean, ignorePressure: Boolean, penTip: PenTipShape, size: Size): IInkDrawingAttributes = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fitToCurve = fitToCurve.asInstanceOf[js.Any], ignorePressure = ignorePressure.asInstanceOf[js.Any], penTip = penTip.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInkDrawingAttributes]
  }
  
  @scala.inline
  implicit class IInkDrawingAttributesMutableBuilder[Self <: IInkDrawingAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitToCurve(value: Boolean): Self = StObject.set(x, "fitToCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePressure(value: Boolean): Self = StObject.set(x, "ignorePressure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPenTip(value: PenTipShape): Self = StObject.set(x, "penTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
