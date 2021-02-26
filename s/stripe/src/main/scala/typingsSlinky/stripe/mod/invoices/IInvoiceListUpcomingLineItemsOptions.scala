package typingsSlinky.stripe.mod.invoices

import typingsSlinky.stripe.mod.IListOptions
import typingsSlinky.stripe.mod.invoiceItems.InvoiceItem
import typingsSlinky.stripe.mod.subscriptions.ISubscriptionUpdateItem
import typingsSlinky.stripe.stripeStrings.now
import typingsSlinky.stripe.stripeStrings.unchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IInvoiceListUpcomingLineItemsOptionsMutableBuilder[Self <: IInvoiceListUpcomingLineItemsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    @scala.inline
    def setInvoice_items(value: js.Array[InvoiceItem]): Self = StObject.set(x, "invoice_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoice_itemsUndefined: Self = StObject.set(x, "invoice_items", js.undefined)
    
    @scala.inline
    def setInvoice_itemsVarargs(value: InvoiceItem*): Self = StObject.set(x, "invoice_items", js.Array(value :_*))
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    @scala.inline
    def setSubscription_billing_cycle_anchor(value: now | unchanged): Self = StObject.set(x, "subscription_billing_cycle_anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_billing_cycle_anchorUndefined: Self = StObject.set(x, "subscription_billing_cycle_anchor", js.undefined)
    
    @scala.inline
    def setSubscription_cancel_at(value: Boolean): Self = StObject.set(x, "subscription_cancel_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_cancel_atUndefined: Self = StObject.set(x, "subscription_cancel_at", js.undefined)
    
    @scala.inline
    def setSubscription_cancel_at_period_end(value: Boolean): Self = StObject.set(x, "subscription_cancel_at_period_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_cancel_at_period_endUndefined: Self = StObject.set(x, "subscription_cancel_at_period_end", js.undefined)
    
    @scala.inline
    def setSubscription_cancel_now(value: Boolean): Self = StObject.set(x, "subscription_cancel_now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_cancel_nowUndefined: Self = StObject.set(x, "subscription_cancel_now", js.undefined)
    
    @scala.inline
    def setSubscription_items(value: js.Array[ISubscriptionUpdateItem]): Self = StObject.set(x, "subscription_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_itemsUndefined: Self = StObject.set(x, "subscription_items", js.undefined)
    
    @scala.inline
    def setSubscription_itemsVarargs(value: ISubscriptionUpdateItem*): Self = StObject.set(x, "subscription_items", js.Array(value :_*))
    
    @scala.inline
    def setSubscription_prorate(value: Boolean): Self = StObject.set(x, "subscription_prorate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_prorateUndefined: Self = StObject.set(x, "subscription_prorate", js.undefined)
    
    @scala.inline
    def setSubscription_proration_date(value: Double): Self = StObject.set(x, "subscription_proration_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_proration_dateUndefined: Self = StObject.set(x, "subscription_proration_date", js.undefined)
    
    @scala.inline
    def setSubscription_start_date(value: Double): Self = StObject.set(x, "subscription_start_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_start_dateUndefined: Self = StObject.set(x, "subscription_start_date", js.undefined)
    
    @scala.inline
    def setSubscription_tax_percent(value: Double): Self = StObject.set(x, "subscription_tax_percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_tax_percentUndefined: Self = StObject.set(x, "subscription_tax_percent", js.undefined)
    
    @scala.inline
    def setSubscription_trial_end(value: now | Double | String): Self = StObject.set(x, "subscription_trial_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_trial_endUndefined: Self = StObject.set(x, "subscription_trial_end", js.undefined)
    
    @scala.inline
    def setSubscription_trial_from_plan(value: Boolean): Self = StObject.set(x, "subscription_trial_from_plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_trial_from_planUndefined: Self = StObject.set(x, "subscription_trial_from_plan", js.undefined)
  }
}
