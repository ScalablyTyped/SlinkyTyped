package typingsSlinky.stripe.mod.paymentMethods

import typingsSlinky.stripe.stripeStrings.amex_express_checkout
import typingsSlinky.stripe.stripeStrings.apple_pay
import typingsSlinky.stripe.stripeStrings.google_pay
import typingsSlinky.stripe.stripeStrings.masterpass
import typingsSlinky.stripe.stripeStrings.samsung_pay
import typingsSlinky.stripe.stripeStrings.visa_checkout
import org.scalablytyped.runtime.StObject
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
trait CardWallet extends StObject
object CardWallet {
  
  @scala.inline
  def AmericanExpressWallet(`type`: amex_express_checkout): typingsSlinky.stripe.mod.paymentMethods.AmericanExpressWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.paymentMethods.AmericanExpressWallet]
  }
  
  @scala.inline
  def ApplePayWallet(`type`: apple_pay): typingsSlinky.stripe.mod.paymentMethods.ApplePayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.paymentMethods.ApplePayWallet]
  }
  
  @scala.inline
  def GooglePayWallet(`type`: google_pay): typingsSlinky.stripe.mod.paymentMethods.GooglePayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.paymentMethods.GooglePayWallet]
  }
  
  @scala.inline
  def MasterpassWallet(masterpass: WalletData, `type`: masterpass): typingsSlinky.stripe.mod.paymentMethods.MasterpassWallet = {
    val __obj = js.Dynamic.literal(masterpass = masterpass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.paymentMethods.MasterpassWallet]
  }
  
  @scala.inline
  def SamsungPayWallet(`type`: samsung_pay): typingsSlinky.stripe.mod.paymentMethods.SamsungPayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.paymentMethods.SamsungPayWallet]
  }
  
  @scala.inline
  def VisaCheckoutWallet(`type`: visa_checkout, visa_checkout: WalletData): typingsSlinky.stripe.mod.paymentMethods.VisaCheckoutWallet = {
    val __obj = js.Dynamic.literal(visa_checkout = visa_checkout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.paymentMethods.VisaCheckoutWallet]
  }
}
