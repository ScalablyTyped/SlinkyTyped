package typingsSlinky.tablesorter.columnWidgetOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnOptions extends js.Object {
  /**
    * The names of the classes to apply when sorting in chronological order.
    */
  var columns: js.UndefOr[js.Array[String]] = js.native
  /**
    * A value indicating whether the class specified in `columns` should also be applied to the table-foot.
    */
  var columns_tfoot: js.UndefOr[Boolean] = js.native
  /**
    * A value indicating whether the class specified in `columns` should also be applied to the table-head.
    */
  var columns_thead: js.UndefOr[Boolean] = js.native
}

object ColumnOptions {
  @scala.inline
  def apply(): ColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnOptions]
  }
  @scala.inline
  implicit class ColumnOptionsOps[Self <: ColumnOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns_tfoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns_tfoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns_tfoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns_tfoot")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns_thead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns_thead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns_thead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns_thead")(js.undefined)
        ret
    }
  }
  
}

