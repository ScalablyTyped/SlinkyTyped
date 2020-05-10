package typingsSlinky.stripeV3.stripe

import typingsSlinky.stripeV3.AnonSepadebit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmSepaDebitSetupData extends js.Object {
  /**
    * Pass an object to confirm using data collected by an iban Element or
    * by passing data directly and to supply additional required billing
    * details:
    */
  var payment_method: js.UndefOr[String | AnonSepadebit] = js.native
}

object ConfirmSepaDebitSetupData {
  @scala.inline
  def apply(): ConfirmSepaDebitSetupData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmSepaDebitSetupData]
  }
  @scala.inline
  implicit class ConfirmSepaDebitSetupDataOps[Self <: ConfirmSepaDebitSetupData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayment_method(value: String | AnonSepadebit): Self = {
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

