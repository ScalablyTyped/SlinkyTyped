package typingsSlinky.uiGrid.mod.grouping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridTreeAggregations extends js.Object {
  var aggregation: String = js.native
  var colName: String = js.native
  var field: String = js.native
}

object IGridTreeAggregations {
  @scala.inline
  def apply(aggregation: String, colName: String, field: String): IGridTreeAggregations = {
    val __obj = js.Dynamic.literal(aggregation = aggregation.asInstanceOf[js.Any], colName = colName.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridTreeAggregations]
  }
  @scala.inline
  implicit class IGridTreeAggregationsOps[Self <: IGridTreeAggregations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

