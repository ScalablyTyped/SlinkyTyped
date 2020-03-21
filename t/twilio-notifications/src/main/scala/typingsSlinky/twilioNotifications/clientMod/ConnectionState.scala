package typingsSlinky.twilioNotifications.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioNotifications.twilioNotificationsStrings.connecting
  - typingsSlinky.twilioNotifications.twilioNotificationsStrings.connected
  - typingsSlinky.twilioNotifications.twilioNotificationsStrings.disconnecting
  - typingsSlinky.twilioNotifications.twilioNotificationsStrings.disconnected
  - typingsSlinky.twilioNotifications.twilioNotificationsStrings.denied
*/
trait ConnectionState extends js.Object

object ConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsSlinky.twilioNotifications.twilioNotificationsStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typingsSlinky.twilioNotifications.twilioNotificationsStrings.connecting = this.cast("connecting")
  @scala.inline
  def denied: typingsSlinky.twilioNotifications.twilioNotificationsStrings.denied = this.cast("denied")
  @scala.inline
  def disconnected: typingsSlinky.twilioNotifications.twilioNotificationsStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def disconnecting: typingsSlinky.twilioNotifications.twilioNotificationsStrings.disconnecting = this.cast("disconnecting")
}

