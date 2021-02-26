package typingsSlinky.stripe.anon

import typingsSlinky.stripe.mod.charges.IPaymentMethodDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Charge extends StObject {
  
  /** The charge that created this object. */
  var charge: String = js.native
  
  /** Transaction-specific details of the payment method used in the payment. */
  var payment_method_details: IPaymentMethodDetails = js.native
}
object Charge {
  
  @scala.inline
  def apply(charge: String, payment_method_details: IPaymentMethodDetails): Charge = {
    val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any], payment_method_details = payment_method_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charge]
  }
  
  @scala.inline
  implicit class ChargeMutableBuilder[Self <: Charge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharge(value: String): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_method_details(value: IPaymentMethodDetails): Self = StObject.set(x, "payment_method_details", value.asInstanceOf[js.Any])
  }
}
