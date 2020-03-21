package typingsSlinky.twilioNotifications.connectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioNotifications.twilioNotificationsStrings.twilsock
  - typingsSlinky.twilioNotifications.twilioNotificationsStrings.gcm
  - typingsSlinky.twilioNotifications.twilioNotificationsStrings.fcm
  - typingsSlinky.twilioNotifications.twilioNotificationsStrings.apn
*/
trait ChannelType extends js.Object

object ChannelType {
  @scala.inline
  def apn: typingsSlinky.twilioNotifications.twilioNotificationsStrings.apn = this.cast("apn")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fcm: typingsSlinky.twilioNotifications.twilioNotificationsStrings.fcm = this.cast("fcm")
  @scala.inline
  def gcm: typingsSlinky.twilioNotifications.twilioNotificationsStrings.gcm = this.cast("gcm")
  @scala.inline
  def twilsock: typingsSlinky.twilioNotifications.twilioNotificationsStrings.twilsock = this.cast("twilsock")
}

