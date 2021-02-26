package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.graphicsContextSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSGraphicsContextSettings extends StObject {
  
  var _class: graphicsContextSettings = js.native
  
  var blendMode: SketchMSGraphicsContextSettingsBlendMode = js.native
  
  var opacity: Double = js.native
}
object SketchMSGraphicsContextSettings {
  
  @scala.inline
  def apply(
    _class: graphicsContextSettings,
    blendMode: SketchMSGraphicsContextSettingsBlendMode,
    opacity: Double
  ): SketchMSGraphicsContextSettings = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSGraphicsContextSettings]
  }
  
  @scala.inline
  implicit class SketchMSGraphicsContextSettingsMutableBuilder[Self <: SketchMSGraphicsContextSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlendMode(value: SketchMSGraphicsContextSettingsBlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: graphicsContextSettings): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
