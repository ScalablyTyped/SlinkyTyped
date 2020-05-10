package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothDeviceInfo extends js.Object {
  /**
    * 当前蓝牙设备的信号强度
    */
  var RSSI: js.UndefOr[Double] = js.native
  /**
    * 当前蓝牙设备的广播数据段中的ManufacturerData数据段 （注意：vConsole 无法打印出 ArrayBuffer 类型数据）
    */
  var advertisData: js.UndefOr[js.Array[_]] = js.native
  /**
    * 当前蓝牙设备的广播数据段中的ServiceUUIDs数据段
    */
  var advertisServiceUUIDs: js.UndefOr[js.Array[_]] = js.native
  /**
    * 用于区分设备的 id
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * 当前蓝牙设备的广播数据段中的LocalName数据段
    */
  var localName: js.UndefOr[String] = js.native
  /**
    * 蓝牙设备名称，某些设备可能没有
    */
  var name: js.UndefOr[String] = js.native
  /**
    * 当前蓝牙设备的广播数据段中的ServiceData数据段
    */
  var serviceData: js.UndefOr[js.Array[_]] = js.native
}

object BluetoothDeviceInfo {
  @scala.inline
  def apply(): BluetoothDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BluetoothDeviceInfo]
  }
  @scala.inline
  implicit class BluetoothDeviceInfoOps[Self <: BluetoothDeviceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRSSI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RSSI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRSSI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RSSI")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertisData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertisData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisData")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertisServiceUUIDs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisServiceUUIDs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertisServiceUUIDs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisServiceUUIDs")(js.undefined)
        ret
    }
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
    def withLocalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(js.undefined)
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
    @scala.inline
    def withServiceData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceData")(js.undefined)
        ret
    }
  }
  
}

