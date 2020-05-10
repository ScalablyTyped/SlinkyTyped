package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Aggregation result data for the requested metric. */
@js.native
trait MetricAggregationResult extends js.Object {
  /** The number of queries with associated events divided by the total number of queries for the interval. Only returned with **event_rate** metrics. */
  var event_rate: js.UndefOr[Double] = js.native
  /** Unix epoch time equivalent of the **key_as_string**, that represents the start of this interval. */
  var key: js.UndefOr[Double] = js.native
  /** Date in string form representing the start of this interval. */
  var key_as_string: js.UndefOr[String] = js.native
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.native
}

object MetricAggregationResult {
  @scala.inline
  def apply(): MetricAggregationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricAggregationResult]
  }
  @scala.inline
  implicit class MetricAggregationResultOps[Self <: MetricAggregationResult] (val x: Self) extends AnyVal {
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
    def withKey(value: Double): Self = {
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
    def withKey_as_string(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_as_string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey_as_string: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_as_string")(js.undefined)
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

