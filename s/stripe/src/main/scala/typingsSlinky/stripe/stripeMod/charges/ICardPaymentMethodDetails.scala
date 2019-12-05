package typingsSlinky.stripe.stripeMod.charges

import typingsSlinky.stripe.Anon_Brand
import typingsSlinky.stripe.stripeStrings.card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardPaymentMethodDetails extends IPaymentMethodDetails {
  var card: Anon_Brand
  var `type`: card
}

object ICardPaymentMethodDetails {
  @scala.inline
  def apply(card: Anon_Brand, `type`: card): ICardPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPaymentMethodDetails]
  }
}

