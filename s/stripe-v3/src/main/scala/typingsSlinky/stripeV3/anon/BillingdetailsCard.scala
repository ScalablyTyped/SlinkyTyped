package typingsSlinky.stripeV3.anon

import typingsSlinky.stripeV3.stripe.BillingDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingdetailsCard extends StObject {
  
  /**
    * The billing details associated with the card. [Recommended]
    */
  var billing_details: js.UndefOr[BillingDetails] = js.native
  
  var card: js.UndefOr[Token] = js.native
}
object BillingdetailsCard {
  
  @scala.inline
  def apply(): BillingdetailsCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingdetailsCard]
  }
  
  @scala.inline
  implicit class BillingdetailsCardMutableBuilder[Self <: BillingdetailsCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBilling_details(value: BillingDetails): Self = StObject.set(x, "billing_details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilling_detailsUndefined: Self = StObject.set(x, "billing_details", js.undefined)
    
    @scala.inline
    def setCard(value: Token): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
  }
}
