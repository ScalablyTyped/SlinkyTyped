package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired as soon as the device detects a touch gesture against this view.
		 */
@js.native
trait TableViewTouchstartEvent extends TableViewBaseEvent {
  /**
  			 * A value which indicates the stylus angle on the screen. If the stylus is perpendicular to the screen or no stylus is
  			 * being used, the value will be Pi/2. If the stylus is parallel to the screen, the value will be 0.
  			 * Note: This property is only available for iOS devices that support 3D-Touch and are 9.1 or later.
  			 */
  var altitudeAngle: Double = js.native
  /**
  			 * The current force value of the touch event.
  			 * Note: This property only available for iOS devices that support 3D-Touch and run 9.0 or later.
  			 */
  var force: Double = js.native
  /**
  			 * Row index.
  			 */
  var index: Double = js.native
  /**
  			 * Maximum possible value of the force property.
  			 * Note: This property is only available for iOS devices that support 3D-Touch and run 9.0 or later.
  			 */
  var maximumPossibleForce: Double = js.native
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
  			 * The time (in seconds) when the touch was used in correlation with the system start up.
  			 *  Note: This property is only available for iOS devices that support 3D-Touch and run 9.0 or later.
  			 */
  var timestamp: Double = js.native
  /**
  			 * X coordinate of the event from the `source` view's coordinate system.
  			 */
  var x: Double = js.native
  /**
  			 * Y coordinate of the event from the `source` view's coordinate system.
  			 */
  var y: Double = js.native
}

object TableViewTouchstartEvent {
  @scala.inline
  def apply(
    altitudeAngle: Double,
    force: Double,
    index: Double,
    maximumPossibleForce: Double,
    row: TableViewRow,
    rowData: Dictionary[TableViewRow],
    source: TableView,
    timestamp: Double,
    x: Double,
    y: Double
  ): TableViewTouchstartEvent = {
    val __obj = js.Dynamic.literal(altitudeAngle = altitudeAngle.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], maximumPossibleForce = maximumPossibleForce.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewTouchstartEvent]
  }
  @scala.inline
  implicit class TableViewTouchstartEventOps[Self <: TableViewTouchstartEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltitudeAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitudeAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumPossibleForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPossibleForce")(value.asInstanceOf[js.Any])
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
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
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

