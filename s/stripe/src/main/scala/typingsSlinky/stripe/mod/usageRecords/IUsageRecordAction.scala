package typingsSlinky.stripe.mod.usageRecords

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.increment
  - typingsSlinky.stripe.stripeStrings.set
*/
trait IUsageRecordAction extends js.Object

object IUsageRecordAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def increment: typingsSlinky.stripe.stripeStrings.increment = this.cast("increment")
  @scala.inline
  def set: typingsSlinky.stripe.stripeStrings.set = this.cast("set")
}

