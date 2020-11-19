package typingsSlinky.stripe.mod.cards

import typingsSlinky.stripe.mod.IStripeSource
import typingsSlinky.stripe.mod.accounts.IAccount
import typingsSlinky.stripe.mod.accounts.IExternalAccount
import typingsSlinky.stripe.mod.customers.ICustomer
import typingsSlinky.stripe.mod.recipients.IRecipient
import typingsSlinky.stripe.stripeStrings.Discover
import typingsSlinky.stripe.stripeStrings.JCB
import typingsSlinky.stripe.stripeStrings.MasterCard
import typingsSlinky.stripe.stripeStrings.Unknown
import typingsSlinky.stripe.stripeStrings.Visa
import typingsSlinky.stripe.stripeStrings.`American Express`
import typingsSlinky.stripe.stripeStrings.`Diners Club`
import typingsSlinky.stripe.stripeStrings.card
import typingsSlinky.stripe.stripeStrings.credit
import typingsSlinky.stripe.stripeStrings.debit
import typingsSlinky.stripe.stripeStrings.fail
import typingsSlinky.stripe.stripeStrings.pass
import typingsSlinky.stripe.stripeStrings.prepaid
import typingsSlinky.stripe.stripeStrings.unavailable
import typingsSlinky.stripe.stripeStrings.unchecked
import typingsSlinky.stripe.stripeStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * You can store multiple cards on a customer in order to charge the customer later. You
  * can also store multiple debit cards on a recipient in order to transfer to those cards later.
  */
@js.native
trait ICard
  extends ICardHash
     with IExternalAccount
     with IStripeSource {
  
  /**
    * The account this card belongs to. This attribute will not be in the
    * card object if the card belongs to a customer or recipient instead.
    * [Expandable]
    */
  var account: js.UndefOr[String | IAccount] = js.native
  
  /**
    * Only applicable on accounts (not customers or recipients). The
    * card can be used as a transfer destination for funds in this
    * currency.
    */
  var currency: js.UndefOr[String] = js.native
  
  /**
    * The customer that this card belongs to. This attribute will not be
    * in the card object if the card belongs to an account or recipient
    * instead.
    */
  var customer: js.UndefOr[String | ICustomer | Null] = js.native
  
  /**
    * Only applicable on accounts (not customers or recipients). This
    * indicates whether or not this card is the default external account
    * for its currency.
    */
  var default_for_currency: js.UndefOr[Boolean] = js.native
  
  /**
    * The recipient that this card belongs to. This attribute will not be
    * in the card object if the card belongs to a customer or account
    * instead. [Expandable]
    */
  var recipient: js.UndefOr[String | IRecipient] = js.native
}
object ICard {
  
  @scala.inline
  def apply(
    brand: Visa | (`American Express`) | MasterCard | Discover | JCB | (`Diners Club`) | Unknown,
    country: String,
    cvc_check: pass | fail | unavailable | unchecked,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: credit | debit | prepaid | unknown_,
    id: String,
    last4: String,
    `object`: card
  ): ICard = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICard]
  }
  
  @scala.inline
  implicit class ICardOps[Self <: ICard] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: String | IAccount): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setCustomer(value: String | ICustomer): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    
    @scala.inline
    def setCustomerNull: Self = this.set("customer", null)
    
    @scala.inline
    def setDefault_for_currency(value: Boolean): Self = this.set("default_for_currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_for_currency: Self = this.set("default_for_currency", js.undefined)
    
    @scala.inline
    def setRecipient(value: String | IRecipient): Self = this.set("recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipient: Self = this.set("recipient", js.undefined)
  }
}
