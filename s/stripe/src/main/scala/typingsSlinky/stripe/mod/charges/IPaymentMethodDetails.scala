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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait IPaymentMethodDetails extends js.Object

object IPaymentMethodDetails {
  @scala.inline
  def IIdealPaymentMethodDetails(`type`: ideal): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IKlarnaPaymentMethodDetails(`type`: klarna): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IWechatPaymentMethodDetails(`type`: wechat): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def ICardPresentPaymentMethodDetails(`type`: card_present): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IGiropayPaymentMethodDetails(`type`: giropay): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IBancontactPaymentMethodDetails(`type`: bancontact): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IEpsPaymentMethodDetails(`type`: eps): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IAchCreditTransferPaymentMethodDetails(ach_credit_transfer: Accountnumber, `type`: ach_credit_transfer): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(ach_credit_transfer = ach_credit_transfer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IStripeAccountPaymentMethodDetails(`type`: stripe_account): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IAchDebitPaymentMethodDetails(`type`: ach_debit): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IP24PaymentMethodDetails(`type`: p24): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IAlipayPaymentMethodDetails(`type`: alipay): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def ICardPaymentMethodDetails(card: Brand, `type`: card): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def ISofortPaymentMethodDetails(`type`: sofort): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
}

