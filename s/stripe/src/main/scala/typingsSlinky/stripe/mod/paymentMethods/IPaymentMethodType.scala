package typingsSlinky.stripe.mod.paymentMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined stripe.stripe.paymentMethods.IPaymentMethod['type'] */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.card
  - typingsSlinky.stripe.stripeStrings.card_present
*/
trait IPaymentMethodType extends js.Object

object IPaymentMethodType {
  @scala.inline
  def card: typingsSlinky.stripe.stripeStrings.card = "card".asInstanceOf[typingsSlinky.stripe.stripeStrings.card]
  @scala.inline
  def card_present: typingsSlinky.stripe.stripeStrings.card_present = "card_present".asInstanceOf[typingsSlinky.stripe.stripeStrings.card_present]
}

