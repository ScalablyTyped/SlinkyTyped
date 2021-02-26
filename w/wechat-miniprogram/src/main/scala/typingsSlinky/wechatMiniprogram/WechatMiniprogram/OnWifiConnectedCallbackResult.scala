package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnWifiConnectedCallbackResult extends StObject {
  
  /** [WifiInfo](https://developers.weixin.qq.com/miniprogram/dev/api/device/wifi/WifiInfo.html)
    *
    * Wi-Fi 信息 */
  var wifi: WifiInfo = js.native
}
object OnWifiConnectedCallbackResult {
  
  @scala.inline
  def apply(wifi: WifiInfo): OnWifiConnectedCallbackResult = {
    val __obj = js.Dynamic.literal(wifi = wifi.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnWifiConnectedCallbackResult]
  }
  
  @scala.inline
  implicit class OnWifiConnectedCallbackResultMutableBuilder[Self <: OnWifiConnectedCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWifi(value: WifiInfo): Self = StObject.set(x, "wifi", value.asInstanceOf[js.Any])
  }
}
