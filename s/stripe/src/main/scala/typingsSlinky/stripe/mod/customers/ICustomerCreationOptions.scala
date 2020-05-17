package typingsSlinky.stripe.mod.customers

import typingsSlinky.stripe.anon.Type
import typingsSlinky.stripe.mod.IAddress
import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import typingsSlinky.stripe.mod.IShippingInformation
import typingsSlinky.stripe.mod.cards.ICardSourceCreationOptionsExtended
import typingsSlinky.stripe.stripeStrings.exempt
import typingsSlinky.stripe.stripeStrings.none
import typingsSlinky.stripe.stripeStrings.now
import typingsSlinky.stripe.stripeStrings.reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomerCreationOptions extends IDataOptionsWithMetadata {
  /**
    * This field has been renamed to balance and will be removed in a future API version.
    * @deprecated
    */
  var account_balance: js.UndefOr[Double] = js.native
  var address: js.UndefOr[IAddress] = js.native
  /***
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
    * The prefix for the customer used to generate unique invoice numbers. Must be 3–12 uppercase letters or numbers.
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
    * The ID of the PaymentMethod to attach to the customer.
    */
  var payment_method: js.UndefOr[String] = js.native
  /**
    * The customer’s phone number. This can be unset by updating the value to null and then saving.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * The identifier of the plan to subscribe the customer to. If provided, the returned customer object will have a list of subscriptions
    * that the customer is currently subscribed to. If you subscribe a customer to a plan without a free trial, the customer must have a
    * valid card as well.
    */
  var plan: js.UndefOr[String] = js.native
  /**
    * Customer’s preferred languages, ordered by preference. This can be unset by updating the value to null and then saving.
    */
  var preferred_locales: js.UndefOr[js.Array[String]] = js.native
  /**
    * The quantity you'd like to apply to the subscription you're creating (if you pass in a plan). For example, if your plan is
    * 10 cents/user/month, and your customer has 5 users, you could pass 5 as the quantity to have the customer charged 50 cents
    * (5 x 10 cents) monthly. Defaults to 1 if not set. Only applies when the plan parameter is also provided.
    */
  var quantity: js.UndefOr[Double] = js.native
  var shipping: js.UndefOr[IShippingInformation] = js.native
  /**
    * The source can either be a token, like the ones returned by our Stripe.js, or
    * a dictionary containing a user’s credit card details.
    */
  var source: js.UndefOr[String | ICardSourceCreationOptionsExtended] = js.native
  /**
    * The customer’s tax exemption. One of none, exempt, or reverse.
    */
  var tax_exempt: js.UndefOr[none | exempt | reverse] = js.native
  /**
    * The customer’s tax IDs.
    */
  var tax_id_data: js.UndefOr[js.Array[Type]] = js.native
  /**
    * @deprecated
    */
  var tax_info: js.UndefOr[js.Any] = js.native
  /**
    * A positive decimal (with at most two decimal places) between 1 and 100.
    * This represents the percentage of the subscription invoice subtotal that
    * will be calculated and added as tax to the final amount each billing period.
    * For example, a plan which charges $10/month with a tax_percent of 20.0
    * will charge $12 per invoice. Can only be used if a plan is provided.
    */
  var tax_percent: js.UndefOr[Double] = js.native
  /**
    * Unix timestamp representing the end of the trial period the customer will get before being charged. If set, trial_end will
    * override the default trial period of the plan the customer is being subscribed to. The special value now can be provided to
    * end the customer's trial immediately. Only applies when the plan parameter is also provided.
    */
  var trial_end: js.UndefOr[Double | now] = js.native
}

object ICustomerCreationOptions {
  @scala.inline
  def apply(): ICustomerCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomerCreationOptions]
  }
  @scala.inline
  implicit class ICustomerCreationOptionsOps[Self <: ICustomerCreationOptions] (val x: Self) extends AnyVal {
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
    def withPayment_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method")(js.undefined)
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
    def withPlan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(js.undefined)
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
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
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
    def withTax_id_data(value: js.Array[Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_id_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_id_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_id_data")(js.undefined)
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
    @scala.inline
    def withTax_percent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_percent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_percent")(js.undefined)
        ret
    }
    @scala.inline
    def withTrial_end(value: Double | now): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trial_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrial_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trial_end")(js.undefined)
        ret
    }
  }
  
}

