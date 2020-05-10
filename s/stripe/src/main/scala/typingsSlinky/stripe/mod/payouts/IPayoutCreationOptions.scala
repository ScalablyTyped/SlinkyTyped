package typingsSlinky.stripe.mod.payouts

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import typingsSlinky.stripe.stripeStrings.alipay_account
import typingsSlinky.stripe.stripeStrings.bank_account
import typingsSlinky.stripe.stripeStrings.card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPayoutCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A positive integer in cents representing how much to payout.
    */
  var amount: Double = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    * https://stripe.com/docs/currencies
    */
  var currency: String = js.native
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    * This can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The ID of a bank account or a card to send the payout to. If no destination is supplied,
    * the default external account for the specified currency will be used.
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * The method used to send this payout, which can be standard or instant.
    * instant is only supported for payouts to debit cards.
    */
  var method: js.UndefOr[PayoutMethods] = js.native
  /**
    * The source balance to draw this payout from. Balances for different payment sources are
    * kept separately. You can find the amounts with the balances API.
    * Valid options are: alipay_account, bank_account, and card.
    */
  var source_type: js.UndefOr[alipay_account | bank_account | card] = js.native
  /**
    * A string to be displayed on the recipient’s bank or card statement. This may be at most 22 characters.
    * Attempting to use a statement_descriptor longer than 22 characters will return an error.
    * Note: Most banks will truncate this information and/or display it inconsistently. Some may not display it at all.
    */
  var statement_descriptor: js.UndefOr[String] = js.native
}

object IPayoutCreationOptions {
  @scala.inline
  def apply(amount: Double, currency: String): IPayoutCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPayoutCreationOptions]
  }
  @scala.inline
  implicit class IPayoutCreationOptionsOps[Self <: IPayoutCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: PayoutMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_type(value: alipay_account | bank_account | card): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_type")(js.undefined)
        ret
    }
    @scala.inline
    def withStatement_descriptor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatement_descriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(js.undefined)
        ret
    }
  }
  
}

