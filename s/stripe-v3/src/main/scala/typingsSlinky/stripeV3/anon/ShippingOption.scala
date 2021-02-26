package typingsSlinky.stripeV3.anon

import typingsSlinky.stripeV3.stripe.paymentRequest.UpdateDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShippingOption extends StObject {
  
  var shippingOption: typingsSlinky.stripeV3.stripe.paymentRequest.ShippingOption = js.native
  
  def updateWith(options: UpdateDetails): Unit = js.native
}
object ShippingOption {
  
  @scala.inline
  def apply(
    shippingOption: typingsSlinky.stripeV3.stripe.paymentRequest.ShippingOption,
    updateWith: UpdateDetails => Unit
  ): ShippingOption = {
    val __obj = js.Dynamic.literal(shippingOption = shippingOption.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
    __obj.asInstanceOf[ShippingOption]
  }
  
  @scala.inline
  implicit class ShippingOptionMutableBuilder[Self <: ShippingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShippingOption(value: typingsSlinky.stripeV3.stripe.paymentRequest.ShippingOption): Self = StObject.set(x, "shippingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateWith(value: UpdateDetails => Unit): Self = StObject.set(x, "updateWith", js.Any.fromFunction1(value))
  }
}
