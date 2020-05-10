package typingsSlinky.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Product extends GraphModel {
  /**
    * A product description.
    */
  var description: String = js.native
  /**
    * Product unique ID
    */
  var id: String | Double = js.native
  /**
    * An Array of Objects that contain meta data about an image including src of the images.
    */
  var images: js.Array[Image] = js.native
  /**
    * Get an array of Product Options. Product Options can be used to define
    * the currently selectedVariant from which you can get a checkout url (ProductVariant.checkoutUrl)
    * or can be added to a cart (Cart.createLineItemsFromVariants).
    */
  var options: js.Array[Option] = js.native
  /**
    * Retrieve variant for currently selected options. By default the first value in each option is selected
    * which means selectedVariant will never be null. With a selectedVariant you can
    * create checkout url (ProductVariant.checkoutUrl) or
    * it can be added to a cart (Cart.createLineItemsFromVariants).
    */
  var selectedVariant: ProductVariant = js.native
  /**
    * Retrieve image for currently selected variantImage.
    */
  var selectedVariantImage: Image = js.native
  /**
    * A read only Array of Strings represented currently selected option values. eg. ["Large", "Red"]
    */
  var selections: js.Array[String] = js.native
  /**
    * The product title
    */
  var title: String = js.native
  /**
    * All variants of a product.
    */
  var variants: js.Array[ProductVariant] = js.native
  /**
    * The product’s vendor name
    */
  var vendor: String = js.native
}

object Product {
  @scala.inline
  def apply(
    description: String,
    id: String | Double,
    images: js.Array[Image],
    options: js.Array[Option],
    selectedVariant: ProductVariant,
    selectedVariantImage: Image,
    selections: js.Array[String],
    title: String,
    variants: js.Array[ProductVariant],
    vendor: String
  ): Product = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectedVariant = selectedVariant.asInstanceOf[js.Any], selectedVariantImage = selectedVariantImage.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
  @scala.inline
  implicit class ProductOps[Self <: Product] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: js.Array[Image]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[Option]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedVariant(value: ProductVariant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedVariant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedVariantImage(value: Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedVariantImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelections(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariants(value: js.Array[ProductVariant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

