package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregatedResultsByOutcome extends js.Object {
  var count: Double = js.native
  var duration: js.Any = js.native
  var groupByField: String = js.native
  var groupByValue: js.Any = js.native
  var outcome: TestOutcome = js.native
  var rerunResultCount: Double = js.native
}

object AggregatedResultsByOutcome {
  @scala.inline
  def apply(
    count: Double,
    duration: js.Any,
    groupByField: String,
    groupByValue: js.Any,
    outcome: TestOutcome,
    rerunResultCount: Double
  ): AggregatedResultsByOutcome = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], groupByField = groupByField.asInstanceOf[js.Any], groupByValue = groupByValue.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], rerunResultCount = rerunResultCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedResultsByOutcome]
  }
  @scala.inline
  implicit class AggregatedResultsByOutcomeOps[Self <: AggregatedResultsByOutcome] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupByField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupByValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutcome(value: TestOutcome): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRerunResultCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rerunResultCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

