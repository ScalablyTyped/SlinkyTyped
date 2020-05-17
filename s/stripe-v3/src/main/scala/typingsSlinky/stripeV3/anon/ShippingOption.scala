package typingsSlinky.stripeV3.anon

import typingsSlinky.stripeV3.stripe.paymentRequest.UpdateDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingOption extends js.Object {
  var shippingOption: typingsSlinky.stripeV3.stripe.paymentRequest.ShippingOption = js.native
  def updateWith(options: UpdateDetails): Unit = js.native
}

object ShippingOption {
  @scala.inline
  def apply(
    shippingOption: typingsSlinky.stripeV3.stripe.paymentRequest.ShippingOption,
    updateWith: UpdateDetails => Unit
  ): ShippingOption = {
    val __obj = js.Dynamic.literal(shippingOption = shippingOption.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
    __obj.asInstanceOf[ShippingOption]
  }
  @scala.inline
  implicit class ShippingOptionOps[Self <: ShippingOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShippingOption(value: typingsSlinky.stripeV3.stripe.paymentRequest.ShippingOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateWith(value: UpdateDetails => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateWith")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

