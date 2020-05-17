package typingsSlinky.stripeV3.stripe

import typingsSlinky.stripeV3.anon.BillingdetailsBillingDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmCardSetupData extends js.Object {
  /*
    * Pass an object to confirm using data collected by a card or
    * cardNumber Element or an with an existing token and to supply
    * additional data relevant to the PaymentMethod, such as billing
    * details:
    */
  var payment_method: js.UndefOr[String | BillingdetailsBillingDetails] = js.native
}

object ConfirmCardSetupData {
  @scala.inline
  def apply(): ConfirmCardSetupData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmCardSetupData]
  }
  @scala.inline
  implicit class ConfirmCardSetupDataOps[Self <: ConfirmCardSetupData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayment_method(value: String | BillingdetailsBillingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method")(js.undefined)
        ret
    }
  }
  
}

