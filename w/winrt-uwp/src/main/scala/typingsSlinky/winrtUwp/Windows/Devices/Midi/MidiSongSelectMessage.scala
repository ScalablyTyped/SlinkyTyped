package typingsSlinky.winrtUwp.Windows.Devices.Midi

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies the selected song. */
@js.native
trait MidiSongSelectMessage extends js.Object {
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer = js.native
  /** Gets the song to select from 0-127. */
  var song: Double = js.native
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double = js.native
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType = js.native
}

object MidiSongSelectMessage {
  @scala.inline
  def apply(rawData: IBuffer, song: Double, timestamp: Double, `type`: MidiMessageType): MidiSongSelectMessage = {
    val __obj = js.Dynamic.literal(rawData = rawData.asInstanceOf[js.Any], song = song.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiSongSelectMessage]
  }
  @scala.inline
  implicit class MidiSongSelectMessageOps[Self <: MidiSongSelectMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRawData(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSong(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("song")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MidiMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

