package typingsSlinky.slateIrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwayEvent extends js.Object {
  var message: String = js.native
  var nick: String = js.native
}

object AwayEvent {
  @scala.inline
  def apply(message: String, nick: String): AwayEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwayEvent]
  }
  @scala.inline
  implicit class AwayEventOps[Self <: AwayEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

