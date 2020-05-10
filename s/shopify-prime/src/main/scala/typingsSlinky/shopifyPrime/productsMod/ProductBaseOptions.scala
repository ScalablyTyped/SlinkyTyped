package typingsSlinky.shopifyPrime.productsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductBaseOptions extends js.Object {
  /**
    * Filter by collection id
    */
  var collection_id: js.UndefOr[String] = js.native
  /**
    * Filter Redirects with given target
    */
  var product_type: js.UndefOr[String] = js.native
  /**
    * Filter by product vendor
    */
  var vendor: js.UndefOr[String] = js.native
}

object ProductBaseOptions {
  @scala.inline
  def apply(): ProductBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductBaseOptions]
  }
  @scala.inline
  implicit class ProductBaseOptionsOps[Self <: ProductBaseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollection_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection_id")(js.undefined)
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

