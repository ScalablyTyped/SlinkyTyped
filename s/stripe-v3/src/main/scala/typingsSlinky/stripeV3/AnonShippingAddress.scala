package typingsSlinky.stripeV3

import typingsSlinky.stripeV3.stripe.paymentRequest.ShippingAddress
import typingsSlinky.stripeV3.stripe.paymentRequest.UpdateDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShippingAddress extends js.Object {
  var shippingAddress: ShippingAddress = js.native
  def updateWith(options: UpdateDetails): Unit = js.native
}

object AnonShippingAddress {
  @scala.inline
  def apply(shippingAddress: ShippingAddress, updateWith: UpdateDetails => Unit): AnonShippingAddress = {
    val __obj = js.Dynamic.literal(shippingAddress = shippingAddress.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
    __obj.asInstanceOf[AnonShippingAddress]
  }
  @scala.inline
  implicit class AnonShippingAddressOps[Self <: AnonShippingAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShippingAddress(value: ShippingAddress): Self = {
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

