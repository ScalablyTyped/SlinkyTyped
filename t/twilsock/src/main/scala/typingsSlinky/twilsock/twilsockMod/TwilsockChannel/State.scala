package typingsSlinky.twilsock.twilsockMod.TwilsockChannel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilsock.twilsockStrings.unknown
  - typingsSlinky.twilsock.twilsockStrings.disconnecting
  - typingsSlinky.twilsock.twilsockStrings.disconnected
  - typingsSlinky.twilsock.twilsockStrings.connecting
  - typingsSlinky.twilsock.twilsockStrings.connected
  - typingsSlinky.twilsock.twilsockStrings.error
  - typingsSlinky.twilsock.twilsockStrings.rejected
*/
trait State extends js.Object

object State {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsSlinky.twilsock.twilsockStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typingsSlinky.twilsock.twilsockStrings.connecting = this.cast("connecting")
  @scala.inline
  def disconnected: typingsSlinky.twilsock.twilsockStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def disconnecting: typingsSlinky.twilsock.twilsockStrings.disconnecting = this.cast("disconnecting")
  @scala.inline
  def error: typingsSlinky.twilsock.twilsockStrings.error = this.cast("error")
  @scala.inline
  def rejected: typingsSlinky.twilsock.twilsockStrings.rejected = this.cast("rejected")
  @scala.inline
  def unknown: typingsSlinky.twilsock.twilsockStrings.unknown = this.cast("unknown")
}

