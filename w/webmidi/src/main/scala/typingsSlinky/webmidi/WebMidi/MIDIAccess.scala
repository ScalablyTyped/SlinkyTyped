package typingsSlinky.webmidi.WebMidi

import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.EventTarget
import typingsSlinky.webmidi.webmidiStrings.statechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MIDIAccess extends EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIConnectionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIConnectionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIConnectionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * The MIDI input ports available to the system.
    */
  var inputs: MIDIInputMap = js.native
  
  /**
    * The handler called when a new port is connected or an existing port changes the
    * state attribute.
    */
  def onstatechange(e: MIDIConnectionEvent): Unit = js.native
  
  /**
    * The MIDI output ports available to the system.
    */
  var outputs: MIDIOutputMap = js.native
  
  /**
    * This attribute informs the user whether system exclusive support is enabled on
    * this MIDIAccess.
    */
  var sysexEnabled: Boolean = js.native
}
