package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryNoticesResponse. */
@js.native
trait QueryNoticesResponse extends js.Object {
  /** Array of aggregation results that match the query. */
  var aggregations: js.UndefOr[js.Array[QueryAggregation]] = js.native
  /** The number of duplicates removed from this notices query. */
  var duplicates_removed: js.UndefOr[Double] = js.native
  /** The number of matching results. */
  var matching_results: js.UndefOr[Double] = js.native
  /** Array of passage results that match the query. */
  var passages: js.UndefOr[js.Array[QueryPassages]] = js.native
  /** Array of document results that match the query. */
  var results: js.UndefOr[js.Array[QueryNoticesResult]] = js.native
}

object QueryNoticesResponse {
  @scala.inline
  def apply(): QueryNoticesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryNoticesResponse]
  }
  @scala.inline
  implicit class QueryNoticesResponseOps[Self <: QueryNoticesResponse] (val x: Self) extends AnyVal {
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
    def withDuplicates_removed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicates_removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicates_removed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicates_removed")(js.undefined)
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
    def withPassages(value: js.Array[QueryPassages]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passages")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: js.Array[QueryNoticesResult]): Self = {
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

