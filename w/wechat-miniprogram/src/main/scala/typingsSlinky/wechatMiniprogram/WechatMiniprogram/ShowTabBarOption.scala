package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowTabBarOption extends js.Object {
  
  /** 是否需要动画效果 */
  var animation: js.UndefOr[Boolean] = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ShowTabBarCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ShowTabBarFailCallback] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ShowTabBarSuccessCallback] = js.native
}
object ShowTabBarOption {
  
  @scala.inline
  def apply(): ShowTabBarOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowTabBarOption]
  }
  
  @scala.inline
  implicit class ShowTabBarOptionOps[Self <: ShowTabBarOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
