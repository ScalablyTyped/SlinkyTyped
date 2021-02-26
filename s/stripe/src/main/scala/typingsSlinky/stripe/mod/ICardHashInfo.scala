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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICardHashInfo extends StObject {
  
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
  implicit class ICardHashInfoMutableBuilder[Self <: ICardHashInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress_city(value: String): Self = StObject.set(x, "address_city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_cityNull: Self = StObject.set(x, "address_city", null)
    
    @scala.inline
    def setAddress_country(value: String): Self = StObject.set(x, "address_country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_countryNull: Self = StObject.set(x, "address_country", null)
    
    @scala.inline
    def setAddress_line1(value: String): Self = StObject.set(x, "address_line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_line1Null: Self = StObject.set(x, "address_line1", null)
    
    @scala.inline
    def setAddress_line1_check(value: pass | fail | unavailable | unchecked): Self = StObject.set(x, "address_line1_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_line1_checkNull: Self = StObject.set(x, "address_line1_check", null)
    
    @scala.inline
    def setAddress_line2(value: String): Self = StObject.set(x, "address_line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_line2Null: Self = StObject.set(x, "address_line2", null)
    
    @scala.inline
    def setAddress_state(value: String): Self = StObject.set(x, "address_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_stateNull: Self = StObject.set(x, "address_state", null)
    
    @scala.inline
    def setAddress_zip(value: String): Self = StObject.set(x, "address_zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_zipNull: Self = StObject.set(x, "address_zip", null)
    
    @scala.inline
    def setAddress_zip_check(value: pass | fail | unavailable | unchecked): Self = StObject.set(x, "address_zip_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_zip_checkNull: Self = StObject.set(x, "address_zip_check", null)
    
    @scala.inline
    def setBrand(value: Visa | (`American Express`) | MasterCard | Discover | JCB | (`Diners Club`) | Unknown): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCvc_check(value: pass | fail | unavailable | unchecked): Self = StObject.set(x, "cvc_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamic_last4(value: String): Self = StObject.set(x, "dynamic_last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamic_last4Null: Self = StObject.set(x, "dynamic_last4", null)
    
    @scala.inline
    def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunding(value: credit | debit | prepaid | unknown_): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setTokenization_method(value: apple_pay | android_pay): Self = StObject.set(x, "tokenization_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenization_methodNull: Self = StObject.set(x, "tokenization_method", null)
  }
}
