package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Log. */
@js.native
trait Log extends js.Object {
  /** The language of the workspace where the message request was made. */
  var language: String = js.native
  /** A unique identifier for the logged event. */
  var log_id: String = js.native
  /** A request sent to the workspace, including the user input and context. */
  var request: MessageRequest = js.native
  /** The timestamp for receipt of the message. */
  var request_timestamp: String = js.native
  /** The response sent by the workspace, including the output text, detected intents and entities, and context. */
  var response: MessageResponse = js.native
  /** The timestamp for the system response to the message. */
  var response_timestamp: String = js.native
  /** The unique identifier of the workspace where the request was made. */
  var workspace_id: String = js.native
}

object Log {
  @scala.inline
  def apply(
    language: String,
    log_id: String,
    request: MessageRequest,
    request_timestamp: String,
    response: MessageResponse,
    response_timestamp: String,
    workspace_id: String
  ): Log = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], log_id = log_id.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], request_timestamp = request_timestamp.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], response_timestamp = response_timestamp.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  @scala.inline
  implicit class LogOps[Self <: Log] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLog_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: MessageRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest_timestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: MessageResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse_timestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkspace_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

