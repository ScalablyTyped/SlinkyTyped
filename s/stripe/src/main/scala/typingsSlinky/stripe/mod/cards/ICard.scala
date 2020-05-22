package typingsSlinky.stripe.mod.cards

import typingsSlinky.stripe.mod.IMetadata
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
import typingsSlinky.stripe.stripeStrings.android_pay
import typingsSlinky.stripe.stripeStrings.apple_pay
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
import scala.scalajs.js.annotation._

/**
  * You can store multiple cards on a customer in order to charge the customer later. You
  * can also store multiple debit cards on a recipient in order to transfer to those cards later.
  */
trait ICard
  extends ICardHash
     with IExternalAccount
     with IStripeSource {
  /**
    * The account this card belongs to. This attribute will not be in the
    * card object if the card belongs to a customer or recipient instead.
    * [Expandable]
    */
  var account: js.UndefOr[String | IAccount] = js.undefined
  /**
    * Only applicable on accounts (not customers or recipients). The
    * card can be used as a transfer destination for funds in this
    * currency.
    */
  var currency: js.UndefOr[String] = js.undefined
  /**
    * The customer that this card belongs to. This attribute will not be
    * in the card object if the card belongs to an account or recipient
    * instead.
    */
  var customer: js.UndefOr[String | ICustomer | Null] = js.undefined
  /**
    * Only applicable on accounts (not customers or recipients). This
    * indicates whether or not this card is the default external account
    * for its currency.
    */
  var default_for_currency: js.UndefOr[Boolean] = js.undefined
  /**
    * The recipient that this card belongs to. This attribute will not be
    * in the card object if the card belongs to a customer or account
    * instead. [Expandable]
    */
  var recipient: js.UndefOr[String | IRecipient] = js.undefined
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
    `object`: card,
    account: String | IAccount = null,
    address_city: String = null,
    address_country: String = null,
    address_line1: String = null,
    address_line1_check: pass | fail | unavailable | unchecked = null,
    address_line2: String = null,
    address_state: String = null,
    address_zip: String = null,
    address_zip_check: pass | fail | unavailable | unchecked = null,
    currency: String = null,
    customer: js.UndefOr[Null | String | ICustomer] = js.undefined,
    default_for_currency: js.UndefOr[Boolean] = js.undefined,
    dynamic_last4: String = null,
    metadata: IMetadata = null,
    name: String = null,
    number: String = null,
    recipient: String | IRecipient = null,
    tokenization_method: apple_pay | android_pay = null
  ): ICard = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], address_city = address_city.asInstanceOf[js.Any], address_country = address_country.asInstanceOf[js.Any], address_line1 = address_line1.asInstanceOf[js.Any], address_line1_check = address_line1_check.asInstanceOf[js.Any], address_line2 = address_line2.asInstanceOf[js.Any], address_state = address_state.asInstanceOf[js.Any], address_zip = address_zip.asInstanceOf[js.Any], address_zip_check = address_zip_check.asInstanceOf[js.Any], dynamic_last4 = dynamic_last4.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tokenization_method = tokenization_method.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (!js.isUndefined(customer)) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (!js.isUndefined(default_for_currency)) __obj.updateDynamic("default_for_currency")(default_for_currency.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICard]
  }
}

