package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthPrivateMessageOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[AuthPrivateMessageCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[AuthPrivateMessageFailCallback] = js.native
  
  /** shareTicket。可以从 wx.onShow 中获取。详情 [shareTicket](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share.html) */
  var shareTicket: js.UndefOr[String] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[AuthPrivateMessageSuccessCallback] = js.native
}
object AuthPrivateMessageOption {
  
  @scala.inline
  def apply(): AuthPrivateMessageOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthPrivateMessageOption]
  }
  
  @scala.inline
  implicit class AuthPrivateMessageOptionMutableBuilder[Self <: AuthPrivateMessageOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareTicketUndefined: Self = StObject.set(x, "shareTicket", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ AuthPrivateMessageSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
