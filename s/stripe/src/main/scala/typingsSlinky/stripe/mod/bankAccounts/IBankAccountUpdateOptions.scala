package typingsSlinky.stripe.mod.bankAccounts

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import typingsSlinky.stripe.stripeStrings.company
import typingsSlinky.stripe.stripeStrings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBankAccountUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * The name of the person or business that owns the bank account.
    */
  var account_holder_name: js.UndefOr[String | Null] = js.native
  /**
    * The type of entity that holds the account. This can be either "individual" or "company".
    */
  var account_holder_type: js.UndefOr[individual | company | Null] = js.native
}

object IBankAccountUpdateOptions {
  @scala.inline
  def apply(): IBankAccountUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBankAccountUpdateOptions]
  }
  @scala.inline
  implicit class IBankAccountUpdateOptionsOps[Self <: IBankAccountUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_holder_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_holder_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount_holder_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_holder_name")(js.undefined)
        ret
    }
    @scala.inline
    def withAccount_holder_nameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_holder_name")(null)
        ret
    }
    @scala.inline
    def withAccount_holder_type(value: individual | company): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_holder_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount_holder_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_holder_type")(js.undefined)
        ret
    }
    @scala.inline
    def withAccount_holder_typeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_holder_type")(null)
        ret
    }
  }
  
}

