package typingsSlinky.winrtUwp.Windows.Devices.Midi

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies a MIDI note to turn on. */
@js.native
trait MidiNoteOnMessage extends js.Object {
  /** Gets the channel from 0-15 that this message applies to. */
  var channel: Double = js.native
  /** Gets the note to turn on which is specified as a value from 0-127. */
  var note: Double = js.native
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer = js.native
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double = js.native
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType = js.native
  /** Gets the value of the velocity from 0-127. */
  var velocity: Double = js.native
}

object MidiNoteOnMessage {
  @scala.inline
  def apply(
    channel: Double,
    note: Double,
    rawData: IBuffer,
    timestamp: Double,
    `type`: MidiMessageType,
    velocity: Double
  ): MidiNoteOnMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiNoteOnMessage]
  }
  @scala.inline
  implicit class MidiNoteOnMessageOps[Self <: MidiNoteOnMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawData(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawData")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

