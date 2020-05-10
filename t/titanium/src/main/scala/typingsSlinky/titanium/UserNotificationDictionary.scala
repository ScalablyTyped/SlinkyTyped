package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of notification data used in the array of `notifications`
  * when receiving pending or local notifications in
  * <Titanium.App.iOS.UserNotificationCenter.getPendingNotifications> and
  * <Titanium.App.iOS.UserNotificationCenter.getDeliveredNotifications>.
  */
@js.native
trait UserNotificationDictionary extends js.Object {
  /**
  	 * Alert button text ('Open', by default) or home text ('Press Home to unlock', by default)
  	 * type: String
  	 */
  var alertAction: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Alert message.
  	 */
  var alertBody: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Image displayed instead of `Default.png` when launching the application.
  	 */
  var alertLaunchImage: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Subtitle of the notification.
  	 */
  var alertSubtitle: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Title of the notification.
  	 */
  var alertTitle: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Application badge value.
  	 */
  var badge: js.UndefOr[Double] = js.native
  /**
  	 * Category identifier of the notification.
  	 */
  var category: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Date and time when the notification was configured to fire.
  	 */
  var date: js.UndefOr[js.Date] = js.native
  /**
  	 * The notification identifier.
  	 */
  var identifier: java.lang.String = js.native
  /**
  	 * Region of the notification.
  	 */
  var region: js.UndefOr[js.Any] = js.native
  /**
  	 * Path to the sound file configured to play when the notification was fired.
  	 */
  var sound: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Timezone of the date when the notification was configured to fire.
  	 */
  var timezone: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Custom data object.
  	 */
  var userInfo: js.UndefOr[js.Any] = js.native
}

object UserNotificationDictionary {
  @scala.inline
  def apply(identifier: java.lang.String): UserNotificationDictionary = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserNotificationDictionary]
  }
  @scala.inline
  implicit class UserNotificationDictionaryOps[Self <: UserNotificationDictionary] (val x: Self) extends AnyVal {
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

