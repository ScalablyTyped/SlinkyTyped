package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.high
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.low
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartAdvertisingObject extends StObject {
  
  /** 广播自定义参数 */
  var advertiseRequest: AdvertiseReqObj = js.native
  
  /** 广播功率
    *
    * 可选值：
    * - 'low': 功率低;
    * - 'medium': 功率适中;
    * - 'high': 功率高; */
  var powerLevel: js.UndefOr[low | medium | high] = js.native
}
object StartAdvertisingObject {
  
  @scala.inline
  def apply(advertiseRequest: AdvertiseReqObj): StartAdvertisingObject = {
    val __obj = js.Dynamic.literal(advertiseRequest = advertiseRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAdvertisingObject]
  }
  
  @scala.inline
  implicit class StartAdvertisingObjectMutableBuilder[Self <: StartAdvertisingObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiseRequest(value: AdvertiseReqObj): Self = StObject.set(x, "advertiseRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerLevel(value: low | medium | high): Self = StObject.set(x, "powerLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerLevelUndefined: Self = StObject.set(x, "powerLevel", js.undefined)
  }
}
