package typingsSlinky.stripejs.paymentMod

import typingsSlinky.stripejs.shippingMod.ShippingAddress
import typingsSlinky.stripejs.shippingMod.ShippingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripePaymentResponse extends js.Object {
  /**
    * The unique name of the payment handler the customer chose to authorize payment
    * @example 'basic-card'
    */
  val methodName: String = js.native
  val payerEmail: js.UndefOr[String] = js.native
  /**
    * Information about the payer
    * NOTE: This is only set if the corresponding field was set to `true` in the `PaymentOptions`
    *
    * @see PaymentOptions.requestPayerName
    * @see PaymentOptions.requestPayerEmail
    * @see PaymentOptions.requestPayerPhone
    */
  val payerName: js.UndefOr[String] = js.native
  val payerPhone: js.UndefOr[String] = js.native
  /**
    * The shipping address the payer selected
    */
  val shippingAddress: ShippingAddress = js.native
  /**
    * The shipping option the payer selected
    */
  val shippingOption: ShippingOption = js.native
  /**
    * NOTE: Only available when the event type 'source' was used
    */
  val source: js.UndefOr[js.Any] = js.native
  /**
    * NOTE: Only available when the event type 'token' was used
    */
  val token: js.UndefOr[js.Any] = js.native
  /**
    * A function to complete the payment and give feedback to the user
    * Call this when you have processed the token data provided by the API
    *
    * @param status - The status that should be shown to the user
    */
  def complete(status: completeStatus): Unit = js.native
}

object StripePaymentResponse {
  @scala.inline
  def apply(
    complete: completeStatus => Unit,
    methodName: String,
    shippingAddress: ShippingAddress,
    shippingOption: ShippingOption
  ): StripePaymentResponse = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), methodName = methodName.asInstanceOf[js.Any], shippingAddress = shippingAddress.asInstanceOf[js.Any], shippingOption = shippingOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripePaymentResponse]
  }
  @scala.inline
  implicit class StripePaymentResponseOps[Self <: StripePaymentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: completeStatus => Unit): Self = {
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
    def withShippingAddress(value: ShippingAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShippingOption(value: ShippingOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOption")(value.asInstanceOf[js.Any])
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
    def withSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

