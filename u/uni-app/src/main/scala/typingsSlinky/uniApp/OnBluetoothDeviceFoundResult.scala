package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBluetoothDeviceFoundResult extends js.Object {
  /**
    * 设备列表信息
    */
  var devices: js.UndefOr[js.Array[BluetoothDeviceInfo]] = js.native
}

object OnBluetoothDeviceFoundResult {
  @scala.inline
  def apply(): OnBluetoothDeviceFoundResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBluetoothDeviceFoundResult]
  }
  @scala.inline
  implicit class OnBluetoothDeviceFoundResultOps[Self <: OnBluetoothDeviceFoundResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevices(value: js.Array[BluetoothDeviceInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devices")(js.undefined)
        ret
    }
  }
  
}

