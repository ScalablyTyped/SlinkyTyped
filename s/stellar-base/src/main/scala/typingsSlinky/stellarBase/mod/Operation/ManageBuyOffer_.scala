package typingsSlinky.stellarBase.mod.Operation

import typingsSlinky.stellarBase.mod.Asset
import typingsSlinky.stellarBase.mod.OperationType.ManageBuyOffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManageBuyOffer_ extends BaseOperation[ManageBuyOffer] {
  var buyAmount: String = js.native
  var buying: Asset = js.native
  var offerId: String = js.native
  var price: String = js.native
  var selling: Asset = js.native
}

object ManageBuyOffer_ {
  @scala.inline
  def apply(
    buyAmount: String,
    buying: Asset,
    offerId: String,
    price: String,
    selling: Asset,
    `type`: ManageBuyOffer
  ): ManageBuyOffer_ = {
    val __obj = js.Dynamic.literal(buyAmount = buyAmount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], offerId = offerId.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageBuyOffer_]
  }
  @scala.inline
  implicit class ManageBuyOffer_Ops[Self <: ManageBuyOffer_] (val x: Self) extends AnyVal {
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
    def withOfferId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice(value: String): Self = {
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
  }
  
}

