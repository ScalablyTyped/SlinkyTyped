package typingsSlinky.stripe.mod.charges

import typingsSlinky.stripe.anon.Accountnumber
import typingsSlinky.stripe.anon.Brand
import typingsSlinky.stripe.stripeStrings.ach_credit_transfer
import typingsSlinky.stripe.stripeStrings.ach_debit
import typingsSlinky.stripe.stripeStrings.alipay
import typingsSlinky.stripe.stripeStrings.bancontact
import typingsSlinky.stripe.stripeStrings.card
import typingsSlinky.stripe.stripeStrings.card_present
import typingsSlinky.stripe.stripeStrings.eps
import typingsSlinky.stripe.stripeStrings.giropay
import typingsSlinky.stripe.stripeStrings.ideal
import typingsSlinky.stripe.stripeStrings.klarna
import typingsSlinky.stripe.stripeStrings.p24
import typingsSlinky.stripe.stripeStrings.sofort
import typingsSlinky.stripe.stripeStrings.stripe_account
import typingsSlinky.stripe.stripeStrings.wechat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.mod.charges.IAchCreditTransferPaymentMethodDetails
  - typingsSlinky.stripe.mod.charges.IAchDebitPaymentMethodDetails
  - typingsSlinky.stripe.mod.charges.IAlipayPaymentMethodDetails
  - typingsSlinky.stripe.mod.charges.IBancontactPaymentMethodDetails
  - typingsSlinky.stripe.mod.charges.ICardPaymentMethodDetails
  - typingsSlinky.stripe.mod.charges.ICardPresentPaymentMethodDetails
  - typingsSlinky.stripe.mod.charges.IEpsPaymentMethodDetails
  - typingsSlinky.stripe.mod.charges.IGiropayPaymentMethodDetails
  - typingsSlinky.stripe.mod.charges.IIdealPaymentMethodDetails
  - typingsSlinky.stripe.mod.charges.IKlarnaPaymentMethodDetails
  - typingsSlinky.stripe.mod.charges.IP24PaymentMethodDetails
  - typingsSlinky.stripe.mod.charges.ISofortPaymentMethodDetails
  - typingsSlinky.stripe.mod.charges.IStripeAccountPaymentMethodDetails
  - typingsSlinky.stripe.mod.charges.IWechatPaymentMethodDetails
*/
trait IPaymentMethodDetails extends StObject
object IPaymentMethodDetails {
  
  @scala.inline
  def IAchCreditTransferPaymentMethodDetails(ach_credit_transfer: Accountnumber, `type`: ach_credit_transfer): typingsSlinky.stripe.mod.charges.IAchCreditTransferPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(ach_credit_transfer = ach_credit_transfer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.charges.IAchCreditTransferPaymentMethodDetails]
  }
  
  @scala.inline
  def IAchDebitPaymentMethodDetails(`type`: ach_debit): typingsSlinky.stripe.mod.charges.IAchDebitPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.charges.IAchDebitPaymentMethodDetails]
  }
  
  @scala.inline
  def IAlipayPaymentMethodDetails(`type`: alipay): typingsSlinky.stripe.mod.charges.IAlipayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.charges.IAlipayPaymentMethodDetails]
  }
  
  @scala.inline
  def IBancontactPaymentMethodDetails(`type`: bancontact): typingsSlinky.stripe.mod.charges.IBancontactPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.charges.IBancontactPaymentMethodDetails]
  }
  
  @scala.inline
  def ICardPaymentMethodDetails(card: Brand, `type`: card): typingsSlinky.stripe.mod.charges.ICardPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.charges.ICardPaymentMethodDetails]
  }
  
  @scala.inline
  def ICardPresentPaymentMethodDetails(`type`: card_present): typingsSlinky.stripe.mod.charges.ICardPresentPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.charges.ICardPresentPaymentMethodDetails]
  }
  
  @scala.inline
  def IEpsPaymentMethodDetails(`type`: eps): typingsSlinky.stripe.mod.charges.IEpsPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.charges.IEpsPaymentMethodDetails]
  }
  
  @scala.inline
  def IGiropayPaymentMethodDetails(`type`: giropay): typingsSlinky.stripe.mod.charges.IGiropayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.charges.IGiropayPaymentMethodDetails]
  }
  
  @scala.inline
  def IIdealPaymentMethodDetails(`type`: ideal): typingsSlinky.stripe.mod.charges.IIdealPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.charges.IIdealPaymentMethodDetails]
  }
  
  @scala.inline
  def IKlarnaPaymentMethodDetails(`type`: klarna): typingsSlinky.stripe.mod.charges.IKlarnaPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.charges.IKlarnaPaymentMethodDetails]
  }
  
  @scala.inline
  def IP24PaymentMethodDetails(`type`: p24): typingsSlinky.stripe.mod.charges.IP24PaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.charges.IP24PaymentMethodDetails]
  }
  
  @scala.inline
  def ISofortPaymentMethodDetails(`type`: sofort): typingsSlinky.stripe.mod.charges.ISofortPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.charges.ISofortPaymentMethodDetails]
  }
  
  @scala.inline
  def IStripeAccountPaymentMethodDetails(`type`: stripe_account): typingsSlinky.stripe.mod.charges.IStripeAccountPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.charges.IStripeAccountPaymentMethodDetails]
  }
  
  @scala.inline
  def IWechatPaymentMethodDetails(`type`: wechat): typingsSlinky.stripe.mod.charges.IWechatPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.stripe.mod.charges.IWechatPaymentMethodDetails]
  }
}
