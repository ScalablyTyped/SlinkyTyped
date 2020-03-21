package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.closed
  - typingsSlinky.std.stdStrings.connected
  - typingsSlinky.std.stdStrings.connecting
  - typingsSlinky.std.stdStrings.disconnected
  - typingsSlinky.std.stdStrings.failed
  - typingsSlinky.std.stdStrings.`new`
*/
trait RTCPeerConnectionState extends js.Object

object RTCPeerConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsSlinky.std.stdStrings.closed = this.cast("closed")
  @scala.inline
  def connected: typingsSlinky.std.stdStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typingsSlinky.std.stdStrings.connecting = this.cast("connecting")
  @scala.inline
  def disconnected: typingsSlinky.std.stdStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def failed: typingsSlinky.std.stdStrings.failed = this.cast("failed")
  @scala.inline
  def `new`: typingsSlinky.std.stdStrings.`new` = this.cast("new")
}

