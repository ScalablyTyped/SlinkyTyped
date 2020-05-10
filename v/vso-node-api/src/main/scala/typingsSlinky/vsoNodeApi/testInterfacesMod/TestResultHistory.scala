package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResultHistory extends js.Object {
  var groupByField: String = js.native
  var resultsForGroup: js.Array[TestResultHistoryDetailsForGroup] = js.native
}

object TestResultHistory {
  @scala.inline
  def apply(groupByField: String, resultsForGroup: js.Array[TestResultHistoryDetailsForGroup]): TestResultHistory = {
    val __obj = js.Dynamic.literal(groupByField = groupByField.asInstanceOf[js.Any], resultsForGroup = resultsForGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultHistory]
  }
  @scala.inline
  implicit class TestResultHistoryOps[Self <: TestResultHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupByField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultsForGroup(value: js.Array[TestResultHistoryDetailsForGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsForGroup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

