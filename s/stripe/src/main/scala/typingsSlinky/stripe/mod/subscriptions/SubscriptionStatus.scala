package typingsSlinky.stripe.mod.subscriptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.incomplete
  - typingsSlinky.stripe.stripeStrings.incomplete_expired
  - typingsSlinky.stripe.stripeStrings.trialing
  - typingsSlinky.stripe.stripeStrings.active
  - typingsSlinky.stripe.stripeStrings.past_due
  - typingsSlinky.stripe.stripeStrings.canceled
  - typingsSlinky.stripe.stripeStrings.unpaid
*/
trait SubscriptionStatus extends js.Object

object SubscriptionStatus {
  @scala.inline
  def active: typingsSlinky.stripe.stripeStrings.active = this.cast("active")
  @scala.inline
  def canceled: typingsSlinky.stripe.stripeStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incomplete: typingsSlinky.stripe.stripeStrings.incomplete = this.cast("incomplete")
  @scala.inline
  def incomplete_expired: typingsSlinky.stripe.stripeStrings.incomplete_expired = this.cast("incomplete_expired")
  @scala.inline
  def past_due: typingsSlinky.stripe.stripeStrings.past_due = this.cast("past_due")
  @scala.inline
  def trialing: typingsSlinky.stripe.stripeStrings.trialing = this.cast("trialing")
  @scala.inline
  def unpaid: typingsSlinky.stripe.stripeStrings.unpaid = this.cast("unpaid")
}

