package typingsSlinky.stripejs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.stripejs.customerMod.Customer
import typingsSlinky.stripejs.mod.StripeError
import typingsSlinky.stripejs.stripejsStrings.accepted
import typingsSlinky.stripejs.stripejsStrings.attempts_remaining
import typingsSlinky.stripejs.stripejsStrings.canceled
import typingsSlinky.stripejs.stripejsStrings.chargeable
import typingsSlinky.stripejs.stripejsStrings.code_verification
import typingsSlinky.stripejs.stripejsStrings.consumed
import typingsSlinky.stripejs.stripejsStrings.declined
import typingsSlinky.stripejs.stripejsStrings.email
import typingsSlinky.stripejs.stripejsStrings.failed
import typingsSlinky.stripejs.stripejsStrings.manual
import typingsSlinky.stripejs.stripejsStrings.none
import typingsSlinky.stripejs.stripejsStrings.not_required
import typingsSlinky.stripejs.stripejsStrings.pending
import typingsSlinky.stripejs.stripejsStrings.processing_error
import typingsSlinky.stripejs.stripejsStrings.receiver
import typingsSlinky.stripejs.stripejsStrings.redirect
import typingsSlinky.stripejs.stripejsStrings.refused
import typingsSlinky.stripejs.stripejsStrings.reusable
import typingsSlinky.stripejs.stripejsStrings.single_use
import typingsSlinky.stripejs.stripejsStrings.source
import typingsSlinky.stripejs.stripejsStrings.succeeded
import typingsSlinky.stripejs.stripejsStrings.user_abort
import typingsSlinky.stripejs.tokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMod {
  
  @js.native
  trait Acceptance extends StObject {
    
    /**
      * The unix timestamp the mandate was accepted or refused at by the customer.
      */
    var date: Double = js.native
    
    /**
      * The unix timestamp the mandate was accepted or refused at by the customer.
      */
    var ip: String = js.native
    
    /**
      * The status of the mandate acceptance
      */
    var status: accepted | refused = js.native
    
    /**
      * The user agent of the browser from which the mandate was accepted or refused by the customer
      * NOTE: This can be unset by updating the value to `null` and then saving
      */
    var user_agent: String = js.native
  }
  object Acceptance {
    
    @scala.inline
    def apply(date: Double, ip: String, status: accepted | refused, user_agent: String): Acceptance = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user_agent = user_agent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Acceptance]
    }
    
    @scala.inline
    implicit class AcceptanceMutableBuilder[Self <: Acceptance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: accepted | refused): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CodeVerification extends StObject {
    
    /**
      * The number of attempts remaining to authenticate the
      * source object with a verification code
      */
    var attempts_remaining: Double = js.native
    
    /**
      * The status of the code verification
      */
    var status: pending | attempts_remaining | succeeded | failed = js.native
  }
  object CodeVerification {
    
    @scala.inline
    def apply(attempts_remaining: Double, status: pending | attempts_remaining | succeeded | failed): CodeVerification = {
      val __obj = js.Dynamic.literal(attempts_remaining = attempts_remaining.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeVerification]
    }
    
    @scala.inline
    implicit class CodeVerificationMutableBuilder[Self <: CodeVerification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttempts_remaining(value: Double): Self = StObject.set(x, "attempts_remaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: pending | attempts_remaining | succeeded | failed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Mandate extends StObject {
    
    var acceptance: js.UndefOr[Acceptance] = js.native
    
    /**
      * The method Stripe should use to notify the customer
      * - email: an email is sent directly to the customer
      * - manual: a source.mandate_notification event is sent to your webhooks endpoint and you should handle the notification
      * - none: the underlying debit network does not require any notification
      */
    var notification_method: js.UndefOr[email | manual | none] = js.native
  }
  object Mandate {
    
    @scala.inline
    def apply(): Mandate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mandate]
    }
    
    @scala.inline
    implicit class MandateMutableBuilder[Self <: Mandate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptance(value: Acceptance): Self = StObject.set(x, "acceptance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptanceUndefined: Self = StObject.set(x, "acceptance", js.undefined)
      
      @scala.inline
      def setNotification_method(value: email | manual | none): Self = StObject.set(x, "notification_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotification_methodUndefined: Self = StObject.set(x, "notification_method", js.undefined)
    }
  }
  
  @js.native
  trait Receiver extends StObject {
    
    /**
      * The address of the receiver source
      * NOTE: This is the value that should be communicated to the customer to send their funds to
      */
    var address: String = js.native
    
    /**
      * The total amount that was charged by you
      * NOTE: The amount charged is expressed in the source’s currency
      */
    var amount_charged: Double = js.native
    
    /**
      * The total amount received by the receiver source
      */
    var amount_received: Double = js.native
    
    /**
      * The total amount that was returned to the customer
      * NOTE: The amount charged is expressed in the source’s currency
      */
    var amount_returned: Double = js.native
  }
  object Receiver {
    
    @scala.inline
    def apply(address: String, amount_charged: Double, amount_received: Double, amount_returned: Double): Receiver = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount_charged = amount_charged.asInstanceOf[js.Any], amount_received = amount_received.asInstanceOf[js.Any], amount_returned = amount_returned.asInstanceOf[js.Any])
      __obj.asInstanceOf[Receiver]
    }
    
    @scala.inline
    implicit class ReceiverMutableBuilder[Self <: Receiver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount_charged(value: Double): Self = StObject.set(x, "amount_charged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount_received(value: Double): Self = StObject.set(x, "amount_received", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount_returned(value: Double): Self = StObject.set(x, "amount_returned", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Redirect extends StObject {
    
    /**
      * The failure reason for the redirect
      * Present only if the redirect status is `'failed'`
      */
    var failure_reason: js.UndefOr[user_abort | declined | processing_error] = js.native
    
    /**
      * The URL you provide to redirect the customer to after they authenticated their payment
      */
    var return_url: String = js.native
    
    /**
      * The status of the redirect
      * - Pending: ready to be used by your customer to authenticate the transaction
      * - succeeded: succesful authentication, cannot be reused
      * - not_required: redirect should not be used
      * - failed: failed authentication, cannot be reused
      */
    var status: pending | succeeded | not_required | failed = js.native
    
    /**
      * The URL provided to you to redirect a customer to as part of a redirect
      * authentication flow
      */
    var url: String = js.native
  }
  object Redirect {
    
    @scala.inline
    def apply(return_url: String, status: pending | succeeded | not_required | failed, url: String): Redirect = {
      val __obj = js.Dynamic.literal(return_url = return_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Redirect]
    }
    
    @scala.inline
    implicit class RedirectMutableBuilder[Self <: Redirect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailure_reason(value: user_abort | declined | processing_error): Self = StObject.set(x, "failure_reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailure_reasonUndefined: Self = StObject.set(x, "failure_reason", js.undefined)
      
      @scala.inline
      def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: pending | succeeded | not_required | failed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Source
    extends /**
    * A matching name to the type with extra information about the payment method
    * @see type
    */
  /* key */ StringDictionary[js.Any] {
    
    /**
      * A positive integer in the smallest currency unit (that is, 100 cents for $1.00,
      * or 1 for ¥1, Japanese Yen being a zero-decimal currency) representing the total
      * amount associated with the source
      */
    var amount: Double = js.native
    
    /**
      * The client secret of the source.
      * Used for client-side retrieval using a publishable key.
      */
    var client_secret: String = js.native
    
    /**
      * Information related to the code verification flow
      * Present if the source is authenticated by a verification code
      */
    var code_verification: js.UndefOr[CodeVerification] = js.native
    
    /**
      * Time at which the object was created.
      * Measured in seconds since the Unix epoch.
      * (Timestamp)
      */
    var created: Double = js.native
    
    /**
      * Three-letter ISO code for the currency associated with the source
      */
    var currency: String = js.native
    
    /**
      * The authentication flow of the source
      */
    var flow: redirect | receiver | code_verification | none = js.native
    
    /**
      * Unique identifier for the object
      */
    var id: String = js.native
    
    /**
      * LIVE MODE = true
      * TEST MODE = false
      */
    var livemode: Boolean = js.native
    
    /**
      * Your own saved information with this bank account
      */
    var metadata: StringDictionary[String] = js.native
    
    var `object`: source = js.native
    
    /**
      * Information about the owner of the payment instrument that may be used or
      * required by particular source types.
      */
    var owner: Customer = js.native
    
    /**
      * Information related to the receiver flow.
      * Present if the source is a receiver
      */
    var receiver: js.UndefOr[Receiver] = js.native
    
    /**
      * Information related to the redirect flow.
      * Present if the source is authenticated by a redirect
      */
    var redirect: js.UndefOr[Redirect] = js.native
    
    /**
      * Extra information about a source
      * NOTE: This will appear on your customer’s statement every time you charge the source
      */
    var statement_descriptor: String = js.native
    
    /**
      * The status of the source
      * NOTE: Only `chargeable` sources can be used to create a charge
      */
    var status: pending | canceled | failed | consumed | chargeable = js.native
    
    /**
      * The type of the source.
      * NOTE: The type is a payment method
      */
    var `type`: paymentOptions = js.native
    
    /**
      * Whether this source should be reusable or not
      */
    var usage: reusable = js.native
  }
  object Source {
    
    @scala.inline
    def apply(
      amount: Double,
      client_secret: String,
      created: Double,
      currency: String,
      flow: redirect | receiver | code_verification | none,
      id: String,
      livemode: Boolean,
      metadata: StringDictionary[String],
      `object`: source,
      owner: Customer,
      statement_descriptor: String,
      status: pending | canceled | failed | consumed | chargeable,
      `type`: paymentOptions,
      usage: reusable
    ): Source = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    @scala.inline
    implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode_verification(value: CodeVerification): Self = StObject.set(x, "code_verification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode_verificationUndefined: Self = StObject.set(x, "code_verification", js.undefined)
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlow(value: redirect | receiver | code_verification | none): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: source): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwner(value: Customer): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiver(value: Receiver): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
      
      @scala.inline
      def setRedirect(value: Redirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: pending | canceled | failed | consumed | chargeable): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: paymentOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsage(value: reusable): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SourceData extends StObject {
    
    /**
      * This is the amount for which the source will be chargeable once ready
      */
    var amount: Double = js.native
    
    /**
      * Three-letter ISO code for the currency associated with the source
      */
    var currency: String = js.native
    
    /**
      * The authentication flow of the source
      */
    var flow: redirect | receiver | code_verification | none = js.native
    
    /**
      * Information about a mandate possiblity attached to a source object
      * (generally for bank debits) as well as its acceptance status
      */
    var mandate: js.UndefOr[Mandate] = js.native
    
    /**
      * Extra data you want to add to the source object
      */
    var metadata: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Information about the owner of the payment instrument that may be used or
      * required by particular source types.
      */
    var owner: js.UndefOr[Customer] = js.native
    
    /**
      * Can be set only if the source is a receiver
      */
    var receiver: js.UndefOr[Receiver] = js.native
    
    /**
      * Required if the source is authenticated by a redirect
      */
    var redirect: js.UndefOr[Redirect] = js.native
    
    /**
      * An arbitrary string to be displayed on your customer’s statement
      * @example if your website is RunClub and the item you’re charging for is a race ticket,
      * you may want to specify a statement_descriptor of RunClub 5K race ticket.
      */
    var statement_descriptor: js.UndefOr[String] = js.native
    
    var three_d_secure_2_eap: js.UndefOr[js.Any] = js.native
    
    /**
      * When passed, token properties will override source parameters
      */
    var token: js.UndefOr[Token] = js.native
    
    /**
      * The type of the source to create
      */
    var `type`: paymentOptions = js.native
    
    /**
      * Whether this source should be reusable or not
      */
    var usage: reusable | single_use = js.native
  }
  object SourceData {
    
    @scala.inline
    def apply(
      amount: Double,
      currency: String,
      flow: redirect | receiver | code_verification | none,
      `type`: paymentOptions,
      usage: reusable | single_use
    ): SourceData = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceData]
    }
    
    @scala.inline
    implicit class SourceDataMutableBuilder[Self <: SourceData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlow(value: redirect | receiver | code_verification | none): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMandate(value: Mandate): Self = StObject.set(x, "mandate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMandateUndefined: Self = StObject.set(x, "mandate", js.undefined)
      
      @scala.inline
      def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setOwner(value: Customer): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      @scala.inline
      def setReceiver(value: Receiver): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
      
      @scala.inline
      def setRedirect(value: Redirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
      
      @scala.inline
      def setThree_d_secure_2_eap(value: js.Any): Self = StObject.set(x, "three_d_secure_2_eap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThree_d_secure_2_eapUndefined: Self = StObject.set(x, "three_d_secure_2_eap", js.undefined)
      
      @scala.inline
      def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      @scala.inline
      def setType(value: paymentOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsage(value: reusable | single_use): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SourceResult extends StObject {
    
    /**
      * There was an error. This includes client-side validation errors.
      */
    var error: js.UndefOr[StripeError] = js.native
    
    /**
      * The identifier of the source to be retrieved
      */
    var source: Source = js.native
  }
  object SourceResult {
    
    @scala.inline
    def apply(source: Source): SourceResult = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceResult]
    }
    
    @scala.inline
    implicit class SourceResultMutableBuilder[Self <: SourceResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: StripeError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stripejs.stripejsStrings.ach_credit_transfer
    - typingsSlinky.stripejs.stripejsStrings.ach_debit
    - typingsSlinky.stripejs.stripejsStrings.alipay
    - typingsSlinky.stripejs.stripejsStrings.bancontact
    - typingsSlinky.stripejs.stripejsStrings.card
    - typingsSlinky.stripejs.stripejsStrings.card_present
    - typingsSlinky.stripejs.stripejsStrings.eps
    - typingsSlinky.stripejs.stripejsStrings.giropay
    - typingsSlinky.stripejs.stripejsStrings.ideal
    - typingsSlinky.stripejs.stripejsStrings.multibanco
    - typingsSlinky.stripejs.stripejsStrings.p24
    - typingsSlinky.stripejs.stripejsStrings.paper_check
    - typingsSlinky.stripejs.stripejsStrings.sepa_credit_transfer
    - typingsSlinky.stripejs.stripejsStrings.sepa_debit
    - typingsSlinky.stripejs.stripejsStrings.sofort
    - typingsSlinky.stripejs.stripejsStrings.three_d_secure
  */
  trait paymentOptions extends StObject
  object paymentOptions {
    
    @scala.inline
    def ach_credit_transfer: typingsSlinky.stripejs.stripejsStrings.ach_credit_transfer = "ach_credit_transfer".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.ach_credit_transfer]
    
    @scala.inline
    def ach_debit: typingsSlinky.stripejs.stripejsStrings.ach_debit = "ach_debit".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.ach_debit]
    
    @scala.inline
    def alipay: typingsSlinky.stripejs.stripejsStrings.alipay = "alipay".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.alipay]
    
    @scala.inline
    def bancontact: typingsSlinky.stripejs.stripejsStrings.bancontact = "bancontact".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.bancontact]
    
    @scala.inline
    def card: typingsSlinky.stripejs.stripejsStrings.card = "card".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.card]
    
    @scala.inline
    def card_present: typingsSlinky.stripejs.stripejsStrings.card_present = "card_present".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.card_present]
    
    @scala.inline
    def eps: typingsSlinky.stripejs.stripejsStrings.eps = "eps".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.eps]
    
    @scala.inline
    def giropay: typingsSlinky.stripejs.stripejsStrings.giropay = "giropay".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.giropay]
    
    @scala.inline
    def ideal: typingsSlinky.stripejs.stripejsStrings.ideal = "ideal".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.ideal]
    
    @scala.inline
    def multibanco: typingsSlinky.stripejs.stripejsStrings.multibanco = "multibanco".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.multibanco]
    
    @scala.inline
    def p24: typingsSlinky.stripejs.stripejsStrings.p24 = "p24".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.p24]
    
    @scala.inline
    def paper_check: typingsSlinky.stripejs.stripejsStrings.paper_check = "paper_check".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.paper_check]
    
    @scala.inline
    def sepa_credit_transfer: typingsSlinky.stripejs.stripejsStrings.sepa_credit_transfer = "sepa_credit_transfer".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.sepa_credit_transfer]
    
    @scala.inline
    def sepa_debit: typingsSlinky.stripejs.stripejsStrings.sepa_debit = "sepa_debit".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.sepa_debit]
    
    @scala.inline
    def sofort: typingsSlinky.stripejs.stripejsStrings.sofort = "sofort".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.sofort]
    
    @scala.inline
    def three_d_secure: typingsSlinky.stripejs.stripejsStrings.three_d_secure = "three_d_secure".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.three_d_secure]
  }
}
