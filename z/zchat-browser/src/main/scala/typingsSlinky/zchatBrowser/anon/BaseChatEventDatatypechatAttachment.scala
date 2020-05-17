package typingsSlinky.zchatBrowser.anon

import typingsSlinky.zchatBrowser.mod.Attachment
import typingsSlinky.zchatBrowser.mod.ChatEvent.ChatEventData
import typingsSlinky.zchatBrowser.zchatBrowserStrings.chatDotfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type  :'chat.file',   attachment  :zchat-browser.zchat-browser.Attachment,   deleted  :boolean} */
@js.native
trait BaseChatEventDatatypechatAttachment extends ChatEventData {
  var attachment: Attachment = js.native
  var deleted: Boolean = js.native
  var display_name: String = js.native
  var nick: String = js.native
  var time_stamp: Double = js.native
  var `type`: chatDotfile = js.native
}

object BaseChatEventDatatypechatAttachment {
  @scala.inline
  def apply(
    attachment: Attachment,
    deleted: Boolean,
    display_name: String,
    nick: String,
    time_stamp: Double,
    `type`: chatDotfile
  ): BaseChatEventDatatypechatAttachment = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChatEventDatatypechatAttachment]
  }
  @scala.inline
  implicit class BaseChatEventDatatypechatAttachmentOps[Self <: BaseChatEventDatatypechatAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachment(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNick(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime_stamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_stamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: chatDotfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

