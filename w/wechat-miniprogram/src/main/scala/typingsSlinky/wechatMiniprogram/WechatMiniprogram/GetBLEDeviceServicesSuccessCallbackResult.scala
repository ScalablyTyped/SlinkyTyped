package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBLEDeviceServicesSuccessCallbackResult extends StObject {
  
  var errMsg: String = js.native
  
  /** 设备服务列表 */
  var services: js.Array[BLEService] = js.native
}
object GetBLEDeviceServicesSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, services: js.Array[BLEService]): GetBLEDeviceServicesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBLEDeviceServicesSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetBLEDeviceServicesSuccessCallbackResultMutableBuilder[Self <: GetBLEDeviceServicesSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServices(value: js.Array[BLEService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesVarargs(value: BLEService*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
