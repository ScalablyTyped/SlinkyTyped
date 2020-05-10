package typingsSlinky.zchatBrowser

import typingsSlinky.zchatBrowser.mod.ChatEvent.ChatEventData
import typingsSlinky.zchatBrowser.zchatBrowserStrings.chatDotrating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type  :'chat.rating',   rating ? :string,   new_rating ? :string} */
@js.native
trait BaseChatEventDatatypechatNewrating extends ChatEventData {
  var display_name: String = js.native
  var new_rating: js.UndefOr[String] = js.native
  var nick: String = js.native
  var rating: js.UndefOr[String] = js.native
  var time_stamp: Double = js.native
  var `type`: chatDotrating = js.native
}

object BaseChatEventDatatypechatNewrating {
  @scala.inline
  def apply(display_name: String, nick: String, time_stamp: Double, `type`: chatDotrating): BaseChatEventDatatypechatNewrating = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChatEventDatatypechatNewrating]
  }
  @scala.inline
  implicit class BaseChatEventDatatypechatNewratingOps[Self <: BaseChatEventDatatypechatNewrating] (val x: Self) extends AnyVal {
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
    def withType(value: chatDotrating): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNew_rating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_rating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_rating")(js.undefined)
        ret
    }
    @scala.inline
    def withRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(js.undefined)
        ret
    }
  }
  
}

