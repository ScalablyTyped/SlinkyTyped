package typingsSlinky.winrtUwp.global.Windows.Devices.Midi

import typingsSlinky.winrtUwp.Windows.Devices.Midi.IMidiMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MessageReceived event. */
@JSGlobal("Windows.Devices.Midi.MidiMessageReceivedEventArgs")
@js.native
abstract class MidiMessageReceivedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Midi.MidiMessageReceivedEventArgs {
  /** The MIDI message. */
  /* CompleteClass */
  override var message: IMidiMessage = js.native
}

