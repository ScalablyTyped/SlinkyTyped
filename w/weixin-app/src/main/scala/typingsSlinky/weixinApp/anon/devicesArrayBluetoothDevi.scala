package typingsSlinky.weixinApp.anon

import typingsSlinky.weixinApp.weixinAppStrings.ok
import typingsSlinky.weixinApp.wx.BluetoothDevice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  devices  :std.Array<weixin-app.wx.BluetoothDevice>} & weixin-app.wx.ErrMsgResponse */
@js.native
trait devicesArrayBluetoothDevi extends js.Object {
  var devices: js.Array[BluetoothDevice] = js.native
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String = js.native
}

object devicesArrayBluetoothDevi {
  @scala.inline
  def apply(devices: js.Array[BluetoothDevice], errMsg: ok | String): devicesArrayBluetoothDevi = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[devicesArrayBluetoothDevi]
  }
  @scala.inline
  implicit class devicesArrayBluetoothDeviOps[Self <: devicesArrayBluetoothDevi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevices(value: js.Array[BluetoothDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrMsg(value: ok | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

