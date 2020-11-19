package typingsSlinky.stripe.mod.invoices

import typingsSlinky.stripe.mod.IDataOptions
import typingsSlinky.stripe.mod.subscriptions.ISubscriptionUpdateItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInvoiceUpcomingOptions extends IDataOptions {
  
  /**
    * The code of the coupon to apply. If a subscription or subscription_plan is provided, the invoice returned will preview updating
    * or creating a subscription with that coupon. Otherwise, it will preview applying that coupon to the customer for the next upcoming
    * invoice from among the customer’s subscriptions.
    */
  var coupon: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the customer whose upcoming invoice you’d like to retrieve. REQUIRED IF SUBSCRIPTION UNSET
    */
  var customer: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the subscription for which you’d like to retrieve the upcoming invoice. If not provided, but a subscription_plan
    * is provided, you will preview creating a subscription to that plan. If neither subscription nor subscription_plan is provided, you
    * will retrieve the next upcoming invoice from among the customer’s subscriptions.
    */
  var subscription: js.UndefOr[String] = js.native
  
  /**
    * Boolean indicating whether this subscription should cancel at the end of the current period.
    */
  var subscription_cancel_at_period_end: js.UndefOr[Boolean] = js.native
  
  /**
    * List of subscription items, each with an attached plan.
    */
  var subscription_items: js.UndefOr[js.Array[ISubscriptionUpdateItem]] = js.native
  
  /**
    * If set, the invoice returned will preview updating the subscription given to this plan, or creating a new subscription to this plan
    * if no subscription is given.
    */
  var subscription_plan: js.UndefOr[String] = js.native
  
  /**
    * If previewing an update to a subscription, this decides whether the preview will show the result of applying prorations or not. If
    * set, one of subscription_plan or subscription, and one of subscription_plan, subscription_quantity or subscription_trial_end are
    * required.
    */
  var subscription_prorate: js.UndefOr[Boolean] = js.native
  
  /**
    * If previewing an update to a subscription, and doing proration, subscription_proration_date forces the proration to be calculated as
    * though the update was done at the specified time. The time given must be within the current subscription period, and cannot be
    * before the subscription was on its current plan.If set, subscription, and one of subscription_plan, subscription_quantity or
    * subscription_trial_end are required. Also, subscription_proration cannot be set to false.
    */
  var subscription_proration_date: js.UndefOr[Double] = js.native
  
  /**
    * If provided, the invoice returned will preview updating or creating a subscription with that quantity. If set, one of subscription_plan
    * or subscription is required.
    */
  var subscription_quantity: js.UndefOr[Double] = js.native
  
  /**
    * If provided, the invoice returned will preview updating or creating a subscription with that trial end. If set, one of subscription_plan
    * or subscription is required.
    */
  var subscription_trial_end: js.UndefOr[Double] = js.native
}
object IInvoiceUpcomingOptions {
  
  @scala.inline
  def apply(): IInvoiceUpcomingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInvoiceUpcomingOptions]
  }
  
  @scala.inline
  implicit class IInvoiceUpcomingOptionsOps[Self <: IInvoiceUpcomingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoupon(value: String): Self = this.set("coupon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoupon: Self = this.set("coupon", js.undefined)
    
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
    
    @scala.inline
    def setSubscription_cancel_at_period_end(value: Boolean): Self = this.set("subscription_cancel_at_period_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription_cancel_at_period_end: Self = this.set("subscription_cancel_at_period_end", js.undefined)
    
    @scala.inline
    def setSubscription_itemsVarargs(value: ISubscriptionUpdateItem*): Self = this.set("subscription_items", js.Array(value :_*))
    
    @scala.inline
    def setSubscription_items(value: js.Array[ISubscriptionUpdateItem]): Self = this.set("subscription_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription_items: Self = this.set("subscription_items", js.undefined)
    
    @scala.inline
    def setSubscription_plan(value: String): Self = this.set("subscription_plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription_plan: Self = this.set("subscription_plan", js.undefined)
    
    @scala.inline
    def setSubscription_prorate(value: Boolean): Self = this.set("subscription_prorate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription_prorate: Self = this.set("subscription_prorate", js.undefined)
    
    @scala.inline
    def setSubscription_proration_date(value: Double): Self = this.set("subscription_proration_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription_proration_date: Self = this.set("subscription_proration_date", js.undefined)
    
    @scala.inline
    def setSubscription_quantity(value: Double): Self = this.set("subscription_quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription_quantity: Self = this.set("subscription_quantity", js.undefined)
    
    @scala.inline
    def setSubscription_trial_end(value: Double): Self = this.set("subscription_trial_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription_trial_end: Self = this.set("subscription_trial_end", js.undefined)
  }
}
