package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestFailuresAnalysis extends js.Object {
  var existingFailures: TestFailureDetails = js.native
  var fixedTests: TestFailureDetails = js.native
  var newFailures: TestFailureDetails = js.native
  var previousContext: TestResultsContext = js.native
}

object TestFailuresAnalysis {
  @scala.inline
  def apply(
    existingFailures: TestFailureDetails,
    fixedTests: TestFailureDetails,
    newFailures: TestFailureDetails,
    previousContext: TestResultsContext
  ): TestFailuresAnalysis = {
    val __obj = js.Dynamic.literal(existingFailures = existingFailures.asInstanceOf[js.Any], fixedTests = fixedTests.asInstanceOf[js.Any], newFailures = newFailures.asInstanceOf[js.Any], previousContext = previousContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestFailuresAnalysis]
  }
  @scala.inline
  implicit class TestFailuresAnalysisOps[Self <: TestFailuresAnalysis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExistingFailures(value: TestFailureDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existingFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedTests(value: TestFailureDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewFailures(value: TestFailureDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousContext(value: TestResultsContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

