package typingsSlinky.stripe.mod.plans

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlanUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * Whether the plan is currently available for new subscriptions.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * A brief description of the plan, hidden from customers. This can be unset by updating the value to null and then saving.
    */
  var nickname: js.UndefOr[String] = js.native
  /**
    * The product the plan belongs to. Note that after updating, statement descriptors and line items of the plan in active subscriptions will
    * be affected.
    */
  var product: js.UndefOr[String] = js.native
  /**
    * Default number of trial days when subscribing a customer to this plan using `trial_from_plan=true`.
    */
  var trial_period_days: js.UndefOr[Double] = js.native
}

object IPlanUpdateOptions {
  @scala.inline
  def apply(): IPlanUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlanUpdateOptions]
  }
  @scala.inline
  implicit class IPlanUpdateOptionsOps[Self <: IPlanUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNickname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(js.undefined)
        ret
    }
    @scala.inline
    def withTrial_period_days(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trial_period_days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrial_period_days: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trial_period_days")(js.undefined)
        ret
    }
  }
  
}

