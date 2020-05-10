package typingsSlinky.shopifyPrime.productCollectionMod

import typingsSlinky.shopifyPrime.AnonAttachment
import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductCollection extends ShopifyObject {
  /**
    * The description of the collection, complete with HTML markup. Many templates
    * display this on their collection pages.
    */
  var body_html: js.UndefOr[String] = js.native
  /**
    * A human-friendly unique string for the collection automatically generated from its title. This is used in shop themes by the Liquid templating language to refer to the collection. Limit of 255 characters.
    */
  var handle: js.UndefOr[String] = js.native
  /**
    * Image associated with the collection. Valid values are:
    * - attachment: An image attached to a shop's theme returned as Base64-encoded binary data.
    * - src: Source URL that specifies the location of the image.
    */
  var image: js.UndefOr[AnonAttachment] = js.native
  /**
    * This can have two different types of values, depending on whether the collection has been published (i.e., made visible to customers):
    * - If the collection is published, this value is the date and time when it was published. The API returns this value in ISO 8601 format.
    * - If the collection is hidden (i.e., not published), this value is null. Changing a collection's status from published to hidden changes its published_at property to null.
    */
  var published_at: js.UndefOr[String] = js.native
  /**
    * The sales channels in which the collection is visible.
    * "published_scope": "global"
    */
  var published_scope: js.UndefOr[String] = js.native
  /**
    * The order in which products in the collection appear. Valid values are:
    *
    * - alpha-asc: Alphabetically, in ascending order (A - Z).
    * - alpha-desc: Alphabetically, in descending order (Z - A).
    * - best-selling: By best-selling products.
    * - created: By date created, in ascending order (oldest - newest).
    * - created-desc: By date created, in descending order (newest - oldest).
    * - manual: Order created by the shop owner.
    * - price-asc: By price, in ascending order (lowest - highest).
    * - price-desc: By price, in descending order (highest - lowest).
    */
  var sort_order: js.UndefOr[String] = js.native
  /**
    * The suffix of the liquid template being used. By default, the original template is called product.liquid, without any suffix. Any additional templates will be: product.suffix.liquid.
    */
  var template_suffix: js.UndefOr[String] = js.native
  /**
    * The name of the collection. Limit of 255 characters.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The date and time when the collection was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: js.UndefOr[String] = js.native
}

object ProductCollection {
  @scala.inline
  def apply(): ProductCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductCollection]
  }
  @scala.inline
  implicit class ProductCollectionOps[Self <: ProductCollection] (val x: Self) extends AnyVal {
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
    def withImage(value: AnonAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
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
    def withSort_order(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort_order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort_order: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort_order")(js.undefined)
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
  }
  
}

