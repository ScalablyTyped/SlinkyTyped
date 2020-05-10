package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResultSummary extends js.Object {
  var aggregatedResultsAnalysis: AggregatedResultsAnalysis = js.native
  var teamProject: TeamProjectReference = js.native
  var testFailures: TestFailuresAnalysis = js.native
  var testResultsContext: TestResultsContext = js.native
}

object TestResultSummary {
  @scala.inline
  def apply(
    aggregatedResultsAnalysis: AggregatedResultsAnalysis,
    teamProject: TeamProjectReference,
    testFailures: TestFailuresAnalysis,
    testResultsContext: TestResultsContext
  ): TestResultSummary = {
    val __obj = js.Dynamic.literal(aggregatedResultsAnalysis = aggregatedResultsAnalysis.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any], testFailures = testFailures.asInstanceOf[js.Any], testResultsContext = testResultsContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultSummary]
  }
  @scala.inline
  implicit class TestResultSummaryOps[Self <: TestResultSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedResultsAnalysis(value: AggregatedResultsAnalysis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedResultsAnalysis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamProject(value: TeamProjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestFailures(value: TestFailuresAnalysis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestResultsContext(value: TestResultsContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResultsContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

