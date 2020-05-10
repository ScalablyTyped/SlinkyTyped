package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sorter extends js.Object {
  var column: String = js.native
  var dir: SortDirection = js.native
}

object Sorter {
  @scala.inline
  def apply(column: String, dir: SortDirection): Sorter = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sorter]
  }
  @scala.inline
  implicit class SorterOps[Self <: Sorter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDir(value: SortDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

