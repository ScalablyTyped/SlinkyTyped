package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.checking
  - typingsSlinky.std.stdStrings.closed
  - typingsSlinky.std.stdStrings.completed
  - typingsSlinky.std.stdStrings.connected
  - typingsSlinky.std.stdStrings.disconnected
  - typingsSlinky.std.stdStrings.failed
  - typingsSlinky.std.stdStrings.`new`
*/
trait RTCIceTransportState extends js.Object

object RTCIceTransportState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def checking: typingsSlinky.std.stdStrings.checking = this.cast("checking")
  @scala.inline
  def closed: typingsSlinky.std.stdStrings.closed = this.cast("closed")
  @scala.inline
  def completed: typingsSlinky.std.stdStrings.completed = this.cast("completed")
  @scala.inline
  def connected: typingsSlinky.std.stdStrings.connected = this.cast("connected")
  @scala.inline
  def disconnected: typingsSlinky.std.stdStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def failed: typingsSlinky.std.stdStrings.failed = this.cast("failed")
  @scala.inline
  def `new`: typingsSlinky.std.stdStrings.`new` = this.cast("new")
}

