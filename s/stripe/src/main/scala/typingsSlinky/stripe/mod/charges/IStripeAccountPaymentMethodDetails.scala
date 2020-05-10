package typingsSlinky.stripe.mod.charges

import typingsSlinky.stripe.stripeStrings.stripe_account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStripeAccountPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: stripe_account = js.native
}

object IStripeAccountPaymentMethodDetails {
  @scala.inline
  def apply(`type`: stripe_account): IStripeAccountPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStripeAccountPaymentMethodDetails]
  }
  @scala.inline
  implicit class IStripeAccountPaymentMethodDetailsOps[Self <: IStripeAccountPaymentMethodDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: stripe_account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

