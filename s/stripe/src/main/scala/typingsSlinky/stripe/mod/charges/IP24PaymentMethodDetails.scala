package typingsSlinky.stripe.mod.charges

import typingsSlinky.stripe.stripeStrings.p24
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IP24PaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: p24 = js.native
}

object IP24PaymentMethodDetails {
  @scala.inline
  def apply(`type`: p24): IP24PaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IP24PaymentMethodDetails]
  }
  @scala.inline
  implicit class IP24PaymentMethodDetailsOps[Self <: IP24PaymentMethodDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: p24): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

