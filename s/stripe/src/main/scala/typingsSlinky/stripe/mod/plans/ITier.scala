package typingsSlinky.stripe.mod.plans

import typingsSlinky.stripe.stripeStrings.inf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITier extends js.Object {
  /**
    * Price for the entire tier.
    */
  var flat_amount: js.UndefOr[Double | Null] = js.native
  /**
    * Same as `flat_amount`, but contains a decimal value with at most 12 decimal places.
    */
  var flat_amount_decimal: js.UndefOr[Double | Null] = js.native
  /**
    * Per unit price for units relevant to the tier.
    */
  var unit_amount: js.UndefOr[Double | Null] = js.native
  /**
    * Same as `unit_amount`, but contains a decimal value with at most 12 decimal places.
    */
  var unit_amount_decimal: js.UndefOr[Double | Null] = js.native
  /**
    * Up to and including to this quantity will be contained in the tier.
    */
  var up_to: Double | Null | inf = js.native
}

object ITier {
  @scala.inline
  def apply(): ITier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITier]
  }
  @scala.inline
  implicit class ITierOps[Self <: ITier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlat_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlat_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat_amount")(js.undefined)
        ret
    }
    @scala.inline
    def withFlat_amountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat_amount")(null)
        ret
    }
    @scala.inline
    def withFlat_amount_decimal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat_amount_decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlat_amount_decimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat_amount_decimal")(js.undefined)
        ret
    }
    @scala.inline
    def withFlat_amount_decimalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat_amount_decimal")(null)
        ret
    }
    @scala.inline
    def withUnit_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit_amount")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit_amountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit_amount")(null)
        ret
    }
    @scala.inline
    def withUnit_amount_decimal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit_amount_decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit_amount_decimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit_amount_decimal")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit_amount_decimalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit_amount_decimal")(null)
        ret
    }
    @scala.inline
    def withUp_to(value: Double | inf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUp_toNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up_to")(null)
        ret
    }
  }
  
}

