package typingsSlinky.stripe.mod.accounts

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExternalAccountUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * If set to true, this bank account will become the default external account for its currency.
    */
  var default_for_currency: js.UndefOr[Boolean] = js.native
}

object IExternalAccountUpdateOptions {
  @scala.inline
  def apply(): IExternalAccountUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExternalAccountUpdateOptions]
  }
  @scala.inline
  implicit class IExternalAccountUpdateOptionsOps[Self <: IExternalAccountUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

