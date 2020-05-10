package typingsSlinky.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeApplePaySessionResult extends js.Object {
  var shippingContact: js.UndefOr[StripeApplePayPaymentContact] = js.native
  var shippingMethod: js.UndefOr[StripeApplePayShippingMethod] = js.native
  var token: StripeCardTokenResponse = js.native
}

object StripeApplePaySessionResult {
  @scala.inline
  def apply(token: StripeCardTokenResponse): StripeApplePaySessionResult = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeApplePaySessionResult]
  }
  @scala.inline
  implicit class StripeApplePaySessionResultOps[Self <: StripeApplePaySessionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToken(value: StripeCardTokenResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
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
    def withShippingMethod(value: StripeApplePayShippingMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingMethod")(js.undefined)
        ret
    }
  }
  
}

