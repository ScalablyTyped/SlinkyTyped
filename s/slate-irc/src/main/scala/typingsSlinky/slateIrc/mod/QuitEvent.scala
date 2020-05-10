package typingsSlinky.slateIrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuitEvent extends js.Object {
  var hostmask: String = js.native
  var message: String = js.native
  var nick: String = js.native
}

object QuitEvent {
  @scala.inline
  def apply(hostmask: String, message: String, nick: String): QuitEvent = {
    val __obj = js.Dynamic.literal(hostmask = hostmask.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuitEvent]
  }
  @scala.inline
  implicit class QuitEventOps[Self <: QuitEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostmask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostmask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNick(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nick")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

