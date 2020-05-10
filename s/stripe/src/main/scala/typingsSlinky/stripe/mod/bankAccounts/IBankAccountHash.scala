package typingsSlinky.stripe.mod.bankAccounts

import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.stripeStrings.`new`
import typingsSlinky.stripe.stripeStrings.bank_account
import typingsSlinky.stripe.stripeStrings.company
import typingsSlinky.stripe.stripeStrings.errored
import typingsSlinky.stripe.stripeStrings.individual
import typingsSlinky.stripe.stripeStrings.validated
import typingsSlinky.stripe.stripeStrings.verification_failed
import typingsSlinky.stripe.stripeStrings.verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBankAccountHash extends IResourceObject {
  /**
    * The name of the person or business that owns the bank account.
    */
  var account_holder_name: String | Null = js.native
  /**
    * The type of entity that holds the account. This can be either
    * "individual"" or "company".
    */
  var account_holder_type: individual | company | Null = js.native
  /**
    * Name of the bank associated with the routing number, e.g. WELLS FARGO.
    */
  var bank_name: String = js.native
  /**
    * Two-letter ISO code representing the country the bank account is located in.
    */
  var country: String = js.native
  /**
    * Three-letter ISO currency code representing the currency paid out to the bank account.
    */
  var currency: String = js.native
  var customer: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies this particular bank account. You can use this attribute
    * to check whether two bank accounts are the same.
    */
  var fingerprint: String = js.native
  var last4: String = js.native
  /**
    * value is "bank_account"
    */
  @JSName("object")
  var object_IBankAccountHash: bank_account = js.native
  /**
    * The routing transit number for the bank account.
    */
  var routing_number: String = js.native
  /**
    * Possible values are "new", "validated", "verified", "verification_failed",
    * or "errored". A bank account that hasn’t had any activity or validation
    * performed is "new". If Stripe can determine that the bank account exists, its
    * status will be "validated". Note that there often isn’t enough information
    * to know (e.g. for smaller credit unions), and the validation is not always
    * run. If customer bank account verification has succeeded, the bank
    * account status will be "verified". If the verification failed for any reason,
    * such as microdeposit failure, the status will be "verification_failed". If a
    * transfer sent to this bank account fails, we’ll set the status to "errored""
    * and will not continue to send transfers until the bank details are updated.
    */
  var status: `new` | validated | verified | verification_failed | errored = js.native
}

object IBankAccountHash {
  @scala.inline
  def apply(
    bank_name: String,
    country: String,
    currency: String,
    fingerprint: String,
    id: String,
    last4: String,
    `object`: bank_account,
    routing_number: String,
    status: `new` | validated | verified | verification_failed | errored
  ): IBankAccountHash = {
    val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBankAccountHash]
  }
  @scala.inline
  implicit class IBankAccountHashOps[Self <: IBankAccountHash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBank_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bank_name")(value.asInstanceOf[js.Any])
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
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: bank_account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouting_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: `new` | validated | verified | verification_failed | errored): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccount_holder_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_holder_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccount_holder_nameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_holder_name")(null)
        ret
    }
    @scala.inline
    def withAccount_holder_type(value: individual | company): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_holder_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccount_holder_typeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_holder_type")(null)
        ret
    }
    @scala.inline
    def withCustomer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(js.undefined)
        ret
    }
  }
  
}

