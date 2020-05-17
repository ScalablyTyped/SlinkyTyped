package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buy extends js.Object {
  var buy: scala.Double = js.native
  var get: scala.Double = js.native
  var install: scala.Double = js.native
  var none: scala.Double = js.native
  var purchaseRequest: scala.Double = js.native
  var request: scala.Double = js.native
  var `try`: scala.Double = js.native
}

object Buy {
  @scala.inline
  def apply(
    buy: scala.Double,
    get: scala.Double,
    install: scala.Double,
    none: scala.Double,
    purchaseRequest: scala.Double,
    request: scala.Double,
    `try`: scala.Double
  ): Buy = {
    val __obj = js.Dynamic.literal(buy = buy.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], purchaseRequest = purchaseRequest.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("try")(`try`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buy]
  }
  @scala.inline
  implicit class BuyOps[Self <: Buy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuy(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstall(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("install")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurchaseRequest(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTry(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("try")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

