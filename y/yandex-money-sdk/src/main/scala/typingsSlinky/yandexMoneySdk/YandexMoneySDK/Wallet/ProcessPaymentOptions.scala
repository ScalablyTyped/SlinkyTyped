package typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessPaymentOptions extends js.Object {
  var csc: js.UndefOr[String] = js.native
  var ext_auth_fail_uri: js.UndefOr[String] = js.native
  var ext_auth_success_uri: js.UndefOr[String] = js.native
  var money_source: js.UndefOr[String] = js.native
  var request_id: String = js.native
  var test_card: js.UndefOr[String] = js.native
  var test_payment: js.UndefOr[Boolean] = js.native
  var test_result: js.UndefOr[String] = js.native
}

object ProcessPaymentOptions {
  @scala.inline
  def apply(request_id: String): ProcessPaymentOptions = {
    val __obj = js.Dynamic.literal(request_id = request_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessPaymentOptions]
  }
  @scala.inline
  implicit class ProcessPaymentOptionsOps[Self <: ProcessPaymentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csc")(js.undefined)
        ret
    }
    @scala.inline
    def withExt_auth_fail_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext_auth_fail_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt_auth_fail_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext_auth_fail_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withExt_auth_success_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext_auth_success_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt_auth_success_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext_auth_success_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withMoney_source(value: String): Self = {
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
    def withTest_card(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test_card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest_card: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test_card")(js.undefined)
        ret
    }
    @scala.inline
    def withTest_payment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test_payment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest_payment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test_payment")(js.undefined)
        ret
    }
    @scala.inline
    def withTest_result(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test_result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest_result: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test_result")(js.undefined)
        ret
    }
  }
  
}

