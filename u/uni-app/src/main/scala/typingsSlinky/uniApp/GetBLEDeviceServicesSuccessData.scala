package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBLEDeviceServicesSuccessData extends js.Object {
  /**
    * 该服务是否为主服务
    */
  var isPrimary: js.UndefOr[Boolean] = js.native
  /**
    * 蓝牙设备服务的 uuid
    */
  var uuid: js.UndefOr[String] = js.native
}

object GetBLEDeviceServicesSuccessData {
  @scala.inline
  def apply(): GetBLEDeviceServicesSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBLEDeviceServicesSuccessData]
  }
  @scala.inline
  implicit class GetBLEDeviceServicesSuccessDataOps[Self <: GetBLEDeviceServicesSuccessData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimary")(js.undefined)
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

