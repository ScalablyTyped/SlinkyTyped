package typingsSlinky.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.CheckboxTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.CheckboxTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.CheckboxTheme> */
@js.native
trait Checkbox extends StObject {
  
  var activeColor: js.UndefOr[String] = js.native
  
  var dark: CheckboxTheme = js.native
  
  var disabledColor: js.UndefOr[String] = js.native
  
  var fontColor: js.UndefOr[String] = js.native
  
  var light: CheckboxTheme = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object Checkbox {
  
  @scala.inline
  def apply(dark: CheckboxTheme, light: CheckboxTheme): Checkbox = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkbox]
  }
  
  @scala.inline
  implicit class CheckboxMutableBuilder[Self <: Checkbox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
    
    @scala.inline
    def setDark(value: CheckboxTheme): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledColor(value: String): Self = StObject.set(x, "disabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledColorUndefined: Self = StObject.set(x, "disabledColor", js.undefined)
    
    @scala.inline
    def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    @scala.inline
    def setLight(value: CheckboxTheme): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
