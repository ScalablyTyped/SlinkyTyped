package typingsSlinky.shopifyPrime.appliedDiscountMod

import typingsSlinky.shopifyPrime.shopifyPrimeStrings.fixed_amount
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.percentage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppliedDiscount extends js.Object {
  /**
    * The applied amount of the discount, based on the setting of value_type.
    * When ValueType is set to fixed_amount discount amount = quantity * value
    * When ValueType is set to percentage discount amount = floor(price * quantity * value) / 100
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * Reason for the discount.
    */
  var description: String = js.native
  /**
    * Title of the discount.
    */
  var title: String = js.native
  /**
    * he value of the discount. If the type of the discount is fixed_amount, then this is a fixed dollar amount. If the type is percentage, then this is the percentage.
    */
  var value: String = js.native
  /**
    * The type of discount. Known values are "percentage" and "fixed_amount".
    */
  var value_type: percentage | fixed_amount = js.native
}

object AppliedDiscount {
  @scala.inline
  def apply(description: String, title: String, value: String, value_type: percentage | fixed_amount): AppliedDiscount = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], value_type = value_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppliedDiscount]
  }
  @scala.inline
  implicit class AppliedDiscountOps[Self <: AppliedDiscount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue_type(value: percentage | fixed_amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
  }
  
}

