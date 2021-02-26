package typingsSlinky.stripe.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.stripe.mod.paymentIntents.IPaymentIntent
import typingsSlinky.stripe.mod.paymentMethods.IPaymentMethod
import typingsSlinky.stripe.mod.setupIntents.ISetupIntent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains all stripe error classes
  */
object errors {
  
  @JSImport("stripe", "errors._Error")
  @js.native
  class Error ()
    extends typingsSlinky.std.Error
  
  @JSImport("stripe", "errors.StripeAPIError")
  @js.native
  class StripeAPIError () extends StripeError {
    
    @JSName("type")
    val type_StripeAPIError: typingsSlinky.stripe.stripeStrings.StripeAPIError = js.native
  }
  
  @JSImport("stripe", "errors.StripeAuthenticationError")
  @js.native
  class StripeAuthenticationError () extends StripeError {
    
    @JSName("type")
    val type_StripeAuthenticationError: typingsSlinky.stripe.stripeStrings.StripeAuthenticationError = js.native
  }
  
  @JSImport("stripe", "errors.StripeCardError")
  @js.native
  class StripeCardError () extends StripeError {
    
    @JSName("type")
    val type_StripeCardError: typingsSlinky.stripe.stripeStrings.StripeCardError = js.native
  }
  
  @JSImport("stripe", "errors.StripeConnectionError")
  @js.native
  class StripeConnectionError () extends StripeError {
    
    @JSName("type")
    val type_StripeConnectionError: typingsSlinky.stripe.stripeStrings.StripeConnectionError = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.stripe.mod.IStripeError because var conflicts: message. Inlined `type`, code, param */ @JSImport("stripe", "errors.StripeError")
  @js.native
  abstract class StripeError () extends Error {
    
    val charge: js.UndefOr[String] = js.native
    
    val code: js.UndefOr[String] = js.native
    
    val decline_code: js.UndefOr[String] = js.native
    
    val detail: js.UndefOr[js.Any] = js.native
    
    val headers: StringDictionary[String] = js.native
    
    /**
      * The parameter the error relates to if the error is parameter-specific. You can use this to display a
      * message near the correct form field, for example.
      */
    var param: js.UndefOr[String] = js.native
    
    val params: js.UndefOr[String] = js.native
    
    val payment_intent: js.UndefOr[IPaymentIntent] = js.native
    
    val payment_method: js.UndefOr[IPaymentMethod] = js.native
    
    val raw: js.Any = js.native
    
    val rawType: RawType = js.native
    
    val requestId: String = js.native
    
    val setup_intent: js.UndefOr[ISetupIntent] = js.native
    
    val source: js.UndefOr[typingsSlinky.stripe.mod.sources.ISource] = js.native
    
    val statusCode: js.UndefOr[Double] = js.native
    
    val `type`: String = js.native
  }
  object StripeError {
    
    /* static member */
    @JSImport("stripe", "errors.StripeError.populate")
    @js.native
    def populate(`type`: RawType): StripeError = js.native
  }
  
  @JSImport("stripe", "errors.StripeIdempotencyError")
  @js.native
  class StripeIdempotencyError () extends StripeError {
    
    @JSName("type")
    val type_StripeIdempotencyError: typingsSlinky.stripe.stripeStrings.StripeIdempotencyError = js.native
  }
  
  @JSImport("stripe", "errors.StripeInvalidRequestError")
  @js.native
  class StripeInvalidRequestError () extends StripeError {
    
    @JSName("type")
    val type_StripeInvalidRequestError: typingsSlinky.stripe.stripeStrings.StripeInvalidRequestError = js.native
  }
  
  @JSImport("stripe", "errors.StripePermissionError")
  @js.native
  class StripePermissionError () extends StripeError {
    
    @JSName("type")
    val type_StripePermissionError: typingsSlinky.stripe.stripeStrings.StripePermissionError = js.native
  }
  
  @JSImport("stripe", "errors.StripeRateLimitError")
  @js.native
  class StripeRateLimitError () extends StripeError {
    
    @JSName("type")
    val type_StripeRateLimitError: typingsSlinky.stripe.stripeStrings.StripeRateLimitError = js.native
  }
  
  @JSImport("stripe", "errors.StripeSignatureVerificationError")
  @js.native
  class StripeSignatureVerificationError () extends StripeError {
    
    @JSName("type")
    val type_StripeSignatureVerificationError: typingsSlinky.stripe.stripeStrings.StripeSignatureVerificationError = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stripe.stripeStrings.card_error
    - typingsSlinky.stripe.stripeStrings.invalid_request_error
    - typingsSlinky.stripe.stripeStrings.api_error
    - typingsSlinky.stripe.stripeStrings.idempotency_error
  */
  trait RawType extends StObject
  object RawType {
    
    @scala.inline
    def api_error: typingsSlinky.stripe.stripeStrings.api_error = "api_error".asInstanceOf[typingsSlinky.stripe.stripeStrings.api_error]
    
    @scala.inline
    def card_error: typingsSlinky.stripe.stripeStrings.card_error = "card_error".asInstanceOf[typingsSlinky.stripe.stripeStrings.card_error]
    
    @scala.inline
    def idempotency_error: typingsSlinky.stripe.stripeStrings.idempotency_error = "idempotency_error".asInstanceOf[typingsSlinky.stripe.stripeStrings.idempotency_error]
    
    @scala.inline
    def invalid_request_error: typingsSlinky.stripe.stripeStrings.invalid_request_error = "invalid_request_error".asInstanceOf[typingsSlinky.stripe.stripeStrings.invalid_request_error]
  }
}
