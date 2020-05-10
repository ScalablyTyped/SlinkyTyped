package typingsSlinky.stripe.mod.setupIntents

import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.IStripeError
import typingsSlinky.stripe.mod.applications.IApplication
import typingsSlinky.stripe.mod.customers.ICustomer
import typingsSlinky.stripe.stripeStrings.canceled
import typingsSlinky.stripe.stripeStrings.processing
import typingsSlinky.stripe.stripeStrings.requires_action
import typingsSlinky.stripe.stripeStrings.requires_confirmation
import typingsSlinky.stripe.stripeStrings.requires_payment_method
import typingsSlinky.stripe.stripeStrings.setup_intent
import typingsSlinky.stripe.stripeStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISetupIntent extends IResourceObject {
  /**
    * ID of the Connect application that created the SetupIntent. [Expandable]
    */
  var application: js.UndefOr[String | IApplication | Null] = js.native
  /**
    * Reason for cancellation of this SetupIntent, one of `abandoned`, `requested_by_customer`, or `duplicate`.
    */
  var cancelation_reason: SetupIntentCancelationReason | Null = js.native
  /**
    * The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
    *
    * The client secret can be used to complete payment setup from your frontend. It should not
    * be stored, logged, embedded in URLs, or exposed to anyone other than the customer. Make
    * sure that you have TLS enabled on any page that includes the client secret.
    */
  var client_secret: String = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * ID of the Customer this SetupIntent is for if one exists. [Expandable]
    */
  var customer: String | ICustomer | Null = js.native
  /**
    * An arbitrary string attached to the object.
    *
    * If present, payment methods used with this SetupIntent can only be attached to
    * this Customer, and payment methods attached to other Customers cannot be used with
    * this SetupIntent.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The error encountered in the previous SetupIntent confirmation.
    */
  var last_setup_error: IStripeError | Null = js.native
  var livemode: Boolean = js.native
  var metadata: IMetadata = js.native
  /**
    * If present, this property tells you what actions you need to take in order for your customer to continue payment setup.
    */
  var next_action: ISetupIntentNextActionUseStripeSdk | ISetupIntentNextActionRedirectToUrl = js.native
  /**
    * Value is "setup_intent".
    */
  @JSName("object")
  var object_ISetupIntent: setup_intent = js.native
  /**
    * The account (if any) for which the setup is intended. [Expandable]
    */
  var on_behalf_of: js.UndefOr[String | Null] = js.native
  /**
    * ID of the payment method used in this SetupIntent. [Expandable]
    */
  var payment_method: js.UndefOr[String | Null] = js.native
  /**
    * Payment-method-specific configuration for this SetupIntent.
    */
  var payment_method_options: js.UndefOr[ISetupIntentPaymentMethodOptions] = js.native
  /**
    * The list of payment method types (e.g. card) that this SetupIntent is allowed to use.
    */
  var payment_method_types: js.Array[SetupIntentPaymentMethodType] = js.native
  /**
    * The several states the SetupIntent goes through until it it either canceled or succeeds.
    */
  var status: requires_payment_method | requires_confirmation | requires_action | processing | canceled | succeeded = js.native
  /**
    * Indicates how the payment method is intended to be used in the future.
    *
    * Use `on_session` if you intend to only reuse the payment method when the customer is in
    * your checkout flow. Use `off_session` if your customer may or may not be in your checkout
    * flow. If not provided, this value defaults to `off_session`.
    */
  var usage: SetupIntentUsageType = js.native
}

object ISetupIntent {
  @scala.inline
  def apply(
    client_secret: String,
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    next_action: ISetupIntentNextActionUseStripeSdk | ISetupIntentNextActionRedirectToUrl,
    `object`: setup_intent,
    payment_method_types: js.Array[SetupIntentPaymentMethodType],
    status: requires_payment_method | requires_confirmation | requires_action | processing | canceled | succeeded,
    usage: SetupIntentUsageType
  ): ISetupIntent = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetupIntent]
  }
  @scala.inline
  implicit class ISetupIntentOps[Self <: ISetupIntent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
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
    def withNext_action(value: ISetupIntentNextActionUseStripeSdk | ISetupIntentNextActionRedirectToUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: setup_intent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayment_method_types(value: js.Array[SetupIntentPaymentMethodType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(
      value: requires_payment_method | requires_confirmation | requires_action | processing | canceled | succeeded
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsage(value: SetupIntentUsageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
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
    def withCancelation_reason(value: SetupIntentCancelationReason): Self = {
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
    def withLast_setup_error(value: IStripeError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_setup_error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_setup_errorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_setup_error")(null)
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
    def withPayment_method_options(value: ISetupIntentPaymentMethodOptions): Self = {
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
  }
  
}

