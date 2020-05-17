package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleDataTable extends js.Object {
  def get_rows(): js.Array[_] = js.native
}

object SimpleDataTable {
  @scala.inline
  def apply(get_rows: () => js.Array[_]): SimpleDataTable = {
    val __obj = js.Dynamic.literal(get_rows = js.Any.fromFunction0(get_rows))
    __obj.asInstanceOf[SimpleDataTable]
  }
  @scala.inline
  implicit class SimpleDataTableOps[Self <: SimpleDataTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_rows(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_rows")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

