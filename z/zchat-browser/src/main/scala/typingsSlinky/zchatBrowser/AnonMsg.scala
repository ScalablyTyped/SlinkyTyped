package typingsSlinky.zchatBrowser

import typingsSlinky.zchatBrowser.mod.ChatEvent.Button
import typingsSlinky.zchatBrowser.mod.ChatEvent.StructuredMessage
import typingsSlinky.zchatBrowser.zchatBrowserStrings.QUICK_REPLIES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMsg extends StructuredMessage {
  var msg: String = js.native
  var quick_replies: js.Array[Button] = js.native
  var `type`: QUICK_REPLIES = js.native
}

object AnonMsg {
  @scala.inline
  def apply(msg: String, quick_replies: js.Array[Button], `type`: QUICK_REPLIES): AnonMsg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], quick_replies = quick_replies.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMsg]
  }
  @scala.inline
  implicit class AnonMsgOps[Self <: AnonMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuick_replies(value: js.Array[Button]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quick_replies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: QUICK_REPLIES): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

