package typingsSlinky.stripeV3.stripe.paymentMethod

import typingsSlinky.stripeV3.stripeV3Strings.ach_credit_transfer
import typingsSlinky.stripeV3.stripeV3Strings.ach_debit
import typingsSlinky.stripeV3.stripeV3Strings.alipay
import typingsSlinky.stripeV3.stripeV3Strings.bancontact
import typingsSlinky.stripeV3.stripeV3Strings.card
import typingsSlinky.stripeV3.stripeV3Strings.eps
import typingsSlinky.stripeV3.stripeV3Strings.giropay
import typingsSlinky.stripeV3.stripeV3Strings.ideal
import typingsSlinky.stripeV3.stripeV3Strings.multibanco
import typingsSlinky.stripeV3.stripeV3Strings.p24
import typingsSlinky.stripeV3.stripeV3Strings.sepa_debit
import typingsSlinky.stripeV3.stripeV3Strings.sofort
import typingsSlinky.stripeV3.stripeV3Strings.stripe_account
import typingsSlinky.stripeV3.stripeV3Strings.wechat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the payment method at the time of the transaction.
  */
@js.native
trait PaymentMethodDetails extends js.Object {
  var ach_credit_transfer: js.UndefOr[AchCreditTransferDetails | Null] = js.native
  var ach_debit: js.UndefOr[AchDebitDetails | Null] = js.native
  var alipay: js.UndefOr[js.Any | Null] = js.native
  var bancontact: js.UndefOr[BanContactDetails | Null] = js.native
  var card: js.UndefOr[PaymentMethodCard | Null] = js.native
  var eps: js.UndefOr[EpsDetails | Null] = js.native
  var giropay: js.UndefOr[GiropayDetails | Null] = js.native
  var ideal: js.UndefOr[IdealDetails | Null] = js.native
  var multibanco: js.UndefOr[MultibancoDetails | Null] = js.native
  var p24: js.UndefOr[P24Details | Null] = js.native
  var sepa_debit: js.UndefOr[SepaDebitDetails | Null] = js.native
  var sofort: js.UndefOr[SofortDetails | Null] = js.native
  var stripe_account: js.UndefOr[js.Any | Null] = js.native
  /**
    * The type of transaction-specific details of the payment method used in the payment
    */
  var `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | stripe_account | wechat = js.native
  var wechat: js.UndefOr[js.Any | Null] = js.native
}

object PaymentMethodDetails {
  @scala.inline
  def apply(
    `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | stripe_account | wechat
  ): PaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodDetails]
  }
  @scala.inline
  implicit class PaymentMethodDetailsOps[Self <: PaymentMethodDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(
      value: ach_credit_transfer | ach_debit | alipay | bancontact | card | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | stripe_account | wechat
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAch_credit_transfer(value: AchCreditTransferDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ach_credit_transfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAch_credit_transfer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ach_credit_transfer")(js.undefined)
        ret
    }
    @scala.inline
    def withAch_credit_transferNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ach_credit_transfer")(null)
        ret
    }
    @scala.inline
    def withAch_debit(value: AchDebitDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ach_debit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAch_debit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ach_debit")(js.undefined)
        ret
    }
    @scala.inline
    def withAch_debitNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ach_debit")(null)
        ret
    }
    @scala.inline
    def withAlipay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alipay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlipay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alipay")(js.undefined)
        ret
    }
    @scala.inline
    def withAlipayNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alipay")(null)
        ret
    }
    @scala.inline
    def withBancontact(value: BanContactDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bancontact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBancontact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bancontact")(js.undefined)
        ret
    }
    @scala.inline
    def withBancontactNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bancontact")(null)
        ret
    }
    @scala.inline
    def withCard(value: PaymentMethodCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(js.undefined)
        ret
    }
    @scala.inline
    def withCardNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(null)
        ret
    }
    @scala.inline
    def withEps(value: EpsDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eps")(js.undefined)
        ret
    }
    @scala.inline
    def withEpsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eps")(null)
        ret
    }
    @scala.inline
    def withGiropay(value: GiropayDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("giropay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGiropay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("giropay")(js.undefined)
        ret
    }
    @scala.inline
    def withGiropayNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("giropay")(null)
        ret
    }
    @scala.inline
    def withIdeal(value: IdealDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdeal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideal")(js.undefined)
        ret
    }
    @scala.inline
    def withIdealNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideal")(null)
        ret
    }
    @scala.inline
    def withMultibanco(value: MultibancoDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multibanco")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultibanco: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multibanco")(js.undefined)
        ret
    }
    @scala.inline
    def withMultibancoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multibanco")(null)
        ret
    }
    @scala.inline
    def withP24(value: P24Details): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p24")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP24: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p24")(js.undefined)
        ret
    }
    @scala.inline
    def withP24Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p24")(null)
        ret
    }
    @scala.inline
    def withSepa_debit(value: SepaDebitDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sepa_debit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSepa_debit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sepa_debit")(js.undefined)
        ret
    }
    @scala.inline
    def withSepa_debitNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sepa_debit")(null)
        ret
    }
    @scala.inline
    def withSofort(value: SofortDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sofort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSofort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sofort")(js.undefined)
        ret
    }
    @scala.inline
    def withSofortNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sofort")(null)
        ret
    }
    @scala.inline
    def withStripe_account(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripe_account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripe_account: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripe_account")(js.undefined)
        ret
    }
    @scala.inline
    def withStripe_accountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripe_account")(null)
        ret
    }
    @scala.inline
    def withWechat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wechat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWechat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wechat")(js.undefined)
        ret
    }
    @scala.inline
    def withWechatNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wechat")(null)
        ret
    }
  }
  
}

