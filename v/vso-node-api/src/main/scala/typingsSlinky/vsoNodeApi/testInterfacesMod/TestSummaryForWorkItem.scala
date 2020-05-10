package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSummaryForWorkItem extends js.Object {
  var summary: AggregatedDataForResultTrend = js.native
  var workItem: WorkItemReference = js.native
}

object TestSummaryForWorkItem {
  @scala.inline
  def apply(summary: AggregatedDataForResultTrend, workItem: WorkItemReference): TestSummaryForWorkItem = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any], workItem = workItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSummaryForWorkItem]
  }
  @scala.inline
  implicit class TestSummaryForWorkItemOps[Self <: TestSummaryForWorkItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSummary(value: AggregatedDataForResultTrend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItem(value: WorkItemReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

