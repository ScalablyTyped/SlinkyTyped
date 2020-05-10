package typingsSlinky.winrt.Windows.Networking.PushNotifications

import typingsSlinky.winrt.Windows.UI.Notifications.BadgeNotification
import typingsSlinky.winrt.Windows.UI.Notifications.TileNotification
import typingsSlinky.winrt.Windows.UI.Notifications.ToastNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPushNotificationReceivedEventArgs extends js.Object {
  var badgeNotification: BadgeNotification = js.native
  var cancel: Boolean = js.native
  var notificationType: PushNotificationType = js.native
  var rawNotification: RawNotification = js.native
  var tileNotification: TileNotification = js.native
  var toastNotification: ToastNotification = js.native
}

object IPushNotificationReceivedEventArgs {
  @scala.inline
  def apply(
    badgeNotification: BadgeNotification,
    cancel: Boolean,
    notificationType: PushNotificationType,
    rawNotification: RawNotification,
    tileNotification: TileNotification,
    toastNotification: ToastNotification
  ): IPushNotificationReceivedEventArgs = {
    val __obj = js.Dynamic.literal(badgeNotification = badgeNotification.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], rawNotification = rawNotification.asInstanceOf[js.Any], tileNotification = tileNotification.asInstanceOf[js.Any], toastNotification = toastNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPushNotificationReceivedEventArgs]
  }
  @scala.inline
  implicit class IPushNotificationReceivedEventArgsOps[Self <: IPushNotificationReceivedEventArgs] (val x: Self) extends AnyVal {
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
    def withRawNotification(value: RawNotification): Self = {
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

