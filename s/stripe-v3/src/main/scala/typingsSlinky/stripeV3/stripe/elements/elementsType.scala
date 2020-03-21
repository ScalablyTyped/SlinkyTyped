package typingsSlinky.stripeV3.stripe.elements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripeV3.stripeV3Strings.card
  - typingsSlinky.stripeV3.stripeV3Strings.cardNumber
  - typingsSlinky.stripeV3.stripeV3Strings.cardExpiry
  - typingsSlinky.stripeV3.stripeV3Strings.cardCvc
  - typingsSlinky.stripeV3.stripeV3Strings.postalCode
  - typingsSlinky.stripeV3.stripeV3Strings.paymentRequestButton
  - typingsSlinky.stripeV3.stripeV3Strings.iban
  - typingsSlinky.stripeV3.stripeV3Strings.idealBank
*/
trait elementsType extends js.Object

object elementsType {
  @scala.inline
  def card: typingsSlinky.stripeV3.stripeV3Strings.card = this.cast("card")
  @scala.inline
  def cardCvc: typingsSlinky.stripeV3.stripeV3Strings.cardCvc = this.cast("cardCvc")
  @scala.inline
  def cardExpiry: typingsSlinky.stripeV3.stripeV3Strings.cardExpiry = this.cast("cardExpiry")
  @scala.inline
  def cardNumber: typingsSlinky.stripeV3.stripeV3Strings.cardNumber = this.cast("cardNumber")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def iban: typingsSlinky.stripeV3.stripeV3Strings.iban = this.cast("iban")
  @scala.inline
  def idealBank: typingsSlinky.stripeV3.stripeV3Strings.idealBank = this.cast("idealBank")
  @scala.inline
  def paymentRequestButton: typingsSlinky.stripeV3.stripeV3Strings.paymentRequestButton = this.cast("paymentRequestButton")
  @scala.inline
  def postalCode: typingsSlinky.stripeV3.stripeV3Strings.postalCode = this.cast("postalCode")
}

