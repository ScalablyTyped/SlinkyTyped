package typingsSlinky.stripe.mod.subscriptions

import typingsSlinky.stripe.mod.IDataOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriptionCancellationOptions extends IDataOptions {
  /**
    * @deprecated Use subscription update with cancel_at_period_end option as of 2018-08-23.
    *
    * A flag that if set to true will delay the cancellation of the subscription until the end of the current period.
    */
  var at_period_end: js.UndefOr[Boolean] = js.native
  /**
    * Will generate a final invoice that invoices for any un-invoiced metered usage and new/pending proration invoice items.
    */
  var invoice_now: js.UndefOr[Boolean] = js.native
  /**
    * Will generate a proration invoice item that credits remaining unused time until the subscription period end.
    */
  var prorate: js.UndefOr[Boolean] = js.native
}

object ISubscriptionCancellationOptions {
  @scala.inline
  def apply(): ISubscriptionCancellationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubscriptionCancellationOptions]
  }
  @scala.inline
  implicit class ISubscriptionCancellationOptionsOps[Self <: ISubscriptionCancellationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAt_period_end(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at_period_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAt_period_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at_period_end")(js.undefined)
        ret
    }
    @scala.inline
    def withInvoice_now(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_now")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoice_now: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_now")(js.undefined)
        ret
    }
    @scala.inline
    def withProrate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prorate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prorate")(js.undefined)
        ret
    }
  }
  
}

