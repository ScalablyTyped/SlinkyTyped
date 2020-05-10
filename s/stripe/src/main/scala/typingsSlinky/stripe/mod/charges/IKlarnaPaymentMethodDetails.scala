package typingsSlinky.stripe.mod.charges

import typingsSlinky.stripe.stripeStrings.klarna
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKlarnaPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: klarna = js.native
}

object IKlarnaPaymentMethodDetails {
  @scala.inline
  def apply(`type`: klarna): IKlarnaPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKlarnaPaymentMethodDetails]
  }
  @scala.inline
  implicit class IKlarnaPaymentMethodDetailsOps[Self <: IKlarnaPaymentMethodDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: klarna): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

