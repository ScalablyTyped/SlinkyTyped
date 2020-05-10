package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.App.iOS.UserNotificationCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary object of parameters used to register the application with local notifications using
  * the <Titanium.App.iOS.registerUserNotificationSettings> method.
  */
@js.native
trait GetUserNotificationSettings extends js.Object {
  /**
  	 * The current alert settings.
  	 */
  var alertSetting: js.UndefOr[Double] = js.native
  /**
  	 * The current alert style used to display notifications.
  	 */
  var alertStyle: js.UndefOr[Double] = js.native
  /**
  	 * The current authorization status for using notifications.
  	 */
  var authorizationStatus: js.UndefOr[Double] = js.native
  /**
  	 * The current badge settings.
  	 */
  var badgeSetting: js.UndefOr[Double] = js.native
  /**
  	 * The current CarPlay settings.
  	 */
  var carPlaySetting: js.UndefOr[Double] = js.native
  /**
  	 * Set of categories of user notification actions required by the applicaiton to use.
  	 */
  var categories: js.UndefOr[js.Array[UserNotificationCategory]] = js.native
  /**
  	 * The authorization status to play sounds for critical alerts.
  	 * Available in Titanium SDK 7.4.0 and later.
  	 */
  var criticalAlertSetting: js.UndefOr[Double] = js.native
  /**
  	 * The current lock-screen settings.
  	 */
  var lockScreenSetting: js.UndefOr[Double] = js.native
  /**
  	 * The current notication-center settings.
  	 */
  var notificationCenterSetting: js.UndefOr[Double] = js.native
  /**
  	 * A Boolean value indicating the system displays a button for in-app notification settings.
  	 * Available in Titanium SDK 7.4.0 and later.
  	 */
  var providesAppNotificationSettings: js.UndefOr[Double] = js.native
  /**
  	 * The current sound settings.
  	 */
  var soundSetting: js.UndefOr[Double] = js.native
  /**
  	 * Notification types to use.
  	 */
  var types: js.UndefOr[js.Array[Double]] = js.native
}

object GetUserNotificationSettings {
  @scala.inline
  def apply(): GetUserNotificationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserNotificationSettings]
  }
  @scala.inline
  implicit class GetUserNotificationSettingsOps[Self <: GetUserNotificationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlertSetting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlertSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withAlertStyle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlertStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizationStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeSetting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withCarPlaySetting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carPlaySetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarPlaySetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carPlaySetting")(js.undefined)
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[UserNotificationCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withCriticalAlertSetting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criticalAlertSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCriticalAlertSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criticalAlertSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScreenSetting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScreenSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationCenterSetting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationCenterSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationCenterSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationCenterSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withProvidesAppNotificationSettings(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providesAppNotificationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvidesAppNotificationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providesAppNotificationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSoundSetting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoundSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}

