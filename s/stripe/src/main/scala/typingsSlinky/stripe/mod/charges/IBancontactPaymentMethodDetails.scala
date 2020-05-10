package typingsSlinky.stripe.mod.charges

import typingsSlinky.stripe.stripeStrings.bancontact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBancontactPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: bancontact = js.native
}

object IBancontactPaymentMethodDetails {
  @scala.inline
  def apply(`type`: bancontact): IBancontactPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBancontactPaymentMethodDetails]
  }
  @scala.inline
  implicit class IBancontactPaymentMethodDetailsOps[Self <: IBancontactPaymentMethodDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: bancontact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

