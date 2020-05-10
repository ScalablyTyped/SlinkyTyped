package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when a table row is moved by the user.
		 */
@js.native
trait TableViewMoveEvent extends TableViewBaseEvent {
  /**
  			 * Boolean to indicate if the right area was clicked. Always `false` for this event.
  			 */
  var detail: Boolean = js.native
  /**
  			 * Row index.
  			 */
  var index: Double = js.native
  /**
  			 * Table view row object.
  			 */
  var row: TableViewRow = js.native
  /**
  			 * Properties of the row. Use this property rather than `row` to access any custom row
  			 * properties.
  			 */
  var rowData: Dictionary[TableViewRow] = js.native
  /**
  			 * Boolean to indicate if the table is in search mode. Always `false` for this event.
  			 */
  var searchMode: Boolean = js.native
  /**
  			 * Table view section object, if the deleted row is contained in a section.
  			 */
  var section: TableViewSection = js.native
  /**
  			 * X coordinate of the event from the `source` view's coordinate system.
  			 */
  var x: Double = js.native
  /**
  			 * Y coordinate of the event from the `source` view's coordinate system.
  			 */
  var y: Double = js.native
}

object TableViewMoveEvent {
  @scala.inline
  def apply(
    detail: Boolean,
    index: Double,
    row: TableViewRow,
    rowData: Dictionary[TableViewRow],
    searchMode: Boolean,
    section: TableViewSection,
    source: TableView,
    x: Double,
    y: Double
  ): TableViewMoveEvent = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], searchMode = searchMode.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewMoveEvent]
  }
  @scala.inline
  implicit class TableViewMoveEventOps[Self <: TableViewMoveEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: TableViewRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowData(value: Dictionary[TableViewRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSection(value: TableViewSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
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

