package typingsSlinky.wegameApi.wx.types

import typingsSlinky.wegameApi.wegameApiStrings.center
import typingsSlinky.wegameApi.wegameApiStrings.left
import typingsSlinky.wegameApi.wegameApiStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonStyle extends StObject {
  
  /**
    * 格式#ff0000
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * 格式#ff0000
    */
  var borderColor: js.UndefOr[String] = js.native
  
  var borderRadius: js.UndefOr[Double] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var left: js.UndefOr[Double] = js.native
  
  var lineHeight: js.UndefOr[Double] = js.native
  
  var textAlign: js.UndefOr[left | center | right] = js.native
  
  var top: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ButtonStyle {
  
  @scala.inline
  def apply(): ButtonStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonStyle]
  }
  
  @scala.inline
  implicit class ButtonStyleMutableBuilder[Self <: ButtonStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setTextAlign(value: left | center | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
