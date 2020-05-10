package typingsSlinky.stripe.mod.subscriptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriptionCreationOptions extends ISubscriptionCustCreationOptions {
  /**
    * A timestamp at which the subscription should cancel. If set to a date before the current period ends
    * this will cause a proration if prorate=true.
    */
  var cancel_at: js.UndefOr[Double | Null] = js.native
  /**
    * Boolean indicating whether this subscription should cancel at the end of the current period.
    */
  var cancel_at_period_end: js.UndefOr[Boolean] = js.native
  /***
    * The identifier of the customer to subscribe.
    */
  var customer: String = js.native
}

object ISubscriptionCreationOptions {
  @scala.inline
  def apply(customer: String): ISubscriptionCreationOptions = {
    val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionCreationOptions]
  }
  @scala.inline
  implicit class ISubscriptionCreationOptionsOps[Self <: ISubscriptionCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancel_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel_at")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel_atNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel_at")(null)
        ret
    }
    @scala.inline
    def withCancel_at_period_end(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel_at_period_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel_at_period_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel_at_period_end")(js.undefined)
        ret
    }
  }
  
}

