package typingsSlinky.webmidi.WebMidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webmidi.webmidiStrings.disconnected
  - typingsSlinky.webmidi.webmidiStrings.connected
*/
trait MIDIPortDeviceState extends js.Object

object MIDIPortDeviceState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsSlinky.webmidi.webmidiStrings.connected = this.cast("connected")
  @scala.inline
  def disconnected: typingsSlinky.webmidi.webmidiStrings.disconnected = this.cast("disconnected")
}

