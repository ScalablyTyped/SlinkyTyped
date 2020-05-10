package typingsSlinky.stripe.mod.taxRates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITaxAmount extends js.Object {
  /**
    * The amount, in cents, of the tax.
    */
  var amount: Double = js.native
  /**
    * Whether this tax amount is inclusive or exclusive.
    */
  var inclusive: Boolean = js.native
  /**
    * The tax rate that was applied to get this tax amount.
    */
  var tax_rate: String | ITaxRate = js.native
}

object ITaxAmount {
  @scala.inline
  def apply(amount: Double, inclusive: Boolean, tax_rate: String | ITaxRate): ITaxAmount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], tax_rate = tax_rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaxAmount]
  }
  @scala.inline
  implicit class ITaxAmountOps[Self <: ITaxAmount] (val x: Self) extends AnyVal {
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
    def withInclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTax_rate(value: String | ITaxRate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_rate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

