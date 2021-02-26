package typingsSlinky.stripeV3.stripe

import typingsSlinky.stripeV3.anon.Url
import typingsSlinky.stripeV3.stripeV3Strings.off_session
import typingsSlinky.stripeV3.stripeV3Strings.on_session
import typingsSlinky.stripeV3.stripeV3Strings.redirect_to_url
import typingsSlinky.stripeV3.stripeV3Strings.setup_intent
import typingsSlinky.stripeV3.stripeV3Strings.use_stripe_sdk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setupIntents {
  
  @js.native
  trait SetupIntent extends StObject {
    
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
    implicit class SetupIntentMutableBuilder[Self <: SetupIntent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationNull: Self = StObject.set(x, "application", null)
      
      @scala.inline
      def setCancelation_reason(value: SetupIntentCancelationReason): Self = StObject.set(x, "cancelation_reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelation_reasonNull: Self = StObject.set(x, "cancelation_reason", null)
      
      @scala.inline
      def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerNull: Self = StObject.set(x, "customer", null)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_payment_error(value: Error): Self = StObject.set(x, "last_payment_error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_payment_errorNull: Self = StObject.set(x, "last_payment_error", null)
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_action(value: SetupIntentNextActionUseStripeSdk | SetupIntentNextActionRedirectToUrl): Self = StObject.set(x, "next_action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: setup_intent): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn_behalf_of(value: String): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn_behalf_ofNull: Self = StObject.set(x, "on_behalf_of", null)
      
      @scala.inline
      def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_methodNull: Self = StObject.set(x, "payment_method", null)
      
      @scala.inline
      def setPayment_method_types(value: js.Array[String]): Self = StObject.set(x, "payment_method_types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_method_typesVarargs(value: String*): Self = StObject.set(x, "payment_method_types", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: SetupIntentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsage(value: on_session | off_session): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stripeV3.stripeV3Strings.abandoned
    - typingsSlinky.stripeV3.stripeV3Strings.requested_by_customer
    - typingsSlinky.stripeV3.stripeV3Strings.duplicate
  */
  trait SetupIntentCancelationReason extends StObject
  object SetupIntentCancelationReason {
    
    @scala.inline
    def abandoned: typingsSlinky.stripeV3.stripeV3Strings.abandoned = "abandoned".asInstanceOf[typingsSlinky.stripeV3.stripeV3Strings.abandoned]
    
    @scala.inline
    def duplicate: typingsSlinky.stripeV3.stripeV3Strings.duplicate = "duplicate".asInstanceOf[typingsSlinky.stripeV3.stripeV3Strings.duplicate]
    
    @scala.inline
    def requested_by_customer: typingsSlinky.stripeV3.stripeV3Strings.requested_by_customer = "requested_by_customer".asInstanceOf[typingsSlinky.stripeV3.stripeV3Strings.requested_by_customer]
  }
  
  @js.native
  trait SetupIntentNextActionRedirectToUrl extends StObject {
    
    /**
      * Contains instructions for authenticating a payment by
      * redirecting your customer to another page or application.
      */
    var redirect_to_url: Url = js.native
    
    /**
      * Type of the next action to perform
      */
    var `type`: redirect_to_url = js.native
  }
  object SetupIntentNextActionRedirectToUrl {
    
    @scala.inline
    def apply(redirect_to_url: Url, `type`: redirect_to_url): SetupIntentNextActionRedirectToUrl = {
      val __obj = js.Dynamic.literal(redirect_to_url = redirect_to_url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetupIntentNextActionRedirectToUrl]
    }
    
    @scala.inline
    implicit class SetupIntentNextActionRedirectToUrlMutableBuilder[Self <: SetupIntentNextActionRedirectToUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRedirect_to_url(value: Url): Self = StObject.set(x, "redirect_to_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: redirect_to_url): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SetupIntentNextActionUseStripeSdk extends StObject {
    
    /**
      * Type of the next action to perform
      */
    var `type`: use_stripe_sdk = js.native
    
    /**
      * When confirming a SetupIntent with Stripe.js, Stripe.js depends on
      * the contents of this dictionary to invoke authentication flows. The
      * shape of the contents is subject to change and is only intended to
      * be used by Stripe.js.
      */
    var use_stripe_sdk: js.Any = js.native
  }
  object SetupIntentNextActionUseStripeSdk {
    
    @scala.inline
    def apply(`type`: use_stripe_sdk, use_stripe_sdk: js.Any): SetupIntentNextActionUseStripeSdk = {
      val __obj = js.Dynamic.literal(use_stripe_sdk = use_stripe_sdk.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetupIntentNextActionUseStripeSdk]
    }
    
    @scala.inline
    implicit class SetupIntentNextActionUseStripeSdkMutableBuilder[Self <: SetupIntentNextActionUseStripeSdk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: use_stripe_sdk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse_stripe_sdk(value: js.Any): Self = StObject.set(x, "use_stripe_sdk", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stripeV3.stripeV3Strings.requires_payment_method
    - typingsSlinky.stripeV3.stripeV3Strings.requires_confirmation
    - typingsSlinky.stripeV3.stripeV3Strings.requires_action
    - typingsSlinky.stripeV3.stripeV3Strings.processing
    - typingsSlinky.stripeV3.stripeV3Strings.canceled
    - typingsSlinky.stripeV3.stripeV3Strings.succeeded
  */
  trait SetupIntentStatus extends StObject
  object SetupIntentStatus {
    
    @scala.inline
    def canceled: typingsSlinky.stripeV3.stripeV3Strings.canceled = "canceled".asInstanceOf[typingsSlinky.stripeV3.stripeV3Strings.canceled]
    
    @scala.inline
    def processing: typingsSlinky.stripeV3.stripeV3Strings.processing = "processing".asInstanceOf[typingsSlinky.stripeV3.stripeV3Strings.processing]
    
    @scala.inline
    def requires_action: typingsSlinky.stripeV3.stripeV3Strings.requires_action = "requires_action".asInstanceOf[typingsSlinky.stripeV3.stripeV3Strings.requires_action]
    
    @scala.inline
    def requires_confirmation: typingsSlinky.stripeV3.stripeV3Strings.requires_confirmation = "requires_confirmation".asInstanceOf[typingsSlinky.stripeV3.stripeV3Strings.requires_confirmation]
    
    @scala.inline
    def requires_payment_method: typingsSlinky.stripeV3.stripeV3Strings.requires_payment_method = "requires_payment_method".asInstanceOf[typingsSlinky.stripeV3.stripeV3Strings.requires_payment_method]
    
    @scala.inline
    def succeeded: typingsSlinky.stripeV3.stripeV3Strings.succeeded = "succeeded".asInstanceOf[typingsSlinky.stripeV3.stripeV3Strings.succeeded]
  }
}
