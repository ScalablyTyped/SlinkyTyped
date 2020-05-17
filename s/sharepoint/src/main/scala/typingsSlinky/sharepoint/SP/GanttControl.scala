package typingsSlinky.sharepoint.SP

import typingsSlinky.sharepoint.SP.JsGrid.ColumnInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttControl extends js.Object {
  def get_Columns(): js.Array[ColumnInfo] = js.native
}

object GanttControl {
  @scala.inline
  def apply(get_Columns: () => js.Array[ColumnInfo]): GanttControl = {
    val __obj = js.Dynamic.literal(get_Columns = js.Any.fromFunction0(get_Columns))
    __obj.asInstanceOf[GanttControl]
  }
  @scala.inline
  implicit class GanttControlOps[Self <: GanttControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_Columns(value: () => js.Array[ColumnInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_Columns")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

