package typingsSlinky.shopifyPrime.refundMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import typingsSlinky.shopifyPrime.transactionMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Refund extends ShopifyObject {
  var created_at: js.UndefOr[String] = js.native
  @JSName("id")
  var id_Refund: Double = js.native
  var note: String = js.native
  var order_adjustments: js.Array[OrderAdjustment] = js.native
  var order_id: js.Any = js.native
  var processed_at: js.UndefOr[String] = js.native
  var refund_line_items: js.Array[_] = js.native
  var restock: js.UndefOr[js.Any] = js.native
  var transactions: js.Array[Transaction] = js.native
  var user_id: Double = js.native
}

object Refund {
  @scala.inline
  def apply(
    id: Double,
    note: String,
    order_adjustments: js.Array[OrderAdjustment],
    order_id: js.Any,
    refund_line_items: js.Array[_],
    transactions: js.Array[Transaction],
    user_id: Double
  ): Refund = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], order_adjustments = order_adjustments.asInstanceOf[js.Any], order_id = order_id.asInstanceOf[js.Any], refund_line_items = refund_line_items.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refund]
  }
  @scala.inline
  implicit class RefundOps[Self <: Refund] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder_adjustments(value: js.Array[OrderAdjustment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_adjustments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder_id(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefund_line_items(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_line_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactions(value: js.Array[Transaction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessed_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processed_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessed_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processed_at")(js.undefined)
        ret
    }
    @scala.inline
    def withRestock(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restock")(js.undefined)
        ret
    }
  }
  
}

