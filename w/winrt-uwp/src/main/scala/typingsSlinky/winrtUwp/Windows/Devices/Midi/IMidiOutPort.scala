package typingsSlinky.winrtUwp.Windows.Devices.Midi

import typingsSlinky.winrtUwp.Windows.Foundation.IClosable
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IMidiOutPortMutableBuilder[Self <: IMidiOutPort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendBuffer(value: IBuffer => Unit): Self = StObject.set(x, "sendBuffer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendMessage(value: IMidiMessage => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction1(value))
  }
}
