package typingsSlinky.sqlJs.moduleMod.SqlJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResults extends js.Object {
  var columns: js.Array[String] = js.native
  var values: js.Array[js.Array[ValueType]] = js.native
}

object QueryResults {
  @scala.inline
  def apply(columns: js.Array[String], values: js.Array[js.Array[ValueType]]): QueryResults = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResults]
  }
  @scala.inline
  implicit class QueryResultsOps[Self <: QueryResults] (val x: Self) extends AnyVal {
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
    def withValues(value: js.Array[js.Array[ValueType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

