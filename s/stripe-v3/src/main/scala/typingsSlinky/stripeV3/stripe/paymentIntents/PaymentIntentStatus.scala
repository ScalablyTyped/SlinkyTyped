package typingsSlinky.stripeV3.stripe.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripeV3.stripeV3Strings.requires_payment_method
  - typingsSlinky.stripeV3.stripeV3Strings.requires_confirmation
  - typingsSlinky.stripeV3.stripeV3Strings.requires_action
  - typingsSlinky.stripeV3.stripeV3Strings.processing
  - typingsSlinky.stripeV3.stripeV3Strings.requires_capture
  - typingsSlinky.stripeV3.stripeV3Strings.canceled
  - typingsSlinky.stripeV3.stripeV3Strings.succeeded
*/
trait PaymentIntentStatus extends js.Object

object PaymentIntentStatus {
  @scala.inline
  def canceled: typingsSlinky.stripeV3.stripeV3Strings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def processing: typingsSlinky.stripeV3.stripeV3Strings.processing = this.cast("processing")
  @scala.inline
  def requires_action: typingsSlinky.stripeV3.stripeV3Strings.requires_action = this.cast("requires_action")
  @scala.inline
  def requires_capture: typingsSlinky.stripeV3.stripeV3Strings.requires_capture = this.cast("requires_capture")
  @scala.inline
  def requires_confirmation: typingsSlinky.stripeV3.stripeV3Strings.requires_confirmation = this.cast("requires_confirmation")
  @scala.inline
  def requires_payment_method: typingsSlinky.stripeV3.stripeV3Strings.requires_payment_method = this.cast("requires_payment_method")
  @scala.inline
  def succeeded: typingsSlinky.stripeV3.stripeV3Strings.succeeded = this.cast("succeeded")
}

