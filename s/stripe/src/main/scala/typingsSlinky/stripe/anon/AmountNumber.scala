package typingsSlinky.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmountNumber extends js.Object {
  /**
    * The amount that will be transferred automatically when a charge succeeds. The amount is capped at the total transaction amount and if no amount is set, the full amount is transferred.
    * If you intend to collect a fee and you need a more robust reporting experience, using application_fee_amount might be a better fit for your integration.
    */
  var amount: js.UndefOr[Double] = js.native
}

object AmountNumber {
  @scala.inline
  def apply(): AmountNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmountNumber]
  }
  @scala.inline
  implicit class AmountNumberOps[Self <: AmountNumber] (val x: Self) extends AnyVal {
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
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
  }
  
}

