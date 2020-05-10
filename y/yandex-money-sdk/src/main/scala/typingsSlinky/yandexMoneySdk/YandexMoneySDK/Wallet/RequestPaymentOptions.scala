package typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPaymentOptions
  extends /* key */ StringDictionary[js.Any] {
  var amount: js.UndefOr[Double] = js.native
  var amount_due: js.UndefOr[Double] = js.native
  var codepro: js.UndefOr[Boolean] = js.native
  var comment: js.UndefOr[String] = js.native
  var expire_period: js.UndefOr[Double] = js.native
  var hold_for_pickup: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var pattern_id: String = js.native
  var `phone-number`: js.UndefOr[String] = js.native
  var test_card: js.UndefOr[String] = js.native
  var test_payment: js.UndefOr[Boolean] = js.native
  var test_result: js.UndefOr[String] = js.native
  var to: js.UndefOr[String] = js.native
}

object RequestPaymentOptions {
  @scala.inline
  def apply(pattern_id: String): RequestPaymentOptions = {
    val __obj = js.Dynamic.literal(pattern_id = pattern_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPaymentOptions]
  }
  @scala.inline
  implicit class RequestPaymentOptionsOps[Self <: RequestPaymentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPattern_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
    @scala.inline
    def withAmount_due(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_due")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount_due: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_due")(js.undefined)
        ret
    }
    @scala.inline
    def withCodepro(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codepro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodepro: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codepro")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withExpire_period(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expire_period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpire_period: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expire_period")(js.undefined)
        ret
    }
    @scala.inline
    def withHold_for_pickup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hold_for_pickup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHold_for_pickup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hold_for_pickup")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def `withPhone-number`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone-number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPhone-number`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone-number")(js.undefined)
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
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

