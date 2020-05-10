package typingsSlinky.stripe.mod.accounts

import typingsSlinky.stripe.AnonCardpayments
import typingsSlinky.stripe.AnonDisabledreason
import typingsSlinky.stripe.mod.IList
import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.stripeStrings.account
import typingsSlinky.stripe.stripeStrings.custom
import typingsSlinky.stripe.stripeStrings.express
import typingsSlinky.stripe.stripeStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccount
  extends IResourceObject
     with IAccountShared {
  /**
    * A hash containing the set of capabilities that was requested for this
    * account and their associatedstates. Keys are names of capabilities.
    * You can see the full list here. Values may be active, inactive, or pending.
    */
  var capabilities: js.UndefOr[AnonCardpayments] = js.native
  /**
    * Whether or not the account can create live charges
    */
  var charges_enabled: Boolean = js.native
  /**
    * Information about the company or business.
    * This field is null unless business_type is set to company.
    */
  var company: js.UndefOr[ICompany] = js.native
  /**
    * The country of the account
    */
  var country: String = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: js.UndefOr[Double] = js.native
  /**
    * Whether or not account details have been submitted yet. Standalone
    * accounts cannot receive transfers before this is true.
    */
  var details_submitted: Boolean = js.native
  /**
    * The display name for this account. This is used on the Stripe dashboard to
    * help you differentiate between accounts.
    */
  var display_name: String = js.native
  /**
    * External accounts (bank accounts and debit cards) currently
    * attached to this account
    */
  var external_accounts: js.UndefOr[IList[IExternalAccount]] = js.native
  /**
    * Information about the person represented by the account.
    * This field is null unless business_type is set to individual.
    */
  var individual: js.UndefOr[IIndividual] = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful
    * for storing additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IMetadata] = js.native
  /**
    * Value is "account"
    */
  @JSName("object")
  var object_IAccount: account = js.native
  /**
    * Whether or not Stripe will send automatic transfers for this account. This
    * is only false when Stripe is waiting for additional information from the
    * account holder.
    */
  var payouts_enabled: Boolean = js.native
  /**
    * Information about the requirements for the account, including what information
    * needs to be collected, and by when.
    */
  var requirements: js.UndefOr[IAccountRequirements] = js.native
  /**
    * The Stripe account type. Can be standard, express, or custom.
    */
  var `type`: standard | express | custom = js.native
  /**
    * The state of the account’s information requests, including what
    * information is needed and by when it must be provided.
    * @deprecated
    */
  var verification: js.UndefOr[AnonDisabledreason] = js.native
}

object IAccount {
  @scala.inline
  def apply(
    charges_enabled: Boolean,
    country: String,
    details_submitted: Boolean,
    display_name: String,
    id: String,
    `object`: account,
    payouts_enabled: Boolean,
    `type`: standard | express | custom
  ): IAccount = {
    val __obj = js.Dynamic.literal(charges_enabled = charges_enabled.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], details_submitted = details_submitted.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], payouts_enabled = payouts_enabled.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccount]
  }
  @scala.inline
  implicit class IAccountOps[Self <: IAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharges_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charges_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails_submitted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details_submitted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayouts_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payouts_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: standard | express | custom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapabilities(value: AnonCardpayments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withCompany(value: ICompany): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withExternal_accounts(value: IList[IExternalAccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal_accounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_accounts")(js.undefined)
        ret
    }
    @scala.inline
    def withIndividual(value: IIndividual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndividual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individual")(js.undefined)
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
    def withRequirements(value: IAccountRequirements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(js.undefined)
        ret
    }
    @scala.inline
    def withVerification(value: AnonDisabledreason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(js.undefined)
        ret
    }
  }
  
}

