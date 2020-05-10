package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectedBluetoothDevicesSuccessData extends js.Object {
  /**
    * 用于区分设备的 id
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * 蓝牙设备名称，某些设备可能没有
    */
  var name: js.UndefOr[String] = js.native
}

object GetConnectedBluetoothDevicesSuccessData {
  @scala.inline
  def apply(): GetConnectedBluetoothDevicesSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectedBluetoothDevicesSuccessData]
  }
  @scala.inline
  implicit class GetConnectedBluetoothDevicesSuccessDataOps[Self <: GetConnectedBluetoothDevicesSuccessData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

