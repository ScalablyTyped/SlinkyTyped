package typingsSlinky.shopifyPrime.orderMod

import typingsSlinky.shopifyPrime.addressMod.Address
import typingsSlinky.shopifyPrime.anon.Name
import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import typingsSlinky.shopifyPrime.clientDetailsMod.ClientDetails
import typingsSlinky.shopifyPrime.customerMod.Customer
import typingsSlinky.shopifyPrime.discountCodeMod.DiscountCode
import typingsSlinky.shopifyPrime.financialStatusMod.FinancialStatus
import typingsSlinky.shopifyPrime.fulfillmentMod.Fulfillment
import typingsSlinky.shopifyPrime.lineItemMod.LineItem
import typingsSlinky.shopifyPrime.paymentDetailsMod.PaymentDetails
import typingsSlinky.shopifyPrime.refundMod.Refund
import typingsSlinky.shopifyPrime.shippingLineMod.ShippingLine
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.fulfilled
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.partial
import typingsSlinky.shopifyPrime.taxLineMod.TaxLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Order extends ShopifyObject {
  var billing_address: js.UndefOr[Address] = js.native
  var browser_ip: js.UndefOr[String] = js.native
  var buyer_accepts_marketing: js.UndefOr[Boolean] = js.native
  var cancel_reason: js.UndefOr[String] = js.native
  var cancelled_at: js.UndefOr[String] = js.native
  var cart_token: js.UndefOr[String] = js.native
  var client_details: js.UndefOr[ClientDetails] = js.native
  var closed_at: js.UndefOr[String] = js.native
  var contact_email: js.UndefOr[String] = js.native
  var created_at: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var customer: js.UndefOr[Customer] = js.native
  var discount_codes: js.UndefOr[js.Array[DiscountCode]] = js.native
  var email: js.UndefOr[String] = js.native
  var financial_status: js.UndefOr[FinancialStatus] = js.native
  var fulfillment_status: js.UndefOr[fulfilled | partial | String] = js.native
  var fulfillments: js.UndefOr[js.Array[Fulfillment]] = js.native
  var landing_site: js.UndefOr[String] = js.native
  var line_items: js.UndefOr[js.Array[LineItem]] = js.native
  var name: js.UndefOr[String] = js.native
  var note: js.UndefOr[String] = js.native
  var note_attributes: js.UndefOr[Name] = js.native
  var number: js.UndefOr[Double] = js.native
  var order_number: js.UndefOr[Double] = js.native
  var payment_details: js.UndefOr[PaymentDetails] = js.native
  var processed_at: js.UndefOr[String] = js.native
  var processing_method: js.UndefOr[String] = js.native
  var referring_site: js.UndefOr[String] = js.native
  var refunds: js.UndefOr[js.Array[Refund]] = js.native
  var shipping_address: js.UndefOr[Address] = js.native
  var shipping_lines: js.UndefOr[js.Array[ShippingLine]] = js.native
  var source_name: js.UndefOr[String] = js.native
  var subtotal_price: js.UndefOr[Double] = js.native
  var tags: js.UndefOr[String] = js.native
  var tax_lines: js.UndefOr[js.Array[TaxLine]] = js.native
  var taxes_included: js.UndefOr[Boolean] = js.native
  var token: js.UndefOr[String] = js.native
  var total_discounts: js.UndefOr[Double] = js.native
  var total_line_items_price: js.UndefOr[Double] = js.native
  var total_price: js.UndefOr[Double] = js.native
  var total_price_usd: js.UndefOr[Double] = js.native
  var total_tax: js.UndefOr[Double] = js.native
  var total_weight: js.UndefOr[Double] = js.native
  var updated_at: js.UndefOr[String] = js.native
}

object Order {
  @scala.inline
  def apply(): Order = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Order]
  }
  @scala.inline
  implicit class OrderOps[Self <: Order] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBrowser_ip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser_ip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_ip")(js.undefined)
        ret
    }
    @scala.inline
    def withBuyer_accepts_marketing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyer_accepts_marketing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuyer_accepts_marketing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyer_accepts_marketing")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel_reason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel_reason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel_reason")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelled_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelled_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled_at")(js.undefined)
        ret
    }
    @scala.inline
    def withCart_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cart_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCart_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cart_token")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_details(value: ClientDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_details: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_details")(js.undefined)
        ret
    }
    @scala.inline
    def withClosed_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosed_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed_at")(js.undefined)
        ret
    }
    @scala.inline
    def withContact_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContact_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact_email")(js.undefined)
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
    def withDiscount_codes(value: js.Array[DiscountCode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount_codes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscount_codes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount_codes")(js.undefined)
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
    def withFinancial_status(value: FinancialStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("financial_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinancial_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("financial_status")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfillment_status(value: fulfilled | partial | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillment_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfillment_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillment_status")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfillments(value: js.Array[Fulfillment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfillments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillments")(js.undefined)
        ret
    }
    @scala.inline
    def withLanding_site(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landing_site")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanding_site: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landing_site")(js.undefined)
        ret
    }
    @scala.inline
    def withLine_items(value: js.Array[LineItem]): Self = {
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
    def withNote_attributes(value: Name): Self = {
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
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_number")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_details(value: PaymentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_details: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_details")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessed_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processed_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessed_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processed_at")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessing_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessing_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing_method")(js.undefined)
        ret
    }
    @scala.inline
    def withReferring_site(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referring_site")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferring_site: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referring_site")(js.undefined)
        ret
    }
    @scala.inline
    def withRefunds(value: js.Array[Refund]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refunds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefunds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refunds")(js.undefined)
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
    def withShipping_lines(value: js.Array[ShippingLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_lines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_lines")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_name")(js.undefined)
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
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_discounts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_discounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_discounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_discounts")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_line_items_price(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_line_items_price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_line_items_price: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_line_items_price")(js.undefined)
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
    def withTotal_price_usd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_price_usd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_price_usd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_price_usd")(js.undefined)
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
    def withTotal_weight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_weight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_weight")(js.undefined)
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

