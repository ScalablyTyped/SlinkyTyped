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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IPaymentIntentMutableBuilder[Self <: IPaymentIntent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_capturable(value: Double): Self = StObject.set(x, "amount_capturable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_received(value: Double): Self = StObject.set(x, "amount_received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: String | IApplication): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNull: Self = StObject.set(x, "application", null)
    
    @scala.inline
    def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    @scala.inline
    def setApplication_fee_amount(value: Double): Self = StObject.set(x, "application_fee_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication_fee_amountNull: Self = StObject.set(x, "application_fee_amount", null)
    
    @scala.inline
    def setApplication_fee_amountUndefined: Self = StObject.set(x, "application_fee_amount", js.undefined)
    
    @scala.inline
    def setCanceled_at(value: Double): Self = StObject.set(x, "canceled_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanceled_atNull: Self = StObject.set(x, "canceled_at", null)
    
    @scala.inline
    def setCancellation_reason(value: PaymentIntentUserProvidedCancellationReason | PaymentIntentStripeProvidedCancellationReason): Self = StObject.set(x, "cancellation_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancellation_reasonNull: Self = StObject.set(x, "cancellation_reason", null)
    
    @scala.inline
    def setCapture_method(value: automatic | manual): Self = StObject.set(x, "capture_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharges(value: IList[ICharge]): Self = StObject.set(x, "charges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmation_method(value: secret | publishable): Self = StObject.set(x, "confirmation_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer(value: String | ICustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLast_payment_error(value: IStripeError): Self = StObject.set(x, "last_payment_error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_payment_errorNull: Self = StObject.set(x, "last_payment_error", null)
    
    @scala.inline
    def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_action(value: IPaymentIntentNextActionUseStripeSdk | IPaymentIntentNextActionRedirectToUrl): Self = StObject.set(x, "next_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: payment_intent): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn_behalf_of(value: String): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn_behalf_ofNull: Self = StObject.set(x, "on_behalf_of", null)
    
    @scala.inline
    def setOn_behalf_ofUndefined: Self = StObject.set(x, "on_behalf_of", js.undefined)
    
    @scala.inline
    def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_methodNull: Self = StObject.set(x, "payment_method", null)
    
    @scala.inline
    def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
    
    @scala.inline
    def setPayment_method_options(value: IPaymentMethodOptions): Self = StObject.set(x, "payment_method_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_method_optionsUndefined: Self = StObject.set(x, "payment_method_options", js.undefined)
    
    @scala.inline
    def setPayment_method_types(value: js.Array[PaymentIntentPaymentMethodType]): Self = StObject.set(x, "payment_method_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_method_typesVarargs(value: PaymentIntentPaymentMethodType*): Self = StObject.set(x, "payment_method_types", js.Array(value :_*))
    
    @scala.inline
    def setReceipt_email(value: String): Self = StObject.set(x, "receipt_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceipt_emailNull: Self = StObject.set(x, "receipt_email", null)
    
    @scala.inline
    def setReview(value: String | IReview): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewNull: Self = StObject.set(x, "review", null)
    
    @scala.inline
    def setReviewUndefined: Self = StObject.set(x, "review", js.undefined)
    
    @scala.inline
    def setSetup_future_usage(value: PaymentIntentFutureUsageType): Self = StObject.set(x, "setup_future_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetup_future_usageNull: Self = StObject.set(x, "setup_future_usage", null)
    
    @scala.inline
    def setShipping(value: IShippingInformation): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingNull: Self = StObject.set(x, "shipping", null)
    
    @scala.inline
    def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    
    @scala.inline
    def setSource(value: String | IStripeSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptorNull: Self = StObject.set(x, "statement_descriptor", null)
    
    @scala.inline
    def setStatus(
      value: requires_payment_method | requires_confirmation | requires_action | processing | requires_capture | canceled | succeeded
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfer_data(value: IPaymentIntentTransferData): Self = StObject.set(x, "transfer_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfer_dataNull: Self = StObject.set(x, "transfer_data", null)
    
    @scala.inline
    def setTransfer_group(value: String): Self = StObject.set(x, "transfer_group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfer_groupNull: Self = StObject.set(x, "transfer_group", null)
  }
}
