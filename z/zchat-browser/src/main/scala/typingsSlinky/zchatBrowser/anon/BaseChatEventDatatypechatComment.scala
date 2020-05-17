package typingsSlinky.zchatBrowser.anon

import typingsSlinky.zchatBrowser.mod.ChatEvent.ChatEventData
import typingsSlinky.zchatBrowser.zchatBrowserStrings.chatDotcomment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type  :'chat.comment',   comment ? :string,   new_comment ? :string} */
@js.native
trait BaseChatEventDatatypechatComment extends ChatEventData {
  var comment: js.UndefOr[String] = js.native
  var display_name: String = js.native
  var new_comment: js.UndefOr[String] = js.native
  var nick: String = js.native
  var time_stamp: Double = js.native
  var `type`: chatDotcomment = js.native
}

object BaseChatEventDatatypechatComment {
  @scala.inline
  def apply(display_name: String, nick: String, time_stamp: Double, `type`: chatDotcomment): BaseChatEventDatatypechatComment = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChatEventDatatypechatComment]
  }
  @scala.inline
  implicit class BaseChatEventDatatypechatCommentOps[Self <: BaseChatEventDatatypechatComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withType(value: chatDotcomment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_comment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_comment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_comment")(js.undefined)
        ret
    }
  }
  
}

