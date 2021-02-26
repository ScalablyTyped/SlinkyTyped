package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardEventInit extends EventModifierInit {
  
  var code: js.UndefOr[java.lang.String] = js.native
  
  var isComposing: js.UndefOr[scala.Boolean] = js.native
  
  var key: js.UndefOr[java.lang.String] = js.native
  
  /** @deprecated */
  var keyCode: js.UndefOr[Double] = js.native
  
  var location: js.UndefOr[Double] = js.native
  
  var repeat: js.UndefOr[scala.Boolean] = js.native
}
object KeyboardEventInit {
  
  @scala.inline
  def apply(): org.scalajs.dom.raw.KeyboardEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[org.scalajs.dom.raw.KeyboardEventInit]
  }
  
  @scala.inline
  implicit class KeyboardEventInitMutableBuilder[Self <: org.scalajs.dom.raw.KeyboardEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: java.lang.String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setIsComposing(value: scala.Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComposingUndefined: Self = StObject.set(x, "isComposing", js.undefined)
    
    @scala.inline
    def setKey(value: java.lang.String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setRepeat(value: scala.Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
