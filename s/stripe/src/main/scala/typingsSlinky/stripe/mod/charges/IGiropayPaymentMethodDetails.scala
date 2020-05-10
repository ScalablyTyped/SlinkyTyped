package typingsSlinky.stripe.mod.charges

import typingsSlinky.stripe.stripeStrings.giropay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGiropayPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: giropay = js.native
}

object IGiropayPaymentMethodDetails {
  @scala.inline
  def apply(`type`: giropay): IGiropayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGiropayPaymentMethodDetails]
  }
  @scala.inline
  implicit class IGiropayPaymentMethodDetailsOps[Self <: IGiropayPaymentMethodDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: giropay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

