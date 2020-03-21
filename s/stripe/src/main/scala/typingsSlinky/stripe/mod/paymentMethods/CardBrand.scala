package typingsSlinky.stripe.mod.paymentMethods

import typingsSlinky.stripe.stripeStrings.discover_
import typingsSlinky.stripe.stripeStrings.jcb_
import typingsSlinky.stripe.stripeStrings.mastercard_
import typingsSlinky.stripe.stripeStrings.unknown_
import typingsSlinky.stripe.stripeStrings.visa_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.amex
  - typingsSlinky.stripe.stripeStrings.diners
  - typingsSlinky.stripe.stripeStrings.discover_
  - typingsSlinky.stripe.stripeStrings.jcb_
  - typingsSlinky.stripe.stripeStrings.mastercard_
  - typingsSlinky.stripe.stripeStrings.unionpay
  - typingsSlinky.stripe.stripeStrings.visa_
  - typingsSlinky.stripe.stripeStrings.unknown_
*/
trait CardBrand extends js.Object

object CardBrand {
  @scala.inline
  def amex: typingsSlinky.stripe.stripeStrings.amex = this.cast("amex")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def diners: typingsSlinky.stripe.stripeStrings.diners = this.cast("diners")
  @scala.inline
  def discover: discover_ = this.cast("discover")
  @scala.inline
  def jcb: jcb_ = this.cast("jcb")
  @scala.inline
  def mastercard: mastercard_ = this.cast("mastercard")
  @scala.inline
  def unionpay: typingsSlinky.stripe.stripeStrings.unionpay = this.cast("unionpay")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def visa: visa_ = this.cast("visa")
}

