package typingsSlinky.stripe.mod.issuing.cards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.active
  - typingsSlinky.stripe.stripeStrings.inactive
  - typingsSlinky.stripe.stripeStrings.canceled
  - typingsSlinky.stripe.stripeStrings.lost
  - typingsSlinky.stripe.stripeStrings.stolen
*/
trait IssuingCardStatus extends js.Object

object IssuingCardStatus {
  @scala.inline
  def active: typingsSlinky.stripe.stripeStrings.active = this.cast("active")
  @scala.inline
  def canceled: typingsSlinky.stripe.stripeStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typingsSlinky.stripe.stripeStrings.inactive = this.cast("inactive")
  @scala.inline
  def lost: typingsSlinky.stripe.stripeStrings.lost = this.cast("lost")
  @scala.inline
  def stolen: typingsSlinky.stripe.stripeStrings.stolen = this.cast("stolen")
}

