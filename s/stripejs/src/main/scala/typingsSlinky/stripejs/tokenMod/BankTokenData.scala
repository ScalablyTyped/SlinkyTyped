package typingsSlinky.stripejs.tokenMod

import typingsSlinky.stripejs.stripejsStrings.company
import typingsSlinky.stripejs.stripejsStrings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BankTokenData extends IBANTokenData {
  /**
    * The bank account number
    */
  var account_number: String = js.native
  /**
    * The 2-digit country ISO code
    * @example 'US'
    */
  var country: String = js.native
  /**
    * The routing transit number for the bank account
    * NOTE: This is optional if the {@link BankTokenData.currency} is 'eur'
    */
  var routing_number: js.UndefOr[String] = js.native
}

object BankTokenData {
  @scala.inline
  def apply(
    account_holder_name: String,
    account_holder_type: individual | company,
    account_number: String,
    country: String,
    currency: String
  ): BankTokenData = {
    val __obj = js.Dynamic.literal(account_holder_name = account_holder_name.asInstanceOf[js.Any], account_holder_type = account_holder_type.asInstanceOf[js.Any], account_number = account_number.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankTokenData]
  }
  @scala.inline
  implicit class BankTokenDataOps[Self <: BankTokenData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouting_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouting_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing_number")(js.undefined)
        ret
    }
  }
  
}

