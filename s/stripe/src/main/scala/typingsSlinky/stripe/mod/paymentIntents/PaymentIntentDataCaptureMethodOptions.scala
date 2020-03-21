package typingsSlinky.stripe.mod.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.automatic
  - typingsSlinky.stripe.stripeStrings.manual
*/
trait PaymentIntentDataCaptureMethodOptions extends js.Object

object PaymentIntentDataCaptureMethodOptions {
  @scala.inline
  def automatic: typingsSlinky.stripe.stripeStrings.automatic = this.cast("automatic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def manual: typingsSlinky.stripe.stripeStrings.manual = this.cast("manual")
}

