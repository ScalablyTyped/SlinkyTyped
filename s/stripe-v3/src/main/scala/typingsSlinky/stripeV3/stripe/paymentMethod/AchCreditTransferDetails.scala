package typingsSlinky.stripeV3.stripe.paymentMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchCreditTransferDetails extends js.Object {
  var account_number: String = js.native
  var bank_name: String = js.native
  var routing_number: String = js.native
  var swift_coode: String = js.native
}

object AchCreditTransferDetails {
  @scala.inline
  def apply(account_number: String, bank_name: String, routing_number: String, swift_coode: String): AchCreditTransferDetails = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], swift_coode = swift_coode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AchCreditTransferDetails]
  }
  @scala.inline
  implicit class AchCreditTransferDetailsOps[Self <: AchCreditTransferDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBank_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bank_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouting_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwift_coode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swift_coode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

