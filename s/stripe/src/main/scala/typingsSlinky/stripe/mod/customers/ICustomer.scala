package typingsSlinky.stripe.mod.customers

import typingsSlinky.stripe.mod.IAddress
import typingsSlinky.stripe.mod.IList
import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.IShippingInformation
import typingsSlinky.stripe.mod.IStripeSource
import typingsSlinky.stripe.mod.coupons.IDiscount
import typingsSlinky.stripe.mod.customerTaxIds.ITaxId
import typingsSlinky.stripe.mod.resources.CustomerCards
import typingsSlinky.stripe.stripeStrings.customer
import typingsSlinky.stripe.stripeStrings.exempt
import typingsSlinky.stripe.stripeStrings.none
import typingsSlinky.stripe.stripeStrings.reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Customer objects allow you to perform recurring charges and track multiple charges that are associated
  * with the same customer. The API allows you to create, delete, and update your customers. You can
  * retrieve individual customers as well as a list of all your customers.
  */
@js.native
trait ICustomer extends IResourceObject {
  /**
    * This field has been renamed to balance and will be removed in a future API version.
    * @deprecated
    */
  var account_balance: js.UndefOr[Double] = js.native
  var address: IAddress | Null = js.native
  /**
    * Current balance, if any, being stored on the customer. If negative, the customer has credit
    * to apply to their next invoice. If positive, the customer has an amount owed that will be
    * added to their next invoice. The balance does not refer to any unpaid invoices; it solely
    * takes into account amounts that have yet to be successfully applied to any invoice. This
    * balance is only taken into account as invoices are finalized.
    */
  var balance: js.UndefOr[Double] = js.native
  var cards: js.UndefOr[CustomerCards] = js.native
  var created: Double = js.native
  /**
    * The currency the customer can be charged in for recurring billing purposes (subscriptions, invoices, invoice items).
    */
  var currency: String | Null = js.native
  /**
    * ID of the default source attached to this customer. [Expandable]
    */
  var default_source: String | IStripeSource | Null = js.native
  /**
    * Whether or not the latest charge for the customer's latest invoice has failed
    */
  var delinquent: Boolean = js.native
  var description: js.UndefOr[String] = js.native
  /**
    * Describes the current discount active on the customer, if there is one.
    */
  var discount: js.UndefOr[IDiscount] = js.native
  var email: js.UndefOr[String] = js.native
  /**
    * The prefix for the customer used to generate unique invoice numbers.
    */
  var invoice_prefix: js.UndefOr[String] = js.native
  /**
    * Default invoice settings for this customer.
    */
  var invoice_settings: js.UndefOr[ICustomerInvoiceSettings | Null] = js.native
  var livemode: Boolean = js.native
  var metadata: IMetadata = js.native
  /**
    * The customer’s full name or business name.
    */
  var name: js.UndefOr[String | Null] = js.native
  /**
    * Value is 'customer'
    */
  @JSName("object")
  var object_ICustomer: customer = js.native
  /**
    * The customer’s phone number.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * The customer’s preferred locales (languages), ordered by preference.
    */
  var preferred_locales: js.UndefOr[js.Array[String]] = js.native
  /**
    * Shipping information associated with the customer.
    */
  var shipping: IShippingInformation | Null = js.native
  /**
    * The customer’s payment sources, if any
    */
  var sources: js.UndefOr[IList[IStripeSource]] = js.native
  /**
    * The customer's current subscriptions, if any
    */
  var subscriptions: ICustomerSubscriptions = js.native
  /**
    * Describes the customer’s tax exemption status. One of none, exempt, or reverse.
    * When set to reverse, invoice and receipt PDFs include the text “Reverse charge”.
    */
  var tax_exempt: js.UndefOr[none | exempt | reverse] = js.native
  /**
    * The customer’s tax IDs.
    */
  var tax_ids: js.UndefOr[IList[ITaxId]] = js.native
  /**
    * @deprecated
    */
  var tax_info: js.UndefOr[js.Any] = js.native
  /**
    * @deprecated
    */
  var tax_info_verification: js.UndefOr[js.Any] = js.native
}

object ICustomer {
  @scala.inline
  def apply(
    created: Double,
    delinquent: Boolean,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: customer,
    subscriptions: ICustomerSubscriptions
  ): ICustomer = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], delinquent = delinquent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomer]
  }
  @scala.inline
  implicit class ICustomerOps[Self <: ICustomer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelinquent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delinquent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: customer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptions(value: ICustomerSubscriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withAddressNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(null)
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
    def withCards(value: CustomerCards): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cards")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(null)
        ret
    }
    @scala.inline
    def withDefault_source(value: String | IStripeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault_sourceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_source")(null)
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
    def withDiscount(value: IDiscount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount")(js.undefined)
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
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
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
    def withShipping(value: IShippingInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShippingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(null)
        ret
    }
    @scala.inline
    def withSources(value: IList[IStripeSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
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
    def withTax_ids(value: IList[ITaxId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_ids")(js.undefined)
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
    def withTax_info_verification(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_info_verification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_info_verification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_info_verification")(js.undefined)
        ret
    }
  }
  
}

