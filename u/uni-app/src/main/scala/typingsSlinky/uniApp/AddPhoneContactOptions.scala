package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddPhoneContactOptions extends js.Object {
  /**
    * 联系地址城市
    */
  var addressCity: js.UndefOr[String] = js.native
  /**
    * 联系地址国家
    */
  var addressCountry: js.UndefOr[String] = js.native
  /**
    * 联系地址邮政编码
    */
  var addressPostalCode: js.UndefOr[String] = js.native
  /**
    * 联系地址省份
    */
  var addressState: js.UndefOr[String] = js.native
  /**
    * 联系地址街道
    */
  var addressStreet: js.UndefOr[String] = js.native
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 电子邮件
    */
  var email: js.UndefOr[String] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 名字
    */
  var firstName: js.UndefOr[String] = js.native
  /**
    * 住宅地址城市
    */
  var homeAddressCity: js.UndefOr[String] = js.native
  /**
    * 住宅地址国家
    */
  var homeAddressCountry: js.UndefOr[String] = js.native
  /**
    * 住宅地址邮政编码
    */
  var homeAddressPostalCode: js.UndefOr[String] = js.native
  /**
    * 住宅地址省份
    */
  var homeAddressState: js.UndefOr[String] = js.native
  /**
    * 住宅地址街道
    */
  var homeAddressStreet: js.UndefOr[String] = js.native
  /**
    * 住宅传真
    */
  var homeFaxNumber: js.UndefOr[String] = js.native
  /**
    * 住宅电话
    */
  var homePhoneNumber: js.UndefOr[String] = js.native
  /**
    * 公司电话
    */
  var hostNumber: js.UndefOr[String] = js.native
  /**
    * 姓氏
    */
  var lastName: js.UndefOr[String] = js.native
  /**
    * 中间名
    */
  var middleName: js.UndefOr[String] = js.native
  /**
    * 手机号
    */
  var mobilePhoneNumber: js.UndefOr[String] = js.native
  /**
    * 昵称
    */
  var nickName: js.UndefOr[String] = js.native
  /**
    * 公司
    */
  var organization: js.UndefOr[String] = js.native
  /**
    * 头像本地文件路径
    */
  var photoFilePath: js.UndefOr[String] = js.native
  /**
    * 备注
    */
  var remark: js.UndefOr[String] = js.native
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 职位
    */
  var title: js.UndefOr[String] = js.native
  /**
    * 网站
    */
  var url: js.UndefOr[String] = js.native
  /**
    * 微信号
    */
  var weChatNumber: js.UndefOr[String] = js.native
  /**
    * 工作地址城市
    */
  var workAddressCity: js.UndefOr[String] = js.native
  /**
    * 工作地址国家
    */
  var workAddressCountry: js.UndefOr[String] = js.native
  /**
    * 工作地址邮政编码
    */
  var workAddressPostalCode: js.UndefOr[String] = js.native
  /**
    * 工作地址省份
    */
  var workAddressState: js.UndefOr[String] = js.native
  /**
    * 工作地址街道
    */
  var workAddressStreet: js.UndefOr[String] = js.native
  /**
    * 工作传真
    */
  var workFaxNumber: js.UndefOr[String] = js.native
  /**
    * 工作电话
    */
  var workPhoneNumber: js.UndefOr[String] = js.native
}

object AddPhoneContactOptions {
  @scala.inline
  def apply(): AddPhoneContactOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddPhoneContactOptions]
  }
  @scala.inline
  implicit class AddPhoneContactOptionsOps[Self <: AddPhoneContactOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressCity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressCity")(js.undefined)
        ret
    }
    @scala.inline
    def withAddressCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withAddressPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressPostalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressPostalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withAddressState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressState")(js.undefined)
        ret
    }
    @scala.inline
    def withAddressStreet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressStreet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressStreet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressStreet")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
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
    def withFail(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
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
    def withHostNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostNumber")(js.undefined)
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
    def withOrganization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(js.undefined)
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
    def withSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
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
    def withWeChatNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weChatNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeChatNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weChatNumber")(js.undefined)
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
    @scala.inline
    def withWorkFaxNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workFaxNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkFaxNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workFaxNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workPhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workPhoneNumber")(js.undefined)
        ret
    }
  }
  
}

