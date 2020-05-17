package typingsSlinky.zchatBrowser.anon

import typingsSlinky.zchatBrowser.mod.EventData
import typingsSlinky.zchatBrowser.zchatBrowserStrings.last_read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timestamp extends EventData {
  var nick: String = js.native
  var timestamp: Double = js.native
  var `type`: last_read = js.native
}

object Timestamp {
  @scala.inline
  def apply(nick: String, timestamp: Double, `type`: last_read): Timestamp = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timestamp]
  }
  @scala.inline
  implicit class TimestampOps[Self <: Timestamp] (val x: Self) extends AnyVal {
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
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: last_read): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

