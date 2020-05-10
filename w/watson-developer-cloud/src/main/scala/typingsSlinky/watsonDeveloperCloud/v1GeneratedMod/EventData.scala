package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Query event data object. */
@js.native
trait EventData extends js.Object {
  /** The optional timestamp for the event that was created. If not provided, the time that the event was created in the log was used. */
  var client_timestamp: js.UndefOr[String] = js.native
  /** The **collection_id** of the document that this event is associated with. */
  var collection_id: String = js.native
  /** The rank of the result item which the event is associated with. */
  var display_rank: js.UndefOr[Double] = js.native
  /** The **document_id** of the document that this event is associated with. */
  var document_id: String = js.native
  /** The **environment_id** associated with the query that the event is associated with. */
  var environment_id: String = js.native
  /** The query identifier stored in the log. The query and any events associated with that query are stored with the same **query_id**. */
  var query_id: js.UndefOr[String] = js.native
  /** The session token that was returned as part of the query results that this event is associated with. */
  var session_token: String = js.native
}

object EventData {
  @scala.inline
  def apply(collection_id: String, document_id: String, environment_id: String, session_token: String): EventData = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], document_id = document_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], session_token = session_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  @scala.inline
  implicit class EventDataOps[Self <: EventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_token")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

