package typingsSlinky.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphModel extends js.Object {
  var attrs: js.UndefOr[js.Any] = js.native
  var onlineStoreUrl: js.UndefOr[String] = js.native
}

object GraphModel {
  @scala.inline
  def apply(): GraphModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphModel]
  }
  @scala.inline
  implicit class GraphModelOps[Self <: GraphModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlineStoreUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlineStoreUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlineStoreUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlineStoreUrl")(js.undefined)
        ret
    }
  }
  
}

