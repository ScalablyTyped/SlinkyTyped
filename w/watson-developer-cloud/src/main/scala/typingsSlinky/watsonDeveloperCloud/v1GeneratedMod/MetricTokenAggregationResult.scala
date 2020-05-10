package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Aggregation result data for the requested metric. */
@js.native
trait MetricTokenAggregationResult extends js.Object {
  /** The number of queries with associated events divided by the total number of queries currently stored (queries and events are stored in the log for 30 days). */
  var event_rate: js.UndefOr[Double] = js.native
  /** The content of the **natural_language_query** parameter used in the query that this result represents. */
  var key: js.UndefOr[String] = js.native
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.native
}

object MetricTokenAggregationResult {
  @scala.inline
  def apply(): MetricTokenAggregationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricTokenAggregationResult]
  }
  @scala.inline
  implicit class MetricTokenAggregationResultOps[Self <: MetricTokenAggregationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent_rate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_rate")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMatching_results(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matching_results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatching_results: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matching_results")(js.undefined)
        ret
    }
  }
  
}

