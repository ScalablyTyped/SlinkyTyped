package typingsSlinky.stripe.mod.accounts

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExternalAccountCreationOptions extends IDataOptionsWithMetadata {
  /**
    * Only applicable on accounts (not customers or recipients). If you set this to true (or if this is the first external account being added
    * in this currency) this card will become the default external account for its currency.
    */
  var default_for_currency: js.UndefOr[Boolean] = js.native
  /**
    * When adding a card to a customer, the parameter name is source. When
    * adding to an account, the parameter name is external_account. The
    * value can either be a token, like the ones returned by our Stripe.js, or a
    * dictionary containing a user’s credit card details (with the options shown
    * below). Stripe will automatically validate the card.
    */
  var external_account: String = js.native
}

object IExternalAccountCreationOptions {
  @scala.inline
  def apply(external_account: String): IExternalAccountCreationOptions = {
    val __obj = js.Dynamic.literal(external_account = external_account.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExternalAccountCreationOptions]
  }
  @scala.inline
  implicit class IExternalAccountCreationOptionsOps[Self <: IExternalAccountCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternal_account(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_account")(value.asInstanceOf[js.Any])
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

