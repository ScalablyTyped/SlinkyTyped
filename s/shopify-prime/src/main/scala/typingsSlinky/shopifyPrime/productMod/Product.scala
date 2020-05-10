package typingsSlinky.shopifyPrime.productMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import typingsSlinky.shopifyPrime.productImageMod.ProductImage
import typingsSlinky.shopifyPrime.productOptionMod.ProductOption
import typingsSlinky.shopifyPrime.productVariantMod.ProductVariant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Product extends ShopifyObject {
  /**
    * The description of the product, complete with HTML formatting.
    */
  var body_html: js.UndefOr[String] = js.native
  /**
    * The date and time when the product was created. The API returns this value in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * A human-friendly unique string for the Product automatically generated from its title.
    * They are used by the Liquid templating language to refer to objects.
    */
  var handle: js.UndefOr[String] = js.native
  /**
    * A list of image objects, each one representing an image associated with the product.
    */
  var images: js.UndefOr[js.Array[ProductImage]] = js.native
  /**
    * The description of the product, to be used for SEO purposes. This will generally be added to the <meta name='description'> tag.
    */
  var metafields_global_description_tag: js.UndefOr[String] = js.native
  /**
    * The name of the product, to be used for SEO purposes. This will generally be added to the <meta name='title'> tag.
    */
  var metafields_global_title_tag: js.UndefOr[String] = js.native
  /**
    * Custom product property names like "Size", "Color", and "Material".
    * Products are based on permutations of these options.
    * A product may have a maximum of 3 options. 255 characters limit each.
    */
  var options: js.UndefOr[js.Array[ProductOption]] = js.native
  /**
    * A categorization that a product can be tagged with, commonly used for filtering and searching.
    */
  var product_type: js.UndefOr[String] = js.native
  /**
    * The date and time when the product was published. The API returns this value in ISO 8601 format.
    * Set to NULL to unpublish a product
    */
  var published_at: js.UndefOr[String] = js.native
  /**
    * The sales channels in which the product is visible.
    */
  var published_scope: js.UndefOr[String] = js.native
  /**
    * A categorization that a product can be tagged with, commonly used for filtering and searching.
    * Each comma-separated tag has a character limit of 255.
    */
  var tags: js.UndefOr[String] = js.native
  /**
    * The suffix of the liquid template being used.
    * By default, the original template is called product.liquid, without any suffix.
    * Any additional templates will be: product.suffix.liquid.
    */
  var template_suffix: js.UndefOr[String] = js.native
  /**
    * The name of the product. In a shop's catalog, clicking on a product's title takes you to that product's page.
    * On a product's page, the product's title typically appears in a large font.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The date and time when the product was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * A list of variant objects, each one representing a slightly different version of the product.
    * For example, if a product comes in different sizes and colors, each size and color permutation (such as "small black", "medium black", "large blue"), would be a variant.
    * To reorder variants, update the product with the variants in the desired order.The position attribute on the variant will be ignored.
    */
  var variants: js.UndefOr[js.Array[ProductVariant]] = js.native
  /**
    * The name of the vendor of the product.
    */
  var vendor: js.UndefOr[String] = js.native
}

object Product {
  @scala.inline
  def apply(): Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Product]
  }
  @scala.inline
  implicit class ProductOps[Self <: Product] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody_html(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body_html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody_html: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body_html")(js.undefined)
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
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.undefined)
        ret
    }
    @scala.inline
    def withImages(value: js.Array[ProductImage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(js.undefined)
        ret
    }
    @scala.inline
    def withMetafields_global_description_tag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metafields_global_description_tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetafields_global_description_tag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metafields_global_description_tag")(js.undefined)
        ret
    }
    @scala.inline
    def withMetafields_global_title_tag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metafields_global_title_tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetafields_global_title_tag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metafields_global_title_tag")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[ProductOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_type")(js.undefined)
        ret
    }
    @scala.inline
    def withPublished_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublished_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_at")(js.undefined)
        ret
    }
    @scala.inline
    def withPublished_scope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublished_scope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_scope")(js.undefined)
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
    def withTemplate_suffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate_suffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_suffix")(js.undefined)
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
    @scala.inline
    def withVariants(value: js.Array[ProductVariant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variants")(js.undefined)
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

