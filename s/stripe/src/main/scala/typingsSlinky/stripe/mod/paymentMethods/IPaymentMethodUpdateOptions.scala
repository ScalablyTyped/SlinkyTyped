package typingsSlinky.stripe.mod.paymentMethods

import typingsSlinky.stripe.anon.Address
import typingsSlinky.stripe.anon.Expmonth
import typingsSlinky.stripe.mod.IMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaymentMethodUpdateOptions extends StObject {
  
  /** Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods. */
  var billing_details: js.UndefOr[Address] = js.native
  
  var card: js.UndefOr[Expmonth] = js.native
  
  /** Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. */
  var metadata: js.UndefOr[IMetadata] = js.native
}
object IPaymentMethodUpdateOptions {
  
  @scala.inline
  def apply(): IPaymentMethodUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentMethodUpdateOptions]
  }
  
  @scala.inline
  implicit class IPaymentMethodUpdateOptionsMutableBuilder[Self <: IPaymentMethodUpdateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBilling_details(value: Address): Self = StObject.set(x, "billing_details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilling_detailsUndefined: Self = StObject.set(x, "billing_details", js.undefined)
    
    @scala.inline
    def setCard(value: Expmonth): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
