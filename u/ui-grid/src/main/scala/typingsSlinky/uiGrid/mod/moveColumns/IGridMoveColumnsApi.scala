package typingsSlinky.uiGrid.mod.moveColumns

import typingsSlinky.uiGrid.anon.ColumnPositionChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridMoveColumnsApi extends js.Object {
  // Events
  var on: ColumnPositionChanged = js.native
  // Methods
  /**
    * Method can be used to change column position
    * @param {number} originalPosition Original column position as a 0 indexed integer
    * @param {number} newPosition New column position as a 0 indexed integer
    */
  def moveColumn(originalPosition: Double, newPosition: Double): Unit = js.native
}

object IGridMoveColumnsApi {
  @scala.inline
  def apply(moveColumn: (Double, Double) => Unit, on: ColumnPositionChanged): IGridMoveColumnsApi = {
    val __obj = js.Dynamic.literal(moveColumn = js.Any.fromFunction2(moveColumn), on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridMoveColumnsApi]
  }
  @scala.inline
  implicit class IGridMoveColumnsApiOps[Self <: IGridMoveColumnsApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMoveColumn(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveColumn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(value: ColumnPositionChanged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

