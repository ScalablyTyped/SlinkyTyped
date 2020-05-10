package typingsSlinky.shopifyPrime.optionsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicListOptions extends js.Object {
  /**
    * The maximum number of objects that should be returned, up to 250. Setting this parameter above 250 will result in an error.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The page number of the result list to retrieve. Use this in tandem with limit to page through the webhooks in a shop.
    */
  var page: js.UndefOr[Double] = js.native
}

object BasicListOptions {
  @scala.inline
  def apply(): BasicListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicListOptions]
  }
  @scala.inline
  implicit class BasicListOptionsOps[Self <: BasicListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
  }
  
}

