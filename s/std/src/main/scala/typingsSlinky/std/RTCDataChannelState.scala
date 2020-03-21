package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.closed
  - typingsSlinky.std.stdStrings.closing
  - typingsSlinky.std.stdStrings.connecting
  - typingsSlinky.std.stdStrings.open
*/
trait RTCDataChannelState extends js.Object

object RTCDataChannelState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsSlinky.std.stdStrings.closed = this.cast("closed")
  @scala.inline
  def closing: typingsSlinky.std.stdStrings.closing = this.cast("closing")
  @scala.inline
  def connecting: typingsSlinky.std.stdStrings.connecting = this.cast("connecting")
  @scala.inline
  def open: typingsSlinky.std.stdStrings.open = this.cast("open")
}

