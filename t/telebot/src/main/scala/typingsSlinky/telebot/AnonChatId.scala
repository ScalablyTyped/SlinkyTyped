package typingsSlinky.telebot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChatId extends js.Object {
  var chatId: js.UndefOr[Double] = js.native
  var disableEditMessage: js.UndefOr[Boolean] = js.native
  var force: js.UndefOr[Boolean] = js.native
  var inlineMessageId: js.UndefOr[String] = js.native
  var messageId: js.UndefOr[Double] = js.native
}

object AnonChatId {
  @scala.inline
  def apply(): AnonChatId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonChatId]
  }
  @scala.inline
  implicit class AnonChatIdOps[Self <: AnonChatId] (val x: Self) extends AnyVal {
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
    def withDisableEditMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEditMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableEditMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEditMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
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

