package typingsSlinky.stripe.mod.charges

import typingsSlinky.stripe.stripeStrings.ach_debit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAchDebitPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: ach_debit = js.native
}

object IAchDebitPaymentMethodDetails {
  @scala.inline
  def apply(`type`: ach_debit): IAchDebitPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAchDebitPaymentMethodDetails]
  }
  @scala.inline
  implicit class IAchDebitPaymentMethodDetailsOps[Self <: IAchDebitPaymentMethodDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: ach_debit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

