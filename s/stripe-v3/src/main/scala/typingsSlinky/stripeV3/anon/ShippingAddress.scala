package typingsSlinky.stripeV3.anon

import typingsSlinky.stripeV3.stripe.paymentRequest.UpdateDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingAddress extends js.Object {
  var shippingAddress: typingsSlinky.stripeV3.stripe.paymentRequest.ShippingAddress = js.native
  def updateWith(options: UpdateDetails): Unit = js.native
}

object ShippingAddress {
  @scala.inline
  def apply(
    shippingAddress: typingsSlinky.stripeV3.stripe.paymentRequest.ShippingAddress,
    updateWith: UpdateDetails => Unit
  ): ShippingAddress = {
    val __obj = js.Dynamic.literal(shippingAddress = shippingAddress.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
    __obj.asInstanceOf[ShippingAddress]
  }
  @scala.inline
  implicit class ShippingAddressOps[Self <: ShippingAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShippingAddress(value: typingsSlinky.stripeV3.stripe.paymentRequest.ShippingAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddress")(value.asInstanceOf[js.Any])
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

