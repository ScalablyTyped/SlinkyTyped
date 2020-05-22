package typingsSlinky.winrt.global.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ToastNotifier")
@js.native
class ToastNotifier ()
  extends typingsSlinky.winrt.Windows.UI.Notifications.ToastNotifier {
  /* CompleteClass */
  override var setting: typingsSlinky.winrt.Windows.UI.Notifications.NotificationSetting = js.native
  /* CompleteClass */
  override def addToSchedule(scheduledToast: typingsSlinky.winrt.Windows.UI.Notifications.ScheduledToastNotification): Unit = js.native
  /* CompleteClass */
  override def getScheduledToastNotifications(): IVectorView[typingsSlinky.winrt.Windows.UI.Notifications.ScheduledToastNotification] = js.native
  /* CompleteClass */
  override def hide(notification: typingsSlinky.winrt.Windows.UI.Notifications.ToastNotification): Unit = js.native
  /* CompleteClass */
  override def removeFromSchedule(scheduledToast: typingsSlinky.winrt.Windows.UI.Notifications.ScheduledToastNotification): Unit = js.native
  /* CompleteClass */
  override def show(notification: typingsSlinky.winrt.Windows.UI.Notifications.ToastNotification): Unit = js.native
}

