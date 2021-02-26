package typingsSlinky.winrtUwp.Windows.Devices.Midi

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.messagereceived
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a port used to receive MIDI messages from a MIDI device. */
@js.native
trait MidiInPort extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagereceived(`type`: messagereceived, listener: TypedEventHandler[MidiInPort, MidiMessageReceivedEventArgs]): Unit = js.native
  
  /** Closes the MidiInPort . */
  def close(): Unit = js.native
  
  /** Gets the id of the device that was used to initialize the MidiInPort . */
  var deviceId: String = js.native
  
  /** Occurs when the MidiInPort receives data. */
  def onmessagereceived(ev: MidiMessageReceivedEventArgs with WinRTEvent[MidiInPort]): Unit = js.native
  /** Occurs when the MidiInPort receives data. */
  @JSName("onmessagereceived")
  var onmessagereceived_Original: TypedEventHandler[MidiInPort, MidiMessageReceivedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messagereceived(`type`: messagereceived, listener: TypedEventHandler[MidiInPort, MidiMessageReceivedEventArgs]): Unit = js.native
}
