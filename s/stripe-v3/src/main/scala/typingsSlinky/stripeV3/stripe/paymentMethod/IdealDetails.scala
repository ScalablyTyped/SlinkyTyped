package typingsSlinky.stripeV3.stripe.paymentMethod

import typingsSlinky.stripeV3.stripeV3Strings.abn_amro
import typingsSlinky.stripeV3.stripeV3Strings.asn_bank
import typingsSlinky.stripeV3.stripeV3Strings.bunq
import typingsSlinky.stripeV3.stripeV3Strings.handelsbanken
import typingsSlinky.stripeV3.stripeV3Strings.ing
import typingsSlinky.stripeV3.stripeV3Strings.knab
import typingsSlinky.stripeV3.stripeV3Strings.moneyou
import typingsSlinky.stripeV3.stripeV3Strings.rabobank
import typingsSlinky.stripeV3.stripeV3Strings.regiobank
import typingsSlinky.stripeV3.stripeV3Strings.sns_bank
import typingsSlinky.stripeV3.stripeV3Strings.triodos_bank
import typingsSlinky.stripeV3.stripeV3Strings.van_lanschot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdealDetails extends js.Object {
  var bank: abn_amro | asn_bank | bunq | handelsbanken | ing | knab | moneyou | rabobank | regiobank | sns_bank | triodos_bank | van_lanschot = js.native
  var bic: String = js.native
  var iban_last4: String = js.native
  var verified_name: String = js.native
}

object IdealDetails {
  @scala.inline
  def apply(
    bank: abn_amro | asn_bank | bunq | handelsbanken | ing | knab | moneyou | rabobank | regiobank | sns_bank | triodos_bank | van_lanschot,
    bic: String,
    iban_last4: String,
    verified_name: String
  ): IdealDetails = {
    val __obj = js.Dynamic.literal(bank = bank.asInstanceOf[js.Any], bic = bic.asInstanceOf[js.Any], iban_last4 = iban_last4.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdealDetails]
  }
  @scala.inline
  implicit class IdealDetailsOps[Self <: IdealDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBank(
      value: abn_amro | asn_bank | bunq | handelsbanken | ing | knab | moneyou | rabobank | regiobank | sns_bank | triodos_bank | van_lanschot
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bank")(value.asInstanceOf[js.Any])
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
    def withVerified_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

