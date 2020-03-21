package typingsSlinky.stripe.mod.setupIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.on_session
  - typingsSlinky.stripe.stripeStrings.off_session
*/
trait SetupIntentUsageType extends js.Object

object SetupIntentUsageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def off_session: typingsSlinky.stripe.stripeStrings.off_session = this.cast("off_session")
  @scala.inline
  def on_session: typingsSlinky.stripe.stripeStrings.on_session = this.cast("on_session")
}

