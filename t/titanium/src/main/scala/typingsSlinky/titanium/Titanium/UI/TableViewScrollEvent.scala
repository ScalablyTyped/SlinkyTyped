package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.Point
import typingsSlinky.titanium.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the table view is scrolled.
		 */
@js.native
trait TableViewScrollEvent extends TableViewBaseEvent {
  /**
  			 * Dictionary with `x` and `y` properties containing the content offset.
  			 */
  var contentOffset: Point = js.native
  /**
  			 * Dictionary with `width` and `height` properties containing the size of the content
  			 * (regardless of the display size in the case of scrolling).
  			 */
  var contentSize: Size = js.native
  /**
  			 * Row index of the topmost visible row in the view.
  			 */
  var firstVisibleItem: Double = js.native
  /**
  			 * Dictionary with `width` and `height` properties containing the size of the visible
  			 * table view
  			 */
  var size: Size = js.native
  /**
  			 * Total number of rows in the view.
  			 */
  var totalItemCount: Double = js.native
  /**
  			 * Number of rows currently visible in the view.
  			 */
  var visibleItemCount: Double = js.native
}

object TableViewScrollEvent {
  @scala.inline
  def apply(
    contentOffset: Point,
    contentSize: Size,
    firstVisibleItem: Double,
    size: Size,
    source: TableView,
    totalItemCount: Double,
    visibleItemCount: Double
  ): TableViewScrollEvent = {
    val __obj = js.Dynamic.literal(contentOffset = contentOffset.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], firstVisibleItem = firstVisibleItem.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any], visibleItemCount = visibleItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewScrollEvent]
  }
  @scala.inline
  implicit class TableViewScrollEventOps[Self <: TableViewScrollEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentOffset(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstVisibleItem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstVisibleItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleItemCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

