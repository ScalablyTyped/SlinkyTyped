package typingsSlinky.shopifyPrime.lineItemMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import typingsSlinky.shopifyPrime.lineItemPropertyMod.LineItemProperty
import typingsSlinky.shopifyPrime.taxLineMod.TaxLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineItem extends ShopifyObject {
  var fulfillable_quantity: js.UndefOr[Double] = js.native
  var fulfillment_service: js.UndefOr[String] = js.native
  var fulfillment_status: js.UndefOr[String] = js.native
  var gift_card: js.UndefOr[Boolean] = js.native
  var grams: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var price: js.UndefOr[Double] = js.native
  var product_id: js.UndefOr[Double] = js.native
  var properties: js.UndefOr[js.Array[LineItemProperty]] = js.native
  var quantity: js.UndefOr[Double] = js.native
  var requires_shipping: js.UndefOr[Boolean] = js.native
  var sku: js.UndefOr[String] = js.native
  var tax_lines: js.UndefOr[js.Array[TaxLine]] = js.native
  var taxable: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var total_discount: js.UndefOr[Double] = js.native
  var variant_id: js.UndefOr[Double] = js.native
  var variant_title: js.UndefOr[String] = js.native
  var vendor: js.UndefOr[String] = js.native
}

object LineItem {
  @scala.inline
  def apply(): LineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineItem]
  }
  @scala.inline
  implicit class LineItemOps[Self <: LineItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFulfillable_quantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillable_quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfillable_quantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillable_quantity")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfillment_service(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillment_service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfillment_service: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillment_service")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfillment_status(value: String): Self = {
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
    def withGift_card(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gift_card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGift_card: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gift_card")(js.undefined)
        ret
    }
    @scala.inline
    def withGrams(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grams")(js.undefined)
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
    def withPrice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_id")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[LineItemProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
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
    def withRequires_shipping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requires_shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequires_shipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requires_shipping")(js.undefined)
        ret
    }
    @scala.inline
    def withSku(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sku")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSku: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sku")(js.undefined)
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
    def withTaxable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxable")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_discount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_discount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_discount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_discount")(js.undefined)
        ret
    }
    @scala.inline
    def withVariant_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariant_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant_id")(js.undefined)
        ret
    }
    @scala.inline
    def withVariant_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariant_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant_title")(js.undefined)
        ret
    }
    @scala.inline
    def withVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(js.undefined)
        ret
    }
  }
  
}

