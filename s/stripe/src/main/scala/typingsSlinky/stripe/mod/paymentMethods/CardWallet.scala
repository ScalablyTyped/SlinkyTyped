package typingsSlinky.stripe.mod.paymentMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.mod.paymentMethods.MasterpassWallet
  - typingsSlinky.stripe.mod.paymentMethods.VisaCheckoutWallet
  - typingsSlinky.stripe.mod.paymentMethods.AmericanExpressWallet
  - typingsSlinky.stripe.mod.paymentMethods.ApplePayWallet
  - typingsSlinky.stripe.mod.paymentMethods.GooglePayWallet
  - typingsSlinky.stripe.mod.paymentMethods.SamsungPayWallet
*/
trait CardWallet extends js.Object

object CardWallet {
  @scala.inline
  implicit def apply(value: AmericanExpressWallet): CardWallet = value.asInstanceOf[CardWallet]
  @scala.inline
  implicit def apply(value: ApplePayWallet): CardWallet = value.asInstanceOf[CardWallet]
  @scala.inline
  implicit def apply(value: GooglePayWallet): CardWallet = value.asInstanceOf[CardWallet]
  @scala.inline
  implicit def apply(value: MasterpassWallet): CardWallet = value.asInstanceOf[CardWallet]
  @scala.inline
  implicit def apply(value: SamsungPayWallet): CardWallet = value.asInstanceOf[CardWallet]
  @scala.inline
  implicit def apply(value: VisaCheckoutWallet): CardWallet = value.asInstanceOf[CardWallet]
}

