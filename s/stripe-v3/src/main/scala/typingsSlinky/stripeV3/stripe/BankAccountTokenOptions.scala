package typingsSlinky.stripeV3.stripe

import typingsSlinky.stripeV3.stripeV3Strings.company
import typingsSlinky.stripeV3.stripeV3Strings.individual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BankAccountTokenOptions extends StObject {
  
  /**
    * The name of the account holder.
    */
  var account_holder_name: String = js.native
  
  /**
    * The type of entity that holds the account. Can be either individual or company.
    */
  var account_holder_type: individual | company = js.native
  
  /**
    * The bank account number (e.g., 000123456789).
    */
  var account_number: String = js.native
  
  /**
    * Two character country code (e.g., US).
    */
  var country: String = js.native
  
  /**
    * Three character currency code (e.g., usd).
    */
  var currency: String = js.native
  
  /**
    * The bank routing number (e.g., 111000025). Optional if the currency is eur, as the account number is an IBAN.
    */
  var routing_number: js.UndefOr[String] = js.native
}
object BankAccountTokenOptions {
  
  @scala.inline
  def apply(
    account_holder_name: String,
    account_holder_type: individual | company,
    account_number: String,
    country: String,
    currency: String
  ): BankAccountTokenOptions = {
    val __obj = js.Dynamic.literal(account_holder_name = account_holder_name.asInstanceOf[js.Any], account_holder_type = account_holder_type.asInstanceOf[js.Any], account_number = account_number.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankAccountTokenOptions]
  }
  
  @scala.inline
  implicit class BankAccountTokenOptionsMutableBuilder[Self <: BankAccountTokenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_holder_name(value: String): Self = StObject.set(x, "account_holder_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_holder_type(value: individual | company): Self = StObject.set(x, "account_holder_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouting_numberUndefined: Self = StObject.set(x, "routing_number", js.undefined)
  }
}
