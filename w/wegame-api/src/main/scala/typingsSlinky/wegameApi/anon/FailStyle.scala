package typingsSlinky.wegameApi.anon

import typingsSlinky.wegameApi.wegameApiStrings.dark
import typingsSlinky.wegameApi.wegameApiStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailStyle extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 样式风格
    */
  var style: light | dark = js.native
  
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}
object FailStyle {
  
  @scala.inline
  def apply(style: light | dark): FailStyle = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailStyle]
  }
  
  @scala.inline
  implicit class FailStyleMutableBuilder[Self <: FailStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setStyle(value: light | dark): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
