package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnCharacteristicReadRequestCallbackResult extends StObject {
  
  /** 唯一标识码，调用 writeCharacteristicValue 时使用 */
  var callbackId: Double = js.native
  
  /** characteristic对应的uuid */
  var characteristicId: String = js.native
  
  /** service对应的uuid */
  var serviceId: String = js.native
}
object OnCharacteristicReadRequestCallbackResult {
  
  @scala.inline
  def apply(callbackId: Double, characteristicId: String, serviceId: String): OnCharacteristicReadRequestCallbackResult = {
    val __obj = js.Dynamic.literal(callbackId = callbackId.asInstanceOf[js.Any], characteristicId = characteristicId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCharacteristicReadRequestCallbackResult]
  }
  
  @scala.inline
  implicit class OnCharacteristicReadRequestCallbackResultMutableBuilder[Self <: OnCharacteristicReadRequestCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallbackId(value: Double): Self = StObject.set(x, "callbackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
  }
}
