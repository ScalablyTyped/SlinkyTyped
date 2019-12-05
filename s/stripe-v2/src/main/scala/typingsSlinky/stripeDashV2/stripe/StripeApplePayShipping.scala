package typingsSlinky.stripeDashV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeDashV2.stripeDashV2Strings.shipping
  - typings.stripeDashV2.stripeDashV2Strings.delivery
  - typings.stripeDashV2.stripeDashV2Strings.storePickup
  - typings.stripeDashV2.stripeDashV2Strings.servicePickup
*/
trait StripeApplePayShipping extends js.Object

object StripeApplePayShipping {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delivery: typingsSlinky.stripeDashV2.stripeDashV2Strings.delivery = this.cast("delivery")
  @scala.inline
  def servicePickup: typingsSlinky.stripeDashV2.stripeDashV2Strings.servicePickup = this.cast("servicePickup")
  @scala.inline
  def shipping: typingsSlinky.stripeDashV2.stripeDashV2Strings.shipping = this.cast("shipping")
  @scala.inline
  def storePickup: typingsSlinky.stripeDashV2.stripeDashV2Strings.storePickup = this.cast("storePickup")
}

