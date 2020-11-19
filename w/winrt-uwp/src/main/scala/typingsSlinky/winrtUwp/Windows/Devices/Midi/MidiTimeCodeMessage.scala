package typingsSlinky.winrtUwp.Windows.Devices.Midi

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MIDI message that specifies a time code. */
@js.native
trait MidiTimeCodeMessage extends js.Object {
  
  /** Gets the value of the frame type from 0-7. */
  var frameType: Double = js.native
  
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer = js.native
  
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double = js.native
  
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType = js.native
  
  /** Gets the time code value from 0-32. */
  var values: Double = js.native
}
object MidiTimeCodeMessage {
  
  @scala.inline
  def apply(frameType: Double, rawData: IBuffer, timestamp: Double, `type`: MidiMessageType, values: Double): MidiTimeCodeMessage = {
    val __obj = js.Dynamic.literal(frameType = frameType.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiTimeCodeMessage]
  }
  
  @scala.inline
  implicit class MidiTimeCodeMessageOps[Self <: MidiTimeCodeMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFrameType(value: Double): Self = this.set("frameType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawData(value: IBuffer): Self = this.set("rawData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MidiMessageType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: Double): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
