package typingsSlinky.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeStatic extends js.Object {
  var applePay: StripeApplePay = js.native
  var bankAccount: StripeBankAccount = js.native
  var card: StripeCard = js.native
  def cardType(cardNumber: String): StripeCardDataBrand = js.native
  def createToken(
    data: StripeCardTokenData,
    responseHandler: js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]
  ): Unit = js.native
  def getToken(
    token: String,
    responseHandler: js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]
  ): Unit = js.native
  def setPublishableKey(key: String): Unit = js.native
  def validateCVC(cardCVC: String): Boolean = js.native
  def validateCardNumber(cardNumber: String): Boolean = js.native
  def validateExpiry(month: String, year: String): Boolean = js.native
}

object StripeStatic {
  @scala.inline
  def apply(
    applePay: StripeApplePay,
    bankAccount: StripeBankAccount,
    card: StripeCard,
    cardType: String => StripeCardDataBrand,
    createToken: (StripeCardTokenData, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Unit,
    getToken: (String, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Unit,
    setPublishableKey: String => Unit,
    validateCVC: String => Boolean,
    validateCardNumber: String => Boolean,
    validateExpiry: (String, String) => Boolean
  ): StripeStatic = {
    val __obj = js.Dynamic.literal(applePay = applePay.asInstanceOf[js.Any], bankAccount = bankAccount.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], cardType = js.Any.fromFunction1(cardType), createToken = js.Any.fromFunction2(createToken), getToken = js.Any.fromFunction2(getToken), setPublishableKey = js.Any.fromFunction1(setPublishableKey), validateCVC = js.Any.fromFunction1(validateCVC), validateCardNumber = js.Any.fromFunction1(validateCardNumber), validateExpiry = js.Any.fromFunction2(validateExpiry))
    __obj.asInstanceOf[StripeStatic]
  }
  @scala.inline
  implicit class StripeStaticOps[Self <: StripeStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplePay(value: StripeApplePay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applePay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBankAccount(value: StripeBankAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bankAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCard(value: StripeCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardType(value: String => StripeCardDataBrand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateToken(
      value: (StripeCardTokenData, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createToken")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetToken(
      value: (String, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToken")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetPublishableKey(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPublishableKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidateCVC(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateCVC")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidateCardNumber(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateCardNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidateExpiry(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateExpiry")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

