package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the device detects a long press.
		 */
@js.native
trait TableViewLongpressEvent extends TableViewBaseEvent {
  /**
  			 * Row index.
  			 */
  var index: Double = js.native
  /**
  			 * Table view row object.
  			 */
  var row: TableViewRow = js.native
  /**
  			 * Properties of the row.
  			 * When the row is created implicitly using a JavaScript dictionary object,
  			 * use this property rather than `row` to access any custom row properties.
  			 * Here's an example of creating a row implicitly, which is not the recommended way.
  			 *     var data = [{title:'Row 1', hasChild:true, color:'red', selectedColor:'#fff', special:'special 1'},];
  			 *     var table = Ti.UI.createTableView({data: data});
  			 */
  var rowData: Dictionary[TableViewRow] = js.native
  /**
  			 * X coordinate of the event from the `source` view's coordinate system.
  			 */
  var x: Double = js.native
  /**
  			 * Y coordinate of the event from the `source` view's coordinate system.
  			 */
  var y: Double = js.native
}

object TableViewLongpressEvent {
  @scala.inline
  def apply(
    index: Double,
    row: TableViewRow,
    rowData: Dictionary[TableViewRow],
    source: TableView,
    x: Double,
    y: Double
  ): TableViewLongpressEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewLongpressEvent]
  }
  @scala.inline
  implicit class TableViewLongpressEventOps[Self <: TableViewLongpressEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

