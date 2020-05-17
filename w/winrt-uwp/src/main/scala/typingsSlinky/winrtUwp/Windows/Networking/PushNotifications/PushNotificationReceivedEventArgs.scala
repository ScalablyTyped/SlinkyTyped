package typingsSlinky.winrtUwp.Windows.Networking.PushNotifications

import typingsSlinky.winrtUwp.Windows.UI.Notifications.BadgeNotification
import typingsSlinky.winrtUwp.Windows.UI.Notifications.TileNotification
import typingsSlinky.winrtUwp.Windows.UI.Notifications.ToastNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates a push notification that has been received from the app server, identifying the type and supplying the content of the notification. Windows passes this information in the PushNotificationReceived event. */
@js.native
trait PushNotificationReceivedEventArgs extends js.Object {
  /** Gets the content of a badge update to perform in response to this push notification. */
  var badgeNotification: BadgeNotification = js.native
  /** Gets or sets whether Windows should perform its default handling of the notification. */
  var cancel: Boolean = js.native
  /** Gets the type of push notification that has been received from the app server. */
  var notificationType: PushNotificationType = js.native
  var rawNotification: js.Any = js.native
   /* unmapped type */ /** Gets the content of a tile update to perform in response to this push notification. */
  var tileNotification: TileNotification = js.native
  /** Gets the content of a toast to display in response to this push notification. */
  var toastNotification: ToastNotification = js.native
}

object PushNotificationReceivedEventArgs {
  @scala.inline
  def apply(
    badgeNotification: BadgeNotification,
    cancel: Boolean,
    notificationType: PushNotificationType,
    rawNotification: js.Any,
    tileNotification: TileNotification,
    toastNotification: ToastNotification
  ): PushNotificationReceivedEventArgs = {
    val __obj = js.Dynamic.literal(badgeNotification = badgeNotification.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], rawNotification = rawNotification.asInstanceOf[js.Any], tileNotification = tileNotification.asInstanceOf[js.Any], toastNotification = toastNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationReceivedEventArgs]
  }
  @scala.inline
  implicit class PushNotificationReceivedEventArgsOps[Self <: PushNotificationReceivedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadgeNotification(value: BadgeNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationType(value: PushNotificationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawNotification(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileNotification(value: TileNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToastNotification(value: ToastNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastNotification")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

