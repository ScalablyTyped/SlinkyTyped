package typingsSlinky.stripe.mod.products

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.service
  - typingsSlinky.stripe.stripeStrings.good
*/
trait ProductType extends js.Object

object ProductType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def good: typingsSlinky.stripe.stripeStrings.good = this.cast("good")
  @scala.inline
  def service: typingsSlinky.stripe.stripeStrings.service = this.cast("service")
}

