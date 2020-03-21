package typingsSlinky.stripe.mod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.active
  - typingsSlinky.stripe.stripeStrings.inactive
  - typingsSlinky.stripe.stripeStrings.blocked
*/
trait CardholderStatus extends js.Object

object CardholderStatus {
  @scala.inline
  def active: typingsSlinky.stripe.stripeStrings.active = this.cast("active")
  @scala.inline
  def blocked: typingsSlinky.stripe.stripeStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typingsSlinky.stripe.stripeStrings.inactive = this.cast("inactive")
}

