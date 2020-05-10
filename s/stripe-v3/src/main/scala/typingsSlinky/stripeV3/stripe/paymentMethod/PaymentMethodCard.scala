package typingsSlinky.stripeV3.stripe.paymentMethod

import typingsSlinky.stripeV3.AnonAddressline1check
import typingsSlinky.stripeV3.AnonAmexexpresscheckout
import typingsSlinky.stripeV3.AnonCharge
import typingsSlinky.stripeV3.AnonSupported
import typingsSlinky.stripeV3.stripe.fundingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodCard extends js.Object {
  /**
    * Card brand
    */
  var brand: paymentMethodCardBrand = js.native
  /**
    * Checks on Card address and CVC if provided.
    */
  var checks: AnonAddressline1check = js.native
  /**
    * Two-letter ISO code representing the country of the card. You
    * could use this attribute to get a sense of the international
    * breakdown of cards you’ve collected.
    */
  var country: String = js.native
  /**
    * Two-digit number representing the card’s expiration month.
    */
  var exp_month: Double = js.native
  /**
    * Four-digit number representing the card’s expiration year.
    */
  var exp_year: Double = js.native
  /**
    * Uniquely identifies this particular card number. You can use
    * this attribute to check whether two customers who’ve signed
    * up with you are using the same card number, for example.
    */
  var fingerprint: String = js.native
  /**
    * Card funding type
    */
  var funding: fundingType = js.native
  /**
    * Details of the original PaymentMethod that created this object.
    */
  var generated_from: AnonCharge = js.native
  /**
    * The last four digits of the card.
    */
  var last4: String = js.native
  /**
    * Contains details on how this Card maybe be used for 3D Secure authentication.
    */
  var three_d_secure_usage: js.UndefOr[AnonSupported] = js.native
  /**
    * If this Card is part of a card wallet, this contains the details of
    * the card wallet.
    */
  var wallet: AnonAmexexpresscheckout | Null = js.native
}

object PaymentMethodCard {
  @scala.inline
  def apply(
    brand: paymentMethodCardBrand,
    checks: AnonAddressline1check,
    country: String,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: fundingType,
    generated_from: AnonCharge,
    last4: String
  ): PaymentMethodCard = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], generated_from = generated_from.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodCard]
  }
  @scala.inline
  implicit class PaymentMethodCardOps[Self <: PaymentMethodCard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrand(value: paymentMethodCardBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecks(value: AnonAddressline1check): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExp_month(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExp_year(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunding(value: fundingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerated_from(value: AnonCharge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generated_from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThree_d_secure_usage(value: AnonSupported): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("three_d_secure_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThree_d_secure_usage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("three_d_secure_usage")(js.undefined)
        ret
    }
    @scala.inline
    def withWallet(value: AnonAmexexpresscheckout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wallet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWalletNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wallet")(null)
        ret
    }
  }
  
}

