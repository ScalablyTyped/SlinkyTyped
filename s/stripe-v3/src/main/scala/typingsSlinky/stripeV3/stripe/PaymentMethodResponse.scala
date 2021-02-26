package typingsSlinky.stripeV3.stripe

import typingsSlinky.stripeV3.stripe.paymentMethod.PaymentMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentMethodResponse extends StObject {
  
  var error: js.UndefOr[Error] = js.native
  
  var paymentMethod: js.UndefOr[PaymentMethod] = js.native
}
object PaymentMethodResponse {
  
  @scala.inline
  def apply(): PaymentMethodResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentMethodResponse]
  }
  
  @scala.inline
  implicit class PaymentMethodResponseMutableBuilder[Self <: PaymentMethodResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: PaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
  }
}
