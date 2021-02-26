package typingsSlinky.stripeV3.stripe.paymentMethod

import typingsSlinky.stripeV3.stripeV3Strings.ach_credit_transfer
import typingsSlinky.stripeV3.stripeV3Strings.ach_debit
import typingsSlinky.stripeV3.stripeV3Strings.alipay
import typingsSlinky.stripeV3.stripeV3Strings.bancontact
import typingsSlinky.stripeV3.stripeV3Strings.card
import typingsSlinky.stripeV3.stripeV3Strings.eps
import typingsSlinky.stripeV3.stripeV3Strings.giropay
import typingsSlinky.stripeV3.stripeV3Strings.ideal
import typingsSlinky.stripeV3.stripeV3Strings.multibanco
import typingsSlinky.stripeV3.stripeV3Strings.p24
import typingsSlinky.stripeV3.stripeV3Strings.sepa_debit
import typingsSlinky.stripeV3.stripeV3Strings.sofort
import typingsSlinky.stripeV3.stripeV3Strings.stripe_account
import typingsSlinky.stripeV3.stripeV3Strings.wechat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about the payment method at the time of the transaction.
  */
@js.native
trait PaymentMethodDetails extends StObject {
  
  var ach_credit_transfer: js.UndefOr[AchCreditTransferDetails | Null] = js.native
  
  var ach_debit: js.UndefOr[AchDebitDetails | Null] = js.native
  
  var alipay: js.UndefOr[js.Any | Null] = js.native
  
  var bancontact: js.UndefOr[BanContactDetails | Null] = js.native
  
  var card: js.UndefOr[PaymentMethodCard | Null] = js.native
  
  var eps: js.UndefOr[EpsDetails | Null] = js.native
  
  var giropay: js.UndefOr[GiropayDetails | Null] = js.native
  
  var ideal: js.UndefOr[IdealDetails | Null] = js.native
  
  var multibanco: js.UndefOr[MultibancoDetails | Null] = js.native
  
  var p24: js.UndefOr[P24Details | Null] = js.native
  
  var sepa_debit: js.UndefOr[SepaDebitDetails | Null] = js.native
  
  var sofort: js.UndefOr[SofortDetails | Null] = js.native
  
  var stripe_account: js.UndefOr[js.Any | Null] = js.native
  
  /**
    * The type of transaction-specific details of the payment method used in the payment
    */
  var `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | stripe_account | wechat = js.native
  
  var wechat: js.UndefOr[js.Any | Null] = js.native
}
object PaymentMethodDetails {
  
  @scala.inline
  def apply(
    `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | stripe_account | wechat
  ): PaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodDetails]
  }
  
  @scala.inline
  implicit class PaymentMethodDetailsMutableBuilder[Self <: PaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAch_credit_transfer(value: AchCreditTransferDetails): Self = StObject.set(x, "ach_credit_transfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAch_credit_transferNull: Self = StObject.set(x, "ach_credit_transfer", null)
    
    @scala.inline
    def setAch_credit_transferUndefined: Self = StObject.set(x, "ach_credit_transfer", js.undefined)
    
    @scala.inline
    def setAch_debit(value: AchDebitDetails): Self = StObject.set(x, "ach_debit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAch_debitNull: Self = StObject.set(x, "ach_debit", null)
    
    @scala.inline
    def setAch_debitUndefined: Self = StObject.set(x, "ach_debit", js.undefined)
    
    @scala.inline
    def setAlipay(value: js.Any): Self = StObject.set(x, "alipay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlipayNull: Self = StObject.set(x, "alipay", null)
    
    @scala.inline
    def setAlipayUndefined: Self = StObject.set(x, "alipay", js.undefined)
    
    @scala.inline
    def setBancontact(value: BanContactDetails): Self = StObject.set(x, "bancontact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBancontactNull: Self = StObject.set(x, "bancontact", null)
    
    @scala.inline
    def setBancontactUndefined: Self = StObject.set(x, "bancontact", js.undefined)
    
    @scala.inline
    def setCard(value: PaymentMethodCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardNull: Self = StObject.set(x, "card", null)
    
    @scala.inline
    def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    @scala.inline
    def setEps(value: EpsDetails): Self = StObject.set(x, "eps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpsNull: Self = StObject.set(x, "eps", null)
    
    @scala.inline
    def setEpsUndefined: Self = StObject.set(x, "eps", js.undefined)
    
    @scala.inline
    def setGiropay(value: GiropayDetails): Self = StObject.set(x, "giropay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGiropayNull: Self = StObject.set(x, "giropay", null)
    
    @scala.inline
    def setGiropayUndefined: Self = StObject.set(x, "giropay", js.undefined)
    
    @scala.inline
    def setIdeal(value: IdealDetails): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdealNull: Self = StObject.set(x, "ideal", null)
    
    @scala.inline
    def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
    
    @scala.inline
    def setMultibanco(value: MultibancoDetails): Self = StObject.set(x, "multibanco", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultibancoNull: Self = StObject.set(x, "multibanco", null)
    
    @scala.inline
    def setMultibancoUndefined: Self = StObject.set(x, "multibanco", js.undefined)
    
    @scala.inline
    def setP24(value: P24Details): Self = StObject.set(x, "p24", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP24Null: Self = StObject.set(x, "p24", null)
    
    @scala.inline
    def setP24Undefined: Self = StObject.set(x, "p24", js.undefined)
    
    @scala.inline
    def setSepa_debit(value: SepaDebitDetails): Self = StObject.set(x, "sepa_debit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSepa_debitNull: Self = StObject.set(x, "sepa_debit", null)
    
    @scala.inline
    def setSepa_debitUndefined: Self = StObject.set(x, "sepa_debit", js.undefined)
    
    @scala.inline
    def setSofort(value: SofortDetails): Self = StObject.set(x, "sofort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSofortNull: Self = StObject.set(x, "sofort", null)
    
    @scala.inline
    def setSofortUndefined: Self = StObject.set(x, "sofort", js.undefined)
    
    @scala.inline
    def setStripe_account(value: js.Any): Self = StObject.set(x, "stripe_account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripe_accountNull: Self = StObject.set(x, "stripe_account", null)
    
    @scala.inline
    def setStripe_accountUndefined: Self = StObject.set(x, "stripe_account", js.undefined)
    
    @scala.inline
    def setType(
      value: ach_credit_transfer | ach_debit | alipay | bancontact | card | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | stripe_account | wechat
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWechat(value: js.Any): Self = StObject.set(x, "wechat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWechatNull: Self = StObject.set(x, "wechat", null)
    
    @scala.inline
    def setWechatUndefined: Self = StObject.set(x, "wechat", js.undefined)
  }
}
