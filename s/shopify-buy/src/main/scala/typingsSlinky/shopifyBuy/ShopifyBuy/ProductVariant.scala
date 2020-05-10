package typingsSlinky.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductVariant extends GraphModel {
  /**
    * Variant in stock. Always true if inventory tracking is disabled.
    */
  var available: Boolean = js.native
  /**
    * Compare at price for variant. The compareAtPrice would be the price of the
    * product previously before the product went on sale.
    */
  var compareAtPrice: String = js.native
  /**
    * Price of variant, formatted according to shop currency format string. For instance "$10.00"
    */
  var formattedPrice: String = js.native
  /**
    * Variant weight in grams. If no weight is defined grams will be 0.
    */
  var grams: Double = js.native
  /**
    * Variant unique ID
    */
  var id: String | Double = js.native
  /**
    * Image for variant
    */
  var image: Image = js.native
  /**
    * Image variants available for a variant.
    */
  var imageVariant: js.Array[ImageVariant] = js.native
  /**
    * Option values associated with this variant, ex {name: "color", value: "Blue"}
    */
  var optionValues: js.Array[OptionValue] = js.native
  /**
    * Price of the variant. The price will be in the following form: "10.00"
    */
  var price: String = js.native
  /**
    * ID of product variant belongs to
    */
  var productId: String | Double = js.native
  /**
    * Title of product variant belongs to
    */
  var productTitle: String = js.native
  /**
    * Title of variant
    */
  var title: String = js.native
  /*
    * Get a checkout url for a specific product variant.
    * You can optionally pass a quantity.
    * If no quantity is passed then quantity will default to 1.
    */
  def checkoutUrl(quantitiy: Double): String = js.native
}

object ProductVariant {
  @scala.inline
  def apply(
    available: Boolean,
    checkoutUrl: Double => String,
    compareAtPrice: String,
    formattedPrice: String,
    grams: Double,
    id: String | Double,
    image: Image,
    imageVariant: js.Array[ImageVariant],
    optionValues: js.Array[OptionValue],
    price: String,
    productId: String | Double,
    productTitle: String,
    title: String
  ): ProductVariant = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], checkoutUrl = js.Any.fromFunction1(checkoutUrl), compareAtPrice = compareAtPrice.asInstanceOf[js.Any], formattedPrice = formattedPrice.asInstanceOf[js.Any], grams = grams.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageVariant = imageVariant.asInstanceOf[js.Any], optionValues = optionValues.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], productTitle = productTitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductVariant]
  }
  @scala.inline
  implicit class ProductVariantOps[Self <: ProductVariant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckoutUrl(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkoutUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCompareAtPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareAtPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattedPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedPrice")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withImageVariant(value: js.Array[ImageVariant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageVariant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionValues(value: js.Array[OptionValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

