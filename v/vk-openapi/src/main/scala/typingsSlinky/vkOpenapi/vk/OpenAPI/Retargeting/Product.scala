package typingsSlinky.vkOpenapi.vk.OpenAPI.Retargeting

import typingsSlinky.vkOpenapi.vk.OpenAPI.NumericBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Product extends js.Object {
  var group_id: js.UndefOr[String] = js.native
  var id: String = js.native
  var price: js.UndefOr[Double] = js.native
  var price_from: js.UndefOr[NumericBoolean] = js.native
  var price_old: js.UndefOr[Double] = js.native
  var recommended_ids: js.UndefOr[String] = js.native
}

object Product {
  @scala.inline
  def apply(id: String): Product = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
  @scala.inline
  implicit class ProductOps[Self <: Product] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_id")(js.undefined)
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
    def withPrice_from(value: NumericBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price_from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice_from: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price_from")(js.undefined)
        ret
    }
    @scala.inline
    def withPrice_old(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price_old")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice_old: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price_old")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommended_ids(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommended_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommended_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommended_ids")(js.undefined)
        ret
    }
  }
  
}

