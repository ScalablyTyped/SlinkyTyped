package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.Point
import typingsSlinky.titanium.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the table view stops scrolling.
		 */
@js.native
trait TableViewScrollendEvent extends TableViewBaseEvent {
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
  			 * Dictionary with `width` and `height` properties containing the size of the visible
  			 * table view.
  			 */
  var size: Size = js.native
  /**
  			 * X coordinate of the event from the `source` view's coordinate system.
  			 */
  var x: Double = js.native
  /**
  			 * Y coordinate of the event from the `source` view's coordinate system.
  			 */
  var y: Double = js.native
}

object TableViewScrollendEvent {
  @scala.inline
  def apply(contentOffset: Point, contentSize: Size, size: Size, source: TableView, x: Double, y: Double): TableViewScrollendEvent = {
    val __obj = js.Dynamic.literal(contentOffset = contentOffset.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewScrollendEvent]
  }
  @scala.inline
  implicit class TableViewScrollendEventOps[Self <: TableViewScrollendEvent] (val x: Self) extends AnyVal {
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
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

