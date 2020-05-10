package typingsSlinky.stellarBase.mod.OperationOptions

import typingsSlinky.stellarBase.mod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManageBuyOffer extends BaseOptions {
  var buyAmount: String = js.native
  var buying: Asset = js.native
  var offerId: js.UndefOr[Double | String] = js.native
  var price: Double | String | js.Object = js.native
  var selling: Asset = js.native
}

object ManageBuyOffer {
  @scala.inline
  def apply(buyAmount: String, buying: Asset, price: Double | String | js.Object, selling: Asset): ManageBuyOffer = {
    val __obj = js.Dynamic.literal(buyAmount = buyAmount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageBuyOffer]
  }
  @scala.inline
  implicit class ManageBuyOfferOps[Self <: ManageBuyOffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuyAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuying(value: Asset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice(value: Double | String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelling(value: Asset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfferId(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerId")(js.undefined)
        ret
    }
  }
  
}

