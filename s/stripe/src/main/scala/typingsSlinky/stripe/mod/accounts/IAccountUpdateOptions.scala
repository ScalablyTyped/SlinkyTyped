package typingsSlinky.stripe.mod.accounts

import typingsSlinky.stripe.AnonAccountholdername
import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccountUpdateOptions
  extends IDataOptionsWithMetadata
     with IAccountShared {
  /**
    * An account token, used to securely provide details to the account.
    */
  var account_token: js.UndefOr[String] = js.native
  /**
    * Information about the company or business.
    * This field is null unless business_type is set to company.
    */
  var company: js.UndefOr[ICompanyCreateUpdateOptions] = js.native
  /**
    * A card or bank account to attach to the account. You can provide either a
    * token, like the ones returned by Stripe.js, or a dictionary as documented in
    * the external_account parameter for either card or bank account creation.
    *
    * This will create a new external account object, make it the new default
    * external account for its currency, and delete the old default if one exists. If
    * you want to add additional external accounts instead of replacing the
    * existing default for this currency, use the bank account or card creation
    * API.
    */
  var external_account: js.UndefOr[AnonAccountholdername] = js.native
  /**
    * Information about the person represented by the account.
    * This field is null unless business_type is set to individual.
    */
  var individual: js.UndefOr[IIndividualCreateUpdateOptions] = js.native
}

object IAccountUpdateOptions {
  @scala.inline
  def apply(): IAccountUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccountUpdateOptions]
  }
  @scala.inline
  implicit class IAccountUpdateOptionsOps[Self <: IAccountUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_token")(js.undefined)
        ret
    }
    @scala.inline
    def withCompany(value: ICompanyCreateUpdateOptions): Self = {
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
    def withExternal_account(value: AnonAccountholdername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal_account: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_account")(js.undefined)
        ret
    }
    @scala.inline
    def withIndividual(value: IIndividualCreateUpdateOptions): Self = {
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
  }
  
}

