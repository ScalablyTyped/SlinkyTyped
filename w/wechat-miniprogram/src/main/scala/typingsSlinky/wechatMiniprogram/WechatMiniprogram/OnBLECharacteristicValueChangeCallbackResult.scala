package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnBLECharacteristicValueChangeCallbackResult extends js.Object {
  
  /** 蓝牙特征值的 uuid */
  var characteristicId: String = js.native
  
  /** 蓝牙设备 id */
  var deviceId: String = js.native
  
  /** 蓝牙特征值对应服务的 uuid */
  var serviceId: String = js.native
  
  /** 特征值最新的值 */
  var value: js.typedarray.ArrayBuffer = js.native
}
object OnBLECharacteristicValueChangeCallbackResult {
  
  @scala.inline
  def apply(characteristicId: String, deviceId: String, serviceId: String, value: js.typedarray.ArrayBuffer): OnBLECharacteristicValueChangeCallbackResult = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBLECharacteristicValueChangeCallbackResult]
  }
  
  @scala.inline
  implicit class OnBLECharacteristicValueChangeCallbackResultOps[Self <: OnBLECharacteristicValueChangeCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setCharacteristicId(value: String): Self = this.set("characteristicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.typedarray.ArrayBuffer): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
