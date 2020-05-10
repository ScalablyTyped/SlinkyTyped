package typingsSlinky.stripeV3.stripe

import typingsSlinky.stripeV3.stripe.paymentIntents.PaymentIntent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentIntentResponse extends js.Object {
  var error: js.UndefOr[Error] = js.native
  var paymentIntent: js.UndefOr[PaymentIntent] = js.native
}

object PaymentIntentResponse {
  @scala.inline
  def apply(): PaymentIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentIntentResponse]
  }
  @scala.inline
  implicit class PaymentIntentResponseOps[Self <: PaymentIntentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: Error): Self = {
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
    def withPaymentIntent(value: PaymentIntent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentIntent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentIntent")(js.undefined)
        ret
    }
  }
  
}

