package typingsSlinky.stripe.mod.skus

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import typingsSlinky.stripe.mod.products.IPackageDimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISkuUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * Whether or not the SKU is available for purchase.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * 3-letter ISO code for currency.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The URL of an image for this SKU, meant to be displayable to the customer.
    * This can be unset by updating the value to null and then saving.
    */
  var image: js.UndefOr[String] = js.native
  var inventory: js.UndefOr[IInventory] = js.native
  /**
    * The dimensions of this SKU for shipping purposes.
    */
  var package_dimensions: js.UndefOr[IPackageDimensions] = js.native
  /**
    * The cost of the item as a nonnegative integer in the smallest currency unit (that is, 100 cents to charge $1.00, or 1 to charge ¥1,
    * Japanese Yen being a 0-decimal currency).
    */
  var price: js.UndefOr[Double] = js.native
  /**
    * The ID of the product this SKU is associated with.
    */
  var product: js.UndefOr[String] = js.native
}

object ISkuUpdateOptions {
  @scala.inline
  def apply(): ISkuUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISkuUpdateOptions]
  }
  @scala.inline
  implicit class ISkuUpdateOptionsOps[Self <: ISkuUpdateOptions] (val x: Self) extends AnyVal {
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
    def withImage(value: String): Self = {
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
    def withInventory(value: IInventory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory")(js.undefined)
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
    def withProduct(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(js.undefined)
        ret
    }
  }
  
}

