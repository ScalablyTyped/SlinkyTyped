package typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component

import typingsSlinky.wechatMiniprogram.anon.PartialILifetime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Method[M /* <: MethodOption */, TIsPage /* <: Boolean */] extends StObject {
  
  /** 组件的方法，包括事件响应函数和任意的自定义方法，关于事件响应函数的使用，参见 [组件间通信与事件](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/events.html) */
  var methods: M with (js.Object | PartialILifetime) = js.native
}
object Method {
  
  @scala.inline
  def apply[M /* <: MethodOption */, TIsPage /* <: Boolean */](methods: M with (js.Object | PartialILifetime)): Method[M, TIsPage] = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method[M, TIsPage]]
  }
  
  @scala.inline
  implicit class MethodMutableBuilder[Self <: Method[_, _], M /* <: MethodOption */, TIsPage /* <: Boolean */] (val x: Self with (Method[M, TIsPage])) extends AnyVal {
    
    @scala.inline
    def setMethods(value: M with (js.Object | PartialILifetime)): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
  }
}
