package typingsSlinky.wegameApi.anon

import typingsSlinky.wegameApi.wx.types.ButtonStyle
import typingsSlinky.wegameApi.wx.types.ButtonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Text extends StObject {
  
  var image: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[ButtonStyle] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var `type`: ButtonType = js.native
}
object Text {
  
  @scala.inline
  def apply(`type`: ButtonType): Text = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setStyle(value: ButtonStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: ButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
