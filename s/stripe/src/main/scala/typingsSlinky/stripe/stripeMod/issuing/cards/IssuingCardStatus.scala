package typingsSlinky.stripe.stripeMod.issuing.cards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.active
  - typings.stripe.stripeStrings.inactive
  - typings.stripe.stripeStrings.canceled
  - typings.stripe.stripeStrings.lost
  - typings.stripe.stripeStrings.stolen
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

