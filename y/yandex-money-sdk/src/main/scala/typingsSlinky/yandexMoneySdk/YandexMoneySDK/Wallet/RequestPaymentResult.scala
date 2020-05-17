package typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet

import typingsSlinky.yandexMoneySdk.anon.Cards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPaymentResult extends js.Object {
  var account_unblock_uri: js.UndefOr[String] = js.native
  var balance: js.UndefOr[Double] = js.native
  var contract_amount: js.UndefOr[Double] = js.native
  var error: js.UndefOr[String] = js.native
  var ext_action_uri: js.UndefOr[String] = js.native
  var money_source: js.UndefOr[Cards] = js.native
  var protection_code: js.UndefOr[String] = js.native
  var recipient_account_status: js.UndefOr[String] = js.native
  var recipient_account_type: js.UndefOr[String] = js.native
  var request_id: js.UndefOr[String] = js.native
  var status: String = js.native
}

object RequestPaymentResult {
  @scala.inline
  def apply(status: String): RequestPaymentResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPaymentResult]
  }
  @scala.inline
  implicit class RequestPaymentResultOps[Self <: RequestPaymentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccount_unblock_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_unblock_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount_unblock_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_unblock_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withBalance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(js.undefined)
        ret
    }
    @scala.inline
    def withContract_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contract_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContract_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contract_amount")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withExt_action_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext_action_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt_action_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext_action_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withMoney_source(value: Cards): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("money_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoney_source: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("money_source")(js.undefined)
        ret
    }
    @scala.inline
    def withProtection_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtection_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection_code")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipient_account_status(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient_account_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipient_account_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient_account_status")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipient_account_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient_account_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipient_account_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient_account_type")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_id")(js.undefined)
        ret
    }
  }
  
}

