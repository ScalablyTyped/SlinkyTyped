package typingsSlinky.stripe

import typingsSlinky.stripe.mod.issuing.cardholders.ICardholderBillingAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddressICardholderBillingAddress extends js.Object {
  var address: ICardholderBillingAddress = js.native
}

object AnonAddressICardholderBillingAddress {
  @scala.inline
  def apply(address: ICardholderBillingAddress): AnonAddressICardholderBillingAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddressICardholderBillingAddress]
  }
  @scala.inline
  implicit class AnonAddressICardholderBillingAddressOps[Self <: AnonAddressICardholderBillingAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: ICardholderBillingAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

