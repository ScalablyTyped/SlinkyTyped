package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary object of parameters used to create a notification using
  * <Titanium.App.iOS.scheduleLocalNotification>.
  */
@js.native
trait NotificationParams extends js.Object {
  /**
  	 * Alert button text ('Open', by default) or home text ('Press Home to unlock', by default)
  	 * to display.
  	 */
  var alertAction: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Alert message to display.
  	 */
  var alertBody: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Image to display instead of `Default.png` when launching the application.
  	 */
  var alertLaunchImage: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Alert subtitle to display.
  	 */
  var alertSubtitle: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Alert title to display.
  	 */
  var alertTitle: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Notification attachments to display.
  	 */
  var attachments: js.UndefOr[js.Array[UserNotificationAttachment]] = js.native
  /**
  	 * Application badge value.
  	 */
  var badge: js.UndefOr[Double] = js.native
  /**
  	 * String identifier of category of actions to be displayed for an interactive notification.
  	 */
  var category: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Date and time for the notification to occur.
  	 */
  var date: js.UndefOr[js.Date] = js.native
  /**
  	 * The notification identifier.
  	 */
  var identifier: java.lang.String = js.native
  /**
  	 * Region the notification will be triggered in. Allowed parameter are:
  	 * - `latitude`: Latitude of the location center, in decimal degrees (required).
  	 * - `longitude`: Longitude of the location center, in decimal degrees (required).
  	 * - `triggersOnce`: Whether or not the notification will only fire once (optional, default: true).
  	 */
  var region: js.UndefOr[js.Any] = js.native
  /**
  	 * Interval to repeat the notification. One of `weekly`, `daily`, `yearly,` `monthly`.
  	 */
  var repeat: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Path to the sound file to play when notification occurs, relative to the `Resources` folder.
  	 */
  var sound: js.UndefOr[java.lang.String] = js.native
  /**
  	 * The string the notification adds to the category's summary format string.
  	 */
  var summaryArgument: js.UndefOr[java.lang.String] = js.native
  /**
  	 * The number of items the notification adds to the category's summary format string.
  	 */
  var summaryArgumentCount: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Timezone of the date configured for the notification. If not set, the system timezone is used.
  	 */
  var timezone: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Data to pass to the application with the notification event.
  	 */
  var userInfo: js.UndefOr[js.Any] = js.native
}

object NotificationParams {
  @scala.inline
  def apply(identifier: java.lang.String): NotificationParams = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationParams]
  }
  @scala.inline
  implicit class NotificationParamsOps[Self <: NotificationParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlertAction(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlertAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertAction")(js.undefined)
        ret
    }
    @scala.inline
    def withAlertBody(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlertBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertBody")(js.undefined)
        ret
    }
    @scala.inline
    def withAlertLaunchImage(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertLaunchImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlertLaunchImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertLaunchImage")(js.undefined)
        ret
    }
    @scala.inline
    def withAlertSubtitle(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertSubtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlertSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertSubtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withAlertTitle(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlertTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachments(value: js.Array[UserNotificationAttachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withBadge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeat(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(js.undefined)
        ret
    }
    @scala.inline
    def withSound(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryArgument(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryArgument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryArgument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryArgument")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryArgumentCount(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryArgumentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryArgumentCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryArgumentCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withUserInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfo")(js.undefined)
        ret
    }
  }
  
}

