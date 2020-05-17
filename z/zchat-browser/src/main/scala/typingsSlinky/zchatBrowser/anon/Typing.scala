package typingsSlinky.zchatBrowser.anon

import typingsSlinky.zchatBrowser.mod.EventData
import typingsSlinky.zchatBrowser.zchatBrowserStrings.typing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typing extends EventData {
  var nick: String = js.native
  var `type`: typing = js.native
  var typing: Boolean = js.native
}

object Typing {
  @scala.inline
  def apply(nick: String, `type`: typing, typing: Boolean): Typing = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typing]
  }
  @scala.inline
  implicit class TypingOps[Self <: Typing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNick(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTyping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

