package typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet

import typingsSlinky.yandexMoneySdk.anon.Article
import typingsSlinky.yandexMoneySdk.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessPaymentResult extends js.Object {
  var account_unblock_uri: js.UndefOr[String] = js.native
  var acs_params: js.UndefOr[Dictkey] = js.native
  var acs_uri: js.UndefOr[String] = js.native
  var balance: js.UndefOr[Double] = js.native
  var credit_amount: js.UndefOr[Double] = js.native
  var digital_goods: js.UndefOr[Article] = js.native
  var error: js.UndefOr[String] = js.native
  var hold_for_pickup_link: js.UndefOr[String] = js.native
  var invoice_id: js.UndefOr[String] = js.native
  var next_retry: js.UndefOr[Double] = js.native
  var payee: js.UndefOr[String] = js.native
  var payer: js.UndefOr[String] = js.native
  var payment_id: js.UndefOr[String] = js.native
  var status: String = js.native
}

object ProcessPaymentResult {
  @scala.inline
  def apply(status: String): ProcessPaymentResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessPaymentResult]
  }
  @scala.inline
  implicit class ProcessPaymentResultOps[Self <: ProcessPaymentResult] (val x: Self) extends AnyVal {
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
    def withAcs_params(value: Dictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acs_params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcs_params: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acs_params")(js.undefined)
        ret
    }
    @scala.inline
    def withAcs_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acs_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcs_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acs_uri")(js.undefined)
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
    def withCredit_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredit_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit_amount")(js.undefined)
        ret
    }
    @scala.inline
    def withDigital_goods(value: Article): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digital_goods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigital_goods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digital_goods")(js.undefined)
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
    def withHold_for_pickup_link(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hold_for_pickup_link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHold_for_pickup_link: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hold_for_pickup_link")(js.undefined)
        ret
    }
    @scala.inline
    def withInvoice_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoice_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_id")(js.undefined)
        ret
    }
    @scala.inline
    def withNext_retry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext_retry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_retry")(js.undefined)
        ret
    }
    @scala.inline
    def withPayee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payee")(js.undefined)
        ret
    }
    @scala.inline
    def withPayer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payer")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_id")(js.undefined)
        ret
    }
  }
  
}

