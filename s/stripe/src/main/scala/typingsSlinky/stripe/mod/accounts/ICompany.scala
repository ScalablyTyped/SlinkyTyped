package typingsSlinky.stripe.mod.accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompany extends ICompanyShared {
  /**
    * Whether the company’s business ID number was provided.
    */
  var tax_id_provided: js.UndefOr[Boolean] = js.native
  /**
    * Whether the company’s business VAT number was provided.
    */
  var vat_id_provided: js.UndefOr[Boolean] = js.native
}

object ICompany {
  @scala.inline
  def apply(): ICompany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompany]
  }
  @scala.inline
  implicit class ICompanyOps[Self <: ICompany] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTax_id_provided(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_id_provided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_id_provided: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_id_provided")(js.undefined)
        ret
    }
    @scala.inline
    def withVat_id_provided(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vat_id_provided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVat_id_provided: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vat_id_provided")(js.undefined)
        ret
    }
  }
  
}

