package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.connecting
  - typings.std.stdStrings.open
  - typings.std.stdStrings.closing
  - typings.std.stdStrings.closed
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

