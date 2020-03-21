package typingsSlinky.stripeV3.stripe.paymentMethod

import typingsSlinky.stripeV3.stripeV3Strings.discover_
import typingsSlinky.stripeV3.stripeV3Strings.jcb_
import typingsSlinky.stripeV3.stripeV3Strings.mastercard_
import typingsSlinky.stripeV3.stripeV3Strings.unknown_
import typingsSlinky.stripeV3.stripeV3Strings.visa_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripeV3.stripeV3Strings.amex
  - typingsSlinky.stripeV3.stripeV3Strings.diners
  - typingsSlinky.stripeV3.stripeV3Strings.discover_
  - typingsSlinky.stripeV3.stripeV3Strings.jcb_
  - typingsSlinky.stripeV3.stripeV3Strings.mastercard_
  - typingsSlinky.stripeV3.stripeV3Strings.unionpay
  - typingsSlinky.stripeV3.stripeV3Strings.visa_
  - typingsSlinky.stripeV3.stripeV3Strings.unknown_
*/
trait paymentMethodCardBrand extends js.Object

object paymentMethodCardBrand {
  @scala.inline
  def amex: typingsSlinky.stripeV3.stripeV3Strings.amex = this.cast("amex")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def diners: typingsSlinky.stripeV3.stripeV3Strings.diners = this.cast("diners")
  @scala.inline
  def discover: discover_ = this.cast("discover")
  @scala.inline
  def jcb: jcb_ = this.cast("jcb")
  @scala.inline
  def mastercard: mastercard_ = this.cast("mastercard")
  @scala.inline
  def unionpay: typingsSlinky.stripeV3.stripeV3Strings.unionpay = this.cast("unionpay")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def visa: visa_ = this.cast("visa")
}

