package typingsSlinky.twitchExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwitchExtBitsProduct extends js.Object {
  /**
  	 * Cost object.
  	 */
  var cost: TwitchExtBitsProductCost = js.native
  /**
  	 * Registered display name for the SKU.
  	 */
  var displayName: String = js.native
  /**
  	 * This field is returned only for extension versions that are not in the Released state.
  	 */
  var inDevelopment: js.UndefOr[Boolean] = js.native
  /**
  	 * Unique ID for the product.
  	 */
  var sku: String = js.native
}

object TwitchExtBitsProduct {
  @scala.inline
  def apply(cost: TwitchExtBitsProductCost, displayName: String, sku: String): TwitchExtBitsProduct = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtBitsProduct]
  }
  @scala.inline
  implicit class TwitchExtBitsProductOps[Self <: TwitchExtBitsProduct] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCost(value: TwitchExtBitsProductCost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSku(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sku")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInDevelopment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDevelopment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInDevelopment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDevelopment")(js.undefined)
        ret
    }
  }
  
}

