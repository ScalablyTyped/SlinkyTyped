package typingsSlinky.stripe.mod.invoices

import typingsSlinky.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInvoiceLineItemRetrievalOptions extends IListOptions {
  var coupon: js.UndefOr[String] = js.native
  /**
    * In the case of upcoming invoices, the customer of the upcoming invoice is required. In other cases it is ignored.
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * In the case of upcoming invoices, the subscription of the upcoming invoice is optional. In other cases it is ignored.
    */
  var subscription: js.UndefOr[String] = js.native
  var subscription_plan: js.UndefOr[String] = js.native
  var subscription_prorate: js.UndefOr[Boolean] = js.native
  var subscription_proration_date: js.UndefOr[Double] = js.native
  var subscription_quantity: js.UndefOr[Double] = js.native
  var subscription_trial_end: js.UndefOr[Double] = js.native
}

object IInvoiceLineItemRetrievalOptions {
  @scala.inline
  def apply(): IInvoiceLineItemRetrievalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInvoiceLineItemRetrievalOptions]
  }
  @scala.inline
  implicit class IInvoiceLineItemRetrievalOptionsOps[Self <: IInvoiceLineItemRetrievalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoupon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coupon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoupon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coupon")(js.undefined)
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
    @scala.inline
    def withSubscription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription_plan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription_plan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_plan")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription_prorate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_prorate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription_prorate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_prorate")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription_proration_date(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_proration_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription_proration_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_proration_date")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription_quantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription_quantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_quantity")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription_trial_end(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_trial_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription_trial_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_trial_end")(js.undefined)
        ret
    }
  }
  
}

