package typingsSlinky.wegameApi.anon

import typingsSlinky.wegameApi.wegameApiStrings.black
import typingsSlinky.wegameApi.wegameApiStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleSuccess extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  var style: white | black = js.native
  
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}
object StyleSuccess {
  
  @scala.inline
  def apply(style: white | black): StyleSuccess = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSuccess]
  }
  
  @scala.inline
  implicit class StyleSuccessMutableBuilder[Self <: StyleSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setStyle(value: white | black): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
