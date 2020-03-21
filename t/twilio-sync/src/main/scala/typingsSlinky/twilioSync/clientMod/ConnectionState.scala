package typingsSlinky.twilioSync.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioSync.twilioSyncStrings.disconnected
  - typingsSlinky.twilioSync.twilioSyncStrings.connecting
  - typingsSlinky.twilioSync.twilioSyncStrings.connected
  - typingsSlinky.twilioSync.twilioSyncStrings.disconnecting
  - typingsSlinky.twilioSync.twilioSyncStrings.denied
  - typingsSlinky.twilioSync.twilioSyncStrings.error
*/
trait ConnectionState extends js.Object

object ConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsSlinky.twilioSync.twilioSyncStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typingsSlinky.twilioSync.twilioSyncStrings.connecting = this.cast("connecting")
  @scala.inline
  def denied: typingsSlinky.twilioSync.twilioSyncStrings.denied = this.cast("denied")
  @scala.inline
  def disconnected: typingsSlinky.twilioSync.twilioSyncStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def disconnecting: typingsSlinky.twilioSync.twilioSyncStrings.disconnecting = this.cast("disconnecting")
  @scala.inline
  def error: typingsSlinky.twilioSync.twilioSyncStrings.error = this.cast("error")
}

