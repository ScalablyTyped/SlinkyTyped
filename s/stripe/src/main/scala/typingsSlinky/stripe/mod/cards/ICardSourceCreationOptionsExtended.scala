package typingsSlinky.stripe.mod.cards

import typingsSlinky.stripe.stripeStrings.card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardSourceCreationOptionsExtended extends ICardSourceCreationOptions {
  /**
    * Required when adding a card to an account (not applicable to a
    * customers or recipients). The card (which must be a debit card) can be
    * used as a transfer destination for funds in this currency. Currently, the
    * only supported currency for debit card transfers is usd.
    *
    * Managed accounts only.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * Only applicable on accounts (not customers or recipients). If you set
    * this to true (or if this is the first external account being added in this
    * currency) this card will become the default external account for its
    * currency.
    *
    * Managed accounts only.
    */
  var default_for_currency: js.UndefOr[Boolean] = js.native
}

object ICardSourceCreationOptionsExtended {
  @scala.inline
  def apply(exp_month: Double, exp_year: Double, number: String, `object`: card): ICardSourceCreationOptionsExtended = {
    val __obj = js.Dynamic.literal(exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardSourceCreationOptionsExtended]
  }
  @scala.inline
  implicit class ICardSourceCreationOptionsExtendedOps[Self <: ICardSourceCreationOptionsExtended] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_for_currency(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_for_currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_for_currency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_for_currency")(js.undefined)
        ret
    }
  }
  
}

