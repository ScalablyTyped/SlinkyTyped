package typingsSlinky.shopifyPrime.refundMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderAdjustment extends ShopifyObject {
  var amount: String = js.native
  var kind: String = js.native
  var order_id: js.Any = js.native
  var reason: String = js.native
  var refund_id: Double = js.native
  var tax_amount: String = js.native
}

object OrderAdjustment {
  @scala.inline
  def apply(
    amount: String,
    kind: String,
    order_id: js.Any,
    reason: String,
    refund_id: Double,
    tax_amount: String
  ): OrderAdjustment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], order_id = order_id.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], refund_id = refund_id.asInstanceOf[js.Any], tax_amount = tax_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderAdjustment]
  }
  @scala.inline
  implicit class OrderAdjustmentOps[Self <: OrderAdjustment] (val x: Self) extends AnyVal {
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
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder_id(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefund_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTax_amount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_amount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

