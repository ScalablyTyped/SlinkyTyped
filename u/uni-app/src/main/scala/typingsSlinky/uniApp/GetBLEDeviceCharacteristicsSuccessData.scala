package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBLEDeviceCharacteristicsSuccessData extends js.Object {
  /**
    * 该特征值支持的操作类型
    */
  var properties: js.UndefOr[js.Any] = js.native
  /**
    * 蓝牙设备服务的 uuid
    */
  var uuid: js.UndefOr[String] = js.native
}

object GetBLEDeviceCharacteristicsSuccessData {
  @scala.inline
  def apply(): GetBLEDeviceCharacteristicsSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsSuccessData]
  }
  @scala.inline
  implicit class GetBLEDeviceCharacteristicsSuccessDataOps[Self <: GetBLEDeviceCharacteristicsSuccessData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.undefined)
        ret
    }
  }
  
}

