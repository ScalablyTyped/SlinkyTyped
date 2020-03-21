package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.delivery
  - typingsSlinky.std.stdStrings.pickup
  - typingsSlinky.std.stdStrings.shipping
*/
trait PaymentShippingType extends js.Object

object PaymentShippingType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delivery: typingsSlinky.std.stdStrings.delivery = this.cast("delivery")
  @scala.inline
  def pickup: typingsSlinky.std.stdStrings.pickup = this.cast("pickup")
  @scala.inline
  def shipping: typingsSlinky.std.stdStrings.shipping = this.cast("shipping")
}

