package typingsSlinky.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripeV2.stripeV2Strings.shipping
  - typingsSlinky.stripeV2.stripeV2Strings.delivery
  - typingsSlinky.stripeV2.stripeV2Strings.storePickup
  - typingsSlinky.stripeV2.stripeV2Strings.servicePickup
*/
trait StripeApplePayShipping extends js.Object

object StripeApplePayShipping {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delivery: typingsSlinky.stripeV2.stripeV2Strings.delivery = this.cast("delivery")
  @scala.inline
  def servicePickup: typingsSlinky.stripeV2.stripeV2Strings.servicePickup = this.cast("servicePickup")
  @scala.inline
  def shipping: typingsSlinky.stripeV2.stripeV2Strings.shipping = this.cast("shipping")
  @scala.inline
  def storePickup: typingsSlinky.stripeV2.stripeV2Strings.storePickup = this.cast("storePickup")
}

