package typingsSlinky.shopifyPrime.draftOrderMod

import typingsSlinky.shopifyPrime.addressMod.Address
import typingsSlinky.shopifyPrime.appliedDiscountMod.AppliedDiscount
import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import typingsSlinky.shopifyPrime.customerMod.Customer
import typingsSlinky.shopifyPrime.draftLineItemMod.DraftLineItem
import typingsSlinky.shopifyPrime.metaFieldMod.MetaField
import typingsSlinky.shopifyPrime.noteAttributeMod.NoteAttribute
import typingsSlinky.shopifyPrime.shippingLineMod.ShippingLine
import typingsSlinky.shopifyPrime.taxLineMod.TaxLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraftOrder extends ShopifyObject {
  /**
    * Discount which will be applied to the line item or the overall order. A draft order line_item can have one discount. A draft order can have one order-level discount.
    */
  var applied_discount: AppliedDiscount = js.native
  /**
    * The mailing address associated with the payment method. This address is an optional field that will not be available on orders that do not require one.
    */
  var billing_address: Address = js.native
  /**
    * Date at which order is created and the draft order changes to completed status. The API returns this value in ISO 8601 format.
    */
  var completed_at: js.UndefOr[String] = js.native
  /**
    * This auto-generated property is the date and time when the draft order was created in Shopify, in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The three letter code (ISO 4217) for the currency used for the payment.
    */
  var currency: String = js.native
  /**
    * Customer associated with the draft order. Customer associated with the draft order. Used to load/remove the associated customer with customer id. When a customer is loaded, the customerΓÇÖs email address is also assocaited.
    */
  var customer: Customer = js.native
  /**
    * The customer's email address.
    */
  var email: String = js.native
  /**
    * This auto-generated property is the date and time when the invoice was emailed to the customer, in ISO 8601 format.
    */
  var invoice_sent_at: js.UndefOr[String] = js.native
  /**
    * The URL for the invoice.
    */
  var invoice_url: String = js.native
  /**
    * Product variant line item or custom line item associated to the draft order. Each draft order must include at least one line_item.
    */
  var line_items: js.Array[DraftLineItem] = js.native
  /**
    * Uses include: Creating, updating, & deserializing webhook bodies that include them.
    */
  var metafields: js.Array[MetaField] = js.native
  /**
    * Name of the draft order.
    */
  var name: String = js.native
  /**
    * The text of an optional note that a shop owner can attach to the draft order.
    */
  var note: String = js.native
  /**
    * Extra information that is added to the order.
    */
  var note_attributes: js.Array[NoteAttribute] = js.native
  /**
    * The unique numeric identifier for the order associated to the draft order, once created.
    */
  var order_id: js.UndefOr[Double] = js.native
  /**
    * The mailing address to where the order will be shipped. This address is optional and will not be available on orders that do not require one.
    */
  var shipping_address: Address = js.native
  /**
    * Details the shipping method used.
    */
  var shipping_line: ShippingLine = js.native
  /**
    * Known values are "open", "invoice_sent", and "completed".
    */
  var status: String = js.native
  /**
    * Price of the order before shipping and taxes
    */
  var subtotal_price: js.UndefOr[Double] = js.native
  /**
    * Tags are additional short descriptors, commonly used for filtering and searching, formatted as a string of comma-separated values.
    */
  var tags: String = js.native
  /**
    * Sets whether or not taxes are exempt for the draft order. If this field is set to false, then Shopify will refer to the taxable field for each line_item. If a customer is applied to the draft order, then Shopify will use the customer's tax_exempt field instead.
    */
  var tax_exempt: js.UndefOr[Boolean] = js.native
  /**
    * An array of tax_line objects, each of which details the total taxes applicable to the order. When creating an order through the API, tax lines may be specified on the order or the line items but not both. Tax lines specified on the order are split on the taxable line items in the created order.
    */
  var tax_lines: js.Array[TaxLine] = js.native
  /**
    * States whether or not taxes are included in the order subtotal.
    */
  var taxes_included: js.UndefOr[Boolean] = js.native
  /**
    * The sum of all the prices of all the items in the order, taxes and discounts included (must be positive).
    */
  var total_price: js.UndefOr[Double] = js.native
  /**
    * The sum of all the taxes applied to the order (must be positive).
    */
  var total_tax: js.UndefOr[Double] = js.native
  /**
    * The date and time when the order was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: js.UndefOr[String] = js.native
}

object DraftOrder {
  @scala.inline
  def apply(
    applied_discount: AppliedDiscount,
    billing_address: Address,
    currency: String,
    customer: Customer,
    email: String,
    invoice_url: String,
    line_items: js.Array[DraftLineItem],
    metafields: js.Array[MetaField],
    name: String,
    note: String,
    note_attributes: js.Array[NoteAttribute],
    shipping_address: Address,
    shipping_line: ShippingLine,
    status: String,
    tags: String,
    tax_lines: js.Array[TaxLine]
  ): DraftOrder = {
    val __obj = js.Dynamic.literal(applied_discount = applied_discount.asInstanceOf[js.Any], billing_address = billing_address.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], invoice_url = invoice_url.asInstanceOf[js.Any], line_items = line_items.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], note_attributes = note_attributes.asInstanceOf[js.Any], shipping_address = shipping_address.asInstanceOf[js.Any], shipping_line = shipping_line.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], tax_lines = tax_lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraftOrder]
  }
  @scala.inline
  implicit class DraftOrderOps[Self <: DraftOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplied_discount(value: AppliedDiscount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applied_discount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBilling_address(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomer(value: Customer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvoice_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine_items(value: js.Array[DraftLineItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetafields(value: js.Array[MetaField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metafields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote_attributes(value: js.Array[NoteAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note_attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShipping_address(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShipping_line(value: ShippingLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTax_lines(value: js.Array[TaxLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleted_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleted_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed_at")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withInvoice_sent_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_sent_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoice_sent_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_sent_at")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtotal_price(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtotal_price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtotal_price: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtotal_price")(js.undefined)
        ret
    }
    @scala.inline
    def withTax_exempt(value: Boolean): Self = {
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
    def withTaxes_included(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxes_included")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxes_included: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxes_included")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_price(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_price: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_price")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_tax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_tax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_tax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_tax")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(js.undefined)
        ret
    }
  }
  
}

