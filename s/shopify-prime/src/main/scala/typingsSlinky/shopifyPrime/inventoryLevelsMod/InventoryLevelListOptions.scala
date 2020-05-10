package typingsSlinky.shopifyPrime.inventoryLevelsMod

import typingsSlinky.shopifyPrime.optionsBaseMod.BasicListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryLevelListOptions extends BasicListOptions {
  /**
    * A comma-separated list of inventory item IDs.
    */
  var inventory_item_ids: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of location IDs.
    */
  var location_ids: js.UndefOr[String] = js.native
}

object InventoryLevelListOptions {
  @scala.inline
  def apply(): InventoryLevelListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryLevelListOptions]
  }
  @scala.inline
  implicit class InventoryLevelListOptionsOps[Self <: InventoryLevelListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInventory_item_ids(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory_item_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventory_item_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory_item_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation_ids(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location_ids")(js.undefined)
        ret
    }
  }
  
}

