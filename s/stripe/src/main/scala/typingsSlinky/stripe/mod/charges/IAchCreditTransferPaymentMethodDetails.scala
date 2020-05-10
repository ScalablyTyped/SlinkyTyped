package typingsSlinky.stripe.mod.charges

import typingsSlinky.stripe.AnonAccountnumber
import typingsSlinky.stripe.stripeStrings.ach_credit_transfer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAchCreditTransferPaymentMethodDetails extends IPaymentMethodDetails {
  var ach_credit_transfer: AnonAccountnumber = js.native
  var `type`: ach_credit_transfer = js.native
}

object IAchCreditTransferPaymentMethodDetails {
  @scala.inline
  def apply(ach_credit_transfer: AnonAccountnumber, `type`: ach_credit_transfer): IAchCreditTransferPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(ach_credit_transfer = ach_credit_transfer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAchCreditTransferPaymentMethodDetails]
  }
  @scala.inline
  implicit class IAchCreditTransferPaymentMethodDetailsOps[Self <: IAchCreditTransferPaymentMethodDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAch_credit_transfer(value: AnonAccountnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ach_credit_transfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ach_credit_transfer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

