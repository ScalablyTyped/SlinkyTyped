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
  def canceled: typingsSlinky.stripe.stripeStrings.canceled = "canceled".asInstanceOf[typingsSlinky.stripe.stripeStrings.canceled]
  @scala.inline
  def failed: typingsSlinky.stripe.stripeStrings.failed = "failed".asInstanceOf[typingsSlinky.stripe.stripeStrings.failed]
  @scala.inline
  def in_transit: typingsSlinky.stripe.stripeStrings.in_transit = "in_transit".asInstanceOf[typingsSlinky.stripe.stripeStrings.in_transit]
  @scala.inline
  def paid: typingsSlinky.stripe.stripeStrings.paid = "paid".asInstanceOf[typingsSlinky.stripe.stripeStrings.paid]
  @scala.inline
  def pending: typingsSlinky.stripe.stripeStrings.pending = "pending".asInstanceOf[typingsSlinky.stripe.stripeStrings.pending]
}

