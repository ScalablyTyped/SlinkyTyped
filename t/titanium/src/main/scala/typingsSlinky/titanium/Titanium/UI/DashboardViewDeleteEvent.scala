package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when an item is deleted in edit mode.
		 */
@js.native
trait DashboardViewDeleteEvent extends DashboardViewBaseEvent {
  /**
  			 * Item that was deleted.
  			 */
  var item: DashboardItem = js.native
}

object DashboardViewDeleteEvent {
  @scala.inline
  def apply(item: DashboardItem, source: DashboardView): DashboardViewDeleteEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewDeleteEvent]
  }
  @scala.inline
  implicit class DashboardViewDeleteEventOps[Self <: DashboardViewDeleteEvent] (val x: Self) extends AnyVal {
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
  }
  
}

