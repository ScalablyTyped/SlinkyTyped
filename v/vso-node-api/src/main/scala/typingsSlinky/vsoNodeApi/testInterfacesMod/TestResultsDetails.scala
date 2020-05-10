package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResultsDetails extends js.Object {
  var groupByField: String = js.native
  var resultsForGroup: js.Array[TestResultsDetailsForGroup] = js.native
}

object TestResultsDetails {
  @scala.inline
  def apply(groupByField: String, resultsForGroup: js.Array[TestResultsDetailsForGroup]): TestResultsDetails = {
    val __obj = js.Dynamic.literal(groupByField = groupByField.asInstanceOf[js.Any], resultsForGroup = resultsForGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsDetails]
  }
  @scala.inline
  implicit class TestResultsDetailsOps[Self <: TestResultsDetails] (val x: Self) extends AnyVal {
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
    def withResultsForGroup(value: js.Array[TestResultsDetailsForGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsForGroup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

