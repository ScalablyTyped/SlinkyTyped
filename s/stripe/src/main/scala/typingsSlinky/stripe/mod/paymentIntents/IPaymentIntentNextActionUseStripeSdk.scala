package typingsSlinky.stripe.mod.paymentIntents

import typingsSlinky.stripe.stripeStrings.use_stripe_sdk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaymentIntentNextActionUseStripeSdk extends StObject {
  
  var `type`: use_stripe_sdk = js.native
  
  /**
    * When confirming a PaymentIntent with js, js depends on the contents of this object to invoke authentication flows. The shape of the contents is subject to change and is only intended to be used by js.
    */
  var use_stripe_sdk: js.Any = js.native
}
object IPaymentIntentNextActionUseStripeSdk {
  
  @scala.inline
  def apply(`type`: use_stripe_sdk, use_stripe_sdk: js.Any): IPaymentIntentNextActionUseStripeSdk = {
    val __obj = js.Dynamic.literal(use_stripe_sdk = use_stripe_sdk.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntentNextActionUseStripeSdk]
  }
  
  @scala.inline
  implicit class IPaymentIntentNextActionUseStripeSdkMutableBuilder[Self <: IPaymentIntentNextActionUseStripeSdk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: use_stripe_sdk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_stripe_sdk(value: js.Any): Self = StObject.set(x, "use_stripe_sdk", value.asInstanceOf[js.Any])
  }
}
