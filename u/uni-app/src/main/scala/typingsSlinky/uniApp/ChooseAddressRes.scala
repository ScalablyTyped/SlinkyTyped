package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseAddressRes extends js.Object {
  /**
    * 国标收货地址第二级地址
    */
  var cityName: js.UndefOr[String] = js.native
  /**
    * 国标收货地址第三级地址
    */
  var countyName: js.UndefOr[String] = js.native
  /**
    * 详细收货地址信息
    */
  var detailInfo: js.UndefOr[String] = js.native
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[String] = js.native
  /**
    * 收货地址国家码
    */
  var nationalCode: js.UndefOr[String] = js.native
  /**
    * 邮编
    */
  var postalCode: js.UndefOr[String] = js.native
  /**
    * 国标收货地址第一级地址
    */
  var provinceName: js.UndefOr[String] = js.native
  /**
    * 收货人手机号码
    */
  var telNumber: js.UndefOr[String] = js.native
  /**
    * 收货人姓名
    */
  var userName: js.UndefOr[String] = js.native
}

object ChooseAddressRes {
  @scala.inline
  def apply(): ChooseAddressRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseAddressRes]
  }
  @scala.inline
  implicit class ChooseAddressResOps[Self <: ChooseAddressRes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCityName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cityName")(js.undefined)
        ret
    }
    @scala.inline
    def withCountyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countyName")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withErrMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withNationalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nationalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNationalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nationalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withProvinceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provinceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvinceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provinceName")(js.undefined)
        ret
    }
    @scala.inline
    def withTelNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTelNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(js.undefined)
        ret
    }
  }
  
}

