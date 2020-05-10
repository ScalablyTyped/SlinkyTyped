package typingsSlinky.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shop extends js.Object {
  var description: String = js.native
  var moneyFormat: String = js.native
  var name: String = js.native
  /**
    * TODO Add types for the Shop properties below
    * PaymentSettings, ShopPolicy etc
    */
  var paymentSettings: js.Any = js.native
  var primaryDomain: js.Any = js.native
  var privacyPolicy: js.Any = js.native
  var refundPolicy: js.Any = js.native
  var termsOfService: js.Any = js.native
}

object Shop {
  @scala.inline
  def apply(
    description: String,
    moneyFormat: String,
    name: String,
    paymentSettings: js.Any,
    primaryDomain: js.Any,
    privacyPolicy: js.Any,
    refundPolicy: js.Any,
    termsOfService: js.Any
  ): Shop = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], moneyFormat = moneyFormat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paymentSettings = paymentSettings.asInstanceOf[js.Any], primaryDomain = primaryDomain.asInstanceOf[js.Any], privacyPolicy = privacyPolicy.asInstanceOf[js.Any], refundPolicy = refundPolicy.asInstanceOf[js.Any], termsOfService = termsOfService.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shop]
  }
  @scala.inline
  implicit class ShopOps[Self <: Shop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoneyFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moneyFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaymentSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryDomain(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivacyPolicy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefundPolicy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refundPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTermsOfService(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termsOfService")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

