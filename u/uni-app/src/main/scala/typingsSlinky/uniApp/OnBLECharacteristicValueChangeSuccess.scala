package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBLECharacteristicValueChangeSuccess extends js.Object {
  /**
    * 蓝牙特征值的 uuid
    */
  var characteristicId: js.UndefOr[String] = js.native
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * 蓝牙特征值对应服务的 uuid
    */
  var serviceId: js.UndefOr[String] = js.native
  /**
    * 特征值最新的值 （注意：vConsole 无法打印出 ArrayBuffer 类型数据）
    */
  var value: js.UndefOr[js.Array[_]] = js.native
}

object OnBLECharacteristicValueChangeSuccess {
  @scala.inline
  def apply(): OnBLECharacteristicValueChangeSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBLECharacteristicValueChangeSuccess]
  }
  @scala.inline
  implicit class OnBLECharacteristicValueChangeSuccessOps[Self <: OnBLECharacteristicValueChangeSuccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacteristicId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristicId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacteristicId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristicId")(js.undefined)
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
    def withServiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

