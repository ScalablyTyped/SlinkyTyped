package typingsSlinky.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when a local notification is received by the application.
		 */
@js.native
trait iOSNotificationEvent extends iOSBaseEvent {
  /**
  			 * Alert button text ('View', by default) or slider text ('slide to unlock...', by default).
  			 */
  var alertAction: String = js.native
  /**
  			 * Alert message.
  			 */
  var alertBody: String = js.native
  /**
  			 * Image displayed instead of `Default.png` when launching the application.
  			 */
  var alertLaunchImage: String = js.native
  /**
  			 * Application badge value.
  			 */
  var badge: Double = js.native
  /**
  			 * The identifier of the app-defined [category object](Titanium.App.iOS.UserNotificationCategory). Available in Titanium SDK 7.5.0+ and iOS 10+.
  			 */
  var category: String = js.native
  /**
  			 * Date and time when the notification was configured to fire.
  			 */
  var date: js.Date = js.native
  /**
  			 * Boolean indicating if notification was received while app was in background. Available in Titanium SDK 6.2.0.
  			 * On iOS 10+ this is no longer available since this event will only fire if the app is in foreground.
  			 */
  var inBackground: Boolean = js.native
  /**
  			 * Name of the sound file configured to play when the notification was fired.
  			 */
  var sound: String = js.native
  /**
  			 * The unique identifier for the thread or conversation related to this notification request.
  			 * It will be used to visually group notifications together. Available in Titanium SDK 7.5.0+ and iOS 10+.
  			 */
  var threadIdentifier: String = js.native
  /**
  			 * Timezone of the date when the notification was configured to fire. Available in Titanium SDK 7.4.0+.
  			 */
  var timezone: String = js.native
  /**
  			 * Custom data object.
  			 */
  var userInfo: js.Any = js.native
}

object iOSNotificationEvent {
  @scala.inline
  def apply(
    alertAction: String,
    alertBody: String,
    alertLaunchImage: String,
    badge: Double,
    category: String,
    date: js.Date,
    inBackground: Boolean,
    sound: String,
    source: iOS,
    threadIdentifier: String,
    timezone: String,
    userInfo: js.Any
  ): iOSNotificationEvent = {
    val __obj = js.Dynamic.literal(alertAction = alertAction.asInstanceOf[js.Any], alertBody = alertBody.asInstanceOf[js.Any], alertLaunchImage = alertLaunchImage.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], inBackground = inBackground.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], threadIdentifier = threadIdentifier.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSNotificationEvent]
  }
  @scala.inline
  implicit class iOSNotificationEventOps[Self <: iOSNotificationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlertAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlertBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlertLaunchImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertLaunchImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreadIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

