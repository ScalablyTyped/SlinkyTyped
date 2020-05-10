package typingsSlinky.stripe

import typingsSlinky.stripe.mod.paymentMethods.CardBrand
import typingsSlinky.stripe.mod.paymentMethods.CardChecks
import typingsSlinky.stripe.mod.paymentMethods.CardWallet
import typingsSlinky.stripe.stripeStrings.credit
import typingsSlinky.stripe.stripeStrings.debit
import typingsSlinky.stripe.stripeStrings.prepaid
import typingsSlinky.stripe.stripeStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBrand extends js.Object {
  /**
    * Card brand. Can be `amex`, `diners`, `discover`, `jcb`, `mastercard`, `unionpay`, `visa`, or `unknown`.
    */
  var brand: CardBrand = js.native
  /**
    * Check results by Card networks on Card address and CVC at time of payment.
    */
  var checks: CardChecks = js.native
  /**
    * Two-letter ISO code representing the country of the card. You could use this attribute to get a sense of
    * the international breakdown of cards you’ve collected.
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
    * Uniquely identifies this particular card number. You can use this attribute to check whether two
    * customers who’ve signed up with you are using the same card number, for example.
    */
  var fingerprint: String = js.native
  /**
    * Card funding type. Can be credit, debit, prepaid, or unknown.
    */
  var funding: credit | debit | prepaid | unknown_ = js.native
  /**
    * The last four digits of the card.
    */
  var last4: String = js.native
  /**
    * Populated if this transaction used 3D Secure authentication.
    */
  var three_d_secure: js.UndefOr[AnonAuthenticated] = js.native
  /**
    * If this Card is part of a card wallet, this contains the details of the card wallet.
    */
  var wallet: js.UndefOr[CardWallet] = js.native
}

object AnonBrand {
  @scala.inline
  def apply(
    brand: CardBrand,
    checks: CardChecks,
    country: String,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: credit | debit | prepaid | unknown_,
    last4: String
  ): AnonBrand = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBrand]
  }
  @scala.inline
  implicit class AnonBrandOps[Self <: AnonBrand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrand(value: CardBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecks(value: CardChecks): Self = {
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
    def withFunding(value: credit | debit | prepaid | unknown_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThree_d_secure(value: AnonAuthenticated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("three_d_secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThree_d_secure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("three_d_secure")(js.undefined)
        ret
    }
    @scala.inline
    def withWallet(value: CardWallet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wallet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWallet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wallet")(js.undefined)
        ret
    }
  }
  
}

