package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An aggregation produced by the Discovery service to analyze the input provided. */
@js.native
trait QueryAggregation extends js.Object {
  /** Aggregations returned by the Discovery service. */
  var aggregations: js.UndefOr[js.Array[QueryAggregation]] = js.native
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.native
  /** Array of aggregation results. */
  var results: js.UndefOr[js.Array[AggregationResult]] = js.native
  /** The type of aggregation command used. For example: term, filter, max, min, etc. */
  var `type`: js.UndefOr[String] = js.native
}

object QueryAggregation {
  @scala.inline
  def apply(): QueryAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryAggregation]
  }
  @scala.inline
  implicit class QueryAggregationOps[Self <: QueryAggregation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregations(value: js.Array[QueryAggregation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregations")(js.undefined)
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
    @scala.inline
    def withResults(value: js.Array[AggregationResult]): Self = {
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
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

