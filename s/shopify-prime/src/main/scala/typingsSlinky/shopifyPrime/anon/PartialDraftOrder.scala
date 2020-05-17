package typingsSlinky.shopifyPrime.anon

import typingsSlinky.shopifyPrime.addressMod.Address
import typingsSlinky.shopifyPrime.appliedDiscountMod.AppliedDiscount
import typingsSlinky.shopifyPrime.customerMod.Customer
import typingsSlinky.shopifyPrime.draftLineItemMod.DraftLineItem
import typingsSlinky.shopifyPrime.metaFieldMod.MetaField
import typingsSlinky.shopifyPrime.noteAttributeMod.NoteAttribute
import typingsSlinky.shopifyPrime.shippingLineMod.ShippingLine
import typingsSlinky.shopifyPrime.taxLineMod.TaxLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<shopify-prime.shopify-prime/dist/models.DraftOrder> */
@js.native
trait PartialDraftOrder extends js.Object {
  var admin_graphql_api_id: js.UndefOr[String] = js.native
  var applied_discount: js.UndefOr[AppliedDiscount] = js.native
  var billing_address: js.UndefOr[Address] = js.native
  var completed_at: js.UndefOr[String] = js.native
  var created_at: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var customer: js.UndefOr[Customer] = js.native
  var email: js.UndefOr[String] = js.native
  var id: js.UndefOr[Double] = js.native
  var invoice_sent_at: js.UndefOr[String] = js.native
  var invoice_url: js.UndefOr[String] = js.native
  var line_items: js.UndefOr[js.Array[DraftLineItem]] = js.native
  var metafields: js.UndefOr[js.Array[MetaField]] = js.native
  var name: js.UndefOr[String] = js.native
  var note: js.UndefOr[String] = js.native
  var note_attributes: js.UndefOr[js.Array[NoteAttribute]] = js.native
  var order_id: js.UndefOr[Double] = js.native
  var shipping_address: js.UndefOr[Address] = js.native
  var shipping_line: js.UndefOr[ShippingLine] = js.native
  var status: js.UndefOr[String] = js.native
  var subtotal_price: js.UndefOr[Double] = js.native
  var tags: js.UndefOr[String] = js.native
  var tax_exempt: js.UndefOr[Boolean] = js.native
  var tax_lines: js.UndefOr[js.Array[TaxLine]] = js.native
  var taxes_included: js.UndefOr[Boolean] = js.native
  var total_price: js.UndefOr[Double] = js.native
  var total_tax: js.UndefOr[Double] = js.native
  var updated_at: js.UndefOr[String] = js.native
}

object PartialDraftOrder {
  @scala.inline
  def apply(): PartialDraftOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDraftOrder]
  }
  @scala.inline
  implicit class PartialDraftOrderOps[Self <: PartialDraftOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdmin_graphql_api_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin_graphql_api_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdmin_graphql_api_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin_graphql_api_id")(js.undefined)
        ret
    }
    @scala.inline
    def withApplied_discount(value: AppliedDiscount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applied_discount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplied_discount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applied_discount")(js.undefined)
        ret
    }
    @scala.inline
    def withBilling_address(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_address")(js.undefined)
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
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomer(value: Customer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(js.undefined)
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
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withInvoice_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoice_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice_url")(js.undefined)
        ret
    }
    @scala.inline
    def withLine_items(value: js.Array[DraftLineItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine_items: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_items")(js.undefined)
        ret
    }
    @scala.inline
    def withMetafields(value: js.Array[MetaField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metafields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetafields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metafields")(js.undefined)
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
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withNote_attributes(value: js.Array[NoteAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note_attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote_attributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note_attributes")(js.undefined)
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
    def withShipping_address(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_address")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping_line(value: ShippingLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_line: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_line")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
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
    def withTags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
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
    def withTax_lines(value: js.Array[TaxLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_lines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_lines")(js.undefined)
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

