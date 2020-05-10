package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultsFilter extends js.Object {
  var automatedTestName: String = js.native
  var branch: String = js.native
  var groupBy: String = js.native
  var maxCompleteDate: js.Date = js.native
  var resultsCount: Double = js.native
  var testCaseReferenceIds: js.Array[Double] = js.native
  var testResultsContext: TestResultsContext = js.native
  var trendDays: Double = js.native
}

object ResultsFilter {
  @scala.inline
  def apply(
    automatedTestName: String,
    branch: String,
    groupBy: String,
    maxCompleteDate: js.Date,
    resultsCount: Double,
    testCaseReferenceIds: js.Array[Double],
    testResultsContext: TestResultsContext,
    trendDays: Double
  ): ResultsFilter = {
    val __obj = js.Dynamic.literal(automatedTestName = automatedTestName.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any], maxCompleteDate = maxCompleteDate.asInstanceOf[js.Any], resultsCount = resultsCount.asInstanceOf[js.Any], testCaseReferenceIds = testCaseReferenceIds.asInstanceOf[js.Any], testResultsContext = testResultsContext.asInstanceOf[js.Any], trendDays = trendDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultsFilter]
  }
  @scala.inline
  implicit class ResultsFilterOps[Self <: ResultsFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomatedTestName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatedTestName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxCompleteDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCompleteDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestCaseReferenceIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCaseReferenceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestResultsContext(value: TestResultsContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResultsContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrendDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendDays")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

