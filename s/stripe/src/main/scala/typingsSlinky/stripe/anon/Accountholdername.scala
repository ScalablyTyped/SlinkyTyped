package typingsSlinky.stripe.anon

import typingsSlinky.stripe.stripeStrings.company
import typingsSlinky.stripe.stripeStrings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accountholdername extends js.Object {
  /**
    * The name of the person or business that owns the bank account. This
    * field is required when attaching the bank account to a customer object.
    */
  var account_holder_name: js.UndefOr[String] = js.native
  /**
    * The type of entity that holds the account. This can be either
    * "individual" or "company". This field is required when attaching the
    * bank account to a customer object.
    */
  var account_holder_type: js.UndefOr[individual | company | Null] = js.native
  /**
    * The account number for the bank account in string form. Must be a
    * checking account.
    */
  var account_number: String = js.native
  /**
    * The country the bank account is in.
    */
  var country: String = js.native
  /**
    * The currency the bank account is in. This must be a country/currency
    * pairing that Stripe supports.
    */
  var currency: String = js.native
  /**
    * The type of external account. Should be "bank_account".
    */
  var `object`: String = js.native
  /**
    * The routing number, sort code, or other country-appropriate institution
    * number for the bank account. For US bank accounts, this is required
    * and should be the ACH routing number, not the wire routing number. If
    * you are providing an IBAN for account_number, this field is not
    * required.
    */
  var routing_number: js.UndefOr[String] = js.native
}

object Accountholdername {
  @scala.inline
  def apply(account_number: String, country: String, currency: String, `object`: String): Accountholdername = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accountholdername]
  }
  @scala.inline
  implicit class AccountholdernameOps[Self <: Accountholdername] (val x: Self) extends AnyVal {
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
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccount_holder_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_holder_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount_holder_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_holder_name")(js.undefined)
        ret
    }
    @scala.inline
    def withAccount_holder_type(value: individual | company): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_holder_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount_holder_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_holder_type")(js.undefined)
        ret
    }
    @scala.inline
    def withAccount_holder_typeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_holder_type")(null)
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

