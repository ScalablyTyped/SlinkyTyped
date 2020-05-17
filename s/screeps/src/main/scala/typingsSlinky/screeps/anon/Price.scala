package typingsSlinky.screeps.anon

import typingsSlinky.screeps.MarketResourceConstant
import typingsSlinky.screeps.ORDER_BUY
import typingsSlinky.screeps.ORDER_SELL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Price extends js.Object {
  var price: Double = js.native
  var resourceType: MarketResourceConstant = js.native
  var roomName: js.UndefOr[String] = js.native
  var totalAmount: Double = js.native
  var `type`: ORDER_BUY | ORDER_SELL = js.native
}

object Price {
  @scala.inline
  def apply(
    price: Double,
    resourceType: MarketResourceConstant,
    totalAmount: Double,
    `type`: ORDER_BUY | ORDER_SELL
  ): Price = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], totalAmount = totalAmount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Price]
  }
  @scala.inline
  implicit class PriceOps[Self <: Price] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: MarketResourceConstant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ORDER_BUY | ORDER_SELL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoomName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomName")(js.undefined)
        ret
    }
  }
  
}

