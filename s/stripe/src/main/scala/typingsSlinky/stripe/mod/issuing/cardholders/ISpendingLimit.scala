package typingsSlinky.stripe.mod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Limit the spending with rules based on time intervals and categories.
  */
@js.native
trait ISpendingLimit extends js.Object {
  /**
    * Maximum amount allowed to spend per time interval.
    */
  var amount: Double = js.native
  /**
    * Array of strings containing categories on which to apply the spending limit. Leave this blank to limit all charges.
    */
  var categories: js.Array[String] = js.native
  /**
    * The time interval with which to apply this spending limit towards. Allowed values are per_authorization, daily, weekly, monthly, yearly, or all_time.
    */
  var interval: SpendingLimitInterval = js.native
}

object ISpendingLimit {
  @scala.inline
  def apply(amount: Double, categories: js.Array[String], interval: SpendingLimitInterval): ISpendingLimit = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpendingLimit]
  }
  @scala.inline
  implicit class ISpendingLimitOps[Self <: ISpendingLimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: SpendingLimitInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

