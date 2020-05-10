package typingsSlinky.wepy

import typingsSlinky.wepy.wepyStrings.`0`
import typingsSlinky.wepy.wepyStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBankAccount extends js.Object {
  var bankAccount: String = js.native
  var bankName: String = js.native
  var companyAddress: String = js.native
  var errMsg: String = js.native
  var taxNumber: String = js.native
  var telephone: String = js.native
  var title: String = js.native
  var `type`: `0` | `1` = js.native
}

object AnonBankAccount {
  @scala.inline
  def apply(
    bankAccount: String,
    bankName: String,
    companyAddress: String,
    errMsg: String,
    taxNumber: String,
    telephone: String,
    title: String,
    `type`: `0` | `1`
  ): AnonBankAccount = {
    val __obj = js.Dynamic.literal(bankAccount = bankAccount.asInstanceOf[js.Any], bankName = bankName.asInstanceOf[js.Any], companyAddress = companyAddress.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], taxNumber = taxNumber.asInstanceOf[js.Any], telephone = telephone.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBankAccount]
  }
  @scala.inline
  implicit class AnonBankAccountOps[Self <: AnonBankAccount] (val x: Self) extends AnyVal {
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
    def withBankName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bankName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompanyAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaxNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTelephone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telephone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

