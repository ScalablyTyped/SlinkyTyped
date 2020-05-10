package typingsSlinky.stripejs.paymentMod

import typingsSlinky.stripejs.shippingMod.ShippingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewShippingOptions extends js.Object {
  /**
    * The selected shipping option
    */
  var shippingOption: ShippingOption = js.native
  /**
    * Calling this function with an UpdateDetails object merges your updates into the
    * current PaymentRequest object.
    */
  def updateWith(dataToUpdate: UpdateOptions): Unit = js.native
}

object NewShippingOptions {
  @scala.inline
  def apply(shippingOption: ShippingOption, updateWith: UpdateOptions => Unit): NewShippingOptions = {
    val __obj = js.Dynamic.literal(shippingOption = shippingOption.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
    __obj.asInstanceOf[NewShippingOptions]
  }
  @scala.inline
  implicit class NewShippingOptionsOps[Self <: NewShippingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShippingOption(value: ShippingOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOption")(value.asInstanceOf[js.Any])
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

