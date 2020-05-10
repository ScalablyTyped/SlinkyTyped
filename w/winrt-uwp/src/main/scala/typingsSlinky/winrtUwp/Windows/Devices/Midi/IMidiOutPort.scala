package typingsSlinky.winrtUwp.Windows.Devices.Midi

import typingsSlinky.winrtUwp.Windows.Foundation.IClosable
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single MIDI out port. */
@js.native
trait IMidiOutPort extends IClosable {
  /** Gets the ID of the device that contains the MIDI out port. */
  var deviceId: String = js.native
  /**
    * Sends the contents of the buffer through the MIDI out port.
    * @param midiData The data to send to the device.
    */
  def sendBuffer(midiData: IBuffer): Unit = js.native
  /**
    * Send the data in the specified MIDI message to the device associated with this MidiOutPort .
    * @param midiMessage The MIDI message to send to the device.
    */
  def sendMessage(midiMessage: IMidiMessage): Unit = js.native
}

object IMidiOutPort {
  @scala.inline
  def apply(
    close: () => Unit,
    deviceId: String,
    sendBuffer: IBuffer => Unit,
    sendMessage: IMidiMessage => Unit
  ): IMidiOutPort = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), deviceId = deviceId.asInstanceOf[js.Any], sendBuffer = js.Any.fromFunction1(sendBuffer), sendMessage = js.Any.fromFunction1(sendMessage))
    __obj.asInstanceOf[IMidiOutPort]
  }
  @scala.inline
  implicit class IMidiOutPortOps[Self <: IMidiOutPort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendBuffer(value: IBuffer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendBuffer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSendMessage(value: IMidiMessage => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessage")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

