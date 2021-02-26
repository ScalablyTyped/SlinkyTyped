package typingsSlinky.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyBLECharacteristicValueChanged
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 蓝牙特征值的 uuid
    */
  var characteristicId: String = js.native
  
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String = js.native
  
  /**
    * 蓝牙特征值对应服务的 uuid
    */
  var serviceId: String = js.native
  
  /**
    * true: 启用 notify; false: 停用 notify
    */
  var state: Boolean = js.native
  
  @JSName("success")
  def success_MNotifyBLECharacteristicValueChanged(res: ErrMsgResponse): Unit = js.native
}
object NotifyBLECharacteristicValueChanged {
  
  @scala.inline
  def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    state: Boolean,
    success: ErrMsgResponse => Unit
  ): NotifyBLECharacteristicValueChanged = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[NotifyBLECharacteristicValueChanged]
  }
  
  @scala.inline
  implicit class NotifyBLECharacteristicValueChangedMutableBuilder[Self <: NotifyBLECharacteristicValueChanged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: ErrMsgResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
