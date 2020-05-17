package typingsSlinky.weixinApp.wx

import typingsSlinky.weixinApp.anon.devicesArrayBluetoothDevi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectedBluetoothDevicesOptions
  extends BaseOptions[js.Any, js.Any] {
  var services: js.Array[String] = js.native
  @JSName("success")
  def success_MGetConnectedBluetoothDevicesOptions(res: devicesArrayBluetoothDevi): Unit = js.native
}

object GetConnectedBluetoothDevicesOptions {
  @scala.inline
  def apply(services: js.Array[String], success: devicesArrayBluetoothDevi => Unit): GetConnectedBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetConnectedBluetoothDevicesOptions]
  }
  @scala.inline
  implicit class GetConnectedBluetoothDevicesOptionsOps[Self <: GetConnectedBluetoothDevicesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: devicesArrayBluetoothDevi => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

