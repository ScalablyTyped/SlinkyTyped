package typingsSlinky.zchatBrowser.anon

import typingsSlinky.zchatBrowser.mod.EventData
import typingsSlinky.zchatBrowser.zchatBrowserStrings.chatDotqueue_position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nick extends EventData {
  var nick: String = js.native
  var queue_position: Double = js.native
  var `type`: chatDotqueue_position = js.native
}

object Nick {
  @scala.inline
  def apply(nick: String, queue_position: Double, `type`: chatDotqueue_position): Nick = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], queue_position = queue_position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nick]
  }
  @scala.inline
  implicit class NickOps[Self <: Nick] (val x: Self) extends AnyVal {
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
    def withQueue_position(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue_position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: chatDotqueue_position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

