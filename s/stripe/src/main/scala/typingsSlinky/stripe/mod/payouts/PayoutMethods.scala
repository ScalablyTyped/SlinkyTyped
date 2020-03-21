package typingsSlinky.stripe.mod.payouts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.instant
  - typingsSlinky.stripe.stripeStrings.standard
*/
trait PayoutMethods extends js.Object

object PayoutMethods {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def instant: typingsSlinky.stripe.stripeStrings.instant = this.cast("instant")
  @scala.inline
  def standard: typingsSlinky.stripe.stripeStrings.standard = this.cast("standard")
}

