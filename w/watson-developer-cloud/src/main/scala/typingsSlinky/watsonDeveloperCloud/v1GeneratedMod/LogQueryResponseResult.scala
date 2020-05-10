package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Individual result object for a **logs** query. Each object represents either a query to a Discovery collection or an event that is associated with a query. */
@js.native
trait LogQueryResponseResult extends js.Object {
  /** Date specified by the user when recording an event. Returned in `YYYY-MM-DDThh:mm:ssZ` format. Only returned with logs of type **event**. */
  var client_timestamp: js.UndefOr[String] = js.native
  /** The collection ID of the document associated with this event. Only returned with logs of type `event`. */
  var collection_id: js.UndefOr[String] = js.native
  /** Date that the log result was created. Returned in `YYYY-MM-DDThh:mm:ssZ` format. */
  var created_timestamp: js.UndefOr[String] = js.native
  /** The **customer_id** label that was specified in the header of the query or event API call that corresponds to this log entry. */
  var customer_id: js.UndefOr[String] = js.native
  /** The original display rank of the document associated with this event. Only returned with logs of type `event`. */
  var display_rank: js.UndefOr[Double] = js.native
  /** The document ID of the document associated with this event. Only returned with logs of type `event`. */
  var document_id: js.UndefOr[String] = js.native
  /** Object containing result information that was returned by the query used to create this log entry. Only returned with logs of type `query`. */
  var document_results: js.UndefOr[LogQueryResponseResultDocuments] = js.native
  /** The type of log entry returned. **query** indicates that the log represents the results of a call to the single collection **query** method. **event** indicates that the log represents  a call to the **events** API. */
  var document_type: js.UndefOr[String] = js.native
  /** The environment ID that is associated with this log entry. */
  var environment_id: js.UndefOr[String] = js.native
  /** The type of event that this object respresents. Possible values are -  `query` the log of a query to a collection -  `click` the result of a call to the **events** endpoint. */
  var event_type: js.UndefOr[String] = js.native
  /** The value of the **natural_language_query** query parameter that was used to create these results. Only returned with logs of type **query**. **Note:** Other query parameters (such as **filter** or **deduplicate**) might  have been used with this query, but are not recorded. */
  var natural_language_query: js.UndefOr[String] = js.native
  /** Identifier that corresponds to the **natural_language_query** string used in the original or associated query. All **event** and **query** log entries that have the same original **natural_language_query** string also have them same **query_id**. This field can be used to recall all **event** and **query** log results that have the same original query (**event** logs do not contain the original **natural_language_query** field). */
  var query_id: js.UndefOr[String] = js.native
  /** The type of result that this **event** is associated with. Only returned with logs of type `event`. */
  var result_type: js.UndefOr[String] = js.native
  /** Unique identifier (within a 24-hour period) that identifies a single `query` log and any `event` logs that were created for it. **Note:** If the exact same query is run at the exact same time on different days, the **session_token** for those queries might be identical. However, the **created_timestamp** differs. **Note:** Session tokens are case sensitive. To avoid matching on session tokens that are identical except for case, use the exact match operator (`::`) when you query for a specific session token. */
  var session_token: js.UndefOr[String] = js.native
}

object LogQueryResponseResult {
  @scala.inline
  def apply(): LogQueryResponseResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogQueryResponseResult]
  }
  @scala.inline
  implicit class LogQueryResponseResultOps[Self <: LogQueryResponseResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_timestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_timestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withCollection_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollection_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection_id")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated_timestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_timestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomer_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_id")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay_rank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_rank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_rank")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_id")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument_results(value: LogQueryResponseResultDocuments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument_results: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_results")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_type")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment_id")(js.undefined)
        ret
    }
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
    def withNatural_language_query(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natural_language_query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatural_language_query: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natural_language_query")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_id")(js.undefined)
        ret
    }
    @scala.inline
    def withResult_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_type")(js.undefined)
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

