package typingsSlinky.uiGrid

import typingsSlinky.angular.mod.IScope
import typingsSlinky.uiGrid.mod.expandable.rowExpandedStateChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRowExpandedStateChanged[TEntity] extends js.Object {
  /**
    * raised when cell editing is complete
    * @param {ng.IScope} scope
    * @param {rowExpandedStateChangedHandler} handler
    */
  def rowExpandedStateChanged(scope: IScope, handler: rowExpandedStateChangedHandler[TEntity]): Unit = js.native
}

object AnonRowExpandedStateChanged {
  @scala.inline
  def apply[TEntity](rowExpandedStateChanged: (IScope, rowExpandedStateChangedHandler[TEntity]) => Unit): AnonRowExpandedStateChanged[TEntity] = {
    val __obj = js.Dynamic.literal(rowExpandedStateChanged = js.Any.fromFunction2(rowExpandedStateChanged))
    __obj.asInstanceOf[AnonRowExpandedStateChanged[TEntity]]
  }
  @scala.inline
  implicit class AnonRowExpandedStateChangedOps[Self[tentity] <: AnonRowExpandedStateChanged[tentity], TEntity] (val x: Self[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntity] with Other]
    @scala.inline
    def withRowExpandedStateChanged(value: (IScope, rowExpandedStateChangedHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpandedStateChanged")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

