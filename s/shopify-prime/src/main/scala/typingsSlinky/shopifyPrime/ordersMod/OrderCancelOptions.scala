package typingsSlinky.shopifyPrime.ordersMod

import typingsSlinky.shopifyPrime.orderCancelReasonMod.OrderCancelReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderCancelOptions extends js.Object {
  /**
    * Amount to refund. If set, Shopify will attempt to void/refund the payment depending on the status.
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * Whether Shopify should send an email to the customer notifying them of the cancellation.
    */
  var email: js.UndefOr[Boolean] = js.native
  /**
    * The reason for the order cancellation.
    */
  var reason: js.UndefOr[OrderCancelReason] = js.native
  /**
    * Required for some more complex refund situations.
    */
  var refund: js.UndefOr[js.Any] = js.native
  /**
    * Restock the items for this order back to your store.
    */
  var restock: js.UndefOr[Boolean] = js.native
}

object OrderCancelOptions {
  @scala.inline
  def apply(): OrderCancelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderCancelOptions]
  }
  @scala.inline
  implicit class OrderCancelOptionsOps[Self <: OrderCancelOptions] (val x: Self) extends AnyVal {
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
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: OrderCancelReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withRefund(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefund: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund")(js.undefined)
        ret
    }
    @scala.inline
    def withRestock(value: Boolean): Self = {
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

