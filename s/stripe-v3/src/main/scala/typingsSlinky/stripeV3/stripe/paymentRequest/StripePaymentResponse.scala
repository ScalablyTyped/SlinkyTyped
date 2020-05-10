package typingsSlinky.stripeV3.stripe.paymentRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripePaymentResponse extends js.Object {
  var methodName: String = js.native
  var payerEmail: js.UndefOr[String] = js.native
  var payerName: js.UndefOr[String] = js.native
  var payerPhone: js.UndefOr[String] = js.native
  var shippingAddress: js.UndefOr[ShippingAddress] = js.native
  var shippingOption: js.UndefOr[ShippingOption] = js.native
  def complete(status: String): Unit = js.native
}

object StripePaymentResponse {
  @scala.inline
  def apply(complete: String => Unit, methodName: String): StripePaymentResponse = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), methodName = methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripePaymentResponse]
  }
  @scala.inline
  implicit class StripePaymentResponseOps[Self <: StripePaymentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayerEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payerEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayerEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payerEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withPayerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payerName")(js.undefined)
        ret
    }
    @scala.inline
    def withPayerPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payerPhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayerPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payerPhone")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingAddress(value: ShippingAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingOption(value: ShippingOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOption")(js.undefined)
        ret
    }
  }
  
}

