package typingsSlinky.stripe.mod.transfers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.pending
  - typingsSlinky.stripe.stripeStrings.paid
  - typingsSlinky.stripe.stripeStrings.failed
  - typingsSlinky.stripe.stripeStrings.in_transit
  - typingsSlinky.stripe.stripeStrings.canceled
*/
trait Statuses extends js.Object

object Statuses {
  @scala.inline
  def canceled: typingsSlinky.stripe.stripeStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typingsSlinky.stripe.stripeStrings.failed = this.cast("failed")
  @scala.inline
  def in_transit: typingsSlinky.stripe.stripeStrings.in_transit = this.cast("in_transit")
  @scala.inline
  def paid: typingsSlinky.stripe.stripeStrings.paid = this.cast("paid")
  @scala.inline
  def pending: typingsSlinky.stripe.stripeStrings.pending = this.cast("pending")
}

