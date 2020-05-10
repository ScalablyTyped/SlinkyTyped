package typingsSlinky.shopifyPrime.recurringChargeMod

import typingsSlinky.shopifyPrime.chargeMod.Charge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurringCharge extends Charge {
  /**
    * The date and time the customer activated the charge. Will be null if the charge has not been activated.
    */
  var activated_on: js.UndefOr[String] = js.native
  /**
    * When using usage charges, this value indicates the remaining balance until the capped_amount is reached.
    */
  var balance_remaining: js.UndefOr[Double] = js.native
  /**
    * When using usage charges, this value indicates the total usage charges accrued during the current billing period.
    */
  var balance_used: js.UndefOr[Double] = js.native
  /**
    * The date and time the customer will be billed. Will be null if the charge has not been activated.
    */
  var billing_on: js.UndefOr[String] = js.native
  /**
    * The date and time the customer cancelled their recurring charge. Will be null if the charge has not been cancelled.
    */
  var cancelled_on: js.UndefOr[String] = js.native
  /**
    * The capped amount is the limit a customer can be charged for usage based billing. Note that Shopify returns this value as a string.
    */
  var capped_amount: js.UndefOr[Double | String] = js.native
  /**
    * tates the terms and conditions of usage based billing charges. Must be present in order to create usage charges. These are presented to the merchant when they approve the usage charges for your app.
    */
  var terms: js.UndefOr[String] = js.native
  /**
    * Number of days the customer is eligible for a free trial.
    */
  var trial_days: Double = js.native
  /**
    * The date and time the customer's free trial ends. Will be null if the charge has not been activated.
    */
  var trial_ends_on: js.UndefOr[String] = js.native
}

object RecurringCharge {
  @scala.inline
  def apply(name: String, trial_days: Double): RecurringCharge = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], trial_days = trial_days.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurringCharge]
  }
  @scala.inline
  implicit class RecurringChargeOps[Self <: RecurringCharge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrial_days(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trial_days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivated_on(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activated_on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivated_on: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activated_on")(js.undefined)
        ret
    }
    @scala.inline
    def withBalance_remaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance_remaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBalance_remaining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance_remaining")(js.undefined)
        ret
    }
    @scala.inline
    def withBalance_used(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance_used")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBalance_used: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance_used")(js.undefined)
        ret
    }
    @scala.inline
    def withBilling_on(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling_on: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_on")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelled_on(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled_on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelled_on: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled_on")(js.undefined)
        ret
    }
    @scala.inline
    def withCapped_amount(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capped_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapped_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capped_amount")(js.undefined)
        ret
    }
    @scala.inline
    def withTerms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(js.undefined)
        ret
    }
    @scala.inline
    def withTrial_ends_on(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trial_ends_on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrial_ends_on: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trial_ends_on")(js.undefined)
        ret
    }
  }
  
}

