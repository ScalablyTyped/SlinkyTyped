package typingsSlinky.stripe

import typingsSlinky.stripe.mod.charges.IPaymentMethodDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCharge extends js.Object {
  /** The charge that created this object. */
  var charge: String = js.native
  /** Transaction-specific details of the payment method used in the payment. */
  var payment_method_details: IPaymentMethodDetails = js.native
}

object AnonCharge {
  @scala.inline
  def apply(charge: String, payment_method_details: IPaymentMethodDetails): AnonCharge = {
    val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any], payment_method_details = payment_method_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCharge]
  }
  @scala.inline
  implicit class AnonChargeOps[Self <: AnonCharge] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withPayment_method_details(value: IPaymentMethodDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_details")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

