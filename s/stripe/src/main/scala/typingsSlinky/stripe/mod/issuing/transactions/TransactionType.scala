package typingsSlinky.stripe.mod.issuing.transactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.capture
  - typingsSlinky.stripe.stripeStrings.refund
  - typingsSlinky.stripe.stripeStrings.cash_withdrawal
  - typingsSlinky.stripe.stripeStrings.refund_reversal
  - typingsSlinky.stripe.stripeStrings.dispute
  - typingsSlinky.stripe.stripeStrings.dispute_loss
*/
trait TransactionType extends js.Object

object TransactionType {
  @scala.inline
  def capture: typingsSlinky.stripe.stripeStrings.capture = this.cast("capture")
  @scala.inline
  def cash_withdrawal: typingsSlinky.stripe.stripeStrings.cash_withdrawal = this.cast("cash_withdrawal")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dispute: typingsSlinky.stripe.stripeStrings.dispute = this.cast("dispute")
  @scala.inline
  def dispute_loss: typingsSlinky.stripe.stripeStrings.dispute_loss = this.cast("dispute_loss")
  @scala.inline
  def refund: typingsSlinky.stripe.stripeStrings.refund = this.cast("refund")
  @scala.inline
  def refund_reversal: typingsSlinky.stripe.stripeStrings.refund_reversal = this.cast("refund_reversal")
}

