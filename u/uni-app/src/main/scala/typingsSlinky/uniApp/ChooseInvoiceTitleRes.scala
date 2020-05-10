package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseInvoiceTitleRes extends js.Object {
  /**
    * 银行账号
    */
  var bankAccount: js.UndefOr[String] = js.native
  /**
    * 银行名称
    */
  var bankName: js.UndefOr[String] = js.native
  /**
    * 单位地址
    */
  var companyAddress: js.UndefOr[String] = js.native
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[String] = js.native
  /**
    * 抬头税号
    */
  var taxNumber: js.UndefOr[String] = js.native
  /**
    * 手机号码
    */
  var telephone: js.UndefOr[String] = js.native
  /**
    * 抬头名称
    */
  var title: js.UndefOr[String] = js.native
  /**
    * 抬头类型（0：单位，1：个人）
    */
  var `type`: js.UndefOr[String] = js.native
}

object ChooseInvoiceTitleRes {
  @scala.inline
  def apply(): ChooseInvoiceTitleRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseInvoiceTitleRes]
  }
  @scala.inline
  implicit class ChooseInvoiceTitleResOps[Self <: ChooseInvoiceTitleRes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBankAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bankAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBankAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bankAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withBankName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bankName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBankName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bankName")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanyAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyAddress")(js.undefined)
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
    def withTaxNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withTelephone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telephone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTelephone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telephone")(js.undefined)
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

