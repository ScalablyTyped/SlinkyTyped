package typingsSlinky.stripeV3.stripe.paymentMethod

import typingsSlinky.stripeV3.stripeV3Strings.de
import typingsSlinky.stripeV3.stripeV3Strings.en
import typingsSlinky.stripeV3.stripeV3Strings.fr
import typingsSlinky.stripeV3.stripeV3Strings.nl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BanContactDetails extends js.Object {
  var bank_code: String = js.native
  var bank_name: String = js.native
  var bic: String = js.native
  var iban_last4: String = js.native
  var preferred_language: en | de | fr | nl = js.native
  var verified_name: String = js.native
}

object BanContactDetails {
  @scala.inline
  def apply(
    bank_code: String,
    bank_name: String,
    bic: String,
    iban_last4: String,
    preferred_language: en | de | fr | nl,
    verified_name: String
  ): BanContactDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], bic = bic.asInstanceOf[js.Any], iban_last4 = iban_last4.asInstanceOf[js.Any], preferred_language = preferred_language.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BanContactDetails]
  }
  @scala.inline
  implicit class BanContactDetailsOps[Self <: BanContactDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBank_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bank_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBank_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bank_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIban_last4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iban_last4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferred_language(value: en | de | fr | nl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred_language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

