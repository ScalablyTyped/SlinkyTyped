package typingsSlinky.stellarSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amount extends js.Object {
  var amount: String = js.native
  var price: String = js.native
  var price_r: D = js.native
}

object Amount {
  @scala.inline
  def apply(amount: String, price: String, price_r: D): Amount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_r = price_r.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
  @scala.inline
  implicit class AmountOps[Self <: Amount] (val x: Self) extends AnyVal {
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
    def withPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice_r(value: D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price_r")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

