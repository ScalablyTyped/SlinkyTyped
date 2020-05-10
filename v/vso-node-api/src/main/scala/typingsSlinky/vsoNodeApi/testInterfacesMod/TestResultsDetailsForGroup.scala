package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResultsDetailsForGroup extends js.Object {
  var groupByValue: js.Any = js.native
  var results: js.Array[TestCaseResult] = js.native
  var resultsCountByOutcome: NumberDictionary[AggregatedResultsByOutcome] = js.native
}

object TestResultsDetailsForGroup {
  @scala.inline
  def apply(
    groupByValue: js.Any,
    results: js.Array[TestCaseResult],
    resultsCountByOutcome: NumberDictionary[AggregatedResultsByOutcome]
  ): TestResultsDetailsForGroup = {
    val __obj = js.Dynamic.literal(groupByValue = groupByValue.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], resultsCountByOutcome = resultsCountByOutcome.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsDetailsForGroup]
  }
  @scala.inline
  implicit class TestResultsDetailsForGroupOps[Self <: TestResultsDetailsForGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupByValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[TestCaseResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultsCountByOutcome(value: NumberDictionary[AggregatedResultsByOutcome]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsCountByOutcome")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

