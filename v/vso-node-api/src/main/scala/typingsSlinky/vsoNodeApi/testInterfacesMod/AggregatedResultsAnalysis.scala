package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregatedResultsAnalysis extends js.Object {
  var duration: js.Any = js.native
  var notReportedResultsByOutcome: NumberDictionary[AggregatedResultsByOutcome] = js.native
  var previousContext: TestResultsContext = js.native
  var resultsByOutcome: NumberDictionary[AggregatedResultsByOutcome] = js.native
  var resultsDifference: AggregatedResultsDifference = js.native
  var totalTests: Double = js.native
}

object AggregatedResultsAnalysis {
  @scala.inline
  def apply(
    duration: js.Any,
    notReportedResultsByOutcome: NumberDictionary[AggregatedResultsByOutcome],
    previousContext: TestResultsContext,
    resultsByOutcome: NumberDictionary[AggregatedResultsByOutcome],
    resultsDifference: AggregatedResultsDifference,
    totalTests: Double
  ): AggregatedResultsAnalysis = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], notReportedResultsByOutcome = notReportedResultsByOutcome.asInstanceOf[js.Any], previousContext = previousContext.asInstanceOf[js.Any], resultsByOutcome = resultsByOutcome.asInstanceOf[js.Any], resultsDifference = resultsDifference.asInstanceOf[js.Any], totalTests = totalTests.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedResultsAnalysis]
  }
  @scala.inline
  implicit class AggregatedResultsAnalysisOps[Self <: AggregatedResultsAnalysis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotReportedResultsByOutcome(value: NumberDictionary[AggregatedResultsByOutcome]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notReportedResultsByOutcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousContext(value: TestResultsContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultsByOutcome(value: NumberDictionary[AggregatedResultsByOutcome]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsByOutcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultsDifference(value: AggregatedResultsDifference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsDifference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTests")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

