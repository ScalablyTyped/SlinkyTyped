package typingsSlinky.stripeV3.stripe

import typingsSlinky.stripeV3.AnonBillingdetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleCardSetupOptions extends js.Object {
  /**
    * Use this parameter to supply additional data relevant to
    * the payment method, such as billing details.
    */
  var payment_method_data: js.UndefOr[AnonBillingdetails] = js.native
}

object HandleCardSetupOptions {
  @scala.inline
  def apply(): HandleCardSetupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleCardSetupOptions]
  }
  @scala.inline
  implicit class HandleCardSetupOptionsOps[Self <: HandleCardSetupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayment_method_data(value: AnonBillingdetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_method_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_data")(js.undefined)
        ret
    }
  }
  
}

