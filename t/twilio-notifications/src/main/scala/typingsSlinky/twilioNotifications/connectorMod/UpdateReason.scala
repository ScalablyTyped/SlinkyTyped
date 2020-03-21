package typingsSlinky.twilioNotifications.connectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioNotifications.twilioNotificationsStrings.token
  - typingsSlinky.twilioNotifications.twilioNotificationsStrings.notificationId
  - typingsSlinky.twilioNotifications.twilioNotificationsStrings.messageType
*/
trait UpdateReason extends js.Object

object UpdateReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def messageType: typingsSlinky.twilioNotifications.twilioNotificationsStrings.messageType = this.cast("messageType")
  @scala.inline
  def notificationId: typingsSlinky.twilioNotifications.twilioNotificationsStrings.notificationId = this.cast("notificationId")
  @scala.inline
  def token: typingsSlinky.twilioNotifications.twilioNotificationsStrings.token = this.cast("token")
}

