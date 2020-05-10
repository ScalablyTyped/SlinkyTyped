package typingsSlinky.winrt.Windows.UI.Notifications

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToastNotifier extends js.Object {
  var setting: NotificationSetting = js.native
  def addToSchedule(scheduledToast: ScheduledToastNotification): Unit = js.native
  def getScheduledToastNotifications(): IVectorView[ScheduledToastNotification] = js.native
  def hide(notification: ToastNotification): Unit = js.native
  def removeFromSchedule(scheduledToast: ScheduledToastNotification): Unit = js.native
  def show(notification: ToastNotification): Unit = js.native
}

object IToastNotifier {
  @scala.inline
  def apply(
    addToSchedule: ScheduledToastNotification => Unit,
    getScheduledToastNotifications: () => IVectorView[ScheduledToastNotification],
    hide: ToastNotification => Unit,
    removeFromSchedule: ScheduledToastNotification => Unit,
    setting: NotificationSetting,
    show: ToastNotification => Unit
  ): IToastNotifier = {
    val __obj = js.Dynamic.literal(addToSchedule = js.Any.fromFunction1(addToSchedule), getScheduledToastNotifications = js.Any.fromFunction0(getScheduledToastNotifications), hide = js.Any.fromFunction1(hide), removeFromSchedule = js.Any.fromFunction1(removeFromSchedule), setting = setting.asInstanceOf[js.Any], show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[IToastNotifier]
  }
  @scala.inline
  implicit class IToastNotifierOps[Self <: IToastNotifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddToSchedule(value: ScheduledToastNotification => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToSchedule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScheduledToastNotifications(value: () => IVectorView[ScheduledToastNotification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScheduledToastNotifications")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: ToastNotification => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveFromSchedule(value: ScheduledToastNotification => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFromSchedule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetting(value: NotificationSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: ToastNotification => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

