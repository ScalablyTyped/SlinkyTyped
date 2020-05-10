package typingsSlinky.stripe.mod.charges

import typingsSlinky.stripe.stripeStrings.eps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEpsPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: eps = js.native
}

object IEpsPaymentMethodDetails {
  @scala.inline
  def apply(`type`: eps): IEpsPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEpsPaymentMethodDetails]
  }
  @scala.inline
  implicit class IEpsPaymentMethodDetailsOps[Self <: IEpsPaymentMethodDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: eps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

