package typingsSlinky.zchatBrowser.mod.ChatEvent

import typingsSlinky.zchatBrowser.mod.Attachment
import typingsSlinky.zchatBrowser.mod.EventData
import typingsSlinky.zchatBrowser.zchatBrowserStrings.chatDotcomment
import typingsSlinky.zchatBrowser.zchatBrowserStrings.chatDotfile
import typingsSlinky.zchatBrowser.zchatBrowserStrings.chatDotmemberjoin
import typingsSlinky.zchatBrowser.zchatBrowserStrings.chatDotmemberleave
import typingsSlinky.zchatBrowser.zchatBrowserStrings.chatDotmsg
import typingsSlinky.zchatBrowser.zchatBrowserStrings.chatDotrating
import typingsSlinky.zchatBrowser.zchatBrowserStrings.chatDotrequestDotrating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechat
  - typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatAttachment
  - typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatDisplayname
  - typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatNick
  - typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatTimestamp
  - typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatNewrating
  - typingsSlinky.zchatBrowser.anon.BaseChatEventDatatypechatComment
*/
trait ChatEventData extends EventData

object ChatEventData {
  @scala.inline
  def BaseChatEventDatatypechatAttachment(
    attachment: Attachment,
    deleted: Boolean,
    display_name: String,
    nick: String,
    time_stamp: Double,
    `type`: chatDotfile
  ): ChatEventData = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechatNick(display_name: String, nick: String, time_stamp: Double, `type`: chatDotmemberleave): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechat(
    display_name: String,
    msg: String,
    nick: String,
    options: js.Array[String],
    structured_msg: StructuredMessage,
    time_stamp: Double,
    `type`: chatDotmsg
  ): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], structured_msg = structured_msg.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechatTimestamp(display_name: String, nick: String, time_stamp: Double, `type`: chatDotrequestDotrating): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechatNewrating(
    display_name: String,
    nick: String,
    time_stamp: Double,
    `type`: chatDotrating,
    new_rating: String = null,
    rating: String = null
  ): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (new_rating != null) __obj.updateDynamic("new_rating")(new_rating.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechatComment(
    display_name: String,
    nick: String,
    time_stamp: Double,
    `type`: chatDotcomment,
    comment: String = null,
    new_comment: String = null
  ): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (new_comment != null) __obj.updateDynamic("new_comment")(new_comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
  @scala.inline
  def BaseChatEventDatatypechatDisplayname(display_name: String, nick: String, time_stamp: Double, `type`: chatDotmemberjoin): ChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEventData]
  }
}

