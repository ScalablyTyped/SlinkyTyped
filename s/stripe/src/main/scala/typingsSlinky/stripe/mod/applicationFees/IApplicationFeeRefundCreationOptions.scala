package typingsSlinky.stripe.mod.applicationFees

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IApplicationFeeRefundCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A positive integer in pence representing how much of this fee to refund.
    * Can only refund up to the unrefunded amount remaining of the fee.
    *
    * default is entire application fee
    */
  var amount: js.UndefOr[Double] = js.native
}

object IApplicationFeeRefundCreationOptions {
  @scala.inline
  def apply(): IApplicationFeeRefundCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IApplicationFeeRefundCreationOptions]
  }
  @scala.inline
  implicit class IApplicationFeeRefundCreationOptionsOps[Self <: IApplicationFeeRefundCreationOptions] (val x: Self) extends AnyVal {
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

