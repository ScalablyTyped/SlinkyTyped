package typingsSlinky.stripe.mod.cards

import typingsSlinky.stripe.mod.ICardHashInfo
import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
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
  * Hash describing the card used to make the charge
  */
trait ICardHash
  extends IResourceObject
     with ICardHashInfo {
  /**
    * Value is 'card'
    */
  @JSName("object")
  var object_ICardHash: card
}

object ICardHash {
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
    address_city: String = null,
    address_country: String = null,
    address_line1: String = null,
    address_line1_check: pass | fail | unavailable | unchecked = null,
    address_line2: String = null,
    address_state: String = null,
    address_zip: String = null,
    address_zip_check: pass | fail | unavailable | unchecked = null,
    dynamic_last4: String = null,
    metadata: IMetadata = null,
    name: String = null,
    number: String = null,
    tokenization_method: apple_pay | android_pay = null
  ): ICardHash = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (address_city != null) __obj.updateDynamic("address_city")(address_city.asInstanceOf[js.Any])
    if (address_country != null) __obj.updateDynamic("address_country")(address_country.asInstanceOf[js.Any])
    if (address_line1 != null) __obj.updateDynamic("address_line1")(address_line1.asInstanceOf[js.Any])
    if (address_line1_check != null) __obj.updateDynamic("address_line1_check")(address_line1_check.asInstanceOf[js.Any])
    if (address_line2 != null) __obj.updateDynamic("address_line2")(address_line2.asInstanceOf[js.Any])
    if (address_state != null) __obj.updateDynamic("address_state")(address_state.asInstanceOf[js.Any])
    if (address_zip != null) __obj.updateDynamic("address_zip")(address_zip.asInstanceOf[js.Any])
    if (address_zip_check != null) __obj.updateDynamic("address_zip_check")(address_zip_check.asInstanceOf[js.Any])
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (tokenization_method != null) __obj.updateDynamic("tokenization_method")(tokenization_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardHash]
  }
}

