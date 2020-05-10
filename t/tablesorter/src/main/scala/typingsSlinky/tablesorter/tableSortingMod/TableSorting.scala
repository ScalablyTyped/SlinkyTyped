package typingsSlinky.tablesorter.tableSortingMod

import typingsSlinky.tablesorter.sortDefinitionOrderMod.SortDefinitionOrder
import typingsSlinky.tablesorter.sortInitiatorMod.SortInitiator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableSorting extends js.Object {
  /**
    * The number of times the sorting has been applied.
    */
  var count: Double = js.native
  /**
    * A value indicating whether the order is locked.
    */
  var lockedOrder: Boolean = js.native
  /**
    * The order to apply the sorting.
    */
  var order: js.Array[SortDefinitionOrder] = js.native
  /**
    * The initiator of the sorting.
    */
  var sortedBy: SortInitiator = js.native
}

object TableSorting {
  @scala.inline
  def apply(count: Double, lockedOrder: Boolean, order: js.Array[SortDefinitionOrder], sortedBy: SortInitiator): TableSorting = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lockedOrder = lockedOrder.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], sortedBy = sortedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSorting]
  }
  @scala.inline
  implicit class TableSortingOps[Self <: TableSorting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockedOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: js.Array[SortDefinitionOrder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortedBy(value: SortInitiator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortedBy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

