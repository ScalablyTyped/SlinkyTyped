package typingsSlinky.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCityName extends js.Object {
  /**
  			 * 国标收货地址第二级地址
  			 *
  			 */
  var cityName: String = js.native
  /**
  			 * 国标收货地址第三级地址
  			 *
  			 */
  var countyName: String = js.native
  /**
  			 * 详细收货地址信息
  			 *
  			 */
  var detailInfo: String = js.native
  /**
  			 * 调用结果
  			 *
  			 */
  var errMsg: String = js.native
  /**
  			 * 收货地址国家码
  			 *
  			 */
  var nationalCode: String = js.native
  /**
  			 * 邮编
  			 *
  			 */
  var postalCode: String = js.native
  /**
  			 * 国标收货地址第一级地址
  			 *
  			 */
  var provinceName: String = js.native
  /**
  			 * 收货人手机号码
  			 *
  			 */
  var telNumber: String = js.native
  /**
  			 * 收货人姓名
  			 *
  			 */
  var userName: String = js.native
}

object AnonCityName {
  @scala.inline
  def apply(
    cityName: String,
    countyName: String,
    detailInfo: String,
    errMsg: String,
    nationalCode: String,
    postalCode: String,
    provinceName: String,
    telNumber: String,
    userName: String
  ): AnonCityName = {
    val __obj = js.Dynamic.literal(cityName = cityName.asInstanceOf[js.Any], countyName = countyName.asInstanceOf[js.Any], detailInfo = detailInfo.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], nationalCode = nationalCode.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], provinceName = provinceName.asInstanceOf[js.Any], telNumber = telNumber.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCityName]
  }
  @scala.inline
  implicit class AnonCityNameOps[Self <: AnonCityName] (val x: Self) extends AnyVal {
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
    def withCountyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetailInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNationalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nationalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvinceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provinceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTelNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

