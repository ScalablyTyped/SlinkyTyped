package typingsSlinky.stripe.mod.accounts

import typingsSlinky.stripe.anon.Branding
import typingsSlinky.stripe.anon.Date
import typingsSlinky.stripe.anon.Mcc
import typingsSlinky.stripe.stripeStrings.company
import typingsSlinky.stripe.stripeStrings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccountShared extends js.Object {
  /**
    * Optional information related to the business.
    */
  var business_profile: js.UndefOr[Mcc] = js.native
  /**
    * The business type. Can be individual or company.
    */
  var business_type: js.UndefOr[individual | company] = js.native
  /**
    * Three-letter ISO currency code representing the default currency for the
    * account. This must be a currency that Stripe supports in the account’s
    * country.
    */
  var default_currency: js.UndefOr[String] = js.native
  /**
    * Email address of the account holder. For standalone accounts, this is used
    * to email them asking them to claim their Stripe account. For managed
    * accounts, this is only to make the account easier to identify to you: Stripe
    * will not email the account holder.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Internal-only description of the product being sold or service being
    * provided by this account. It’s used by Stripe for risk and underwriting
    * purposes.
    */
  var product_description: js.UndefOr[String] = js.native
  /**
    * The set of capabilities you want to unlock for this account (US only).
    * Each capability will be inactive until you have provided its specific
    * requirements and Stripe has verified them. An account may have some of
    * its requested capabilities be active and some be inactive.
    */
  var requested_capabilities: js.UndefOr[js.Array[String]] = js.native
  /**
    * Account options for customizing how the account functions within Stripe.
    */
  var settings: js.UndefOr[Branding] = js.native
  /**
    * Details on who accepted the Stripe terms of service, and when they
    * accepted it. See our updating managed accounts guide for more
    * information
    */
  var tos_acceptance: js.UndefOr[Date] = js.native
}

object IAccountShared {
  @scala.inline
  def apply(): IAccountShared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccountShared]
  }
  @scala.inline
  implicit class IAccountSharedOps[Self <: IAccountShared] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusiness_profile(value: Mcc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business_profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusiness_profile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business_profile")(js.undefined)
        ret
    }
    @scala.inline
    def withBusiness_type(value: individual | company): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusiness_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business_type")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_currency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_currency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_currency")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_description")(js.undefined)
        ret
    }
    @scala.inline
    def withRequested_capabilities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requested_capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequested_capabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requested_capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: Branding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
    @scala.inline
    def withTos_acceptance(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tos_acceptance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTos_acceptance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tos_acceptance")(js.undefined)
        ret
    }
  }
  
}

