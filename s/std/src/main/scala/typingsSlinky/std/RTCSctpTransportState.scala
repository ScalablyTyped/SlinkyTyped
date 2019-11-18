package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.connecting
  - typings.std.stdStrings.connected
  - typings.std.stdStrings.closed
*/
trait RTCSctpTransportState extends js.Object

object RTCSctpTransportState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsSlinky.std.stdStrings.closed = this.cast("closed")
  @scala.inline
  def connected: typingsSlinky.std.stdStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typingsSlinky.std.stdStrings.connecting = this.cast("connecting")
}

