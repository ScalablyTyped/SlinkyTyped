package typingsSlinky.uiGrid.mod.cellNav

import typingsSlinky.angular.mod.IPromise
import typingsSlinky.uiGrid.anon.Navigate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellNavApi[TEntity] extends js.Object {
  // Events
  var on: Navigate[TEntity] = js.native
  // Methods
  /**
    * Gets the currently selected rows and columns.  array is empty if no selection has occurred
    * @returns {Array<IRowCol>} an array containing the current selection
    */
  def getCurrentSelection(): js.Array[IRowCol[TEntity]] = js.native
  /**
    * Gets the current focused cell.  value is null if no selection has occurred
    * @returns {IRowCol} the current (or last if Grid does not have focus) focused row and column
    */
  def getFocusedCell(): IRowCol[TEntity] = js.native
  /**
    * Gets the index of the passed rowCol.  Returns -1 if the RowCol isn't selected
    * @param rowCol
    * @returns the index in the order in which the RowCol was selected
    */
  def rowColSelectIndex(rowCol: IRowCol[TEntity]): Double = js.native
  /**
    * Brings the specified row and column into view, and sets focus to that cell
    * @param {TEntity} rowEntity gridOptions.data[] array instance to make visible and set focus
    * @param {IColumnDef} colDef Column definition to make visible and set focus
    */
  def scrollToFocus(rowEntity: TEntity, colDef: IColumnDef): IPromise[_] = js.native
}

object ICellNavApi {
  @scala.inline
  def apply[TEntity](
    getCurrentSelection: () => js.Array[IRowCol[TEntity]],
    getFocusedCell: () => IRowCol[TEntity],
    on: Navigate[TEntity],
    rowColSelectIndex: IRowCol[TEntity] => Double,
    scrollToFocus: (TEntity, IColumnDef) => IPromise[_]
  ): ICellNavApi[TEntity] = {
    val __obj = js.Dynamic.literal(getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getFocusedCell = js.Any.fromFunction0(getFocusedCell), on = on.asInstanceOf[js.Any], rowColSelectIndex = js.Any.fromFunction1(rowColSelectIndex), scrollToFocus = js.Any.fromFunction2(scrollToFocus))
    __obj.asInstanceOf[ICellNavApi[TEntity]]
  }
  @scala.inline
  implicit class ICellNavApiOps[Self[tentity] <: ICellNavApi[tentity], TEntity] (val x: Self[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntity] with Other]
    @scala.inline
    def withGetCurrentSelection(value: () => js.Array[IRowCol[TEntity]]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFocusedCell(value: () => IRowCol[TEntity]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFocusedCell")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOn(value: Navigate[TEntity]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowColSelectIndex(value: IRowCol[TEntity] => Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowColSelectIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScrollToFocus(value: (TEntity, IColumnDef) => IPromise[_]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToFocus")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

