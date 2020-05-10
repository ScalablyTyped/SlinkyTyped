package typingsSlinky.stripejs.paymentMod

import typingsSlinky.stripejs.shippingMod.ShippingAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewShippingAddress extends js.Object {
  /**
    * The customer's selected ShippingAddress.
    */
  var shippingAddress: ShippingAddress = js.native
  /**
    * Calling this function with an UpdateDetails object merges your updates into the
    * current PaymentRequest object.
    */
  def updateWith(dataToUpdate: UpdateOptions): Unit = js.native
}

object NewShippingAddress {
  @scala.inline
  def apply(shippingAddress: ShippingAddress, updateWith: UpdateOptions => Unit): NewShippingAddress = {
    val __obj = js.Dynamic.literal(shippingAddress = shippingAddress.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
    __obj.asInstanceOf[NewShippingAddress]
  }
  @scala.inline
  implicit class NewShippingAddressOps[Self <: NewShippingAddress] (val x: Self) extends AnyVal {
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
    def withUpdateWith(value: UpdateOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateWith")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

