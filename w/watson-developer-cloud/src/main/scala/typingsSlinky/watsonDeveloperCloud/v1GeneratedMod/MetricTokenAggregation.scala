package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An aggregation analyzing log information for queries and events. */
@js.native
trait MetricTokenAggregation extends js.Object {
  /** The event type associated with this metric result. This field, when present, will always be `click`. */
  var event_type: js.UndefOr[String] = js.native
  /** Array of results for the metric token aggregation. */
  var results: js.UndefOr[js.Array[MetricTokenAggregationResult]] = js.native
}

object MetricTokenAggregation {
  @scala.inline
  def apply(): MetricTokenAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricTokenAggregation]
  }
  @scala.inline
  implicit class MetricTokenAggregationOps[Self <: MetricTokenAggregation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_type")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: js.Array[MetricTokenAggregationResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
  }
  
}

