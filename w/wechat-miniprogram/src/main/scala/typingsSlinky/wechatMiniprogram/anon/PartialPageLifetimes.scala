package typingsSlinky.wechatMiniprogram.anon

import typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page.IResizeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.Component.PageLifetimes> */
@js.native
trait PartialPageLifetimes extends StObject {
  
  var hide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var resize: js.UndefOr[js.Function1[/* size */ IResizeOption, Unit]] = js.native
  
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
    def setResize(value: /* size */ IResizeOption => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
