package typingsSlinky.stellarBase.mod.OperationOptions

import typingsSlinky.stellarBase.mod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePassiveSellOffer extends BaseOptions {
  var amount: String = js.native
  var buying: Asset = js.native
  var price: Double | String | js.Object = js.native
  var selling: Asset = js.native
}

object CreatePassiveSellOffer {
  @scala.inline
  def apply(amount: String, buying: Asset, price: Double | String | js.Object, selling: Asset): CreatePassiveSellOffer = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePassiveSellOffer]
  }
  @scala.inline
  implicit class CreatePassiveSellOfferOps[Self <: CreatePassiveSellOffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
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
  }
  
}

