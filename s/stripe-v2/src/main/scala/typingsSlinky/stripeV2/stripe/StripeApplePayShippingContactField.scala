package typingsSlinky.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripeV2.stripeV2Strings.phone
  - typingsSlinky.stripeV2.stripeV2Strings.email
  - typingsSlinky.stripeV2.stripeV2Strings.postalAddress
  - typingsSlinky.stripeV2.stripeV2Strings.name
*/
trait StripeApplePayShippingContactField extends js.Object

object StripeApplePayShippingContactField {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def email: typingsSlinky.stripeV2.stripeV2Strings.email = this.cast("email")
  @scala.inline
  def name: typingsSlinky.stripeV2.stripeV2Strings.name = this.cast("name")
  @scala.inline
  def phone: typingsSlinky.stripeV2.stripeV2Strings.phone = this.cast("phone")
  @scala.inline
  def postalAddress: typingsSlinky.stripeV2.stripeV2Strings.postalAddress = this.cast("postalAddress")
}

