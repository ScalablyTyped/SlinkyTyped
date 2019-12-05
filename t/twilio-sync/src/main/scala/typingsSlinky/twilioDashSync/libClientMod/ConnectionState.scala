package typingsSlinky.twilioDashSync.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashSync.twilioDashSyncStrings.disconnected
  - typings.twilioDashSync.twilioDashSyncStrings.connecting
  - typings.twilioDashSync.twilioDashSyncStrings.connected
  - typings.twilioDashSync.twilioDashSyncStrings.disconnecting
  - typings.twilioDashSync.twilioDashSyncStrings.denied
  - typings.twilioDashSync.twilioDashSyncStrings.error
*/
trait ConnectionState extends js.Object

object ConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsSlinky.twilioDashSync.twilioDashSyncStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typingsSlinky.twilioDashSync.twilioDashSyncStrings.connecting = this.cast("connecting")
  @scala.inline
  def denied: typingsSlinky.twilioDashSync.twilioDashSyncStrings.denied = this.cast("denied")
  @scala.inline
  def disconnected: typingsSlinky.twilioDashSync.twilioDashSyncStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def disconnecting: typingsSlinky.twilioDashSync.twilioDashSyncStrings.disconnecting = this.cast("disconnecting")
  @scala.inline
  def error: typingsSlinky.twilioDashSync.twilioDashSyncStrings.error = this.cast("error")
}

