package typingsSlinky.stripe.mod.accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompanyCreateUpdateOptions extends ICompanyShared {
  /**
    * The business ID number of the company, as appropriate for the company’s country.
    * (Examples are an Employer ID Number in the U.S., a Business Number in Canada, or a
    * Company Number in the UK.) This can be unset by updating the value to null and then saving.
    */
  var tax_id: js.UndefOr[String] = js.native
  /**
    * The VAT number of the company.
    * This can be unset by updating the value to null and then saving.
    */
  var vat_id: js.UndefOr[String] = js.native
}

object ICompanyCreateUpdateOptions {
  @scala.inline
  def apply(): ICompanyCreateUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompanyCreateUpdateOptions]
  }
  @scala.inline
  implicit class ICompanyCreateUpdateOptionsOps[Self <: ICompanyCreateUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTax_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_id")(js.undefined)
        ret
    }
    @scala.inline
    def withVat_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vat_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVat_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vat_id")(js.undefined)
        ret
    }
  }
  
}

