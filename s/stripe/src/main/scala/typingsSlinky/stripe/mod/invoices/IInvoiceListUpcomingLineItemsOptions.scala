package typingsSlinky.stripe.mod.invoices

import typingsSlinky.stripe.mod.IListOptions
import typingsSlinky.stripe.mod.invoiceItems.InvoiceItem
import typingsSlinky.stripe.mod.subscriptions.ISubscriptionUpdateItem
import typingsSlinky.stripe.stripeStrings.now
import typingsSlinky.stripe.stripeStrings.unchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInvoiceListUpcomingLineItemsOptions extends IListOptions {
  /**
    * The code of the coupon to apply. If subscription or subscription_items is provided, the invoice returned will preview updating or
    * creating a subscription with that coupon. Otherwise, it will preview applying that coupon to the customer for the next upcoming invoice
    * from among the customer’s subscriptions. The invoice can be previewed without a coupon by passing this value as an empty string.
    */
  var coupon: js.UndefOr[String] = js.native
  /**
    * The identifier of the customer whose upcoming invoice you’d like to retrieve.
    * Required if subscription unset
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * array of hashes
    * List of invoice items to add or update in the upcoming invoice preview.
    */
  var invoice_items: js.UndefOr[js.Array[InvoiceItem]] = js.native
  /**
    * The identifier of the subscription for which you’d like to retrieve the upcoming invoice. If not
    * provided, but a subscription_items is provided, you will preview creating a subscription with
    * those items. If neither subscription nor subscription_items is provided, you will retrieve the
    * next upcoming invoice from among the customer’s subscriptions.
    */
  var subscription: js.UndefOr[String] = js.native
  /**
    * For new subscriptions, a future timestamp to anchor the subscription’s billing cycle. This is used to
    * determine the date of the first full invoice, and, for plans with month or year intervals, the day of
    * the month for subsequent invoices. For existing subscriptions, the value can only be set to now or
    * unchanged.
    */
  var subscription_billing_cycle_anchor: js.UndefOr[now | unchanged] = js.native
  /**
    * Boolean indicating when the subscription should be scheduled to cancel. Will prorate if
    * within the current period if prorate=true
    */
  var subscription_cancel_at: js.UndefOr[Boolean] = js.native
  /**
    * Boolean indicating whether this subscription should cancel at the end of the current period.
    */
  var subscription_cancel_at_period_end: js.UndefOr[Boolean] = js.native
  var subscription_cancel_now: js.UndefOr[Boolean] = js.native
  /**
    * array of hashes List of subscription items, each with an attached plan.
    */
  var subscription_items: js.UndefOr[js.Array[ISubscriptionUpdateItem]] = js.native
  /**
    * If previewing an update to a subscription, this decides whether the preview will show the result of
    * applying prorations or not. If set, one of subscription_items or subscription, and one of
    * subscription_items or subscription_trial_end are required.
    */
  var subscription_prorate: js.UndefOr[Boolean] = js.native
  /**
    * If previewing an update to a subscription, and doing proration, subscription_proration_date
    * forces the proration to be calculated as though the update was done at the specified time. The time
    * given must be within the current subscription period, and cannot be before the subscription was on
    * its current plan. If set, subscription, and one of subscription_items, or subscription_trial_end are
    * required. Also, subscription_proration cannot be set to false.
    */
  var subscription_proration_date: js.UndefOr[Double] = js.native
  /**
    * Date a subscription is intended to start (can be future or past)
    */
  var subscription_start_date: js.UndefOr[Double] = js.native
  /**
    * DEPRECATED
    * If provided, the invoice returned will preview updating or creating a subscription with that tax
    * percent. If set, one of subscription_items or subscription is required. This field has been deprecated
    * and will be removed in a future API version, for further information view the migration docs for
    * tax_rates.
    */
  var subscription_tax_percent: js.UndefOr[Double] = js.native
  /**
    * If provided, the invoice returned will preview updating or creating a subscription with that trial end.
    * If set, one of subscription_items or subscription is required.
    */
  var subscription_trial_end: js.UndefOr[now | Double | String] = js.native
  /**
    * Indicates if a plan’s trial_period_days should be applied to the subscription. Setting
    * subscription_trial_end per subscription is preferred, and this defaults to false. Setting this flag to
    * true together with subscription_trial_end is not allowed.
    */
  var subscription_trial_from_plan: js.UndefOr[Boolean] = js.native
}

object IInvoiceListUpcomingLineItemsOptions {
  @scala.inline
  def apply(): IInvoiceListUpcomingLineItemsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInvoiceListUpcomingLineItemsOptions]
  }
  @scala.inline
  implicit class IInvoiceListUpcomingLineItemsOptionsOps[Self <: IInvoiceListUpcomingLineItemsOptions] (val x: Self) extends AnyVal {
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
    def withInvoice_items(value: js.Array[InvoiceItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoice_items: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_items")(js.undefined)
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
    def withSubscription_billing_cycle_anchor(value: now | unchanged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_billing_cycle_anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription_billing_cycle_anchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_billing_cycle_anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription_cancel_at(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_cancel_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription_cancel_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_cancel_at")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription_cancel_at_period_end(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_cancel_at_period_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription_cancel_at_period_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_cancel_at_period_end")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription_cancel_now(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_cancel_now")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription_cancel_now: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_cancel_now")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription_items(value: js.Array[ISubscriptionUpdateItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription_items: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_items")(js.undefined)
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
    def withSubscription_start_date(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_start_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription_start_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_start_date")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription_tax_percent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_tax_percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription_tax_percent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_tax_percent")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription_trial_end(value: now | Double | String): Self = {
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
    @scala.inline
    def withSubscription_trial_from_plan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_trial_from_plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription_trial_from_plan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_trial_from_plan")(js.undefined)
        ret
    }
  }
  
}

