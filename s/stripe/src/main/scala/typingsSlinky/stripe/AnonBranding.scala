package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBranding extends js.Object {
  /**
    * Settings used to apply the account’s branding to email receipts, invoices,
    * Checkout, and other products.
    */
  var branding: js.UndefOr[AnonIcon] = js.native
  /**
    * Settings specific to card charging on the account.
    */
  var card_payments: js.UndefOr[AnonDeclineon] = js.native
  /**
    * Settings used to configure the account within the Stripe dashboard.
    */
  var dashboard: js.UndefOr[AnonDisplayname] = js.native
  /**
    * Settings that apply across payment methods for charging on the account.
    */
  var payments: js.UndefOr[AnonStatementdescriptor] = js.native
  /**
    * Settings specific to the account’s payouts.
    */
  var payouts: js.UndefOr[AnonDebitnegativebalances] = js.native
}

object AnonBranding {
  @scala.inline
  def apply(): AnonBranding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBranding]
  }
  @scala.inline
  implicit class AnonBrandingOps[Self <: AnonBranding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranding(value: AnonIcon): Self = {
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
    def withCard_payments(value: AnonDeclineon): Self = {
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
    def withDashboard(value: AnonDisplayname): Self = {
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
    def withPayments(value: AnonStatementdescriptor): Self = {
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
    def withPayouts(value: AnonDebitnegativebalances): Self = {
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

