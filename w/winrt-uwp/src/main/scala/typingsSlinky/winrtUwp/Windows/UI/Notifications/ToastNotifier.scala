package typingsSlinky.winrtUwp.Windows.UI.Notifications

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Raises a toast notification to the specific app to which the ToastNotifier is bound. This class also lets you schedule and remove toast notifications. */
@js.native
trait ToastNotifier extends StObject {
  
  /**
    * Adds a ScheduledToastNotification for later display by Windows.
    * @param scheduledToast The scheduled toast notification, which includes its content and timing instructions.
    */
  def addToSchedule(scheduledToast: ScheduledToastNotification): Unit = js.native
  
  /**
    * Gets the collection of ScheduledToastNotification objects that this app has scheduled for display.
    * @return The collection of scheduled toast notifications that the app bound to this notifier has scheduled for timed display.
    */
  def getScheduledToastNotifications(): IVectorView[ScheduledToastNotification] = js.native
  
  /**
    * Removes the specified toast notification from the screen.
    * @param notification The object that specifies the toast to hide.
    */
  def hide(notification: ToastNotification): Unit = js.native
  
  /**
    * Cancels the scheduled display of a specified ScheduledToastNotification .
    * @param scheduledToast The notification to remove from the schedule.
    */
  def removeFromSchedule(scheduledToast: ScheduledToastNotification): Unit = js.native
  
  /** Gets a value that tells you whether there is an app, user, or system block that prevents the display of a toast notification. */
  var setting: NotificationSetting = js.native
  
  /**
    * Displays the specified toast notification.
    * @param notification The object that contains the content of the toast notification to display.
    */
  def show(notification: ToastNotification): Unit = js.native
}
object ToastNotifier {
  
  @scala.inline
  def apply(
    addToSchedule: ScheduledToastNotification => Unit,
    getScheduledToastNotifications: () => IVectorView[ScheduledToastNotification],
    hide: ToastNotification => Unit,
    removeFromSchedule: ScheduledToastNotification => Unit,
    setting: NotificationSetting,
    show: ToastNotification => Unit
  ): ToastNotifier = {
    val __obj = js.Dynamic.literal(addToSchedule = js.Any.fromFunction1(addToSchedule), getScheduledToastNotifications = js.Any.fromFunction0(getScheduledToastNotifications), hide = js.Any.fromFunction1(hide), removeFromSchedule = js.Any.fromFunction1(removeFromSchedule), setting = setting.asInstanceOf[js.Any], show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[ToastNotifier]
  }
  
  @scala.inline
  implicit class ToastNotifierMutableBuilder[Self <: ToastNotifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddToSchedule(value: ScheduledToastNotification => Unit): Self = StObject.set(x, "addToSchedule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScheduledToastNotifications(value: () => IVectorView[ScheduledToastNotification]): Self = StObject.set(x, "getScheduledToastNotifications", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: ToastNotification => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveFromSchedule(value: ScheduledToastNotification => Unit): Self = StObject.set(x, "removeFromSchedule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetting(value: NotificationSetting): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: ToastNotification => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
