package typingsSlinky.sweetalert

import typingsSlinky.sweetalert.anon.PartialSwalOptions
import typingsSlinky.sweetalert.optionsButtonsMod.ButtonList
import typingsSlinky.sweetalert.optionsContentMod.ContentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @JSImport("sweetalert/typings/modules/options", "getOpts")
  @js.native
  def getOpts(params: (String | PartialSwalOptions)*): SwalOptions = js.native
  
  @JSImport("sweetalert/typings/modules/options", "setDefaults")
  @js.native
  def setDefaults(opts: js.Object): Unit = js.native
  
  @js.native
  trait SwalOptions extends StObject {
    
    var buttons: ButtonList | (js.Array[String | Boolean]) = js.native
    
    var className: String = js.native
    
    var closeOnClickOutside: Boolean = js.native
    
    var closeOnEsc: Boolean = js.native
    
    var content: ContentOptions = js.native
    
    var dangerMode: Boolean = js.native
    
    var icon: String = js.native
    
    var text: String = js.native
    
    var timer: Double = js.native
    
    var title: String = js.native
  }
  object SwalOptions {
    
    @scala.inline
    def apply(
      buttons: ButtonList | (js.Array[String | Boolean]),
      className: String,
      closeOnClickOutside: Boolean,
      closeOnEsc: Boolean,
      content: ContentOptions,
      dangerMode: Boolean,
      icon: String,
      text: String,
      timer: Double,
      title: String
    ): SwalOptions = {
      val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closeOnClickOutside = closeOnClickOutside.asInstanceOf[js.Any], closeOnEsc = closeOnEsc.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], dangerMode = dangerMode.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwalOptions]
    }
    
    @scala.inline
    implicit class SwalOptionsMutableBuilder[Self <: SwalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtons(value: ButtonList | (js.Array[String | Boolean])): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsVarargs(value: (String | Boolean)*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnClickOutside(value: Boolean): Self = StObject.set(x, "closeOnClickOutside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: ContentOptions): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerMode(value: Boolean): Self = StObject.set(x, "dangerMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
