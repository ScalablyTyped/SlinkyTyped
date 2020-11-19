package typingsSlinky.stripe.mod.sources

import typingsSlinky.stripe.anon.Amountcharged
import typingsSlinky.stripe.anon.Attemptsremaining
import typingsSlinky.stripe.anon.Bankname
import typingsSlinky.stripe.anon.Failurereason
import typingsSlinky.stripe.anon.Phone
import typingsSlinky.stripe.mod.ICardHashInfo
import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.IStripeSource
import typingsSlinky.stripe.stripeStrings.ach_credit_transfer
import typingsSlinky.stripe.stripeStrings.ach_debit
import typingsSlinky.stripe.stripeStrings.alipay
import typingsSlinky.stripe.stripeStrings.bancontact
import typingsSlinky.stripe.stripeStrings.canceled
import typingsSlinky.stripe.stripeStrings.card
import typingsSlinky.stripe.stripeStrings.card_present
import typingsSlinky.stripe.stripeStrings.chargeable
import typingsSlinky.stripe.stripeStrings.code_verification
import typingsSlinky.stripe.stripeStrings.consumed
import typingsSlinky.stripe.stripeStrings.eps
import typingsSlinky.stripe.stripeStrings.failed
import typingsSlinky.stripe.stripeStrings.giropay
import typingsSlinky.stripe.stripeStrings.ideal
import typingsSlinky.stripe.stripeStrings.multibanco
import typingsSlinky.stripe.stripeStrings.none
import typingsSlinky.stripe.stripeStrings.p24
import typingsSlinky.stripe.stripeStrings.pending
import typingsSlinky.stripe.stripeStrings.receiver
import typingsSlinky.stripe.stripeStrings.redirect
import typingsSlinky.stripe.stripeStrings.reusable
import typingsSlinky.stripe.stripeStrings.sepa_debit
import typingsSlinky.stripe.stripeStrings.single_use
import typingsSlinky.stripe.stripeStrings.sofort
import typingsSlinky.stripe.stripeStrings.source
import typingsSlinky.stripe.stripeStrings.three_d_secure
import typingsSlinky.stripe.stripeStrings.wechat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Source object: https://stripe.com/docs/api/sources/object */
@js.native
trait ISource
  extends IResourceObject
     with IStripeSource {
  
  var ach_credit_transfer: js.UndefOr[Bankname] = js.native
  
  var amount: js.UndefOr[Double | Null] = js.native
  
  var card: js.UndefOr[ICardHashInfo] = js.native
  
  var client_secret: String = js.native
  
  var code_verification: js.UndefOr[Attemptsremaining] = js.native
  
  var created: Double = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var customer: js.UndefOr[String] = js.native
  
  var flow: redirect | receiver | code_verification | none = js.native
  
  var livemode: Boolean = js.native
  
  var metadata: IMetadata = js.native
  
  @JSName("object")
  var object_ISource: source = js.native
  
  var owner: Phone = js.native
  
  var receiver: js.UndefOr[Amountcharged] = js.native
  
  var redirect: js.UndefOr[Failurereason] = js.native
  
  var statement_descriptor: js.UndefOr[String | Null] = js.native
  
  var status: canceled | chargeable | consumed | failed | pending = js.native
  
  var `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat = js.native
  
  var usage: reusable | single_use = js.native
}
object ISource {
  
  @scala.inline
  def apply(
    client_secret: String,
    created: Double,
    flow: redirect | receiver | code_verification | none,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: source,
    owner: Phone,
    status: canceled | chargeable | consumed | failed | pending,
    `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat,
    usage: reusable | single_use
  ): ISource = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISource]
  }
  
  @scala.inline
  implicit class ISourceOps[Self <: ISource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlow(value: redirect | receiver | code_verification | none): Self = this.set("flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: source): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: Phone): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: canceled | chargeable | consumed | failed | pending): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage(value: reusable | single_use): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAch_credit_transfer(value: Bankname): Self = this.set("ach_credit_transfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAch_credit_transfer: Self = this.set("ach_credit_transfer", js.undefined)
    
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setAmountNull: Self = this.set("amount", null)
    
    @scala.inline
    def setCard(value: ICardHashInfo): Self = this.set("card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    
    @scala.inline
    def setCode_verification(value: Attemptsremaining): Self = this.set("code_verification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode_verification: Self = this.set("code_verification", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    
    @scala.inline
    def setReceiver(value: Amountcharged): Self = this.set("receiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiver: Self = this.set("receiver", js.undefined)
    
    @scala.inline
    def setRedirect(value: Failurereason): Self = this.set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatement_descriptor: Self = this.set("statement_descriptor", js.undefined)
    
    @scala.inline
    def setStatement_descriptorNull: Self = this.set("statement_descriptor", null)
  }
}
