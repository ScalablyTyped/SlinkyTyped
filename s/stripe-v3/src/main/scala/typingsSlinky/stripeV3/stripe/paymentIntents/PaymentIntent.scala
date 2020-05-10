package typingsSlinky.stripeV3.stripe.paymentIntents

import typingsSlinky.stripeV3.AnonDestination
import typingsSlinky.stripeV3.stripe.Error
import typingsSlinky.stripeV3.stripe.List
import typingsSlinky.stripeV3.stripe.Metadata
import typingsSlinky.stripeV3.stripe.ShippingDetails
import typingsSlinky.stripeV3.stripeV3Strings.automatic
import typingsSlinky.stripeV3.stripeV3Strings.manual
import typingsSlinky.stripeV3.stripeV3Strings.payment_intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentIntent extends js.Object {
  /**
    * The amount in cents that is to be collected from this PaymentIntent.
    */
  var amount: Double = js.native
  /**
    * The amount that can be captured with from this PaymentIntent (in cents).
    */
  var amount_capturable: Double = js.native
  /**
    * The amount that was collected from this PaymentIntent (in cents).
    */
  var amount_received: Double = js.native
  /**
    * ID of the Connect application that created the PaymentIntent.
    */
  var application: String | Null = js.native
  /**
    * A fee in cents that will be applied to the invoice and transferred to the application owner's Stripe account.
    */
  var application_fee_amount: Double | Null = js.native
  /**
    * User-given reason for cancellation of this PaymentIntent.
    */
  var cancelation_reason: PaymentIntentCancelationReason | Null = js.native
  /**
    * Populated when `status` is `canceled`, this is the time at which the PaymentIntent was canceled.
    * Measured in seconds since the Unix epoch.
    */
  var canceled_at: Double | Null = js.native
  /**
    * Capture method of this PaymentIntent.
    */
  var capture_method: automatic | manual = js.native
  /**
    * Charges that were created by this PaymentIntent, if any.
    */
  var charges: List[Charge] = js.native
  /**
    * The client secret of this PaymentIntent. Used for client-side retrieval using a publishable key. Please refer to dynamic authentication guide on how client_secret should be handled.
    */
  var client_secret: String = js.native
  /**
    * Confirmation method of this PaymentIntent.
    */
  var confirmation_method: automatic | manual = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  /**
    * ID of the Customer this PaymentIntent is for if one exists.
    */
  var customer: String | Null = js.native
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Unique identifier for the object.
    */
  var id: String = js.native
  /**
    * The payment error encountered in the previous PaymentIntent confirmation.
    */
  var last_payment_error: Error | Null = js.native
  /**
    * Has the value true if the object exists in live mode or the value false
    * if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  var metadata: Metadata = js.native
  /**
    * If present, this property tells you what actions you need to take in order
    * for your customer to fulfill a payment using the provided source.
    */
  var next_action: PaymentIntentNextActionUseStripeSdk | PaymentIntentNextActionRedirectToUrl = js.native
  /**
    * Value is "payment_intent".
    */
  var `object`: payment_intent = js.native
  /**
    * The account (if any) for which the funds of the PaymentIntent are intended.
    * See the PaymentIntents Connect usage guide for details.
    */
  var on_behalf_of: String | Null = js.native
  /**
    * ID of the payment method used in this PaymentIntent.
    */
  var payment_method: String | Null = js.native
  /**
    * The list of payment method types (e.g. card) that this PaymentIntent is allowed to use.
    */
  var payment_method_types: js.Array[String] = js.native
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: String | Null = js.native
  /**
    * ID of the review associated with this PaymentIntent, if any.
    */
  var review: String | Null = js.native
  /**
    * Shipping information for this PaymentIntent.
    */
  var shipping: ShippingDetails | Null = js.native
  /**
    * The ID of a Source (e.g. 'src_abc123' or 'card_abc123').
    * Will be null unless this PaymentIntent was created with a source
    * instead of a payment_method. (Undocumented as of August 2019)
    */
  var source: String | Null = js.native
  /**
    * Extra information about a PaymentIntent. This will appear on your
    * customer’s statement when this PaymentIntent succeeds in creating a charge.
    */
  var statement_descriptor: String | Null = js.native
  /**
    * The several states the PaymentIntent goes through until it it either canceled or succeeds.
    */
  var status: PaymentIntentStatus = js.native
  /**
    * The data with which to automatically create a Transfer when the payment is finalized.
    */
  var transfer_data: AnonDestination | Null = js.native
  /**
    * A string that identifies the resulting payment as part of a group.
    */
  var transfer_group: String | Null = js.native
}

object PaymentIntent {
  @scala.inline
  def apply(
    amount: Double,
    amount_capturable: Double,
    amount_received: Double,
    capture_method: automatic | manual,
    charges: List[Charge],
    client_secret: String,
    confirmation_method: automatic | manual,
    created: Double,
    currency: String,
    id: String,
    livemode: Boolean,
    metadata: Metadata,
    next_action: PaymentIntentNextActionUseStripeSdk | PaymentIntentNextActionRedirectToUrl,
    `object`: payment_intent,
    payment_method_types: js.Array[String],
    status: PaymentIntentStatus
  ): PaymentIntent = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_capturable = amount_capturable.asInstanceOf[js.Any], amount_received = amount_received.asInstanceOf[js.Any], capture_method = capture_method.asInstanceOf[js.Any], charges = charges.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], confirmation_method = confirmation_method.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentIntent]
  }
  @scala.inline
  implicit class PaymentIntentOps[Self <: PaymentIntent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount_capturable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_capturable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount_received(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapture_method(value: automatic | manual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharges(value: List[Charge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfirmation_method(value: automatic | manual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmation_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_action(value: PaymentIntentNextActionUseStripeSdk | PaymentIntentNextActionRedirectToUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: payment_intent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayment_method_types(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: PaymentIntentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(null)
        ret
    }
    @scala.inline
    def withApplication_fee_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_fee_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication_fee_amountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_fee_amount")(null)
        ret
    }
    @scala.inline
    def withCancelation_reason(value: PaymentIntentCancelationReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelation_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelation_reasonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelation_reason")(null)
        ret
    }
    @scala.inline
    def withCanceled_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanceled_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled_at")(null)
        ret
    }
    @scala.inline
    def withCustomer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(null)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_payment_error(value: Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_payment_error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_payment_errorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_payment_error")(null)
        ret
    }
    @scala.inline
    def withOn_behalf_of(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_behalf_of")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn_behalf_ofNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_behalf_of")(null)
        ret
    }
    @scala.inline
    def withPayment_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayment_methodNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method")(null)
        ret
    }
    @scala.inline
    def withReceipt_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceipt_emailNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt_email")(null)
        ret
    }
    @scala.inline
    def withReview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review")(null)
        ret
    }
    @scala.inline
    def withShipping(value: ShippingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShippingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(null)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(null)
        ret
    }
    @scala.inline
    def withStatement_descriptor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatement_descriptorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(null)
        ret
    }
    @scala.inline
    def withTransfer_data(value: AnonDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransfer_dataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_data")(null)
        ret
    }
    @scala.inline
    def withTransfer_group(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransfer_groupNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_group")(null)
        ret
    }
  }
  
}

