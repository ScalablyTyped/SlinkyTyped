package typingsSlinky.stripe.stripeMod.customerBalanceTransactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.adjustment
  - typings.stripe.stripeStrings.applied_to_invoice
  - typings.stripe.stripeStrings.credit_note
  - typings.stripe.stripeStrings.initial
  - typings.stripe.stripeStrings.invoice_too_large
  - typings.stripe.stripeStrings.invoice_too_small
  - typings.stripe.stripeStrings.unspent_receiver_credit
*/
trait CustomerBalanceTransactionType extends js.Object

object CustomerBalanceTransactionType {
  @scala.inline
  def adjustment: typingsSlinky.stripe.stripeStrings.adjustment = this.cast("adjustment")
  @scala.inline
  def applied_to_invoice: typingsSlinky.stripe.stripeStrings.applied_to_invoice = this.cast("applied_to_invoice")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def credit_note: typingsSlinky.stripe.stripeStrings.credit_note = this.cast("credit_note")
  @scala.inline
  def initial: typingsSlinky.stripe.stripeStrings.initial = this.cast("initial")
  @scala.inline
  def invoice_too_large: typingsSlinky.stripe.stripeStrings.invoice_too_large = this.cast("invoice_too_large")
  @scala.inline
  def invoice_too_small: typingsSlinky.stripe.stripeStrings.invoice_too_small = this.cast("invoice_too_small")
  @scala.inline
  def unspent_receiver_credit: typingsSlinky.stripe.stripeStrings.unspent_receiver_credit = this.cast("unspent_receiver_credit")
}

