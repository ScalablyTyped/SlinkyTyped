package typingsSlinky.uiGrid.anon

import typingsSlinky.angular.mod.IScope
import typingsSlinky.uiGrid.mod.treeBase.rowCollapsedHandler
import typingsSlinky.uiGrid.mod.treeBase.rowExpandedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowCollapsed[TEntity] extends js.Object {
  /**
    * Raised when a row is collapsed.  Doesn't really have a purpose at the moment.  Included for symmetry
    * @param {ng.IScope} scope Grid scope
    * @param {rowCollapsedHandler} handler Callback
    */
  def rowCollapsed(scope: IScope, handler: rowCollapsedHandler[TEntity]): Unit = js.native
  /**
    * Raised whenever a row is expanded.
    *
    * If you are dynamically rendering your tree,
    * in your callback you can retrieve the children of this row and load them into the grid data.
    *
    * When the data is loaded, the grid will automatically refresh to show these new rows.
    * @param {ng.IScope} scope Grid Scope
    * @param {rowExpandedHandler} handler Callback
    */
  def rowExpanded(scope: IScope, handler: rowExpandedHandler[TEntity]): Unit = js.native
}

object RowCollapsed {
  @scala.inline
  def apply[TEntity](
    rowCollapsed: (IScope, rowCollapsedHandler[TEntity]) => Unit,
    rowExpanded: (IScope, rowExpandedHandler[TEntity]) => Unit
  ): RowCollapsed[TEntity] = {
    val __obj = js.Dynamic.literal(rowCollapsed = js.Any.fromFunction2(rowCollapsed), rowExpanded = js.Any.fromFunction2(rowExpanded))
    __obj.asInstanceOf[RowCollapsed[TEntity]]
  }
  @scala.inline
  implicit class RowCollapsedOps[Self[tentity] <: RowCollapsed[tentity], TEntity] (val x: Self[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntity] with Other]
    @scala.inline
    def withRowCollapsed(value: (IScope, rowCollapsedHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCollapsed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRowExpanded(value: (IScope, rowExpandedHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpanded")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

