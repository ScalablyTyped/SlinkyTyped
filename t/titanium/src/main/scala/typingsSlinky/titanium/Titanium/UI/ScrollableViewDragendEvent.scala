package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the scrolling drag gesture on the view has been completed.
		 */
@js.native
trait ScrollableViewDragendEvent extends ScrollableViewBaseEvent {
  /**
  			 * Index of the currently visible view of <Titanium.UI.ScrollableView.views>.
  			 */
  var currentPage: Double = js.native
  /**
  			 * The currently visible view.
  			 */
  var view: View = js.native
}

object ScrollableViewDragendEvent {
  @scala.inline
  def apply(currentPage: Double, source: ScrollableView, view: View): ScrollableViewDragendEvent = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableViewDragendEvent]
  }
  @scala.inline
  implicit class ScrollableViewDragendEventOps[Self <: ScrollableViewDragendEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

