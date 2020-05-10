package typingsSlinky.stripe.mod.paymentIntents

import typingsSlinky.stripe.mod.IList
import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.IShippingInformation
import typingsSlinky.stripe.mod.IStripeError
import typingsSlinky.stripe.mod.IStripeSource
import typingsSlinky.stripe.mod.applications.IApplication
import typingsSlinky.stripe.mod.charges.ICharge
import typingsSlinky.stripe.mod.customers.ICustomer
import typingsSlinky.stripe.mod.reviews.IReview
import typingsSlinky.stripe.stripeStrings.automatic
import typingsSlinky.stripe.stripeStrings.canceled
import typingsSlinky.stripe.stripeStrings.manual
import typingsSlinky.stripe.stripeStrings.payment_intent
import typingsSlinky.stripe.stripeStrings.processing
import typingsSlinky.stripe.stripeStrings.publishable
import typingsSlinky.stripe.stripeStrings.requires_action
import typingsSlinky.stripe.stripeStrings.requires_capture
import typingsSlinky.stripe.stripeStrings.requires_confirmation
import typingsSlinky.stripe.stripeStrings.requires_payment_method
import typingsSlinky.stripe.stripeStrings.secret
import typingsSlinky.stripe.stripeStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaymentIntent extends IResourceObject {
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
    * ID of the Connect application that created the PaymentIntent. [Expandable]
    */
  var application: js.UndefOr[String | IApplication | Null] = js.native
  /**
    * A fee in cents that will be applied to the invoice and transferred to the application owner's Stripe account.
    */
  var application_fee_amount: js.UndefOr[Double | Null] = js.native
  /**
    * Populated when `status` is `canceled`, this is the time at which the PaymentIntent was canceled.
    * Measured in seconds since the Unix epoch.
    */
  var canceled_at: Double | Null = js.native
  /**
    * User-given reason for cancellation of this PaymentIntent.
    */
  var cancellation_reason: PaymentIntentUserProvidedCancellationReason | PaymentIntentStripeProvidedCancellationReason | Null = js.native
  /**
    * Capture method of this PaymentIntent.
    */
  var capture_method: automatic | manual = js.native
  /**
    * Charges that were created by this PaymentIntent, if any.
    */
  var charges: IList[ICharge] = js.native
  /**
    * The client secret of this PaymentIntent. Used for client-side retrieval using a publishable key. Please refer to dynamic authentication guide on how client_secret should be handled.
    */
  var client_secret: String = js.native
  /**
    * Confirmation method of this PaymentIntent.
    */
  var confirmation_method: secret | publishable = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  /**
    * ID of the Customer this PaymentIntent is for if one exists. [Expandable]
    */
  var customer: String | ICustomer | Null = js.native
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The payment error encountered in the previous PaymentIntent confirmation.
    */
  var last_payment_error: IStripeError | Null = js.native
  var livemode: Boolean = js.native
  var metadata: IMetadata = js.native
  /**
    * If present, this property tells you what actions you need to take in order for your customer to fulfill a payment using the provided source.
    */
  var next_action: IPaymentIntentNextActionUseStripeSdk | IPaymentIntentNextActionRedirectToUrl = js.native
  /**
    * Value is "payment_intent".
    */
  @JSName("object")
  var object_IPaymentIntent: payment_intent = js.native
  /**
    * The account (if any) for which the funds of the PaymentIntent are intended. See the PaymentIntents Connect usage guide for details. [Expandable]
    */
  var on_behalf_of: js.UndefOr[String | Null] = js.native
  /**
    * ID of the payment method used in this PaymentIntent. [Expandable]
    */
  var payment_method: js.UndefOr[String | Null] = js.native
  /**
    * Payment-method-specific configuration for this PaymentIntent.
    */
  var payment_method_options: js.UndefOr[IPaymentMethodOptions] = js.native
  /**
    * The list of payment method types (e.g. card) that this PaymentIntent is allowed to use.
    */
  var payment_method_types: js.Array[PaymentIntentPaymentMethodType] = js.native
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: String | Null = js.native
  /**
    * ID of the review associated with this PaymentIntent, if any. [Expandable]
    */
  var review: js.UndefOr[String | IReview | Null] = js.native
  /*
    * Indicates that you intend to make future payments with this PaymentIntent’s payment method.
    */
  var setup_future_usage: PaymentIntentFutureUsageType | Null = js.native
  /**
    * Shipping information for this PaymentIntent.
    */
  var shipping: js.UndefOr[IShippingInformation | Null] = js.native
  /**
    * ID of the source used in this PaymentIntent. [Expandable]
    */
  var source: String | IStripeSource | Null = js.native
  /**
    * Extra information about a PaymentIntent. This will appear on your customer’s statement when this PaymentIntent succeeds in creating a charge.
    */
  var statement_descriptor: String | Null = js.native
  /**
    * The several states the PaymentIntent goes through until it it either canceled or succeeds.
    */
  var status: requires_payment_method | requires_confirmation | requires_action | processing | requires_capture | canceled | succeeded = js.native
  /**
    * The data with which to automatically create a Transfer when the payment is finalized.
    */
  var transfer_data: IPaymentIntentTransferData | Null = js.native
  /**
    * A string that identifies the resulting payment as part of a group.
    */
  var transfer_group: String | Null = js.native
}

