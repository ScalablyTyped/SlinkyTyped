package typingsSlinky.stripe.mod.issuing.authorizations

import typingsSlinky.stripe.stripeStrings.`match`
import typingsSlinky.stripe.stripeStrings.exempt
import typingsSlinky.stripe.stripeStrings.failure
import typingsSlinky.stripe.stripeStrings.mismatch
import typingsSlinky.stripe.stripeStrings.none
import typingsSlinky.stripe.stripeStrings.not_provided
import typingsSlinky.stripe.stripeStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerificationData extends js.Object {
  /**
    * One of match, mismatch, or not_provided.
    */
  var address_line1_check: `match` | mismatch | not_provided = js.native
  /**
    * One of match, mismatch, or not_provided.
    */
  var address_zip_check: `match` | mismatch | not_provided = js.native
  /**
    * One of exempt, failure, none, or success.
    */
  var authentication: exempt | failure | none | success = js.native
  /**
    * One of match, mismatch, or not_provided.
    */
  var cvc_check: `match` | mismatch | not_provided = js.native
}

object VerificationData {
  @scala.inline
  def apply(
    address_line1_check: `match` | mismatch | not_provided,
    address_zip_check: `match` | mismatch | not_provided,
    authentication: exempt | failure | none | success,
    cvc_check: `match` | mismatch | not_provided
  ): VerificationData = {
    val __obj = js.Dynamic.literal(address_line1_check = address_line1_check.asInstanceOf[js.Any], address_zip_check = address_zip_check.asInstanceOf[js.Any], authentication = authentication.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerificationData]
  }
  @scala.inline
  implicit class VerificationDataOps[Self <: VerificationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress_line1_check(value: `match` | mismatch | not_provided): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_line1_check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress_zip_check(value: `match` | mismatch | not_provided): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_zip_check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthentication(value: exempt | failure | none | success): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCvc_check(value: `match` | mismatch | not_provided): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvc_check")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

