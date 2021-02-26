package typingsSlinky.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<weixin-app.wx.PageLifetimes> */
@js.native
trait PartialPageLifetimes extends StObject {
  
  var hide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var show: js.UndefOr[js.Function0[Unit]] = js.native
}
object PartialPageLifetimes {
  
  @scala.inline
  def apply(): PartialPageLifetimes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPageLifetimes]
  }
  
  @scala.inline
  implicit class PartialPageLifetimesMutableBuilder[Self <: PartialPageLifetimes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
