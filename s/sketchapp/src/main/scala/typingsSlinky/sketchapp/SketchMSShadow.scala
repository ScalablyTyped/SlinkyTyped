package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.MSInnerShadow
import typingsSlinky.sketchapp.sketchappStrings.shadow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSShadow extends StObject {
  
  var _class: shadow | MSInnerShadow = js.native
  
  var blurRadius: Double = js.native
  
  var color: SketchMSColor = js.native
  
  var contextSettings: SketchMSGraphicsContextSettings = js.native
  
  var isEnabled: Boolean = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  var spread: Double = js.native
}
object SketchMSShadow {
  
  @scala.inline
  def apply(
    _class: shadow | MSInnerShadow,
    blurRadius: Double,
    color: SketchMSColor,
    contextSettings: SketchMSGraphicsContextSettings,
    isEnabled: Boolean,
    offsetX: Double,
    offsetY: Double,
    spread: Double
  ): SketchMSShadow = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], blurRadius = blurRadius.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], spread = spread.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSShadow]
  }
  
  @scala.inline
  implicit class SketchMSShadowMutableBuilder[Self <: SketchMSShadow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlurRadius(value: Double): Self = StObject.set(x, "blurRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: SketchMSColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextSettings(value: SketchMSGraphicsContextSettings): Self = StObject.set(x, "contextSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpread(value: Double): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: shadow | MSInnerShadow): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
