package typingsSlinky.stripeV3.anon

import typingsSlinky.stripeV3.stripe.paymentMethod.PaymentMethodDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Charge extends js.Object {
  var charge: js.UndefOr[String | Null] = js.native
  var payment_method_details: js.UndefOr[PaymentMethodDetails | Null] = js.native
}

object Charge {
  @scala.inline
  def apply(): Charge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Charge]
  }
  @scala.inline
  implicit class ChargeOps[Self <: Charge] (val x: Self) extends AnyVal {
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
    def withoutCharge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charge")(js.undefined)
        ret
    }
    @scala.inline
    def withChargeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charge")(null)
        ret
    }
    @scala.inline
    def withPayment_method_details(value: PaymentMethodDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_method_details: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_details")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_method_detailsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_details")(null)
        ret
    }
  }
  
}

