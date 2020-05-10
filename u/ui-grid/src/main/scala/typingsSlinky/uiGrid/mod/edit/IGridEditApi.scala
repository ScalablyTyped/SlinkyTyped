package typingsSlinky.uiGrid.mod.edit

import typingsSlinky.uiGrid.AnonAfterCellEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridEditApi[TEntity] extends js.Object {
  var on: AnonAfterCellEdit[TEntity] = js.native
}

object IGridEditApi {
  @scala.inline
  def apply[TEntity](on: AnonAfterCellEdit[TEntity]): IGridEditApi[TEntity] = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridEditApi[TEntity]]
  }
  @scala.inline
  implicit class IGridEditApiOps[Self[tentity] <: IGridEditApi[tentity], TEntity] (val x: Self[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntity] with Other]
    @scala.inline
    def withOn(value: AnonAfterCellEdit[TEntity]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

