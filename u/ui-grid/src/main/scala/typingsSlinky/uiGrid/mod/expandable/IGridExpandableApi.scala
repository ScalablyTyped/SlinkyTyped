package typingsSlinky.uiGrid.mod.expandable

import typingsSlinky.uiGrid.AnonRowExpandedStateChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridExpandableApi[TEntity] extends js.Object {
  // Events
  var on: AnonRowExpandedStateChanged[TEntity] = js.native
  // Methods
  /**
    * Collapse all subgrids.
    */
  def collapseAllRows(): Unit = js.native
  /**
    * expand all subgrids
    */
  def expandAllRows(): Unit = js.native
  /**
    * Toggle all subgrids
    */
  def toggleAllRows(): Unit = js.native
  /**
    * Toggle a specific row
    * @param {TEntity} rowEntity The data entity for the row you want to expand
    */
  def toggleRowExpansion(rowEntity: TEntity): Unit = js.native
}

object IGridExpandableApi {
  @scala.inline
  def apply[TEntity](
    collapseAllRows: () => Unit,
    expandAllRows: () => Unit,
    on: AnonRowExpandedStateChanged[TEntity],
    toggleAllRows: () => Unit,
    toggleRowExpansion: TEntity => Unit
  ): IGridExpandableApi[TEntity] = {
    val __obj = js.Dynamic.literal(collapseAllRows = js.Any.fromFunction0(collapseAllRows), expandAllRows = js.Any.fromFunction0(expandAllRows), on = on.asInstanceOf[js.Any], toggleAllRows = js.Any.fromFunction0(toggleAllRows), toggleRowExpansion = js.Any.fromFunction1(toggleRowExpansion))
    __obj.asInstanceOf[IGridExpandableApi[TEntity]]
  }
  @scala.inline
  implicit class IGridExpandableApiOps[Self[tentity] <: IGridExpandableApi[tentity], TEntity] (val x: Self[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntity] with Other]
    @scala.inline
    def withCollapseAllRows(value: () => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAllRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExpandAllRows(value: () => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAllRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOn(value: AnonRowExpandedStateChanged[TEntity]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggleAllRows(value: () => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleAllRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggleRowExpansion(value: TEntity => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleRowExpansion")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

