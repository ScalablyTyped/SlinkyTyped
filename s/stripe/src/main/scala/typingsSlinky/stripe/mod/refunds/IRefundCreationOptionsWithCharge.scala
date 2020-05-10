package typingsSlinky.stripe.mod.refunds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRefundCreationOptionsWithCharge extends IRefundCreationOptions {
  /**
    * The identifier of the charge to refund.
    */
  var charge: String = js.native
}

object IRefundCreationOptionsWithCharge {
  @scala.inline
  def apply(charge: String): IRefundCreationOptionsWithCharge = {
    val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRefundCreationOptionsWithCharge]
  }
  @scala.inline
  implicit class IRefundCreationOptionsWithChargeOps[Self <: IRefundCreationOptionsWithCharge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charge")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

