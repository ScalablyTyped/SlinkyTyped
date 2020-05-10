package typingsSlinky.slateIrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MOTDEvent extends js.Object {
  var motd: js.Array[String] = js.native
}

object MOTDEvent {
  @scala.inline
  def apply(motd: js.Array[String]): MOTDEvent = {
    val __obj = js.Dynamic.literal(motd = motd.asInstanceOf[js.Any])
    __obj.asInstanceOf[MOTDEvent]
  }
  @scala.inline
  implicit class MOTDEventOps[Self <: MOTDEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMotd(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

