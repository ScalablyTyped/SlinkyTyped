package typingsSlinky.webmidi.WebMidi

import typingsSlinky.std.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIDIConnectionEventInit extends EventInit {
  /**
    * The port that has been connected or disconnected.
    */
  var port: MIDIPort = js.native
}

object MIDIConnectionEventInit {
  @scala.inline
  def apply(port: MIDIPort): MIDIConnectionEventInit = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIDIConnectionEventInit]
  }
  @scala.inline
  implicit class MIDIConnectionEventInitOps[Self <: MIDIConnectionEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPort(value: MIDIPort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

