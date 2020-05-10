package typingsSlinky.stripe.mod

import typingsSlinky.stripe.stripeStrings.Discover
import typingsSlinky.stripe.stripeStrings.JCB
import typingsSlinky.stripe.stripeStrings.MasterCard
import typingsSlinky.stripe.stripeStrings.Unknown
import typingsSlinky.stripe.stripeStrings.Visa
import typingsSlinky.stripe.stripeStrings.`American Express`
import typingsSlinky.stripe.stripeStrings.`Diners Club`
import typingsSlinky.stripe.stripeStrings.android_pay
import typingsSlinky.stripe.stripeStrings.apple_pay
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

@js.native
trait ICardHashInfo extends js.Object {
  var address_city: String | Null = js.native
  /**
    * Billing address country, if provided when creating card
    */
  var address_country: String | Null = js.native
  var address_line1: String | Null = js.native
  /**
    * If address_line1 was provided, results of the check: pass, fail, unavailable, or unchecked.
    */
  var address_line1_check: pass | fail | unavailable | unchecked | Null = js.native
  var address_line2: String | Null = js.native
  var address_state: String | Null = js.native
  var address_zip: String | Null = js.native
  /**
    * If address_zip was provided, results of the check: pass, fail, unavailable, or unchecked.
    */
  var address_zip_check: pass | fail | unavailable | unchecked | Null = js.native
  /**
    * Card brand. Can be Visa, American Express, MasterCard, Discover, JCB, Diners Club, or Unknown.
    */
  var brand: Visa | (`American Express`) | MasterCard | Discover | JCB | (`Diners Club`) | Unknown = js.native
  /**
    * Two-letter ISO code representing the country of the card. You could use this
    * attribute to get a sense of the international breakdown of cards you've collected.
    */
  var country: String = js.native
  /**
    * If a CVC was provided, results of the check: pass, fail, unavailable, or unchecked
    */
  var cvc_check: pass | fail | unavailable | unchecked = js.native
  /**
    * (For Apple Pay integrations only.) The last four digits of the device account number.
    */
  var dynamic_last4: String | Null = js.native
  var exp_month: Double = js.native
  var exp_year: Double = js.native
  /**
    * Uniquely identifies this particular card number. You can use this attribute to check
    * whether two customers who've signed up with you are using the same card number, for example.
    */
  var fingerprint: String = js.native
  /**
    * Card funding type. Can be credit, debit, prepaid, or unknown
    */
  var funding: credit | debit | prepaid | unknown_ = js.native
  var last4: String = js.native
  var metadata: js.UndefOr[IMetadata] = js.native
  /**
    * Cardholder name
    */
  var name: String | Null = js.native
  /**
    * The card number
    */
  var number: js.UndefOr[String] = js.native
  /**
    * If the card number is tokenized, this is the method that was
    * used. Can be "apple_pay" or "android_pay".
    */
  var tokenization_method: apple_pay | android_pay | Null = js.native
}

object ICardHashInfo {
  @scala.inline
  def apply(
    brand: Visa | (`American Express`) | MasterCard | Discover | JCB | (`Diners Club`) | Unknown,
    country: String,
    cvc_check: pass | fail | unavailable | unchecked,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: credit | debit | prepaid | unknown_,
    last4: String
  ): ICardHashInfo = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardHashInfo]
  }
  @scala.inline
  implicit class ICardHashInfoOps[Self <: ICardHashInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrand(value: Visa | (`American Express`) | MasterCard | Discover | JCB | (`Diners Club`) | Unknown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCvc_check(value: pass | fail | unavailable | unchecked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvc_check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExp_month(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExp_year(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunding(value: credit | debit | prepaid | unknown_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress_city(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress_cityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_city")(null)
        ret
    }
    @scala.inline
    def withAddress_country(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress_countryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_country")(null)
        ret
    }
    @scala.inline
    def withAddress_line1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_line1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress_line1Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_line1")(null)
        ret
    }
    @scala.inline
    def withAddress_line1_check(value: pass | fail | unavailable | unchecked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_line1_check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress_line1_checkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_line1_check")(null)
        ret
    }
    @scala.inline
    def withAddress_line2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_line2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress_line2Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_line2")(null)
        ret
    }
    @scala.inline
    def withAddress_state(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress_stateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_state")(null)
        ret
    }
    @scala.inline
    def withAddress_zip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_zip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress_zipNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_zip")(null)
        ret
    }
    @scala.inline
    def withAddress_zip_check(value: pass | fail | unavailable | unchecked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_zip_check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress_zip_checkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_zip_check")(null)
        ret
    }
    @scala.inline
    def withDynamic_last4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic_last4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDynamic_last4Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic_last4")(null)
        ret
    }
    @scala.inline
    def withMetadata(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenization_method(value: apple_pay | android_pay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenization_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenization_methodNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenization_method")(null)
        ret
    }
  }
  
}

