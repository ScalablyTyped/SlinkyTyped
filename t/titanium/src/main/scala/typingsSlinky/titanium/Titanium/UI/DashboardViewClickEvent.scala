package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the device detects a click against the view.
		 */
@js.native
trait DashboardViewClickEvent extends DashboardViewBaseEvent {
  /**
  			 * Item that was clicked.
  			 */
  var item: js.Any = js.native
  /**
  			 * Coordinates x and y of the event from the parent view's coordinate system.
  			 */
  var location: Point = js.native
}

object DashboardViewClickEvent {
  @scala.inline
  def apply(item: js.Any, location: Point, source: DashboardView): DashboardViewClickEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewClickEvent]
  }
  @scala.inline
  implicit class DashboardViewClickEventOps[Self <: DashboardViewClickEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

