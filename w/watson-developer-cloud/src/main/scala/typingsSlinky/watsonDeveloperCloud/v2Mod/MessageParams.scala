package typingsSlinky.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `message` operation. */
@js.native
trait MessageParams extends js.Object {
  /** Unique identifier of the assistant. You can find the assistant ID of an assistant on the **Assistants** tab of the Watson Assistant tool. For information about creating assistants, see the [documentation](https://console.bluemix.net/docs/services/assistant/assistant-add.html#assistant-add-task). **Note:** Currently, the v2 API does not support creating assistants. */
  var assistant_id: String = js.native
  /** State information for the conversation. The context is stored by the assistant on a per-session basis. You can use this property to set or modify context variables, which can also be accessed by dialog nodes. */
  var context: js.UndefOr[MessageContext] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** An input object that includes the input text. */
  var input: js.UndefOr[MessageInput] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** Unique identifier of the session. */
  var session_id: String = js.native
}

object MessageParams {
  @scala.inline
  def apply(assistant_id: String, session_id: String): MessageParams = {
    val __obj = js.Dynamic.literal(assistant_id = assistant_id.asInstanceOf[js.Any], session_id = session_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageParams]
  }
  @scala.inline
  implicit class MessageParamsOps[Self <: MessageParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssistant_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assistant_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: MessageContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: MessageInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_response(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_response: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_response")(js.undefined)
        ret
    }
  }
  
}

