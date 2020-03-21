package typingsSlinky.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripeV2.stripeV2Strings.postalAddress
  - typingsSlinky.stripeV2.stripeV2Strings.name
*/
trait StripeApplePayBillingContactField extends js.Object

object StripeApplePayBillingContactField {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def name: typingsSlinky.stripeV2.stripeV2Strings.name = this.cast("name")
  @scala.inline
  def postalAddress: typingsSlinky.stripeV2.stripeV2Strings.postalAddress = this.cast("postalAddress")
}

