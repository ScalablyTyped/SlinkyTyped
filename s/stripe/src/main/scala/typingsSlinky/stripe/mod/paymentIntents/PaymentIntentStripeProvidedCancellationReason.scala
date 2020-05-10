package typingsSlinky.stripe.mod.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.failed_invoice
  - typingsSlinky.stripe.stripeStrings.void_invoice
  - typingsSlinky.stripe.stripeStrings.automatic
*/
trait PaymentIntentStripeProvidedCancellationReason extends js.Object

object PaymentIntentStripeProvidedCancellationReason {
  @scala.inline
  def automatic: typingsSlinky.stripe.stripeStrings.automatic = "automatic".asInstanceOf[typingsSlinky.stripe.stripeStrings.automatic]
  @scala.inline
  def failed_invoice: typingsSlinky.stripe.stripeStrings.failed_invoice = "failed_invoice".asInstanceOf[typingsSlinky.stripe.stripeStrings.failed_invoice]
  @scala.inline
  def void_invoice: typingsSlinky.stripe.stripeStrings.void_invoice = "void_invoice".asInstanceOf[typingsSlinky.stripe.stripeStrings.void_invoice]
}

