package typingsSlinky.stripe.anon

import typingsSlinky.stripe.mod.issuing.cardholders.ICardholderBillingAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressICardholderBillingAddress extends StObject {
  
  var address: ICardholderBillingAddress = js.native
}
object AddressICardholderBillingAddress {
  
  @scala.inline
  def apply(address: ICardholderBillingAddress): AddressICardholderBillingAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressICardholderBillingAddress]
  }
  
  @scala.inline
  implicit class AddressICardholderBillingAddressMutableBuilder[Self <: AddressICardholderBillingAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: ICardholderBillingAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
  }
}
