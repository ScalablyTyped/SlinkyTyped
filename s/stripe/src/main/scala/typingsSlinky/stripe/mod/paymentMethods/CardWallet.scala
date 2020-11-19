package typingsSlinky.stripe.mod.paymentMethods

import typingsSlinky.stripe.stripeStrings.amex_express_checkout
import typingsSlinky.stripe.stripeStrings.apple_pay
import typingsSlinky.stripe.stripeStrings.google_pay
import typingsSlinky.stripe.stripeStrings.masterpass
import typingsSlinky.stripe.stripeStrings.samsung_pay
import typingsSlinky.stripe.stripeStrings.visa_checkout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def VisaCheckoutWallet(`type`: visa_checkout, visa_checkout: WalletData): CardWallet = {
    val __obj = js.Dynamic.literal(visa_checkout = visa_checkout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardWallet]
  }
  
  @scala.inline
  def SamsungPayWallet(`type`: samsung_pay): CardWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardWallet]
  }
  
  @scala.inline
  def GooglePayWallet(`type`: google_pay): CardWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardWallet]
  }
  
  @scala.inline
  def MasterpassWallet(masterpass: WalletData, `type`: masterpass): CardWallet = {
    val __obj = js.Dynamic.literal(masterpass = masterpass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardWallet]
  }
  
  @scala.inline
  def ApplePayWallet(`type`: apple_pay): CardWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardWallet]
  }
  
  @scala.inline
  def AmericanExpressWallet(`type`: amex_express_checkout): CardWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardWallet]
  }
}
