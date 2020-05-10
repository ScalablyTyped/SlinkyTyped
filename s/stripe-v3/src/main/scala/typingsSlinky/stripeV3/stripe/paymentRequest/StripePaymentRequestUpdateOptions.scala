package typingsSlinky.stripeV3.stripe.paymentRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripePaymentRequestUpdateOptions extends js.Object {
  var currency: String = js.native
  var displayItems: js.UndefOr[js.Array[DisplayItem]] = js.native
  var shippingOptions: js.UndefOr[js.Array[ShippingOption]] = js.native
  var total: DisplayItem = js.native
}

object StripePaymentRequestUpdateOptions {
  @scala.inline
  def apply(currency: String, total: DisplayItem): StripePaymentRequestUpdateOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripePaymentRequestUpdateOptions]
  }
  @scala.inline
  implicit class StripePaymentRequestUpdateOptionsOps[Self <: StripePaymentRequestUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: DisplayItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayItems(value: js.Array[DisplayItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayItems")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingOptions(value: js.Array[ShippingOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOptions")(js.undefined)
        ret
    }
  }
  
}

