package typingsSlinky.stripejs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.stripejs.stripejsStrings.Discover
import typingsSlinky.stripejs.stripejsStrings.JCB
import typingsSlinky.stripejs.stripejsStrings.MasterCard
import typingsSlinky.stripejs.stripejsStrings.UnionPay
import typingsSlinky.stripejs.stripejsStrings.Unknown
import typingsSlinky.stripejs.stripejsStrings.Visa
import typingsSlinky.stripejs.stripejsStrings.`American Express`
import typingsSlinky.stripejs.stripejsStrings.`Diners Club`
import typingsSlinky.stripejs.stripejsStrings.`new`
import typingsSlinky.stripejs.stripejsStrings.android_pay
import typingsSlinky.stripejs.stripejsStrings.apple_pay
import typingsSlinky.stripejs.stripejsStrings.bank_account
import typingsSlinky.stripejs.stripejsStrings.card
import typingsSlinky.stripejs.stripejsStrings.company
import typingsSlinky.stripejs.stripejsStrings.credit
import typingsSlinky.stripejs.stripejsStrings.debit
import typingsSlinky.stripejs.stripejsStrings.errored
import typingsSlinky.stripejs.stripejsStrings.individual
import typingsSlinky.stripejs.stripejsStrings.instant
import typingsSlinky.stripejs.stripejsStrings.prepaid
import typingsSlinky.stripejs.stripejsStrings.standard
import typingsSlinky.stripejs.stripejsStrings.unknown_
import typingsSlinky.stripejs.stripejsStrings.validated
import typingsSlinky.stripejs.stripejsStrings.verification_failed
import typingsSlinky.stripejs.stripejsStrings.verified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customerMod {
  
  @js.native
  trait Address extends StObject {
    
    /**
      * City/District/Suburb/Town/Village.
      */
    var city: String = js.native
    
    /**
      * Two-letter country code, capitalized
      * NOTE: The codes are specified by the ISO3166 alpha-2
      */
    var country: String = js.native
    
    /**
      * Address line 1 (Street address/PO Box/Company name).
      */
    var line1: String = js.native
    
    /**
      * Address line 2 (Apartment/Suite/Unit/Building).
      */
    var line2: String = js.native
    
    /**
      * ZIP or postal code
      */
    var postal_code: String = js.native
    
    /**
      * State/County/Province/Region.
      */
    var state: String = js.native
  }
  object Address {
    
    @scala.inline
    def apply(city: String, country: String, line1: String, line2: String, postal_code: String, state: String): Address = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], line1 = line1.asInstanceOf[js.Any], line2 = line2.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine1(value: String): Self = StObject.set(x, "line1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine2(value: String): Self = StObject.set(x, "line2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BankAccount extends StObject {
    
    /**
      * The name of the person or business that owns the bank account.
      */
    var account_holder_name: String = js.native
    
    /**
      * The type of entity that holds the account.
      */
    var account_holder_type: individual | company = js.native
    
    /**
      * Name of the bank associated with the routing number
      * @example 'STRIPE TEST BANK'
      */
    var bank_name: String = js.native
    
    /**
      * Two-letter ISO code representing the country the bank account is located in
      * @example 'US'
      */
    var country: String = js.native
    
    /**
      * Three-letter ISO code for the currency paid out to the bank account
      * @example 'usd'
      */
    var currency: String = js.native
    
    var customer: String = js.native
    
    /**
      * Uniquely identifies this particular bank account.
      * NOTE: You can use this attribute to check whether two bank accounts are the same
      */
    var fingerprint: String = js.native
    
    /**
      * The unique identifier of the bank account
      */
    var id: String = js.native
    
    /**
      * The last 4 digits of the bank number
      */
    var last4: String = js.native
    
    /**
      * Your own saved information with this bank account
      */
    var metadata: StringDictionary[String] = js.native
    
    var `object`: bank_account = js.native
    
    /**
      * The routing transit number for the bank account
      */
    var routing_number: String = js.native
    
    /**
      * The status of the bank account
      * @see https://stripe.com/docs/api#customer_bank_account_object-status
      */
    var status: `new` | validated | verified | verification_failed | errored = js.native
  }
  object BankAccount {
    
    @scala.inline
    def apply(
      account_holder_name: String,
      account_holder_type: individual | company,
      bank_name: String,
      country: String,
      currency: String,
      customer: String,
      fingerprint: String,
      id: String,
      last4: String,
      metadata: StringDictionary[String],
      `object`: bank_account,
      routing_number: String,
      status: `new` | validated | verified | verification_failed | errored
    ): BankAccount = {
      val __obj = js.Dynamic.literal(account_holder_name = account_holder_name.asInstanceOf[js.Any], account_holder_type = account_holder_type.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BankAccount]
    }
    
    @scala.inline
    implicit class BankAccountMutableBuilder[Self <: BankAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount_holder_name(value: String): Self = StObject.set(x, "account_holder_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccount_holder_type(value: individual | company): Self = StObject.set(x, "account_holder_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: bank_account): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: `new` | validated | verified | verification_failed | errored): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Card extends StObject {
    
    var account: js.UndefOr[String] = js.native
    
    /**
      * City/District/Suburb/Town/Village
      */
    var address_city: String = js.native
    
    /**
      * The country in which the address is located
      */
    var address_country: String = js.native
    
    /**
      * Address line 1 (Street address/PO Box/Company name)
      */
    var address_line1: String = js.native
    
    /**
      * The results of address_line1 if it was provided
      */
    var address_line1_check: checkStatus = js.native
    
    /**
      * Address line 2 (Apartment/Suite/Unit/Building)
      */
    var address_line2: String = js.native
    
    /**
      * State/County/Province/Region.
      */
    var address_state: String = js.native
    
    /**
      * ZIP or postal code
      */
    var address_zip: String = js.native
    
    /**
      * The results of address_zip if it was provided
      */
    var address_zip_check: checkStatus = js.native
    
    /**
      * A set of available payout methods for this card
      * NOTE: Only values from this set should be passed as the method when creating a transfer
      */
    var available_payout_methods: js.Array[standard] | (js.Tuple2[standard, instant]) = js.native
    
    /**
      * The brand of the card
      */
    var brand: (`American Express`) | (`Diners Club`) | Discover | JCB | MasterCard | UnionPay | Visa | Unknown = js.native
    
    /**
      * Two-letter ISO code representing the country of the card
      * You could use this attribute to get a sense of the international breakdown of cards you’ve collected
      */
    var country: String = js.native
    
    /**
      * Three-letter ISO code for currency
      * Only applicable on accounts (not customers or recipients).
      * The card can be used as a transfer destination for funds in this currency
      */
    var currency: js.UndefOr[String] = js.native
    
    /**
      * The customer that this card belongs to
      * NOTE: This attribute will not be in the card object if the card belongs to an account or recipient instead
      */
    var customer: js.UndefOr[js.Any] = js.native
    
    /**
      * If a CVC was provided, results of the check
      */
    var cvc_check: checkStatus = js.native
    
    /**
      * Only applicable on accounts (not customers or recipients)
      * This indicates whether this card is the default external account for its currency
      */
    var default_for_currency: js.UndefOr[Boolean] = js.native
    
    /**
      * The last four digits of the device account number.
      * NOTE: For tokenized numbers only
      */
    var dynamic_last4: String = js.native
    
    /**
      * Two-digit number representing the card’s expiration month
      */
    var exp_month: Double = js.native
    
    /**
      * Four-digit number representing the card’s expiration year
      */
    var exp_year: Double = js.native
    
    /**
      * Uniquely identifies this particular card number
      */
    var fingerprint: String = js.native
    
    /**
      * Card funding type
      */
    var funding: credit | debit | prepaid | unknown_ = js.native
    
    /**
      * The unique identifier of the bank account
      */
    var id: String = js.native
    
    /**
      * The last four digits of the card
      */
    var last4: String = js.native
    
    /**
      * Your own saved information with this card
      */
    var metadata: StringDictionary[String] = js.native
    
    /**
      * The name of the cardholder
      */
    var name: String = js.native
    
    /**
      * The account this card belongs to.
      * NOTE: This attribute will not be in the card object if the card belongs to a customer or recipient instead.
      */
    var `object`: card = js.native
    
    /**
      * The recipient that this card belongs to.
      * NOTE: This attribute will not be in the card object if the card belongs to a customer or account instead
      */
    var recipient: js.UndefOr[String] = js.native
    
    /**
      * If the card number is tokenized, this is the method that was used
      */
    var tokenization_method: apple_pay | android_pay = js.native
  }
  object Card {
    
    @scala.inline
    def apply(
      address_city: String,
      address_country: String,
      address_line1: String,
      address_line1_check: checkStatus,
      address_line2: String,
      address_state: String,
      address_zip: String,
      address_zip_check: checkStatus,
      available_payout_methods: js.Array[standard] | (js.Tuple2[standard, instant]),
      brand: (`American Express`) | (`Diners Club`) | Discover | JCB | MasterCard | UnionPay | Visa | Unknown,
      country: String,
      cvc_check: checkStatus,
      dynamic_last4: String,
      exp_month: Double,
      exp_year: Double,
      fingerprint: String,
      funding: credit | debit | prepaid | unknown_,
      id: String,
      last4: String,
      metadata: StringDictionary[String],
      name: String,
      `object`: card,
      tokenization_method: apple_pay | android_pay
    ): Card = {
      val __obj = js.Dynamic.literal(address_city = address_city.asInstanceOf[js.Any], address_country = address_country.asInstanceOf[js.Any], address_line1 = address_line1.asInstanceOf[js.Any], address_line1_check = address_line1_check.asInstanceOf[js.Any], address_line2 = address_line2.asInstanceOf[js.Any], address_state = address_state.asInstanceOf[js.Any], address_zip = address_zip.asInstanceOf[js.Any], address_zip_check = address_zip_check.asInstanceOf[js.Any], available_payout_methods = available_payout_methods.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any], dynamic_last4 = dynamic_last4.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tokenization_method = tokenization_method.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Card]
    }
    
    @scala.inline
    implicit class CardMutableBuilder[Self <: Card] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      @scala.inline
      def setAddress_city(value: String): Self = StObject.set(x, "address_city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_country(value: String): Self = StObject.set(x, "address_country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_line1(value: String): Self = StObject.set(x, "address_line1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_line1_check(value: checkStatus): Self = StObject.set(x, "address_line1_check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_line2(value: String): Self = StObject.set(x, "address_line2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_state(value: String): Self = StObject.set(x, "address_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_zip(value: String): Self = StObject.set(x, "address_zip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_zip_check(value: checkStatus): Self = StObject.set(x, "address_zip_check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailable_payout_methods(value: js.Array[standard] | (js.Tuple2[standard, instant])): Self = StObject.set(x, "available_payout_methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailable_payout_methodsVarargs(value: standard*): Self = StObject.set(x, "available_payout_methods", js.Array(value :_*))
      
      @scala.inline
      def setBrand(
        value: (`American Express`) | (`Diners Club`) | Discover | JCB | MasterCard | UnionPay | Visa | Unknown
      ): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setCustomer(value: js.Any): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
      
      @scala.inline
      def setCvc_check(value: checkStatus): Self = StObject.set(x, "cvc_check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault_for_currency(value: Boolean): Self = StObject.set(x, "default_for_currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault_for_currencyUndefined: Self = StObject.set(x, "default_for_currency", js.undefined)
      
      @scala.inline
      def setDynamic_last4(value: String): Self = StObject.set(x, "dynamic_last4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunding(value: credit | debit | prepaid | unknown_): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: card): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
      
      @scala.inline
      def setTokenization_method(value: apple_pay | android_pay): Self = StObject.set(x, "tokenization_method", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Customer extends StObject {
    
    /**
      * The Address of the customer
      */
    var address: Address = js.native
    
    /**
      * The email address of the customer
      */
    var email: String = js.native
    
    /**
      * The full name of the owner
      */
    var name: String = js.native
    
    /**
      * The phone number of the customer
      * NOTE: This includes the extension
      */
    var phone: String = js.native
    
    /**
      * Verified customer’s address
      */
    val verified_address: Address = js.native
    
    /**
      * Verified customer’s email address
      */
    val verified_email: String = js.native
    
    /**
      * Verified customer’s full name
      */
    val verified_name: String = js.native
    
    /**
      * Verified customer’s phone number
      */
    val verified_phone: String = js.native
  }
  object Customer {
    
    @scala.inline
    def apply(
      address: Address,
      email: String,
      name: String,
      phone: String,
      verified_address: Address,
      verified_email: String,
      verified_name: String,
      verified_phone: String
    ): Customer = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], verified_address = verified_address.asInstanceOf[js.Any], verified_email = verified_email.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any], verified_phone = verified_phone.asInstanceOf[js.Any])
      __obj.asInstanceOf[Customer]
    }
    
    @scala.inline
    implicit class CustomerMutableBuilder[Self <: Customer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerified_address(value: Address): Self = StObject.set(x, "verified_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerified_email(value: String): Self = StObject.set(x, "verified_email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerified_name(value: String): Self = StObject.set(x, "verified_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerified_phone(value: String): Self = StObject.set(x, "verified_phone", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stripejs.stripejsStrings.pass
    - typingsSlinky.stripejs.stripejsStrings.fail
    - typingsSlinky.stripejs.stripejsStrings.unavailable
    - typingsSlinky.stripejs.stripejsStrings.unchecked
  */
  trait checkStatus extends StObject
  object checkStatus {
    
    @scala.inline
    def fail: typingsSlinky.stripejs.stripejsStrings.fail = "fail".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.fail]
    
    @scala.inline
    def pass: typingsSlinky.stripejs.stripejsStrings.pass = "pass".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.pass]
    
    @scala.inline
    def unavailable: typingsSlinky.stripejs.stripejsStrings.unavailable = "unavailable".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.unavailable]
    
    @scala.inline
    def unchecked: typingsSlinky.stripejs.stripejsStrings.unchecked = "unchecked".asInstanceOf[typingsSlinky.stripejs.stripejsStrings.unchecked]
  }
}
