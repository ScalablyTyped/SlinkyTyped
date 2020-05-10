package typingsSlinky.webmidi.WebMidi

import typingsSlinky.std.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIDIMessageEventInit extends EventInit {
  /**
    * A Uint8Array containing the MIDI data bytes of a single MIDI message.
    */
  var data: js.typedarray.Uint8Array = js.native
  /**
    * A timestamp specifying when the event occurred.
    */
  var receivedTime: Double = js.native
}

object MIDIMessageEventInit {
  @scala.inline
  def apply(data: js.typedarray.Uint8Array, receivedTime: Double): MIDIMessageEventInit = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], receivedTime = receivedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIDIMessageEventInit]
  }
  @scala.inline
  implicit class MIDIMessageEventInitOps[Self <: MIDIMessageEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceivedTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

