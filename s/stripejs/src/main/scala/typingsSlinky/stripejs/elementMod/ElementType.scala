package typingsSlinky.stripejs.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripejs.stripejsStrings.card
  - typingsSlinky.stripejs.stripejsStrings.cardNumber
  - typingsSlinky.stripejs.stripejsStrings.cardExpiry
  - typingsSlinky.stripejs.stripejsStrings.cardCvc
  - typingsSlinky.stripejs.stripejsStrings.postalCode
  - typingsSlinky.stripejs.stripejsStrings.paymentRequestButton
*/
trait ElementType extends js.Object

object ElementType {
  @scala.inline
  def card: typingsSlinky.stripejs.stripejsStrings.card = this.cast("card")
  @scala.inline
  def cardCvc: typingsSlinky.stripejs.stripejsStrings.cardCvc = this.cast("cardCvc")
  @scala.inline
  def cardExpiry: typingsSlinky.stripejs.stripejsStrings.cardExpiry = this.cast("cardExpiry")
  @scala.inline
  def cardNumber: typingsSlinky.stripejs.stripejsStrings.cardNumber = this.cast("cardNumber")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def paymentRequestButton: typingsSlinky.stripejs.stripejsStrings.paymentRequestButton = this.cast("paymentRequestButton")
  @scala.inline
  def postalCode: typingsSlinky.stripejs.stripejsStrings.postalCode = this.cast("postalCode")
}

