package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A response containing the documents and aggregations for the query. */
@js.native
trait QueryResponse extends js.Object {
  /** Array of aggregation results for the query. */
  var aggregations: js.UndefOr[js.Array[QueryAggregation]] = js.native
  /** The number of duplicate results removed. */
  var duplicates_removed: js.UndefOr[Double] = js.native
  /** The number of matching results for the query. */
  var matching_results: js.UndefOr[Double] = js.native
  /** Array of passage results for the query. */
  var passages: js.UndefOr[js.Array[QueryPassages]] = js.native
  /** Array of document results for the query. */
  var results: js.UndefOr[js.Array[QueryResult]] = js.native
  /** An object contain retrieval type information. */
  var retrieval_details: js.UndefOr[RetrievalDetails] = js.native
  /** The session token for this query. The session token can be used to add events associated with this query to the query and event log. **Important:** Session tokens are case sensitive. */
  var session_token: js.UndefOr[String] = js.native
}

object QueryResponse {
  @scala.inline
  def apply(): QueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResponse]
  }
  @scala.inline
  implicit class QueryResponseOps[Self <: QueryResponse] (val x: Self) extends AnyVal {
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
    def withResults(value: js.Array[QueryResult]): Self = {
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
    def withRetrieval_details(value: RetrievalDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieval_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetrieval_details: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieval_details")(js.undefined)
        ret
    }
    @scala.inline
    def withSession_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_token")(js.undefined)
        ret
    }
  }
  
}

