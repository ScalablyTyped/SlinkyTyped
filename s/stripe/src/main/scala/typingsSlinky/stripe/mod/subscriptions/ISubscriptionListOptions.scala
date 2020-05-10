package typingsSlinky.stripe.mod.subscriptions

import typingsSlinky.stripe.mod.IListOptionsCreated
import typingsSlinky.stripe.stripeStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriptionListOptions extends IListOptionsCreated {
  /**
    * The billing mode of the subscriptions to retrieve. Either "charge_automatically" or "send_invoice".
    */
  var billing: js.UndefOr[SubscriptionBilling] = js.native
  /**
    * The ID of the customer whose subscriptions will be retrieved
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * The ID of the plan whose subscriptions will be retrieved
    */
  var plan: js.UndefOr[String] = js.native
  /**
    * The status of the subscriptions to retrieve.
    */
  var status: js.UndefOr[SubscriptionStatus | all] = js.native
}

object ISubscriptionListOptions {
  @scala.inline
  def apply(): ISubscriptionListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubscriptionListOptions]
  }
  @scala.inline
  implicit class ISubscriptionListOptionsOps[Self <: ISubscriptionListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBilling(value: SubscriptionBilling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing")(js.undefined)
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
    def withPlan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SubscriptionStatus | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

