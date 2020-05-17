package typingsSlinky.stripe.anon

import typingsSlinky.stripe.stripeStrings.active
import typingsSlinky.stripe.stripeStrings.inactive
import typingsSlinky.stripe.stripeStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cardpayments extends js.Object {
  /**
    * The status of the card payments capability of the account, or whether
    * the account can directly process credit and debit card charges.
    */
  var card_payments: js.UndefOr[active | inactive | pending] = js.native
  /**
    * The status of the legacy payments capability of the account.
    */
  var legacy_payments: js.UndefOr[active | inactive | pending] = js.native
  /**
    * The status of the transfers capability of the account, or whether your
    * platform can transfer funds to the account.
    */
  var transfers: js.UndefOr[active | inactive | pending] = js.native
}

object Cardpayments {
  @scala.inline
  def apply(): Cardpayments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cardpayments]
  }
  @scala.inline
  implicit class CardpaymentsOps[Self <: Cardpayments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCard_payments(value: active | inactive | pending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card_payments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCard_payments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card_payments")(js.undefined)
        ret
    }
    @scala.inline
    def withLegacy_payments(value: active | inactive | pending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacy_payments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegacy_payments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacy_payments")(js.undefined)
        ret
    }
    @scala.inline
    def withTransfers(value: active | inactive | pending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransfers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfers")(js.undefined)
        ret
    }
  }
  
}

