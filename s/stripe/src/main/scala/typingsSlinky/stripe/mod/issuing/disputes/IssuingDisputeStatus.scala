package typingsSlinky.stripe.mod.issuing.disputes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.lost
  - typingsSlinky.stripe.stripeStrings.under_review
  - typingsSlinky.stripe.stripeStrings.unsubmitted
  - typingsSlinky.stripe.stripeStrings.won
*/
trait IssuingDisputeStatus extends js.Object

object IssuingDisputeStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lost: typingsSlinky.stripe.stripeStrings.lost = this.cast("lost")
  @scala.inline
  def under_review: typingsSlinky.stripe.stripeStrings.under_review = this.cast("under_review")
  @scala.inline
  def unsubmitted: typingsSlinky.stripe.stripeStrings.unsubmitted = this.cast("unsubmitted")
  @scala.inline
  def won: typingsSlinky.stripe.stripeStrings.won = this.cast("won")
}

