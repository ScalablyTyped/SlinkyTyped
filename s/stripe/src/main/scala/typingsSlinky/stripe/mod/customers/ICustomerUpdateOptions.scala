package typingsSlinky.stripe.mod.customers

import typingsSlinky.stripe.mod.IAddress
import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import typingsSlinky.stripe.mod.IShippingInformation
import typingsSlinky.stripe.mod.cards.ICardSourceCreationOptionsExtended
import typingsSlinky.stripe.stripeStrings.exempt
import typingsSlinky.stripe.stripeStrings.none
import typingsSlinky.stripe.stripeStrings.reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomerUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * This field has been renamed to balance and will be removed in a future API version.
    * @deprecated
    */
  var account_balance: js.UndefOr[Double] = js.native
  var address: js.UndefOr[IAddress] = js.native
  /**
    * An integer amount in cents that represents the customer’s current balance, which affect the
    * customer’s future invoices. A negative amount represents a credit that decreases the amount
    * due on an invoice; a positive amount increases the amount due on an invoice.
    */
  var balance: js.UndefOr[Double] = js.native
  /**
    * If you provide a coupon code, the customer will have a discount applied on all recurring charges. Charges you create through the
    * API will not have the discount.
    */
  var coupon: js.UndefOr[String] = js.native
  /**
    * ID of source to make the customer’s new default for invoice payments
    */
  var default_source: js.UndefOr[String] = js.native
  /**
    * An arbitrary string that you can attach to a customer object. It is displayed alongside the customer in the dashboard. This can
    * be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Customer's email address. It's displayed alongside the customer in your dashboard and can be useful for searching and tracking.
    * This can be unset by updating the value to null and then saving.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The prefix for the customer used to generate unique invoice numbers.
    */
  var invoice_prefix: js.UndefOr[String] = js.native
  /**
    * Default invoice settings for this customer.
    */
  var invoice_settings: js.UndefOr[ICustomerInvoiceSettings | Null] = js.native
  /**
    * The customer’s full name or business name. This can be unset by updating the value to null and then saving.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The customer’s phone number. This can be unset by updating the value to null and then saving.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * Customer’s preferred languages, ordered by preference. This can be unset by updating
    * the value to null and then saving.
    */
  var preferred_locales: js.UndefOr[js.Array[String] | Null] = js.native
  var shipping: js.UndefOr[IShippingInformation] = js.native
  /**
    * The source can either be a token, like the ones returned by our Stripe.js, or
    * a dictionary containing a user’s credit card details (with the options shown
    * below). Passing source will create a new source object, make it the new
    * customer default source, and delete the old customer default if one exists.
    * If you want to add additional sources instead of replacing the existing
    * default, use the card creation API. Whenever you attach a card to a
    * customer, Stripe will automatically validate the card.
    */
  var source: js.UndefOr[String | ICardSourceCreationOptionsExtended] = js.native
  /**
    * The customer’s tax exemption. One of none, exempt, or reverse.
    */
  var tax_exempt: js.UndefOr[none | exempt | reverse] = js.native
  /**
    * @deprecated
    */
  var tax_info: js.UndefOr[js.Any] = js.native
}

object ICustomerUpdateOptions {
  @scala.inline
  def apply(): ICustomerUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomerUpdateOptions]
  }
  @scala.inline
  implicit class ICustomerUpdateOptionsOps[Self <: ICustomerUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_balance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_balance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount_balance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_balance")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress(value: IAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withBalance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(js.undefined)
        ret
    }
    @scala.inline
    def withCoupon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coupon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoupon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coupon")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_source(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_source: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_source")(js.undefined)
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
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withInvoice_prefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoice_prefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withInvoice_settings(value: ICustomerInvoiceSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoice_settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_settings")(js.undefined)
        ret
    }
    @scala.inline
    def withInvoice_settingsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_settings")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferred_locales(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred_locales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferred_locales: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred_locales")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferred_localesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred_locales")(null)
        ret
    }
    @scala.inline
    def withShipping(value: IShippingInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String | ICardSourceCreationOptionsExtended): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withTax_exempt(value: none | exempt | reverse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_exempt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_exempt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_exempt")(js.undefined)
        ret
    }
    @scala.inline
    def withTax_info(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_info")(js.undefined)
        ret
    }
  }
  
}

