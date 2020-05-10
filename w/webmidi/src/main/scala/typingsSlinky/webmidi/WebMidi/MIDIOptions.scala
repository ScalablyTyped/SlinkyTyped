package typingsSlinky.webmidi.WebMidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIDIOptions extends js.Object {
  /**
    * This member informs the system whether the ability to send and receive system
    * exclusive messages is requested or allowed on a given MIDIAccess object.
    */
  var sysex: Boolean = js.native
}

object MIDIOptions {
  @scala.inline
  def apply(sysex: Boolean): MIDIOptions = {
    val __obj = js.Dynamic.literal(sysex = sysex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIDIOptions]
  }
  @scala.inline
  implicit class MIDIOptionsOps[Self <: MIDIOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSysex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

