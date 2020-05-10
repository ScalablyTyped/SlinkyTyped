package typingsSlinky.uiGrid.mod.expandable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridRow extends js.Object {
  /**
    * If set to true, the row is expanded and the expanded view is visible
    * Defaults to false
    * @default false
    */
  var isExpanded: js.UndefOr[Boolean] = js.native
}

object IGridRow {
  @scala.inline
  def apply(): IGridRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridRow]
  }
  @scala.inline
  implicit class IGridRowOps[Self <: IGridRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.undefined)
        ret
    }
  }
  
}

