package typingsSlinky.victory.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeBaseProps extends StObject {
  
  var colorScale: js.Array[String] = js.native
  
  var height: Double = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var width: Double = js.native
}
object ThemeBaseProps {
  
  @scala.inline
  def apply(colorScale: js.Array[String], height: Double, width: Double): ThemeBaseProps = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeBaseProps]
  }
  
  @scala.inline
  implicit class ThemeBasePropsMutableBuilder[Self <: ThemeBaseProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorScale(value: js.Array[String]): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorScaleVarargs(value: String*): Self = StObject.set(x, "colorScale", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
