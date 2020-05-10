package typingsSlinky.uiGrid

import typingsSlinky.angular.mod.IScope
import typingsSlinky.uiGrid.mod.pagination.paginationChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPaginationChanged extends js.Object {
  /**
    * This event fires when the pageSize or currentPage changes
    * @param {ng.IScope} scope The grid scope
    * @param {paginationChangedHandler} handler Callback
    */
  def paginationChanged(scope: IScope, handler: paginationChangedHandler): Unit = js.native
}

object AnonPaginationChanged {
  @scala.inline
  def apply(paginationChanged: (IScope, paginationChangedHandler) => Unit): AnonPaginationChanged = {
    val __obj = js.Dynamic.literal(paginationChanged = js.Any.fromFunction2(paginationChanged))
    __obj.asInstanceOf[AnonPaginationChanged]
  }
  @scala.inline
  implicit class AnonPaginationChangedOps[Self <: AnonPaginationChanged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaginationChanged(value: (IScope, paginationChangedHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationChanged")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

