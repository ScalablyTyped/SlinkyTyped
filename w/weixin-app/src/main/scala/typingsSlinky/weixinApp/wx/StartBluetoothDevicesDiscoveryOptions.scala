package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartBluetoothDevicesDiscoveryOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 否允许重复上报同一设备， 如果允许重复上报，则onDeviceFound 方法会多次上报同一设备，但是 RSSI 值会有不同
  		 */
  var allowDuplicatesKey: js.UndefOr[Boolean] = js.native
  /**
  		 * 上报设备的间隔，默认为0，意思是找到新设备立即上报，否则根据传入的间隔上报
  		 */
  var interval: js.UndefOr[Double] = js.native
  /**
  		 * 蓝牙设备主 service 的 uuid 列表
  		 * 某些蓝牙设备会广播自己的主 service 的 uuid。如果这里传入该数组，那么根据该 uuid 列表，只搜索有这个主服务的设备。
  		 */
  var services: js.UndefOr[js.Array[String]] = js.native
}

object StartBluetoothDevicesDiscoveryOptions {
  @scala.inline
  def apply(): StartBluetoothDevicesDiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBluetoothDevicesDiscoveryOptions]
  }
  @scala.inline
  implicit class StartBluetoothDevicesDiscoveryOptionsOps[Self <: StartBluetoothDevicesDiscoveryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDuplicatesKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDuplicatesKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDuplicatesKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDuplicatesKey")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withServices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(js.undefined)
        ret
    }
  }
  
}

