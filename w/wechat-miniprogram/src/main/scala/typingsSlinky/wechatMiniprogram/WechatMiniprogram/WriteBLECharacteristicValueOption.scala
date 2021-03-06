package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteBLECharacteristicValueOption extends StObject {
  
  /** 蓝牙特征值的 uuid */
  var characteristicId: String = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[WriteBLECharacteristicValueCompleteCallback] = js.native
  
  /** 蓝牙设备 id */
  var deviceId: String = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[WriteBLECharacteristicValueFailCallback] = js.native
  
  /** 蓝牙特征值对应服务的 uuid */
  var serviceId: String = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[WriteBLECharacteristicValueSuccessCallback] = js.native
  
  /** 蓝牙设备特征值对应的二进制值 */
  var value: js.typedarray.ArrayBuffer = js.native
}
object WriteBLECharacteristicValueOption {
  
  @scala.inline
  def apply(characteristicId: String, deviceId: String, serviceId: String, value: js.typedarray.ArrayBuffer): WriteBLECharacteristicValueOption = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteBLECharacteristicValueOption]
  }
  
  @scala.inline
  implicit class WriteBLECharacteristicValueOptionMutableBuilder[Self <: WriteBLECharacteristicValueOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: /* res */ BluetoothError => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: /* res */ BluetoothError => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ BluetoothError => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
