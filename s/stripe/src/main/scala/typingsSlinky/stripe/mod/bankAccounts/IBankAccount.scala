package typingsSlinky.stripe.mod.bankAccounts

import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IStripeSource
import typingsSlinky.stripe.mod.accounts.IExternalAccount
import typingsSlinky.stripe.stripeStrings.`new`
import typingsSlinky.stripe.stripeStrings.bank_account
import typingsSlinky.stripe.stripeStrings.errored
import typingsSlinky.stripe.stripeStrings.validated
import typingsSlinky.stripe.stripeStrings.verification_failed
import typingsSlinky.stripe.stripeStrings.verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBankAccount
  extends IBankAccountHash
     with IExternalAccount
     with IStripeSource {
  var account: js.UndefOr[String] = js.native
  /**
    * This indicates whether or not this bank account is the default external account for its currency.
    */
  var default_for_currency: js.UndefOr[Boolean] = js.native
  /**
    * A set of key/value pairs that you can attach to a bank account object. It
    * can be useful for storing additional information about the bank account in
    * a structured format.
    */
  var metadata: IMetadata = js.native
}

object IBankAccount {
  @scala.inline
  def apply(
    bank_name: String,
    country: String,
    currency: String,
    fingerprint: String,
    id: String,
    last4: String,
    metadata: IMetadata,
    `object`: bank_account,
    routing_number: String,
    status: `new` | validated | verified | verification_failed | errored
  ): IBankAccount = {
    val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBankAccount]
  }
  @scala.inline
  implicit class IBankAccountOps[Self <: IBankAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_for_currency(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_for_currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_for_currency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_for_currency")(js.undefined)
        ret
    }
  }
  
}

