package typingsSlinky.stripeV3.stripe.paymentRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripePaymentRequestOptions extends StripePaymentRequestUpdateOptions {
  var country: String = js.native
  var requestPayerEmail: js.UndefOr[Boolean] = js.native
  var requestPayerName: js.UndefOr[Boolean] = js.native
  var requestPayerPhone: js.UndefOr[Boolean] = js.native
  var requestShipping: js.UndefOr[Boolean] = js.native
}

object StripePaymentRequestOptions {
  @scala.inline
  def apply(country: String, currency: String, total: DisplayItem): StripePaymentRequestOptions = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripePaymentRequestOptions]
  }
  @scala.inline
  implicit class StripePaymentRequestOptionsOps[Self <: StripePaymentRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestPayerEmail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPayerEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestPayerEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPayerEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestPayerName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPayerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestPayerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPayerName")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestPayerPhone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPayerPhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestPayerPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPayerPhone")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestShipping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestShipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestShipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestShipping")(js.undefined)
        ret
    }
  }
  
}

