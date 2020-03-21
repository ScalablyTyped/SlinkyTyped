package typingsSlinky.webmidi.WebMidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webmidi.webmidiStrings.open
  - typingsSlinky.webmidi.webmidiStrings.closed
  - typingsSlinky.webmidi.webmidiStrings.pending
*/
trait MIDIPortConnectionState extends js.Object

object MIDIPortConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsSlinky.webmidi.webmidiStrings.closed = this.cast("closed")
  @scala.inline
  def open: typingsSlinky.webmidi.webmidiStrings.open = this.cast("open")
  @scala.inline
  def pending: typingsSlinky.webmidi.webmidiStrings.pending = this.cast("pending")
}

