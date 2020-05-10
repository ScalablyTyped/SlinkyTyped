package typingsSlinky.uiGrid.mod.cellNav

import typingsSlinky.std.Number
import typingsSlinky.uiGrid.mod.IGridColumnOf
import typingsSlinky.uiGrid.mod.IGridRowOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowCol[TEntity] extends js.Object {
  var col: IGridColumnOf[TEntity] = js.native
  var row: IGridRowOf[TEntity] = js.native
  /**
    * Gets the intersection of where the row and column meet.
    * @returns The value from the grid data that this RowCol points to.  If the column has a cellFilter this
    *          will also apply the filter to it and return the value that the filter displays
    */
  def getIntersectionValueFiltered(): String | Number | js.Object = js.native
  /**
    * Gets the intersection of where the row and column meet
    * @returns The value from the grid data that this RowCol points to.  If the column has a cellFilter this
    *          will NOT return the filtered value.
    */
  def getIntersectionValueRaw(): String | Number | js.Object = js.native
}

object IRowCol {
  @scala.inline
  def apply[TEntity](
    col: IGridColumnOf[TEntity],
    getIntersectionValueFiltered: () => String | Number | js.Object,
    getIntersectionValueRaw: () => String | Number | js.Object,
    row: IGridRowOf[TEntity]
  ): IRowCol[TEntity] = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], getIntersectionValueFiltered = js.Any.fromFunction0(getIntersectionValueFiltered), getIntersectionValueRaw = js.Any.fromFunction0(getIntersectionValueRaw), row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowCol[TEntity]]
  }
  @scala.inline
  implicit class IRowColOps[Self[tentity] <: IRowCol[tentity], TEntity] (val x: Self[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntity] with Other]
    @scala.inline
    def withCol(value: IGridColumnOf[TEntity]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetIntersectionValueFiltered(value: () => String | Number | js.Object): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIntersectionValueFiltered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIntersectionValueRaw(value: () => String | Number | js.Object): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIntersectionValueRaw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRow(value: IGridRowOf[TEntity]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

