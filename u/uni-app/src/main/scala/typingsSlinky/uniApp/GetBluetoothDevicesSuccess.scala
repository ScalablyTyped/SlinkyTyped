package typingsSlinky.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBluetoothDevicesSuccess extends StObject {
  
  /**
    * uuid 对应的的已连接设备列表
    */
  var devices: js.UndefOr[js.Array[BluetoothDeviceInfo]] = js.native
  
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.native
}
object GetBluetoothDevicesSuccess {
  
  @scala.inline
  def apply(): GetBluetoothDevicesSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBluetoothDevicesSuccess]
  }
  
  @scala.inline
  implicit class GetBluetoothDevicesSuccessMutableBuilder[Self <: GetBluetoothDevicesSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: js.Array[BluetoothDeviceInfo]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: BluetoothDeviceInfo*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
  }
}
