package typingsSlinky.stripe.mod.issuing.cards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.damage
  - typingsSlinky.stripe.stripeStrings.expiration
  - typingsSlinky.stripe.stripeStrings.loss
  - typingsSlinky.stripe.stripeStrings.theft
*/
trait IssuingCardReplacementReason extends js.Object

object IssuingCardReplacementReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def damage: typingsSlinky.stripe.stripeStrings.damage = this.cast("damage")
  @scala.inline
  def expiration: typingsSlinky.stripe.stripeStrings.expiration = this.cast("expiration")
  @scala.inline
  def loss: typingsSlinky.stripe.stripeStrings.loss = this.cast("loss")
  @scala.inline
  def theft: typingsSlinky.stripe.stripeStrings.theft = this.cast("theft")
}

