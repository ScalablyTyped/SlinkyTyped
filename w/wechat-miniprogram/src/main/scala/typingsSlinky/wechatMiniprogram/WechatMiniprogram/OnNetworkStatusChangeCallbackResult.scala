package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.`2g`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.`3g`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.`4g`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.none
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.unknown
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.wifi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnNetworkStatusChangeCallbackResult extends js.Object {
  
  /** 当前是否有网络连接 */
  var isConnected: Boolean = js.native
  
  /** 网络类型
    *
    * 可选值：
    * - 'wifi': wifi 网络;
    * - '2g': 2g 网络;
    * - '3g': 3g 网络;
    * - '4g': 4g 网络;
    * - 'unknown': Android 下不常见的网络类型;
    * - 'none': 无网络; */
  var networkType: wifi | `2g` | `3g` | `4g` | unknown | none = js.native
}
object OnNetworkStatusChangeCallbackResult {
  
  @scala.inline
  def apply(isConnected: Boolean, networkType: wifi | `2g` | `3g` | `4g` | unknown | none): OnNetworkStatusChangeCallbackResult = {
    val __obj = js.Dynamic.literal(isConnected = isConnected.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnNetworkStatusChangeCallbackResult]
  }
  
  @scala.inline
  implicit class OnNetworkStatusChangeCallbackResultOps[Self <: OnNetworkStatusChangeCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setIsConnected(value: Boolean): Self = this.set("isConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkType(value: wifi | `2g` | `3g` | `4g` | unknown | none): Self = this.set("networkType", value.asInstanceOf[js.Any])
  }
}
