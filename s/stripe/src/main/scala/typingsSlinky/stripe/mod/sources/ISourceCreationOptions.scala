package typingsSlinky.stripe.mod.sources

import typingsSlinky.stripe.anon.Acceptance
import typingsSlinky.stripe.anon.AddressEmail
import typingsSlinky.stripe.anon.Bank
import typingsSlinky.stripe.anon.Iban
import typingsSlinky.stripe.anon.Refundattributesmethod
import typingsSlinky.stripe.anon.ReturnurlString
import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.stripeStrings.ach_credit_transfer
import typingsSlinky.stripe.stripeStrings.ach_debit
import typingsSlinky.stripe.stripeStrings.alipay
import typingsSlinky.stripe.stripeStrings.bancontact
import typingsSlinky.stripe.stripeStrings.card
import typingsSlinky.stripe.stripeStrings.card_present
import typingsSlinky.stripe.stripeStrings.code_verification
import typingsSlinky.stripe.stripeStrings.eps
import typingsSlinky.stripe.stripeStrings.giropay
import typingsSlinky.stripe.stripeStrings.ideal
import typingsSlinky.stripe.stripeStrings.multibanco
import typingsSlinky.stripe.stripeStrings.none
import typingsSlinky.stripe.stripeStrings.p24
import typingsSlinky.stripe.stripeStrings.receiver
import typingsSlinky.stripe.stripeStrings.redirect
import typingsSlinky.stripe.stripeStrings.reusable
import typingsSlinky.stripe.stripeStrings.sepa_debit
import typingsSlinky.stripe.stripeStrings.single_use
import typingsSlinky.stripe.stripeStrings.sofort
import typingsSlinky.stripe.stripeStrings.three_d_secure
import typingsSlinky.stripe.stripeStrings.wechat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISourceCreationOptions extends IDataOptionsWithMetadata {
  
  var amount: js.UndefOr[Double] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var flow: js.UndefOr[redirect | receiver | code_verification | none] = js.native
  
  var ideal: js.UndefOr[Bank] = js.native
  
  var mandate: js.UndefOr[Acceptance] = js.native
  
  @JSName("metadata")
  var metadata_ISourceCreationOptions: js.UndefOr[IMetadata] = js.native
  
  var owner: js.UndefOr[AddressEmail] = js.native
  
  var receiver: js.UndefOr[Refundattributesmethod] = js.native
  
  var redirect: js.UndefOr[ReturnurlString] = js.native
  
  var sepa_debit: js.UndefOr[Iban] = js.native
  
  var statement_descriptor: js.UndefOr[String] = js.native
  
  var token: js.UndefOr[String] = js.native
  
  var `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat = js.native
  
  var usage: js.UndefOr[reusable | single_use] = js.native
}
object ISourceCreationOptions {
  
  @scala.inline
  def apply(
    `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat
  ): ISourceCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceCreationOptions]
  }
  
  @scala.inline
  implicit class ISourceCreationOptionsOps[Self <: ISourceCreationOptions] (val x: Self) extends AnyVal {
    
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
    def setType(
      value: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setFlow(value: redirect | receiver | code_verification | none): Self = this.set("flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlow: Self = this.set("flow", js.undefined)
    
    @scala.inline
    def setIdeal(value: Bank): Self = this.set("ideal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdeal: Self = this.set("ideal", js.undefined)
    
    @scala.inline
    def setMandate(value: Acceptance): Self = this.set("mandate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMandate: Self = this.set("mandate", js.undefined)
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setOwner(value: AddressEmail): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setReceiver(value: Refundattributesmethod): Self = this.set("receiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiver: Self = this.set("receiver", js.undefined)
    
    @scala.inline
    def setRedirect(value: ReturnurlString): Self = this.set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    
    @scala.inline
    def setSepa_debit(value: Iban): Self = this.set("sepa_debit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSepa_debit: Self = this.set("sepa_debit", js.undefined)
    
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatement_descriptor: Self = this.set("statement_descriptor", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setUsage(value: reusable | single_use): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
  }
}
