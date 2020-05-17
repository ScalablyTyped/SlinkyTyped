package typingsSlinky.uiGrid.anon

import typingsSlinky.angular.mod.IScope
import typingsSlinky.uiGrid.mod.canvasHeightChangedHandler
import typingsSlinky.uiGrid.mod.columnVisibilityChangedHandler
import typingsSlinky.uiGrid.mod.filterChangedHandler
import typingsSlinky.uiGrid.mod.rowsRenderedHandler
import typingsSlinky.uiGrid.mod.rowsVisibleChangedHandler
import typingsSlinky.uiGrid.mod.scrollBeginHandler
import typingsSlinky.uiGrid.mod.scrollEndHandler
import typingsSlinky.uiGrid.mod.sortChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasHeightChanged[TEntity] extends js.Object {
  /**
    * is raised when the canvas height has changed
    * @param {ng.IScope} scope Grid scope
    * @param {canvasHeightChangedHandler} handler Callback
    */
  def canvasHeightChanged(scope: IScope, handler: canvasHeightChangedHandler): Unit = js.native
  /**
    * The visibility of a column has changed, the column itself is passed out as a parameter of the event
    * @param {ng.IScope} scope The scope of the controller. This is used to deregister this event when the
    *        scope is destroyed
    * @param {columnVisibilityChangedHandler} callBack Will be called when the event is emited.
    *        The function passes back the GridCol that has changed
    */
  def columnVisibilityChanged(scope: IScope, callBack: columnVisibilityChangedHandler[TEntity]): Unit = js.native
  /**
    * is raised after the filter is changed.
    * The nature of the watch expression doesn't allow notification of what changed,
    * so the receiver of this event will need to re-extract the filter conditions from the columns.
    * @param {ng.IScope} scope Grid scope
    * @param {filterChangedHandler} handler Callback
    */
  def filterChanged(scope: IScope, handler: filterChangedHandler[TEntity]): Unit = js.native
  /**
    * is raised after the cache of visible rows is changed
    * @param {ng.IScope} scope Grid scope
    * @param {rowsRenderedHandler} handler callback
    */
  def rowsRendered(scope: IScope, handler: rowsRenderedHandler[TEntity]): Unit = js.native
  /**
    * is raised after the rows that are visible change.
    * The filtering is zero-based, so it isn't possible to say which rows changed
    * (unlike in the selection feature). We can plausibly know which row was changed when setRowInvisible is
    * called, but in that situation the user already knows which row they changed.
    * When a filter runs we don't know what changed, and that is the one that would have been useful.
    * @param {ng.IScope} scope Grid scope
    * @param {rowsVisibleChangedHandler} handler callback
    */
  def rowsVisibleChanged(scope: IScope, handler: rowsVisibleChangedHandler[TEntity]): Unit = js.native
  /**
    * is raised when scroll begins. Is throttled, so won't be raised too frequently
    * @param {ng.IScope} scope Grid scope
    * @param {scrollBeginHandler} handler callback
    */
  def scrollBegin(scope: IScope, handler: scrollBeginHandler): Unit = js.native
  /**
    * is raised when scroll has finished. Is throttled, so won't be raised too frequently
    * @param {ng.IScope} scope Grid scope
    * @param {scrollEndHandler} handler callback
    */
  def scrollEnd(scope: IScope, handler: scrollEndHandler): Unit = js.native
  /**
    * is raised after the sort criteria on one or more columns have changed
    * @param {ng.IScope} scope Grid scope
    * @param {sortChangedHandler} handler callback
    */
  def sortChanged(scope: IScope, handler: sortChangedHandler[TEntity]): Unit = js.native
}

object CanvasHeightChanged {
  @scala.inline
  def apply[TEntity](
    canvasHeightChanged: (IScope, canvasHeightChangedHandler) => Unit,
    columnVisibilityChanged: (IScope, columnVisibilityChangedHandler[TEntity]) => Unit,
    filterChanged: (IScope, filterChangedHandler[TEntity]) => Unit,
    rowsRendered: (IScope, rowsRenderedHandler[TEntity]) => Unit,
    rowsVisibleChanged: (IScope, rowsVisibleChangedHandler[TEntity]) => Unit,
    scrollBegin: (IScope, scrollBeginHandler) => Unit,
    scrollEnd: (IScope, scrollEndHandler) => Unit,
    sortChanged: (IScope, sortChangedHandler[TEntity]) => Unit
  ): CanvasHeightChanged[TEntity] = {
    val __obj = js.Dynamic.literal(canvasHeightChanged = js.Any.fromFunction2(canvasHeightChanged), columnVisibilityChanged = js.Any.fromFunction2(columnVisibilityChanged), filterChanged = js.Any.fromFunction2(filterChanged), rowsRendered = js.Any.fromFunction2(rowsRendered), rowsVisibleChanged = js.Any.fromFunction2(rowsVisibleChanged), scrollBegin = js.Any.fromFunction2(scrollBegin), scrollEnd = js.Any.fromFunction2(scrollEnd), sortChanged = js.Any.fromFunction2(sortChanged))
    __obj.asInstanceOf[CanvasHeightChanged[TEntity]]
  }
  @scala.inline
  implicit class CanvasHeightChangedOps[Self[tentity] <: CanvasHeightChanged[tentity], TEntity] (val x: Self[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntity] with Other]
    @scala.inline
    def withCanvasHeightChanged(value: (IScope, canvasHeightChangedHandler) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasHeightChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withColumnVisibilityChanged(value: (IScope, columnVisibilityChangedHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnVisibilityChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFilterChanged(value: (IScope, filterChangedHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRowsRendered(value: (IScope, rowsRenderedHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsRendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRowsVisibleChanged(value: (IScope, rowsVisibleChangedHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsVisibleChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScrollBegin(value: (IScope, scrollBeginHandler) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBegin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScrollEnd(value: (IScope, scrollEndHandler) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSortChanged(value: (IScope, sortChangedHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortChanged")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

