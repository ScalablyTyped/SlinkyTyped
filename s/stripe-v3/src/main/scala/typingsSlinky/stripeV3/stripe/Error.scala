package typingsSlinky.stripeV3.stripe

import typingsSlinky.stripeV3.stripe.paymentIntents.PaymentIntent
import typingsSlinky.stripeV3.stripe.paymentMethod.PaymentMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  /**
    * For card errors, the ID of the failed charge.
    */
  var charge: String = js.native
  /**
    * For some errors that could be handled programmatically,
    * a short string indicating the error code reported.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * For card errors resulting from a card issuer decline,
    * a short string indicating the card issuer’s reason for
    * the decline if they provide one.
    */
  var decline_code: js.UndefOr[String] = js.native
  /**
    * A URL to more information about the error code reported.
    */
  var doc_url: js.UndefOr[String] = js.native
  /**
    * A human-readable message providing more details about the
    * error. For card errors, these messages can be shown to
    * your users.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * If the error is parameter-specific, the parameter related
    * to the error. For example, you can use this to display a
    * message near the correct form field.
    */
  var param: js.UndefOr[String] = js.native
  /**
    * The PaymentIntent object for errors returned on a request
    * involving a PaymentIntent.
    */
  var payment_intent: js.UndefOr[PaymentIntent] = js.native
  /**
    * The PaymentMethod object for errors returned on a
    * request involving a PaymentMethod.
    */
  var payment_method: js.UndefOr[PaymentMethod] = js.native
  /**
    * The source object for errors returned on a request involving
    * a source.
    */
  var source: js.UndefOr[Source] = js.native
  /**
    * The type of error returned.
    */
  var `type`: ErrorType = js.native
}

object Error {
  @scala.inline
  def apply(charge: String, `type`: ErrorType): Error = {
    val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ErrorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withDecline_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decline_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecline_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decline_code")(js.undefined)
        ret
    }
    @scala.inline
    def withDoc_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoc_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc_url")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_intent(value: PaymentIntent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_intent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_intent")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_method(value: PaymentMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: Source): Self = {
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
  }
  
}

