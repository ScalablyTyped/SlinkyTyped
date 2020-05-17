package typingsSlinky.yandexMoneySdk.YandexMoneySDK.ExternalPayment

import typingsSlinky.yandexMoneySdk.anon.Dictkey
import typingsSlinky.yandexMoneySdk.anon.Moneysourcetoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessResult extends js.Object {
  var acs_params: js.UndefOr[Dictkey] = js.native
  var acs_uri: js.UndefOr[String] = js.native
  var error: js.UndefOr[String] = js.native
  var invoice_id: js.UndefOr[String] = js.native
  var money_source: js.UndefOr[Moneysourcetoken] = js.native
  var next_retry: js.UndefOr[Double] = js.native
  var status: String = js.native
}

object ProcessResult {
  @scala.inline
  def apply(status: String): ProcessResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessResult]
  }
  @scala.inline
  implicit class ProcessResultOps[Self <: ProcessResult] (val x: Self) extends AnyVal {
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
    def withMoney_source(value: Moneysourcetoken): Self = {
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
  }
  
}

