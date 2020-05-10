package typingsSlinky.shopifyPrime.inventoryLevelMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryLevel extends ShopifyObject {
  var available: js.UndefOr[Double] = js.native
  var inventory_item_id: js.UndefOr[Double] = js.native
  var location_id: js.UndefOr[Double] = js.native
}

object InventoryLevel {
  @scala.inline
  def apply(): InventoryLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryLevel]
  }
  @scala.inline
  implicit class InventoryLevelOps[Self <: InventoryLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(js.undefined)
        ret
    }
    @scala.inline
    def withInventory_item_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory_item_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventory_item_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory_item_id")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location_id")(js.undefined)
        ret
    }
  }
  
}

