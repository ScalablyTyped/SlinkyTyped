package typingsSlinky.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCharacteristicId extends js.Object {
  /**
  					 * 蓝牙设备特征值的 uuid
  					 */
  var characteristicId: String = js.native
  /**
  					 * 蓝牙设备特征值对应服务的 uuid
  					 */
  var serviceId: String = js.native
  /**
  					 * 蓝牙设备特征值对应的二进制值
  					 */
  var value: js.typedarray.ArrayBuffer = js.native
}

object AnonCharacteristicId {
  @scala.inline
  def apply(characteristicId: String, serviceId: String, value: js.typedarray.ArrayBuffer): AnonCharacteristicId = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCharacteristicId]
  }
  @scala.inline
  implicit class AnonCharacteristicIdOps[Self <: AnonCharacteristicId] (val x: Self) extends AnyVal {
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
    def withServiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

