package typingsSlinky.stripe.mod.paymentMethods

import typingsSlinky.stripe.anon.Checks
import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.stripeStrings.card
import typingsSlinky.stripe.stripeStrings.card_present
import typingsSlinky.stripe.stripeStrings.payment_method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.mod.paymentMethods.ICardPaymentMethod
  - typingsSlinky.stripe.mod.paymentMethods.ICardPresentPaymentMethod
*/
trait IPaymentMethod extends StObject
object IPaymentMethod {
  
  @scala.inline
  def ICardPaymentMethod(
    card: Checks,
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: payment_method,
    `type`: card
  ): typingsSlinky.stripe.mod.paymentMethods.ICardPaymentMethod = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.paymentMethods.ICardPaymentMethod]
  }
  
  @scala.inline
  def ICardPresentPaymentMethod(
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: payment_method,
    `type`: card_present
  ): typingsSlinky.stripe.mod.paymentMethods.ICardPresentPaymentMethod = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.paymentMethods.ICardPresentPaymentMethod]
  }
}
