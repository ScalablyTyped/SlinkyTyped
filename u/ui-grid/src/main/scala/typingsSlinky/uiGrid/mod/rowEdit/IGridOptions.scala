package typingsSlinky.uiGrid.mod.rowEdit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptions extends js.Object {
  /**
    * How long the grid should wait for another change on this row before triggering a save (in milliseconds).
    * If set to -1, then saves are never triggered by timer
    * (implying that the user will call flushDirtyRows() manually)
    */
  var rowEditWaitInterval: js.UndefOr[Double] = js.native
}

object IGridOptions {
  @scala.inline
  def apply(): IGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions]
  }
  @scala.inline
  implicit class IGridOptionsOps[Self <: IGridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowEditWaitInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditWaitInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowEditWaitInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEditWaitInterval")(js.undefined)
        ret
    }
  }
  
}

