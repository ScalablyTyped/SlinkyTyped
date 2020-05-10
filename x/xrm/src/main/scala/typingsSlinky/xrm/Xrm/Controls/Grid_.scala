package typingsSlinky.xrm.Xrm.Controls

import typingsSlinky.xrm.Xrm.Collection.ItemCollection
import typingsSlinky.xrm.Xrm.Controls.Grid.GridRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a grid.  Use Grid methods to access information about data in the grid. Grid is returned by the
  * GridControl.getGrid method.
  */
@js.native
trait Grid_ extends js.Object {
  /**
    * Returns a collection of every GridRow in the Grid.
    * @returns The rows.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  def getRows(): ItemCollection[GridRow] = js.native
  /**
    * Returns a collection of every selected GridRow in the Grid.
    * @returns The selected rows.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  def getSelectedRows(): ItemCollection[GridRow] = js.native
  /**
    * Returns the total number of records in the Grid.
    * @returns The total record count.
    */
  def getTotalRecordCount(): Double = js.native
}

object Grid_ {
  @scala.inline
  def apply(
    getRows: () => ItemCollection[GridRow],
    getSelectedRows: () => ItemCollection[GridRow],
    getTotalRecordCount: () => Double
  ): Grid_ = {
    val __obj = js.Dynamic.literal(getRows = js.Any.fromFunction0(getRows), getSelectedRows = js.Any.fromFunction0(getSelectedRows), getTotalRecordCount = js.Any.fromFunction0(getTotalRecordCount))
    __obj.asInstanceOf[Grid_]
  }
  @scala.inline
  implicit class Grid_Ops[Self <: Grid_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRows(value: () => ItemCollection[GridRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedRows(value: () => ItemCollection[GridRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTotalRecordCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalRecordCount")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

