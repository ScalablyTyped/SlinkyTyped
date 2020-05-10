package typingsSlinky.shopifyPrime.paymentDetailsMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentDetails extends ShopifyObject {
  var avs_result_code: js.UndefOr[String] = js.native
  var credit_card_bin: js.UndefOr[String] = js.native
  var credit_card_company: js.UndefOr[String] = js.native
  var credit_card_number: js.UndefOr[String] = js.native
  var cvv_result_code: js.UndefOr[String] = js.native
}

object PaymentDetails {
  @scala.inline
  def apply(): PaymentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDetails]
  }
  @scala.inline
  implicit class PaymentDetailsOps[Self <: PaymentDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvs_result_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avs_result_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvs_result_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avs_result_code")(js.undefined)
        ret
    }
    @scala.inline
    def withCredit_card_bin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit_card_bin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredit_card_bin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit_card_bin")(js.undefined)
        ret
    }
    @scala.inline
    def withCredit_card_company(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit_card_company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredit_card_company: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit_card_company")(js.undefined)
        ret
    }
    @scala.inline
    def withCredit_card_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit_card_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredit_card_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit_card_number")(js.undefined)
        ret
    }
    @scala.inline
    def withCvv_result_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvv_result_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCvv_result_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvv_result_code")(js.undefined)
        ret
    }
  }
  
}

