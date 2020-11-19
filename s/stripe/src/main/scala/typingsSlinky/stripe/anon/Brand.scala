package typingsSlinky.stripe.anon

import typingsSlinky.stripe.mod.paymentMethods.CardBrand
import typingsSlinky.stripe.mod.paymentMethods.CardChecks
import typingsSlinky.stripe.mod.paymentMethods.CardWallet
import typingsSlinky.stripe.stripeStrings.credit
import typingsSlinky.stripe.stripeStrings.debit
import typingsSlinky.stripe.stripeStrings.prepaid
import typingsSlinky.stripe.stripeStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Brand extends js.Object {
  
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
  var three_d_secure: js.UndefOr[Authenticated] = js.native
  
  /**
    * If this Card is part of a card wallet, this contains the details of the card wallet.
    */
  var wallet: js.UndefOr[CardWallet] = js.native
}
object Brand {
  
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
  ): Brand = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brand]
  }
  
  @scala.inline
  implicit class BrandOps[Self <: Brand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBrand(value: CardBrand): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecks(value: CardChecks): Self = this.set("checks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExp_month(value: Double): Self = this.set("exp_month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExp_year(value: Double): Self = this.set("exp_year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunding(value: credit | debit | prepaid | unknown_): Self = this.set("funding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast4(value: String): Self = this.set("last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThree_d_secure(value: Authenticated): Self = this.set("three_d_secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThree_d_secure: Self = this.set("three_d_secure", js.undefined)
    
    @scala.inline
    def setWallet(value: CardWallet): Self = this.set("wallet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWallet: Self = this.set("wallet", js.undefined)
  }
}
