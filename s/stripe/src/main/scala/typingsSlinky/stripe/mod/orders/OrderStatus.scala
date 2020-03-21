package typingsSlinky.stripe.mod.orders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Current order status. One of created, paid, canceled, fulfilled, or returned. More detail in the Relay API Overview.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.created
  - typingsSlinky.stripe.stripeStrings.paid
  - typingsSlinky.stripe.stripeStrings.canceled
  - typingsSlinky.stripe.stripeStrings.fulfilled
  - typingsSlinky.stripe.stripeStrings.returned
*/
trait OrderStatus extends js.Object

object OrderStatus {
  @scala.inline
  def canceled: typingsSlinky.stripe.stripeStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def created: typingsSlinky.stripe.stripeStrings.created = this.cast("created")
  @scala.inline
  def fulfilled: typingsSlinky.stripe.stripeStrings.fulfilled = this.cast("fulfilled")
  @scala.inline
  def paid: typingsSlinky.stripe.stripeStrings.paid = this.cast("paid")
  @scala.inline
  def returned: typingsSlinky.stripe.stripeStrings.returned = this.cast("returned")
}

