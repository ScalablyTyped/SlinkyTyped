package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the view has stopped moving completely.
		 */
@js.native
trait ScrollableViewScrollendEvent extends ScrollableViewBaseEvent {
  /**
  			 * Index of the currently visible view of <Titanium.UI.ScrollableView.views>.
  			 */
  var currentPage: Double = js.native
  /**
  			 * The currently visible view.
  			 */
  var view: View = js.native
}

object ScrollableViewScrollendEvent {
  @scala.inline
  def apply(currentPage: Double, source: ScrollableView, view: View): ScrollableViewScrollendEvent = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableViewScrollendEvent]
  }
  @scala.inline
  implicit class ScrollableViewScrollendEventOps[Self <: ScrollableViewScrollendEvent] (val x: Self) extends AnyVal {
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

