package typingsSlinky.stripe.mod.balance

import typingsSlinky.stripe.AnonAlipayaccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISourceType extends js.Object {
  var amount: Double = js.native
  var currency: String = js.native
  var source_types: AnonAlipayaccount = js.native
}

object ISourceType {
  @scala.inline
  def apply(amount: Double, currency: String, source_types: AnonAlipayaccount): ISourceType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], source_types = source_types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceType]
  }
  @scala.inline
  implicit class ISourceTypeOps[Self <: ISourceType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_types(value: AnonAlipayaccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

