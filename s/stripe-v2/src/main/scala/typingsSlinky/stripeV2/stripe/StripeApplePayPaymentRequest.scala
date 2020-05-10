package typingsSlinky.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeApplePayPaymentRequest extends js.Object {
  var billingContact: StripeApplePayPaymentContact = js.native
  var countryCode: String = js.native
  var currencyCode: String = js.native
  var lineItems: js.UndefOr[js.Array[StripeApplePayLineItem]] = js.native
  var requiredBillingContactFields: js.UndefOr[js.Array[StripeApplePayBillingContactField]] = js.native
  var requiredShippingContactFields: js.UndefOr[js.Array[StripeApplePayShippingContactField]] = js.native
  var shippingContact: js.UndefOr[StripeApplePayPaymentContact] = js.native
  var shippingMethods: js.UndefOr[js.Array[StripeApplePayShippingMethod]] = js.native
  var shippingType: js.UndefOr[js.Array[StripeApplePayShipping]] = js.native
  var total: StripeApplePayLineItem = js.native
}

object StripeApplePayPaymentRequest {
  @scala.inline
  def apply(
    billingContact: StripeApplePayPaymentContact,
    countryCode: String,
    currencyCode: String,
    total: StripeApplePayLineItem
  ): StripeApplePayPaymentRequest = {
    val __obj = js.Dynamic.literal(billingContact = billingContact.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeApplePayPaymentRequest]
  }
  @scala.inline
  implicit class StripeApplePayPaymentRequestOps[Self <: StripeApplePayPaymentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingContact(value: StripeApplePayPaymentContact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: StripeApplePayLineItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineItems(value: js.Array[StripeApplePayLineItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItems")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredBillingContactFields(value: js.Array[StripeApplePayBillingContactField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredBillingContactFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredBillingContactFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredBillingContactFields")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredShippingContactFields(value: js.Array[StripeApplePayShippingContactField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredShippingContactFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredShippingContactFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredShippingContactFields")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingContact(value: StripeApplePayPaymentContact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingContact")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingMethods(value: js.Array[StripeApplePayShippingMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingType(value: js.Array[StripeApplePayShipping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingType")(js.undefined)
        ret
    }
  }
  
}

