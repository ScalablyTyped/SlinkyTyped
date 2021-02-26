package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.`2g`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.`3g`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.`4g`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.`5g`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.none
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.unknown
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.wifi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNetworkTypeSuccessCallbackResult extends StObject {
  
  var errMsg: String = js.native
  
  /** 网络类型
    *
    * 可选值：
    * - 'wifi': wifi 网络;
    * - '2g': 2g 网络;
    * - '3g': 3g 网络;
    * - '4g': 4g 网络;
    * - '5g': 5g 网络;
    * - 'unknown': Android 下不常见的网络类型;
    * - 'none': 无网络; */
  var networkType: wifi | `2g` | `3g` | `4g` | `5g` | unknown | none = js.native
}
object GetNetworkTypeSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, networkType: wifi | `2g` | `3g` | `4g` | `5g` | unknown | none): GetNetworkTypeSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkTypeSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetNetworkTypeSuccessCallbackResultMutableBuilder[Self <: GetNetworkTypeSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkType(value: wifi | `2g` | `3g` | `4g` | `5g` | unknown | none): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}
