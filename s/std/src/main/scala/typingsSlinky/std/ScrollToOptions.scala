package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollToOptions extends ScrollOptions {
  
  var left: js.UndefOr[Double] = js.native
  
  var top: js.UndefOr[Double] = js.native
}
object ScrollToOptions {
  
  @scala.inline
  def apply(): ScrollToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollToOptions]
  }
  
  @scala.inline
  implicit class ScrollToOptionsMutableBuilder[Self <: ScrollToOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
