package typingsSlinky.screeps

import typingsSlinky.screeps.screepsStrings.dashed
import typingsSlinky.screeps.screepsStrings.dotted
import typingsSlinky.screeps.screepsStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineStyle extends StObject {
  
  /**
    * Line color in any web format, default is #ffffff(white).
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Either undefined (solid line), dashed, or dotted.Default is undefined.
    */
  var lineStyle: js.UndefOr[dashed | dotted | solid] = js.native
  
  /**
    * Opacity value, default is 0.5.
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * Line width, default is 0.1.
    */
  var width: js.UndefOr[Double] = js.native
}
object LineStyle {
  
  @scala.inline
  def apply(): LineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineStyle]
  }
  
  @scala.inline
  implicit class LineStyleMutableBuilder[Self <: LineStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLineStyle(value: dashed | dotted | solid): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
