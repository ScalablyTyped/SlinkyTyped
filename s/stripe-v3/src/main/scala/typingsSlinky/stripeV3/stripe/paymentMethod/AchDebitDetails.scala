package typingsSlinky.stripeV3.stripe.paymentMethod

import typingsSlinky.stripeV3.stripeV3Strings.company
import typingsSlinky.stripeV3.stripeV3Strings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchDebitDetails extends js.Object {
  var account_holder_type: individual | company = js.native
  var bank_name: String = js.native
  var country: String = js.native
  var fingerprint: String = js.native
  var last4: String = js.native
  var routing_number: String = js.native
}

object AchDebitDetails {
  @scala.inline
  def apply(
    account_holder_type: individual | company,
    bank_name: String,
    country: String,
    fingerprint: String,
    last4: String,
    routing_number: String
  ): AchDebitDetails = {
    val __obj = js.Dynamic.literal(account_holder_type = account_holder_type.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[AchDebitDetails]
  }
  @scala.inline
  implicit class AchDebitDetailsOps[Self <: AchDebitDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_holder_type(value: individual | company): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_holder_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBank_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bank_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouting_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing_number")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

