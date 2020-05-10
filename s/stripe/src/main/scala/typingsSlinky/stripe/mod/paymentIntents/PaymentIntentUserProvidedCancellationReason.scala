package typingsSlinky.stripe.mod.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.duplicate
  - typingsSlinky.stripe.stripeStrings.fraudulent
  - typingsSlinky.stripe.stripeStrings.requested_by_customer
  - typingsSlinky.stripe.stripeStrings.abandoned
*/
trait PaymentIntentUserProvidedCancellationReason extends js.Object

object PaymentIntentUserProvidedCancellationReason {
  @scala.inline
  def abandoned: typingsSlinky.stripe.stripeStrings.abandoned = "abandoned".asInstanceOf[typingsSlinky.stripe.stripeStrings.abandoned]
  @scala.inline
  def duplicate: typingsSlinky.stripe.stripeStrings.duplicate = "duplicate".asInstanceOf[typingsSlinky.stripe.stripeStrings.duplicate]
  @scala.inline
  def fraudulent: typingsSlinky.stripe.stripeStrings.fraudulent = "fraudulent".asInstanceOf[typingsSlinky.stripe.stripeStrings.fraudulent]
  @scala.inline
  def requested_by_customer: typingsSlinky.stripe.stripeStrings.requested_by_customer = "requested_by_customer".asInstanceOf[typingsSlinky.stripe.stripeStrings.requested_by_customer]
}

