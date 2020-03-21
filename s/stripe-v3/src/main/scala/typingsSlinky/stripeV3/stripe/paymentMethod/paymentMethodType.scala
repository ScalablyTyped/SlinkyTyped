package typingsSlinky.stripeV3.stripe.paymentMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripeV3.stripeV3Strings.card
  - typingsSlinky.stripeV3.stripeV3Strings.card_present
*/
trait paymentMethodType extends js.Object

object paymentMethodType {
  @scala.inline
  def card: typingsSlinky.stripeV3.stripeV3Strings.card = this.cast("card")
  @scala.inline
  def card_present: typingsSlinky.stripeV3.stripeV3Strings.card_present = this.cast("card_present")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

