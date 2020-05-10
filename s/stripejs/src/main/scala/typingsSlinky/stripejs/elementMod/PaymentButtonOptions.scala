package typingsSlinky.stripejs.elementMod

import typingsSlinky.stripejs.AnonBase
import typingsSlinky.stripejs.AnonComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentButtonOptions extends js.Object {
  /**
    * Set custom class names on the container DOM element when the Stripe Element is in a
    * particular state.
    */
  var classes: js.UndefOr[AnonBase] = js.native
  var paymentRequest: js.Any = js.native
  var style: js.UndefOr[AnonComplete] = js.native
}

object PaymentButtonOptions {
  @scala.inline
  def apply(paymentRequest: js.Any): PaymentButtonOptions = {
    val __obj = js.Dynamic.literal(paymentRequest = paymentRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentButtonOptions]
  }
  @scala.inline
  implicit class PaymentButtonOptionsOps[Self <: PaymentButtonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaymentRequest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClasses(value: AnonBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: AnonComplete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

