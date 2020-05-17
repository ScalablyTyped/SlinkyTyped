package typingsSlinky.stripe.mod.paymentMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.mod.paymentMethods.ICardPaymentMethod
  - typingsSlinky.stripe.mod.paymentMethods.ICardPresentPaymentMethod
*/
trait IPaymentMethod extends js.Object

object IPaymentMethod {
  @scala.inline
  implicit def apply(value: ICardPaymentMethod): IPaymentMethod = value.asInstanceOf[IPaymentMethod]
  @scala.inline
  implicit def apply(value: ICardPresentPaymentMethod): IPaymentMethod = value.asInstanceOf[IPaymentMethod]
}

