package typingsSlinky.stripe.mod.products

import typingsSlinky.stripe.mod.IDateFilter
import typingsSlinky.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProductListOptions extends IListOptions {
  /**
    * Only return products that are active or inactive (e.g. pass false to list all inactive products).
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var created: js.UndefOr[IDateFilter] = js.native
  /**
    * Only return products with the given IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Only return products that can be shipped (i.e., physical, not digital products).
    */
  var shippable: js.UndefOr[Boolean] = js.native
  /**
    * Only return products of this type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Only return products with the given url
    */
  var url: js.UndefOr[String] = js.native
}

object IProductListOptions {
  @scala.inline
  def apply(): IProductListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProductListOptions]
  }
  @scala.inline
  implicit class IProductListOptionsOps[Self <: IProductListOptions] (val x: Self) extends AnyVal {
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
    def withCreated(value: IDateFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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

