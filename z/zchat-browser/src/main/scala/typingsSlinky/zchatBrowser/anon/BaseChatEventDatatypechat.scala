package typingsSlinky.zchatBrowser.anon

import typingsSlinky.zchatBrowser.mod.ChatEvent.ChatEventData
import typingsSlinky.zchatBrowser.mod.ChatEvent.StructuredMessage
import typingsSlinky.zchatBrowser.zchatBrowserStrings.chatDotmsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type  :'chat.msg',   msg  :string,   options  :std.Array<string>,   structured_msg  :zchat-browser.zchat-browser.ChatEvent.StructuredMessage} */
@js.native
trait BaseChatEventDatatypechat extends ChatEventData {
  var display_name: String = js.native
  var msg: String = js.native
  var nick: String = js.native
  var options: js.Array[String] = js.native
  var structured_msg: StructuredMessage = js.native
  var time_stamp: Double = js.native
  var `type`: chatDotmsg = js.native
}

object BaseChatEventDatatypechat {
  @scala.inline
  def apply(
    display_name: String,
    msg: String,
    nick: String,
    options: js.Array[String],
    structured_msg: StructuredMessage,
    time_stamp: Double,
    `type`: chatDotmsg
  ): BaseChatEventDatatypechat = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], structured_msg = structured_msg.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChatEventDatatypechat]
  }
  @scala.inline
  implicit class BaseChatEventDatatypechatOps[Self <: BaseChatEventDatatypechat] (val x: Self) extends AnyVal {
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
    def withMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNick(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStructured_msg(value: StructuredMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structured_msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime_stamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_stamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: chatDotmsg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

