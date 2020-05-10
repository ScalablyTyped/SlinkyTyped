package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregatedDataForResultTrend extends js.Object {
  /**
    * This is tests execution duration.
    */
  var duration: js.Any = js.native
  var resultsByOutcome: NumberDictionary[AggregatedResultsByOutcome] = js.native
  var testResultsContext: TestResultsContext = js.native
  var totalTests: Double = js.native
}

object AggregatedDataForResultTrend {
  @scala.inline
  def apply(
    duration: js.Any,
    resultsByOutcome: NumberDictionary[AggregatedResultsByOutcome],
    testResultsContext: TestResultsContext,
    totalTests: Double
  ): AggregatedDataForResultTrend = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], resultsByOutcome = resultsByOutcome.asInstanceOf[js.Any], testResultsContext = testResultsContext.asInstanceOf[js.Any], totalTests = totalTests.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedDataForResultTrend]
  }
  @scala.inline
  implicit class AggregatedDataForResultTrendOps[Self <: AggregatedDataForResultTrend] (val x: Self) extends AnyVal {
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
    def withResultsByOutcome(value: NumberDictionary[AggregatedResultsByOutcome]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsByOutcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestResultsContext(value: TestResultsContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResultsContext")(value.asInstanceOf[js.Any])
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

