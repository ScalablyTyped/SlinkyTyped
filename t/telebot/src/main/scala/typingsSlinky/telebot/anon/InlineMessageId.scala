package typingsSlinky.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineMessageId extends js.Object {
  var chatId: js.UndefOr[Double] = js.native
  var inlineMessageId: js.UndefOr[String] = js.native
  var messageId: js.UndefOr[Double] = js.native
}

object InlineMessageId {
  @scala.inline
  def apply(): InlineMessageId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineMessageId]
  }
  @scala.inline
  implicit class InlineMessageIdOps[Self <: InlineMessageId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChatId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chatId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChatId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chatId")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineMessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineMessageId")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(js.undefined)
        ret
    }
  }
  
}

