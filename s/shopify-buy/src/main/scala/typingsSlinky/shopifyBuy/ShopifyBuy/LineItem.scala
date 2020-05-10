package typingsSlinky.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineItem extends GraphModel {
  /**
    * Compare at price for variant. The compareAtPrice would be the price of the product
    * previously before the product went on sale.
    * If no compareAtPrice is set then this value will be null. An example value: "5.00".
    */
  var compare_at_price: String | Null = js.native
  /**
    * Variant's weight in grams. If no weight is set then 0 is returned.
    */
  var grams: Double = js.native
  /**
    * A line item ID.
    */
  var id: String | Double = js.native
  /**
    * Variant's image.
    */
  var image: Image = js.native
  /**
    * The total price for this line item. For instance if the variant costs 1.50 and you have a
    * quantity of 2 then line_price will be 3.00.
    */
  var line_price: String = js.native
  /**
    * Price of the variant. For example: "5.00".
    */
  var price: String = js.native
  /**
    * ID of variant's product.
    */
  var product_id: String | Double = js.native
  /**
    * Count of variants to order.
    */
  var quantity: Double = js.native
  /**
    * Product title of variant's parent product.
    */
  var title: String = js.native
  /**
    * ID of line item variant.
    */
  var variant_id: String | Double = js.native
  /**
    * Title of variant.
    */
  var variant_title: String = js.native
}

object LineItem {
  @scala.inline
  def apply(
    grams: Double,
    id: String | Double,
    image: Image,
    line_price: String,
    price: String,
    product_id: String | Double,
    quantity: Double,
    title: String,
    variant_id: String | Double,
    variant_title: String
  ): LineItem = {
    val __obj = js.Dynamic.literal(grams = grams.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], line_price = line_price.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], variant_id = variant_id.asInstanceOf[js.Any], variant_title = variant_title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineItem]
  }
  @scala.inline
  implicit class LineItemOps[Self <: LineItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrams(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine_price(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduct_id(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariant_id(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariant_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompare_at_price(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare_at_price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompare_at_priceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare_at_price")(null)
        ret
    }
  }
  
}

