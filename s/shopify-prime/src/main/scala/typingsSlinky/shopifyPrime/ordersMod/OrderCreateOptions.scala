package typingsSlinky.shopifyPrime.ordersMod

import typingsSlinky.shopifyPrime.inventoryBehaviorMod.InventoryBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderCreateOptions extends js.Object {
  var inventory_behavior: js.UndefOr[InventoryBehavior] = js.native
  var send_fulfillment_receipt: js.UndefOr[Boolean] = js.native
  var send_receipt: js.UndefOr[Boolean] = js.native
}

object OrderCreateOptions {
  @scala.inline
  def apply(): OrderCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderCreateOptions]
  }
  @scala.inline
  implicit class OrderCreateOptionsOps[Self <: OrderCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInventory_behavior(value: InventoryBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory_behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventory_behavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory_behavior")(js.undefined)
        ret
    }
    @scala.inline
    def withSend_fulfillment_receipt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_fulfillment_receipt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSend_fulfillment_receipt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_fulfillment_receipt")(js.undefined)
        ret
    }
    @scala.inline
    def withSend_receipt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_receipt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSend_receipt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_receipt")(js.undefined)
        ret
    }
  }
  
}

