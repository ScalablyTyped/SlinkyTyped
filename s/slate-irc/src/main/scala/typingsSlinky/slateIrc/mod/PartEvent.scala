package typingsSlinky.slateIrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartEvent extends js.Object {
  var channels: js.Array[String] = js.native
  var hostmask: String = js.native
  var nick: String = js.native
}

object PartEvent {
  @scala.inline
  def apply(channels: js.Array[String], hostmask: String, nick: String): PartEvent = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], hostmask = hostmask.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartEvent]
  }
  @scala.inline
  implicit class PartEventOps[Self <: PartEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostmask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostmask")(value.asInstanceOf[js.Any])
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

