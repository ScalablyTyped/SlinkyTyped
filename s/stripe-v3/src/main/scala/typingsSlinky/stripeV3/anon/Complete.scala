package typingsSlinky.stripeV3.anon

import typingsSlinky.stripeV3.stripe.elements.PaymentRequestButtonStyleOptions
import typingsSlinky.stripeV3.stripe.elements.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Complete extends js.Object {
  var base: js.UndefOr[Style] = js.native
  var complete: js.UndefOr[Style] = js.native
  var empty: js.UndefOr[Style] = js.native
  var invalid: js.UndefOr[Style] = js.native
  var paymentRequestButton: js.UndefOr[PaymentRequestButtonStyleOptions] = js.native
}

object Complete {
  @scala.inline
  def apply(): Complete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Complete]
  }
  @scala.inline
  implicit class CompleteOps[Self <: Complete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withEmpty(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalid(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentRequestButton(value: PaymentRequestButtonStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentRequestButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentRequestButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentRequestButton")(js.undefined)
        ret
    }
  }
  
}

