package typingsSlinky.stripe.mod.setupIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.abandoned
  - typingsSlinky.stripe.stripeStrings.requested_by_customer
  - typingsSlinky.stripe.stripeStrings.duplicate
*/
trait SetupIntentCancelationReason extends js.Object

object SetupIntentCancelationReason {
  @scala.inline
  def abandoned: typingsSlinky.stripe.stripeStrings.abandoned = this.cast("abandoned")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def duplicate: typingsSlinky.stripe.stripeStrings.duplicate = this.cast("duplicate")
  @scala.inline
  def requested_by_customer: typingsSlinky.stripe.stripeStrings.requested_by_customer = this.cast("requested_by_customer")
}

