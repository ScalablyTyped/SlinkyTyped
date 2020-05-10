package typingsSlinky.stripe.mod.products

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProductUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * Whether or not the product is available for purchase. Setting this to false also deactivates any active, related SKUs. Setting this to
    * true does not automatically activate any deactivated, related SKUs.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * A short one-line description of the product, meant to be displayable to the customer.
    */
  var caption: js.UndefOr[String] = js.native
  /**
    * An array of Connect application names or identifiers that should not be able to order the SKUs for this product. This can be unset
    * by updating the value to null and then saving.
    */
  var deactivate_on: js.UndefOr[js.Array[String]] = js.native
  /**
    * The product’s description, meant to be displayable to the customer.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A list of up to 8 URLs of images for this product, meant to be displayable to the customer. This can be unset by updating the value to
    * null and then saving.
    */
  var images: js.UndefOr[js.Array[String]] = js.native
  /**
    * The product’s name, meant to be displayable to the customer.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The dimensions of this product for shipping purposes. A SKU associated with this product can override this value by having its own
    * package_dimensions.
    */
  var package_dimensions: js.UndefOr[IPackageDimensions] = js.native
  /**
    * Whether this product is shipped (i.e. physical goods). Defaults to true.
    */
  var shippable: js.UndefOr[Boolean] = js.native
  /**
    * An arbitrary string to be displayed on your customer’s credit card statement. This may be up to 22 characters. The statement description
    * may not include <>”’ characters, and will appear on your customer’s statement in capital letters. Non-ASCII characters are automatically
    * stripped. While most banks display this information consistently, some may display it incorrectly or not at all.
    * May only be set if type=service.
    */
  var statement_descriptor: js.UndefOr[String] = js.native
  /**
    * A URL of a publicly-accessible webpage for this product.
    */
  var url: js.UndefOr[String] = js.native
}

object IProductUpdateOptions {
  @scala.inline
  def apply(): IProductUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProductUpdateOptions]
  }
  @scala.inline
  implicit class IProductUpdateOptionsOps[Self <: IProductUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withDeactivate_on(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate_on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeactivate_on: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate_on")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withImages(value: js.Array[String]): Self = {
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
    def withPackage_dimensions(value: IPackageDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package_dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackage_dimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package_dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withShippable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippable")(js.undefined)
        ret
    }
    @scala.inline
    def withStatement_descriptor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatement_descriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

