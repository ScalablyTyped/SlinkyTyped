package typingsSlinky.stripe.mod.customers

import typingsSlinky.stripe.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomerInvoiceSettings extends js.Object {
  /**
    * Default custom fields to be displayed on invoices for this customer.
    */
  var custom_fields: js.UndefOr[js.Array[Name]] = js.native
  /**
    * ID of the default payment method used for subscriptions and invoices for the customer.
    */
  var default_payment_method: js.UndefOr[String] = js.native
  /**
    * Default footer to be displayed on invoices for this customer.
    * This can be unset by updating the value to null and then saving.
    */
  var footer: js.UndefOr[String] = js.native
}

object ICustomerInvoiceSettings {
  @scala.inline
  def apply(): ICustomerInvoiceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomerInvoiceSettings]
  }
  @scala.inline
  implicit class ICustomerInvoiceSettingsOps[Self <: ICustomerInvoiceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustom_fields(value: js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_fields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_fields")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_payment_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_payment_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_payment_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_payment_method")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
  }
  
}

