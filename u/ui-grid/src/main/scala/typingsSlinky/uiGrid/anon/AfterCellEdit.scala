package typingsSlinky.uiGrid.anon

import typingsSlinky.angular.mod.IScope
import typingsSlinky.uiGrid.mod.edit.afterCellEditHandler
import typingsSlinky.uiGrid.mod.edit.beginCellEditHandler
import typingsSlinky.uiGrid.mod.edit.cancelCellEditHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterCellEdit[TEntity] extends js.Object {
  /**
    * raised when cell editing is complete
    * @param scope The grid scope
    * @param {afterCellEditHandler} handler Callback
    */
  def afterCellEdit(scope: IScope, handler: afterCellEditHandler[TEntity]): Unit = js.native
  /**
    * raised when cell editing starts on a cell
    * @param scope The grid scope
    * @param {beginCellEditHandler} handler Callback
    */
  def beginCellEdit(scope: IScope, handler: beginCellEditHandler[TEntity]): Unit = js.native
  /**
    * raised when cell editing is cancelled on a cell
    * @param scope The grid scope
    * @param {cancelCellEditHandler} handler Callback
    */
  def cancelCellEdit(scope: IScope, handler: cancelCellEditHandler[TEntity]): Unit = js.native
}

object AfterCellEdit {
  @scala.inline
  def apply[TEntity](
    afterCellEdit: (IScope, afterCellEditHandler[TEntity]) => Unit,
    beginCellEdit: (IScope, beginCellEditHandler[TEntity]) => Unit,
    cancelCellEdit: (IScope, cancelCellEditHandler[TEntity]) => Unit
  ): AfterCellEdit[TEntity] = {
    val __obj = js.Dynamic.literal(afterCellEdit = js.Any.fromFunction2(afterCellEdit), beginCellEdit = js.Any.fromFunction2(beginCellEdit), cancelCellEdit = js.Any.fromFunction2(cancelCellEdit))
    __obj.asInstanceOf[AfterCellEdit[TEntity]]
  }
  @scala.inline
  implicit class AfterCellEditOps[Self[tentity] <: AfterCellEdit[tentity], TEntity] (val x: Self[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntity] with Other]
    @scala.inline
    def withAfterCellEdit(value: (IScope, afterCellEditHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCellEdit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBeginCellEdit(value: (IScope, beginCellEditHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginCellEdit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCancelCellEdit(value: (IScope, cancelCellEditHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelCellEdit")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

