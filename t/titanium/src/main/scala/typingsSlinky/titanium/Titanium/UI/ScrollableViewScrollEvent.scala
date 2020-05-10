package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired repeatedly as the view is being scrolled.
		 */
@js.native
trait ScrollableViewScrollEvent extends ScrollableViewBaseEvent {
  /**
  			 * Index of the currently visible view of <Titanium.UI.ScrollableView.views>.
  			 */
  var currentPage: Double = js.native
  /**
  			 * Current page index that the view is scrolled to as a float. For
  			 * example, if the user is holding the `ScrollableView` in between
  			 * the first and second page, this will have a value of 0.5.
  			 */
  var currentPageAsFloat: Double = js.native
  /**
  			 * The currently visible view.
  			 */
  var view: View = js.native
}

object ScrollableViewScrollEvent {
  @scala.inline
  def apply(currentPage: Double, currentPageAsFloat: Double, source: ScrollableView, view: View): ScrollableViewScrollEvent = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], currentPageAsFloat = currentPageAsFloat.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableViewScrollEvent]
  }
  @scala.inline
  implicit class ScrollableViewScrollEventOps[Self <: ScrollableViewScrollEvent] (val x: Self) extends AnyVal {
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
    def withCurrentPageAsFloat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageAsFloat")(value.asInstanceOf[js.Any])
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

