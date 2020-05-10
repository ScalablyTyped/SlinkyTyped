package typingsSlinky.shopifyPrime.productVariantMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductVariant extends ShopifyObject {
  /**
    * The barcode, UPC or ISBN number for the product.
    */
  var barcode: String = js.native
  /**
    * The competitors price for the same item.
    */
  var compare_at_price: js.UndefOr[js.Any] = js.native
  /**
    * The date and time when the product variant was created. The API returns this value in ISO 8601 format.
    */
  var created_at: String = js.native
  /**
    * Service who is doing the fulfillment. Valid values are: manual
    */
  var fulfillment_service: String = js.native
  /**
    * The weight of the product variant in grams.
    */
  var grams: Double = js.native
  /**
    * The unique identifier for the inventory item, which is used in the Inventory API to query for inventory information.
    */
  var inventory_item_id: Double = js.native
  /**
    * Specifies whether or not Shopify tracks the number of items in stock for this product variant.
    */
  var inventory_management: String = js.native
  /**
    * Specifies whether or not customers are allowed to place an order for a product variant when it's out of stock
    */
  var inventory_policy: String = js.native
  /**
    * The number of items in stock for this product variant.
    */
  var inventory_quantity: Double = js.native
  /**
    * Custom properties that a shop owner can use to define product variants. Multiple options can exist. Options are represented as: option1, option2, option3 etc.
    */
  var option1: String = js.native
  var option2: String | Null = js.native
  var option3: String | Null = js.native
  /**
    * The order of the product variant in the list of product variants. 1 is the first position. To reorder variants, update the product with the variants in the desired order. The position attribute on the variant will be ignored.
    */
  var position: Double = js.native
  /**
    * The price of the product variant.
    */
  var price: Double = js.native
  /**
    * The unique numeric identifier for the product.
    */
  var product_id: Double = js.native
  /**
    * Specifies whether or not a customer needs to provide a shipping address when placing an order for this product variant.
    */
  var requires_shipping: Boolean = js.native
  /**
    * A unique identifier for the product in the shop.
    */
  var sku: String = js.native
  /**
    * Specifies whether or not a tax is charged when the product variant is sold.
    */
  var taxable: Boolean = js.native
  /**
    * The title of the product variant.
    */
  var title: String = js.native
  /**
    * The date and time when the product variant was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: String = js.native
  /**
    * The weight of the product variant in the unit system specified with weight_unit.
    */
  var weight: Double = js.native
  /**
    * The unit system that the product variant's weight is measure in. The weight_unit can be either "g", "kg, "oz", or "lb".
    */
  var weight_unit: String = js.native
}

object ProductVariant {
  @scala.inline
  def apply(
    barcode: String,
    created_at: String,
    fulfillment_service: String,
    grams: Double,
    inventory_item_id: Double,
    inventory_management: String,
    inventory_policy: String,
    inventory_quantity: Double,
    option1: String,
    position: Double,
    price: Double,
    product_id: Double,
    requires_shipping: Boolean,
    sku: String,
    taxable: Boolean,
    title: String,
    updated_at: String,
    weight: Double,
    weight_unit: String
  ): ProductVariant = {
    val __obj = js.Dynamic.literal(barcode = barcode.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], fulfillment_service = fulfillment_service.asInstanceOf[js.Any], grams = grams.asInstanceOf[js.Any], inventory_item_id = inventory_item_id.asInstanceOf[js.Any], inventory_management = inventory_management.asInstanceOf[js.Any], inventory_policy = inventory_policy.asInstanceOf[js.Any], inventory_quantity = inventory_quantity.asInstanceOf[js.Any], option1 = option1.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], requires_shipping = requires_shipping.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], taxable = taxable.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], weight_unit = weight_unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductVariant]
  }
  @scala.inline
  implicit class ProductVariantOps[Self <: ProductVariant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFulfillment_service(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillment_service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrams(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInventory_item_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory_item_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInventory_management(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory_management")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInventory_policy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory_policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInventory_quantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory_quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOption1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduct_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequires_shipping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requires_shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSku(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sku")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaxable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight_unit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight_unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompare_at_price(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare_at_price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompare_at_price: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare_at_price")(js.undefined)
        ret
    }
    @scala.inline
    def withOption2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOption2Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option2")(null)
        ret
    }
    @scala.inline
    def withOption3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOption3Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option3")(null)
        ret
    }
  }
  
}

