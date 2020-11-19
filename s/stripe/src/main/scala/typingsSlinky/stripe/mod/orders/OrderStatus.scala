package typingsSlinky.stripe.mod.orders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def canceled: typingsSlinky.stripe.stripeStrings.canceled = "canceled".asInstanceOf[typingsSlinky.stripe.stripeStrings.canceled]
  
  @scala.inline
  def created: typingsSlinky.stripe.stripeStrings.created = "created".asInstanceOf[typingsSlinky.stripe.stripeStrings.created]
  
  @scala.inline
  def fulfilled: typingsSlinky.stripe.stripeStrings.fulfilled = "fulfilled".asInstanceOf[typingsSlinky.stripe.stripeStrings.fulfilled]
  
  @scala.inline
  def paid: typingsSlinky.stripe.stripeStrings.paid = "paid".asInstanceOf[typingsSlinky.stripe.stripeStrings.paid]
  
  @scala.inline
  def returned: typingsSlinky.stripe.stripeStrings.returned = "returned".asInstanceOf[typingsSlinky.stripe.stripeStrings.returned]
}
