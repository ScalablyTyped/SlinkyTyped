package typingsSlinky.vkOpenapi.vk.OpenAPI.Retargeting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductEventParams extends js.Object {
  var business_value: js.UndefOr[Double] = js.native
  var category_ids: js.UndefOr[String] = js.native
  var currency_code: js.UndefOr[String] = js.native
  var products: js.UndefOr[js.Array[Product]] = js.native
  var products_recommended_ids: js.UndefOr[String] = js.native
  var search_string: js.UndefOr[String] = js.native
  var total_price: js.UndefOr[Double] = js.native
}

object ProductEventParams {
  @scala.inline
  def apply(): ProductEventParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductEventParams]
  }
  @scala.inline
  implicit class ProductEventParamsOps[Self <: ProductEventParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusiness_value(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusiness_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business_value")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory_ids(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency_code")(js.undefined)
        ret
    }
    @scala.inline
    def withProducts(value: js.Array[Product]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products")(js.undefined)
        ret
    }
    @scala.inline
    def withProducts_recommended_ids(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products_recommended_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducts_recommended_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products_recommended_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch_string(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch_string: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_string")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_price(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_price: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_price")(js.undefined)
        ret
    }
  }
  
}

