package typingsSlinky.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeClientCheckoutOptions extends js.Object {
  var billingAddressCollection: js.UndefOr[billingAddressCollectionType] = js.native
  var cancelUrl: String = js.native
  var clientReferenceId: js.UndefOr[String] = js.native
  var customerEmail: js.UndefOr[String] = js.native
  var items: js.Array[StripeCheckoutItem] = js.native
  var locale: js.UndefOr[String] = js.native
  var successUrl: String = js.native
}

object StripeClientCheckoutOptions {
  @scala.inline
  def apply(cancelUrl: String, items: js.Array[StripeCheckoutItem], successUrl: String): StripeClientCheckoutOptions = {
    val __obj = js.Dynamic.literal(cancelUrl = cancelUrl.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], successUrl = successUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeClientCheckoutOptions]
  }
  @scala.inline
  implicit class StripeClientCheckoutOptionsOps[Self <: StripeClientCheckoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[StripeCheckoutItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBillingAddressCollection(value: billingAddressCollectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddressCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingAddressCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddressCollection")(js.undefined)
        ret
    }
    @scala.inline
    def withClientReferenceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientReferenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientReferenceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientReferenceId")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
  }
  
}

