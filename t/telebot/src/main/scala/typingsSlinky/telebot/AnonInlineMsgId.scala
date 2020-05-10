package typingsSlinky.telebot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInlineMsgId extends js.Object {
  var chatId: Double | String = js.native
  var inlineMsgId: js.UndefOr[Double] = js.native
  var messageId: Double = js.native
}

object AnonInlineMsgId {
  @scala.inline
  def apply(chatId: Double | String, messageId: Double): AnonInlineMsgId = {
    val __obj = js.Dynamic.literal(chatId = chatId.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInlineMsgId]
  }
  @scala.inline
  implicit class AnonInlineMsgIdOps[Self <: AnonInlineMsgId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChatId(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chatId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInlineMsgId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineMsgId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineMsgId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineMsgId")(js.undefined)
        ret
    }
  }
  
}

