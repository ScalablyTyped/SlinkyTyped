package typingsSlinky.stripe.mod.skus

import typingsSlinky.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISkuListOptions extends IListOptions {
  /**
    * Only return SKUs that are active or inactive (e.g. pass false to list all inactive products).
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Only return SKUs that have the specified key/value pairs in this partially constructed dictionary.
    * Can be specified only if product is also supplied. For instance, if the associated product has
    * attributes ["color", "size"], passing in attributes[color]=red returns all the SKUs for this product
    * that have color set to red.
    */
  var attributes: js.UndefOr[ISkuAttributes] = js.native
  /**
    * Only return SKUs with the given IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Only return SKUs that are either in stock or out of stock (e.g. pass false to list all SKUs that are out of stock).
    * If no value is provided, all SKUs are returned.
    */
  var in_stock: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the product whose SKUs will be retrieved.
    */
  var product: js.UndefOr[String] = js.native
}

object ISkuListOptions {
  @scala.inline
  def apply(): ISkuListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISkuListOptions]
  }
  @scala.inline
  implicit class ISkuListOptionsOps[Self <: ISkuListOptions] (val x: Self) extends AnyVal {
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
    def withAttributes(value: ISkuAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(js.undefined)
        ret
    }
    @scala.inline
    def withIn_stock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_stock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn_stock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_stock")(js.undefined)
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

