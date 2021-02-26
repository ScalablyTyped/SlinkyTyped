package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVoIPChatMuteConfigOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[UpdateVoIPChatMuteConfigCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[UpdateVoIPChatMuteConfigFailCallback] = js.native
  
  /** 静音设置 */
  var muteConfig: MuteConfig = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[UpdateVoIPChatMuteConfigSuccessCallback] = js.native
}
object UpdateVoIPChatMuteConfigOption {
  
  @scala.inline
  def apply(muteConfig: MuteConfig): UpdateVoIPChatMuteConfigOption = {
    val __obj = js.Dynamic.literal(muteConfig = muteConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoIPChatMuteConfigOption]
  }
  
  @scala.inline
  implicit class UpdateVoIPChatMuteConfigOptionMutableBuilder[Self <: UpdateVoIPChatMuteConfigOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setMuteConfig(value: MuteConfig): Self = StObject.set(x, "muteConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
