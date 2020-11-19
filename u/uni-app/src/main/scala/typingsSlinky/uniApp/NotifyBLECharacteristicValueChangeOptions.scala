package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyBLECharacteristicValueChangeOptions extends js.Object {
  
  /**
    * 蓝牙特征值的 uuid
    */
  var characteristicId: js.UndefOr[String] = js.native
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: js.UndefOr[String] = js.native
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 蓝牙特征值对应服务的 uuid
    */
  var serviceId: js.UndefOr[String] = js.native
  
  /**
    * true: 启用 notify; false: 停用 notify
    */
  var state: js.UndefOr[Boolean] = js.native
  
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  var success: js.UndefOr[js.Function1[/* result */ StopBluetoothDevicesDiscoverySuccess, Unit]] = js.native
}
object NotifyBLECharacteristicValueChangeOptions {
  
  @scala.inline
  def apply(): NotifyBLECharacteristicValueChangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyBLECharacteristicValueChangeOptions]
  }
  
  @scala.inline
  implicit class NotifyBLECharacteristicValueChangeOptionsOps[Self <: NotifyBLECharacteristicValueChangeOptions] (val x: Self) extends AnyVal {
    
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
    def deleteCharacteristicId: Self = this.set("characteristicId", js.undefined)
    
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceId: Self = this.set("serviceId", js.undefined)
    
    @scala.inline
    def setState(value: Boolean): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ StopBluetoothDevicesDiscoverySuccess => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
