package typingsSlinky.wepy.wxEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WechatProfileDetails extends js.Object {
  var email: js.UndefOr[String] = js.native
  var firstName: js.UndefOr[String] = js.native
  var homeAddressCity: js.UndefOr[String] = js.native
  var homeAddressCountry: js.UndefOr[String] = js.native
  var homeAddressPostalCode: js.UndefOr[String] = js.native
  var homeAddressState: js.UndefOr[String] = js.native
  var homeAddressStreet: js.UndefOr[String] = js.native
  var homeFaxNumber: js.UndefOr[String] = js.native
  var homePhoneNumber: js.UndefOr[String] = js.native
  var lastName: js.UndefOr[String] = js.native
  var middleName: js.UndefOr[String] = js.native
  var mobilePhoneNumber: js.UndefOr[String] = js.native
  var nickName: js.UndefOr[String] = js.native
  var photoFilePath: js.UndefOr[String] = js.native
  var remark: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var workAddressCity: js.UndefOr[String] = js.native
  var workAddressCountry: js.UndefOr[String] = js.native
  var workAddressPostalCode: js.UndefOr[String] = js.native
  var workAddressState: js.UndefOr[String] = js.native
  var workAddressStreet: js.UndefOr[String] = js.native
}

object WechatProfileDetails {
  @scala.inline
  def apply(): WechatProfileDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WechatProfileDetails]
  }
  @scala.inline
  implicit class WechatProfileDetailsOps[Self <: WechatProfileDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeAddressCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeAddressCity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeAddressCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeAddressCity")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeAddressCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeAddressCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeAddressCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeAddressCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeAddressPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeAddressPostalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeAddressPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeAddressPostalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeAddressState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeAddressState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeAddressState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeAddressState")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeAddressStreet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeAddressStreet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeAddressStreet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeAddressStreet")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeFaxNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeFaxNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeFaxNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeFaxNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withHomePhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homePhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomePhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homePhoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleName")(js.undefined)
        ret
    }
    @scala.inline
    def withMobilePhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobilePhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobilePhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobilePhoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withNickName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNickName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickName")(js.undefined)
        ret
    }
    @scala.inline
    def withPhotoFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotoFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoFilePath")(js.undefined)
        ret
    }
    @scala.inline
    def withRemark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remark")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkAddressCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workAddressCity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkAddressCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workAddressCity")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkAddressCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workAddressCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkAddressCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workAddressCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkAddressPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workAddressPostalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkAddressPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workAddressPostalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkAddressState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workAddressState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkAddressState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workAddressState")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkAddressStreet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workAddressStreet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkAddressStreet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workAddressStreet")(js.undefined)
        ret
    }
  }
  
}

