package typingsSlinky.stripeV3.stripe.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripeV3.stripeV3Strings.duplicate
  - typingsSlinky.stripeV3.stripeV3Strings.fraudulent
  - typingsSlinky.stripeV3.stripeV3Strings.requested_by_customer
  - typingsSlinky.stripeV3.stripeV3Strings.abandoned
  - typingsSlinky.stripeV3.stripeV3Strings.failed_invoice
  - typingsSlinky.stripeV3.stripeV3Strings.void_invoice
  - typingsSlinky.stripeV3.stripeV3Strings.automatic
*/
trait PaymentIntentCancelationReason extends js.Object

object PaymentIntentCancelationReason {
  @scala.inline
  def abandoned: typingsSlinky.stripeV3.stripeV3Strings.abandoned = this.cast("abandoned")
  @scala.inline
  def automatic: typingsSlinky.stripeV3.stripeV3Strings.automatic = this.cast("automatic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def duplicate: typingsSlinky.stripeV3.stripeV3Strings.duplicate = this.cast("duplicate")
  @scala.inline
  def failed_invoice: typingsSlinky.stripeV3.stripeV3Strings.failed_invoice = this.cast("failed_invoice")
  @scala.inline
  def fraudulent: typingsSlinky.stripeV3.stripeV3Strings.fraudulent = this.cast("fraudulent")
  @scala.inline
  def requested_by_customer: typingsSlinky.stripeV3.stripeV3Strings.requested_by_customer = this.cast("requested_by_customer")
  @scala.inline
  def void_invoice: typingsSlinky.stripeV3.stripeV3Strings.void_invoice = this.cast("void_invoice")
}

