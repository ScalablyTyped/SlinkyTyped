package typingsSlinky.uiGrid

import typingsSlinky.angular.mod.IScope
import typingsSlinky.uiGrid.mod.selection.rowSelectionChangedBatchHandler
import typingsSlinky.uiGrid.mod.selection.rowSelectionChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRowSelectionChanged[TEntity] extends js.Object {
  /**
    * is raised after the row.isSelected state is changed
    * @param {ng.IScope} scope grid scope
    * @param {rowSelectionChangedHandler} handler callback
    */
  def rowSelectionChanged(scope: IScope, handler: rowSelectionChangedHandler[TEntity]): Unit = js.native
  /**
    * is raised after the row.isSelected state is changed in bulk,
    * if the enableSelectionBatchEvent option is set to true (which it is by default).
    * This allows more efficient processing of bulk events.
    * @param {ng.IScope} scope grid scope
    * @param {rowSelectionChangedBatchHandler} handler callback
    */
  def rowSelectionChangedBatch(scope: IScope, handler: rowSelectionChangedBatchHandler[TEntity]): Unit = js.native
}

object AnonRowSelectionChanged {
  @scala.inline
  def apply[TEntity](
    rowSelectionChanged: (IScope, rowSelectionChangedHandler[TEntity]) => Unit,
    rowSelectionChangedBatch: (IScope, rowSelectionChangedBatchHandler[TEntity]) => Unit
  ): AnonRowSelectionChanged[TEntity] = {
    val __obj = js.Dynamic.literal(rowSelectionChanged = js.Any.fromFunction2(rowSelectionChanged), rowSelectionChangedBatch = js.Any.fromFunction2(rowSelectionChangedBatch))
    __obj.asInstanceOf[AnonRowSelectionChanged[TEntity]]
  }
  @scala.inline
  implicit class AnonRowSelectionChangedOps[Self[tentity] <: AnonRowSelectionChanged[tentity], TEntity] (val x: Self[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntity] with Other]
    @scala.inline
    def withRowSelectionChanged(value: (IScope, rowSelectionChangedHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelectionChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRowSelectionChangedBatch(value: (IScope, rowSelectionChangedBatchHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelectionChangedBatch")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

