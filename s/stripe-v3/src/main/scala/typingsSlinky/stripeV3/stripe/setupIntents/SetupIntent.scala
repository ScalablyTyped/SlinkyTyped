package typingsSlinky.stripeV3.stripe.setupIntents

import typingsSlinky.stripeV3.stripe.Error
import typingsSlinky.stripeV3.stripe.Metadata
import typingsSlinky.stripeV3.stripeV3Strings.off_session
import typingsSlinky.stripeV3.stripeV3Strings.on_session
import typingsSlinky.stripeV3.stripeV3Strings.setup_intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetupIntent extends js.Object {
  /**
    * ID of the Connect application that created the SetupIntent.
    */
  var application: String | Null = js.native
  /**
    * Reason for cancellation of this SetupIntent.
    */
  var cancelation_reason: SetupIntentCancelationReason | Null = js.native
  /**
    * The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
    * The client secret can be used to complete payment setup from your frontend.
    * It should not be stored, logged, embedded in URLs, or exposed to anyone other than the customer.
    * Make sure that you have TLS enabled on any page that includes the client secret.
    */
  var client_secret: String = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * ID of the Customer this SetupIntent belongs to, if one exists.
    * If present, payment methods used with this SetupIntent can only be attached
    * to this Customer, and payment methods attached to other Customers cannot be
    * used with this SetupIntent.
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
    * The error encountered in the previous SetupIntent confirmation.
    */
  var last_payment_error: Error | Null = js.native
  /**
    * Has the value true if the object exists in live mode or the value
    * false if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be
    * useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata = js.native
  /**
    * If present, this property tells you what actions you need to take in
    * order for your customer to continue payment setup.
    */
  var next_action: SetupIntentNextActionUseStripeSdk | SetupIntentNextActionRedirectToUrl = js.native
  /**
    * Value is "setup_intent".
    */
  var `object`: setup_intent = js.native
  /**
    * The account (if any) for which the setup is intended.
    */
  var on_behalf_of: String | Null = js.native
  /**
    * ID of the payment method used with this SetupIntent.
    */
  var payment_method: String | Null = js.native
  /**
    * The list of payment method types (e.g. card) that this SetupIntent is allowed to set up.
    */
  var payment_method_types: js.Array[String] = js.native
  /**
    * Status of this SetupIntent
    */
  var status: SetupIntentStatus = js.native
  /**
    * Indicates how the payment method is intended to be used in the future.
    * Use on_session if you intend to only reuse the payment method
    * when the customer is in your checkout flow. Use off_session if your
    * customer may or may not be in your checkout flow. If not provided,
    * this value defaults to off_session.
    */
  var usage: on_session | off_session = js.native
}

object SetupIntent {
  @scala.inline
  def apply(
    client_secret: String,
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: Metadata,
    next_action: SetupIntentNextActionUseStripeSdk | SetupIntentNextActionRedirectToUrl,
    `object`: setup_intent,
    payment_method_types: js.Array[String],
    status: SetupIntentStatus,
    usage: on_session | off_session
  ): SetupIntent = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetupIntent]
  }
  @scala.inline
  implicit class SetupIntentOps[Self <: SetupIntent] (val x: Self) extends AnyVal {
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
    def withNext_action(value: SetupIntentNextActionUseStripeSdk | SetupIntentNextActionRedirectToUrl): Self = {
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
    def withPayment_method_types(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: SetupIntentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsage(value: on_session | off_session): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
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
  }
  
}