object IPaymentIntent {
  @scala.inline
  def apply(
    amount: Double,
    amount_capturable: Double,
    amount_received: Double,
    capture_method: automatic | manual,
    charges: IList[ICharge],
    client_secret: String,
    confirmation_method: secret | publishable,
    created: Double,
    currency: String,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    next_action: IPaymentIntentNextActionUseStripeSdk | IPaymentIntentNextActionRedirectToUrl,
    `object`: payment_intent,
    payment_method_types: js.Array[PaymentIntentPaymentMethodType],
    status: requires_payment_method | requires_confirmation | requires_action | processing | requires_capture | canceled | succeeded
  ): IPaymentIntent = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_capturable = amount_capturable.asInstanceOf[js.Any], amount_received = amount_received.asInstanceOf[js.Any], capture_method = capture_method.asInstanceOf[js.Any], charges = charges.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], confirmation_method = confirmation_method.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntent]
  }
  @scala.inline
  implicit class IPaymentIntentOps[Self <: IPaymentIntent] (val x: Self) extends AnyVal {
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
    def withCharges(value: IList[ICharge]): Self = {
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
    def withConfirmation_method(value: secret | publishable): Self = {
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
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_action(value: IPaymentIntentNextActionUseStripeSdk | IPaymentIntentNextActionRedirectToUrl): Self = {
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
    def withPayment_method_types(value: js.Array[PaymentIntentPaymentMethodType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(
      value: requires_payment_method | requires_confirmation | requires_action | processing | requires_capture | canceled | succeeded
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: String | IApplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(js.undefined)
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
    def withoutApplication_fee_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_fee_amount")(js.undefined)
        ret
    }
    @scala.inline
    def withApplication_fee_amountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_fee_amount")(null)
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
    def withCancellation_reason(value: PaymentIntentUserProvidedCancellationReason | PaymentIntentStripeProvidedCancellationReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellation_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancellation_reasonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellation_reason")(null)
        ret
    }
    @scala.inline
    def withCustomer(value: String | ICustomer): Self = {
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
    def withLast_payment_error(value: IStripeError): Self = {
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
    def withoutOn_behalf_of: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_behalf_of")(js.undefined)
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
    def withoutPayment_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_methodNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method")(null)
        ret
    }
    @scala.inline
    def withPayment_method_options(value: IPaymentMethodOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_method_options: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_options")(js.undefined)
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
    def withReview(value: String | IReview): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review")(js.undefined)
        ret
    }
    @scala.inline
    def withReviewNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review")(null)
        ret
    }
    @scala.inline
    def withSetup_future_usage(value: PaymentIntentFutureUsageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup_future_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetup_future_usageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup_future_usage")(null)
        ret
    }
    @scala.inline
    def withShipping(value: IShippingInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(null)
        ret
    }
    @scala.inline
    def withSource(value: String | IStripeSource): Self = {
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
    def withTransfer_data(value: IPaymentIntentTransferData): Self = {
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

