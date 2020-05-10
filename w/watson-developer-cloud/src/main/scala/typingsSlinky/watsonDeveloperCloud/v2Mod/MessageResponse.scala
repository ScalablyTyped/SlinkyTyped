package typingsSlinky.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A response from the Watson Assistant service. */
@js.native
trait MessageResponse extends js.Object {
  /** State information for the conversation. The context is stored by the assistant on a per-session basis. You can use this property to access context variables. **Note:** The context is included in message responses only if **return_context**=`true` in the message request. */
  var context: js.UndefOr[MessageContext] = js.native
  /** Assistant output to be rendered or processed by the client. */
  var output: MessageOutput = js.native
}

object MessageResponse {
  @scala.inline
  def apply(output: MessageOutput): MessageResponse = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageResponse]
  }
  @scala.inline
  implicit class MessageResponseOps[Self <: MessageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutput(value: MessageOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
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
  }
  
}

