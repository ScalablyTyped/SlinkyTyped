package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when an item is moved in edit mode.
		 */
@js.native
trait DashboardViewMoveEvent extends DashboardViewBaseEvent {
  /**
  			 * Item that was moved.
  			 */
  var item: DashboardItem = js.native
  /**
  			 * List of items to be committed, possibly in new order, when edit mode ends.
  			 */
  var items: js.Array[DashboardItem] = js.native
}

object DashboardViewMoveEvent {
  @scala.inline
  def apply(item: DashboardItem, items: js.Array[DashboardItem], source: DashboardView): DashboardViewMoveEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewMoveEvent]
  }
  @scala.inline
  implicit class DashboardViewMoveEventOps[Self <: DashboardViewMoveEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: DashboardItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[DashboardItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

