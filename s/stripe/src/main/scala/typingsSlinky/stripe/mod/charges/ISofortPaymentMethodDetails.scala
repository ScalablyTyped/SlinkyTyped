package typingsSlinky.stripe.mod.charges

import typingsSlinky.stripe.stripeStrings.sofort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISofortPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: sofort = js.native
}

object ISofortPaymentMethodDetails {
  @scala.inline
  def apply(`type`: sofort): ISofortPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISofortPaymentMethodDetails]
  }
  @scala.inline
  implicit class ISofortPaymentMethodDetailsOps[Self <: ISofortPaymentMethodDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: sofort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

