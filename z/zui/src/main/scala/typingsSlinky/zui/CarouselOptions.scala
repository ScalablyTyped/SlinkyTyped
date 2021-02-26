package typingsSlinky.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarouselOptions extends StObject {
  
  var interval: js.UndefOr[Double] = js.native
  
  var keyboard: js.UndefOr[Boolean] = js.native
  
  var pause: js.UndefOr[String] = js.native
  
  var wrap: js.UndefOr[Boolean] = js.native
}
object CarouselOptions {
  
  @scala.inline
  def apply(): CarouselOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselOptions]
  }
  
  @scala.inline
  implicit class CarouselOptionsMutableBuilder[Self <: CarouselOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setPause(value: String): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    @scala.inline
    def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
