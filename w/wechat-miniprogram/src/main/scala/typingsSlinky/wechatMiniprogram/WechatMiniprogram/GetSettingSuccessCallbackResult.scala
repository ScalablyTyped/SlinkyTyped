package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSettingSuccessCallbackResult extends StObject {
  
  /** [AuthSetting](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/setting/AuthSetting.html)
    *
    * 用户授权结果 */
  var authSetting: AuthSetting = js.native
  
  var errMsg: String = js.native
  
  /** [SubscriptionsSetting](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/setting/SubscriptionsSetting.html)
    *
    * 用户订阅消息设置，接口参数`withSubscriptions`值为`true`时才会返回。
    *
    * 最低基础库： `2.10.1` */
  var subscriptionsSetting: SubscriptionsSetting = js.native
}
object GetSettingSuccessCallbackResult {
  
  @scala.inline
  def apply(authSetting: AuthSetting, errMsg: String, subscriptionsSetting: SubscriptionsSetting): GetSettingSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], subscriptionsSetting = subscriptionsSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSettingSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetSettingSuccessCallbackResultMutableBuilder[Self <: GetSettingSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthSetting(value: AuthSetting): Self = StObject.set(x, "authSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsSetting(value: SubscriptionsSetting): Self = StObject.set(x, "subscriptionsSetting", value.asInstanceOf[js.Any])
  }
}
