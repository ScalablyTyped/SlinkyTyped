package typingsSlinky.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Branding extends js.Object {
  /**
    * Settings used to apply the account’s branding to email receipts, invoices,
    * Checkout, and other products.
    */
  var branding: js.UndefOr[Icon] = js.native
  /**
    * Settings specific to card charging on the account.
    */
  var card_payments: js.UndefOr[Declineon] = js.native
  /**
    * Settings used to configure the account within the Stripe dashboard.
    */
  var dashboard: js.UndefOr[Displayname] = js.native
  /**
    * Settings that apply across payment methods for charging on the account.
    */
  var payments: js.UndefOr[Statementdescriptor] = js.native
  /**
    * Settings specific to the account’s payouts.
    */
  var payouts: js.UndefOr[Debitnegativebalances] = js.native
}

object Branding {
  @scala.inline
  def apply(): Branding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Branding]
  }
  @scala.inline
  implicit class BrandingOps[Self <: Branding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranding(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branding")(js.undefined)
        ret
    }
    @scala.inline
    def withCard_payments(value: Declineon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card_payments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCard_payments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card_payments")(js.undefined)
        ret
    }
    @scala.inline
    def withDashboard(value: Displayname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashboard")(js.undefined)
        ret
    }
    @scala.inline
    def withPayments(value: Statementdescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payments")(js.undefined)
        ret
    }
    @scala.inline
    def withPayouts(value: Debitnegativebalances): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayouts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payouts")(js.undefined)
        ret
    }
  }
  
}

