package typingsSlinky.stripe.mod.issuing.authorizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.chip
  - typingsSlinky.stripe.stripeStrings.contactless
  - typingsSlinky.stripe.stripeStrings.keyed_in
  - typingsSlinky.stripe.stripeStrings.online
  - typingsSlinky.stripe.stripeStrings.swipe
*/
trait AuthorizationMethod extends js.Object

object AuthorizationMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chip: typingsSlinky.stripe.stripeStrings.chip = this.cast("chip")
  @scala.inline
  def contactless: typingsSlinky.stripe.stripeStrings.contactless = this.cast("contactless")
  @scala.inline
  def keyed_in: typingsSlinky.stripe.stripeStrings.keyed_in = this.cast("keyed_in")
  @scala.inline
  def online: typingsSlinky.stripe.stripeStrings.online = this.cast("online")
  @scala.inline
  def swipe: typingsSlinky.stripe.stripeStrings.swipe = this.cast("swipe")
}

