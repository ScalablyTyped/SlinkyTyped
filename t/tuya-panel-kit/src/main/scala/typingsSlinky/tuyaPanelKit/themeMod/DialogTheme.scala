package typingsSlinky.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogTheme extends StObject {
  
  var bg: String = js.native
  
  var cancelFontColor: String = js.native
  
  var cancelFontSize: Double = js.native
  
  var cellHeight: Double = js.native
  
  var confirmFontColor: String = js.native
  
  var confirmFontSize: Double = js.native
  
  var lineColor: String = js.native
  
  var prompt: PromptTheme = js.native
  
  var radius: Double = js.native
  
  var subTitleFontColor: String = js.native
  
  var subTitleFontSize: Double = js.native
  
  var titleFontColor: String = js.native
  
  var titleFontSize: Double = js.native
  
  var width: Double = js.native
}
object DialogTheme {
  
  @scala.inline
  def apply(
    bg: String,
    cancelFontColor: String,
    cancelFontSize: Double,
    cellHeight: Double,
    confirmFontColor: String,
    confirmFontSize: Double,
    lineColor: String,
    prompt: PromptTheme,
    radius: Double,
    subTitleFontColor: String,
    subTitleFontSize: Double,
    titleFontColor: String,
    titleFontSize: Double,
    width: Double
  ): DialogTheme = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], cancelFontColor = cancelFontColor.asInstanceOf[js.Any], cancelFontSize = cancelFontSize.asInstanceOf[js.Any], cellHeight = cellHeight.asInstanceOf[js.Any], confirmFontColor = confirmFontColor.asInstanceOf[js.Any], confirmFontSize = confirmFontSize.asInstanceOf[js.Any], lineColor = lineColor.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], subTitleFontColor = subTitleFontColor.asInstanceOf[js.Any], subTitleFontSize = subTitleFontSize.asInstanceOf[js.Any], titleFontColor = titleFontColor.asInstanceOf[js.Any], titleFontSize = titleFontSize.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogTheme]
  }
  
  @scala.inline
  implicit class DialogThemeMutableBuilder[Self <: DialogTheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelFontColor(value: String): Self = StObject.set(x, "cancelFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelFontSize(value: Double): Self = StObject.set(x, "cancelFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmFontColor(value: String): Self = StObject.set(x, "confirmFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmFontSize(value: Double): Self = StObject.set(x, "confirmFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrompt(value: PromptTheme): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleFontColor(value: String): Self = StObject.set(x, "subTitleFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleFontSize(value: Double): Self = StObject.set(x, "subTitleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontColor(value: String): Self = StObject.set(x, "titleFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontSize(value: Double): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
