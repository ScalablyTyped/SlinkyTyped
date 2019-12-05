package typingsSlinky.twilioDashNotifications.libConnectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashNotifications.twilioDashNotificationsStrings.token
  - typings.twilioDashNotifications.twilioDashNotificationsStrings.notificationId
  - typings.twilioDashNotifications.twilioDashNotificationsStrings.messageType
*/
trait UpdateReason extends js.Object

object UpdateReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def messageType: typingsSlinky.twilioDashNotifications.twilioDashNotificationsStrings.messageType = this.cast("messageType")
  @scala.inline
  def notificationId: typingsSlinky.twilioDashNotifications.twilioDashNotificationsStrings.notificationId = this.cast("notificationId")
  @scala.inline
  def token: typingsSlinky.twilioDashNotifications.twilioDashNotificationsStrings.token = this.cast("token")
}

