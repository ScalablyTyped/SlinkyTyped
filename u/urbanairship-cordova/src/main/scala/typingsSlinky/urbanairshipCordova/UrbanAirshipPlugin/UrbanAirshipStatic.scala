package typingsSlinky.urbanairshipCordova.UrbanAirshipPlugin

import typingsSlinky.urbanairshipCordova.anon.Alert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region API Definitions
@js.native
trait UrbanAirshipStatic extends js.Object {
  /**
    * The enumeration values for use with setNotificationTypes().
    */
  var notificationType: Alert = js.native
  /**
    * (Android Only)
    *
    * Clears the notifications posted by the application.
    *
    * @param callback The function to call on completion.
    */
  def clearNotifications(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Fluent API to edit the channel tag groups by adding or removing tags,
    * then applying the changes.
    *
    * For exmaple:
    *
    * UAirship.editChannelTagGroups()
    *      .addTags("loyalty", ["platinum-member", "gold-member"])
    *      .removeTags("loyalty", ["silver-member", "bronze-member"])
    *      .apply()
    */
  def editChannelTagGroups(): EditChannelTagGroupsApi = js.native
  /**
    * Fluent API to edit the named user tag groups by adding or removing
    * tags, then applying the changes.
    *
    * For example:
    *
    * UAirship.editNamedUserTagGroups()
    *      .addTags("loyalty", ["platinum-member", "gold-member"])
    *      .removeTags("loyalty", ["silver-member", "bronze-member"])
    *      .apply()
    *
    * @returns The chainable API instance.
    */
  def editNamedUserTagGroups(): EditNamedUserTagGroupsApi = js.native
  /**
    * Gets the alias for this device.
    *
    * @param callback The function to call on completion.
    */
  def getAlias(callback: js.Function1[/* alias */ String, Unit]): Unit = js.native
  /**
    * (iOS Only)
    *
    * Gets the current application badge number.
    *
    * @param callback The function to call on completion.
    */
  def getBadgeNumber(callback: js.Function1[/* badgeNumber */ Double, Unit]): Unit = js.native
  /**
    * Get the push identifier for the device. The channel ID is used to send
    * messages to the device for testing, and is the canonical identifier for
    * the device in Urban Airship.
    *
    * @param callback The function to call on completion.
    */
  def getChannelID(callback: js.Function1[/* id */ String, Unit]): Unit = js.native
  /**
    * Returns the push message object that contains the data associated with a
    * push notification. The extras dictionary can contain arbitrary key/value
    * data that you use in your application.
    *
    * @param clear Set to true to clear the notification.
    * @param callback The function to call on completion.
    */
  def getLaunchNotification(clear: Boolean, callback: js.Function1[/* push */ PushEvent, Unit]): Unit = js.native
  /**
    * Gets the named user ID for this device.
    *
    * @param callback The function to call on completion.
    */
  def getNamedUser(callback: js.Function1[/* namedUserId */ String, Unit]): Unit = js.native
  /**
    * Get the current quiet time. The quietTime object represents a timespan
    * during which notifications should be silenced. The typical use case is
    * to expose a preference to your users so that they can enable this setting
    * and specify an interval during which they do not wish to be disturbed.
    *
    * @param callback The function to call on completion.
    */
  def getQuietTime(callback: js.Function1[/* quietTime */ QuietTimeTimeSpan, Unit]): Unit = js.native
  /**
    * Returns the tags for the device.
    *
    * @param callback The function to call on completion.
    */
  def getTags(callback: js.Function1[/* tags */ js.Array[String], Unit]): Unit = js.native
  /**
    * Checks if analytics is enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isAnalyticsEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit = js.native
  /**
    * Checks if background location updates are enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isBackgroundLocationEnabled(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Checks if quiet time is currently in effect.
    *
    * @param callback The function to call on completion.
    */
  def isInQuietTime(callback: js.Function1[/* inQuietTime */ Boolean, Unit]): Unit = js.native
  /**
    * Checks if location is enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isLocationEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit = js.native
  /**
    * Checks if quiet time is enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isQuietTimeEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit = js.native
  /**
    * (Android Only)
    *
    * Checks if sound is enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isSoundEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit = js.native
  /**
    * Checks if user notifications are enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isUserNotificationsEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit = js.native
  /**
    * (Android Only)
    *
    * Checks if vibration is enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isVibrateEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit = js.native
  /**
    * Records the current location of the device.
    *
    * @param callback The function to call on completion.
    */
  def recordCurrentLocation(callback: js.Function0[Unit]): Unit = js.native
  /**
    * (iOS Only)
    *
    * Reset the badge number to zero.
    *
    * @param callback The function to call on completion.
    */
  def resetBadge(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Runs an Urban Airship action.
    *
    * @param actionName The name of the action to run.
    * @param actionValue The value for the action.
    * @param callback The function to call on completion.
    */
  def runAction(
    actionName: String,
    actionValue: String,
    callback: js.Function1[/* result */ RunActionResult, Unit]
  ): Unit = js.native
  /**
    * Set alias for the device.
    *
    * @param alias The alias to set for this device.
    * @param callback The function to call on completion.
    */
  def setAlias(alias: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Enables or disables analytics. Disabling analytics will delete any
    * locally stored events and prevent any events from uploading. Features
    * that depend on analytics being enabled may not work properly if it’s
    * disabled (reports, region triggers, location segmentation, push to
    * local time).
    *
    * @param enabled Set to true to enable analytics, false to disable.
    * @param callback The function to call on completion.
    */
  def setAnalyticsEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit = js.native
  /**
    * (iOS Only)
    *
    * Set whether the UA Autobadge feature is enabled.
    *
    * @param enabled Set to true to enable Autobadge, false to disable.
    * @param callback The function to call on completion.
    */
  def setAutobadgeEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Enables or disables background location on the device.
    *
    * @param enabled Set to true to enable background location, false to disable.
    * @param callback The function to call on completion.
    */
  def setBackgroundLocationEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit = js.native
  /**
    * (iOS Only)
    *
    * Set the current application badge number.
    *
    * @param badge The number to use for the badge.
    * @param callback The function to call on completion.
    */
  def setBadgeNumber(badge: Double, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Enables or disables Urban Airship location services on the device.
    *
    * @param enabled Set to true to enable location, false to disable.
    * @param callback The function to call on completion.
    */
  def setLocationEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Set the named user ID for this device.
    *
    * @param namedUser The named user ID.
    * @param callback The function to call on completion.
    */
  def setNamedUser(namedUserId: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * (iOS Only)
    *
    * On iOS, registration for push requires specifying what
    * combination of badges, sound and alerts are desired. This function
    * must be explicitly called in order to begin the registration process.
    *
    * For example:
    *
    * UAirship.setNotificationTypes(UAirship.notificationType.sound |
    *                                  UAirship.notificationType.alert);
    *
    * @param bitmask The notification types to set.
    * @param callback The function to call on completion.
    */
  def setNotificationTypes(bitmask: Double, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Set the quiet time for the device.
    *
    * @param startHour The start hour for quiet time.
    * @param startMinute The start minute for quiet time.
    * @param endHour The end hour for quiet time.
    * @param endMinute the end minute for quiet time.
    * @param callback The function to call on completion.
    */
  def setQuietTime(
    startHour: Double,
    startMinute: Double,
    endHour: Double,
    endMinute: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  /**
    * Enables or disables quiet time.
    *
    * @param enabled Set to true to enable quiet time, false to disable.
    * @param callback The function to call on completion.
    */
  def setQuietTimeEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit = js.native
  /**
    * (Android only, iOS sound settings come in the push)
    *
    * Set whether the device makes sound on push.
    *
    * @param enabled Set to true to enable sound, false to disable.
    * @param callback The function to call on completion.
    */
  def setSoundEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Sets tags for the device.
    *
    * @param tags An array of tags.
    * @param callback The function to call on completion.
    */
  def setTags(tags: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
  /**
    * Enables or disables user notifications on the device.
    * This will prompt users to opt-in to notifications on iOS.
    *
    * @param enabled Set to true to enable notifications, false to disable.
    * @param callback The function to call on completion.
    */
  def setUserNotificationsEnabled(enabled: Boolean, callback: js.Function1[/* status */ String, Unit]): Unit = js.native
  /**
    * (Android Only)
    *
    * Set whether the device vibrates on push.
    *
    * @param enabled Set to true to enable vibration, false to disable.
    * @param callback The function to call on completion.
    */
  def setVibrateEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit = js.native
}

object UrbanAirshipStatic {
  @scala.inline
  def apply(
    clearNotifications: js.Function0[Unit] => Unit,
    editChannelTagGroups: () => EditChannelTagGroupsApi,
    editNamedUserTagGroups: () => EditNamedUserTagGroupsApi,
    getAlias: js.Function1[/* alias */ String, Unit] => Unit,
    getBadgeNumber: js.Function1[/* badgeNumber */ Double, Unit] => Unit,
    getChannelID: js.Function1[/* id */ String, Unit] => Unit,
    getLaunchNotification: (Boolean, js.Function1[/* push */ PushEvent, Unit]) => Unit,
    getNamedUser: js.Function1[/* namedUserId */ String, Unit] => Unit,
    getQuietTime: js.Function1[/* quietTime */ QuietTimeTimeSpan, Unit] => Unit,
    getTags: js.Function1[/* tags */ js.Array[String], Unit] => Unit,
    isAnalyticsEnabled: js.Function1[/* enabled */ Boolean, Unit] => Unit,
    isBackgroundLocationEnabled: js.Function0[Unit] => Unit,
    isInQuietTime: js.Function1[/* inQuietTime */ Boolean, Unit] => Unit,
    isLocationEnabled: js.Function1[/* enabled */ Boolean, Unit] => Unit,
    isQuietTimeEnabled: js.Function1[/* enabled */ Boolean, Unit] => Unit,
    isSoundEnabled: js.Function1[/* enabled */ Boolean, Unit] => Unit,
    isUserNotificationsEnabled: js.Function1[/* enabled */ Boolean, Unit] => Unit,
    isVibrateEnabled: js.Function1[/* enabled */ Boolean, Unit] => Unit,
    notificationType: Alert,
    recordCurrentLocation: js.Function0[Unit] => Unit,
    resetBadge: js.Function0[Unit] => Unit,
    runAction: (String, String, js.Function1[/* result */ RunActionResult, Unit]) => Unit,
    setAlias: (String, js.Function0[Unit]) => Unit,
    setAnalyticsEnabled: (Boolean, js.Function0[Unit]) => Unit,
    setAutobadgeEnabled: (Boolean, js.Function0[Unit]) => Unit,
    setBackgroundLocationEnabled: (Boolean, js.Function0[Unit]) => Unit,
    setBadgeNumber: (Double, js.Function0[Unit]) => Unit,
    setLocationEnabled: (Boolean, js.Function0[Unit]) => Unit,
    setNamedUser: (String, js.Function0[Unit]) => Unit,
    setNotificationTypes: (Double, js.Function0[Unit]) => Unit,
    setQuietTime: (Double, Double, Double, Double, js.Function0[Unit]) => Unit,
    setQuietTimeEnabled: (Boolean, js.Function0[Unit]) => Unit,
    setSoundEnabled: (Boolean, js.Function0[Unit]) => Unit,
    setTags: (js.Array[String], js.Function0[Unit]) => Unit,
    setUserNotificationsEnabled: (Boolean, js.Function1[/* status */ String, Unit]) => Unit,
    setVibrateEnabled: (Boolean, js.Function0[Unit]) => Unit
  ): UrbanAirshipStatic = {
    val __obj = js.Dynamic.literal(clearNotifications = js.Any.fromFunction1(clearNotifications), editChannelTagGroups = js.Any.fromFunction0(editChannelTagGroups), editNamedUserTagGroups = js.Any.fromFunction0(editNamedUserTagGroups), getAlias = js.Any.fromFunction1(getAlias), getBadgeNumber = js.Any.fromFunction1(getBadgeNumber), getChannelID = js.Any.fromFunction1(getChannelID), getLaunchNotification = js.Any.fromFunction2(getLaunchNotification), getNamedUser = js.Any.fromFunction1(getNamedUser), getQuietTime = js.Any.fromFunction1(getQuietTime), getTags = js.Any.fromFunction1(getTags), isAnalyticsEnabled = js.Any.fromFunction1(isAnalyticsEnabled), isBackgroundLocationEnabled = js.Any.fromFunction1(isBackgroundLocationEnabled), isInQuietTime = js.Any.fromFunction1(isInQuietTime), isLocationEnabled = js.Any.fromFunction1(isLocationEnabled), isQuietTimeEnabled = js.Any.fromFunction1(isQuietTimeEnabled), isSoundEnabled = js.Any.fromFunction1(isSoundEnabled), isUserNotificationsEnabled = js.Any.fromFunction1(isUserNotificationsEnabled), isVibrateEnabled = js.Any.fromFunction1(isVibrateEnabled), notificationType = notificationType.asInstanceOf[js.Any], recordCurrentLocation = js.Any.fromFunction1(recordCurrentLocation), resetBadge = js.Any.fromFunction1(resetBadge), runAction = js.Any.fromFunction3(runAction), setAlias = js.Any.fromFunction2(setAlias), setAnalyticsEnabled = js.Any.fromFunction2(setAnalyticsEnabled), setAutobadgeEnabled = js.Any.fromFunction2(setAutobadgeEnabled), setBackgroundLocationEnabled = js.Any.fromFunction2(setBackgroundLocationEnabled), setBadgeNumber = js.Any.fromFunction2(setBadgeNumber), setLocationEnabled = js.Any.fromFunction2(setLocationEnabled), setNamedUser = js.Any.fromFunction2(setNamedUser), setNotificationTypes = js.Any.fromFunction2(setNotificationTypes), setQuietTime = js.Any.fromFunction5(setQuietTime), setQuietTimeEnabled = js.Any.fromFunction2(setQuietTimeEnabled), setSoundEnabled = js.Any.fromFunction2(setSoundEnabled), setTags = js.Any.fromFunction2(setTags), setUserNotificationsEnabled = js.Any.fromFunction2(setUserNotificationsEnabled), setVibrateEnabled = js.Any.fromFunction2(setVibrateEnabled))
    __obj.asInstanceOf[UrbanAirshipStatic]
  }
  @scala.inline
  implicit class UrbanAirshipStaticOps[Self <: UrbanAirshipStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearNotifications(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearNotifications")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEditChannelTagGroups(value: () => EditChannelTagGroupsApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editChannelTagGroups")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEditNamedUserTagGroups(value: () => EditNamedUserTagGroupsApi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editNamedUserTagGroups")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAlias(value: js.Function1[/* alias */ String, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlias")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBadgeNumber(value: js.Function1[/* badgeNumber */ Double, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBadgeNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetChannelID(value: js.Function1[/* id */ String, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChannelID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLaunchNotification(value: (Boolean, js.Function1[/* push */ PushEvent, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLaunchNotification")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetNamedUser(value: js.Function1[/* namedUserId */ String, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNamedUser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetQuietTime(value: js.Function1[/* quietTime */ QuietTimeTimeSpan, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQuietTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTags(value: js.Function1[/* tags */ js.Array[String], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTags")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsAnalyticsEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAnalyticsEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsBackgroundLocationEnabled(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBackgroundLocationEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsInQuietTime(value: js.Function1[/* inQuietTime */ Boolean, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInQuietTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsLocationEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocationEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsQuietTimeEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isQuietTimeEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsSoundEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSoundEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsUserNotificationsEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUserNotificationsEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsVibrateEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVibrateEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotificationType(value: Alert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordCurrentLocation(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCurrentLocation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetBadge(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetBadge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRunAction(value: (String, String, js.Function1[/* result */ RunActionResult, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetAlias(value: (String, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAlias")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetAnalyticsEnabled(value: (Boolean, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnalyticsEnabled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetAutobadgeEnabled(value: (Boolean, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutobadgeEnabled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetBackgroundLocationEnabled(value: (Boolean, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackgroundLocationEnabled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetBadgeNumber(value: (Double, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBadgeNumber")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetLocationEnabled(value: (Boolean, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocationEnabled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetNamedUser(value: (String, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNamedUser")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetNotificationTypes(value: (Double, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNotificationTypes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetQuietTime(value: (Double, Double, Double, Double, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setQuietTime")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withSetQuietTimeEnabled(value: (Boolean, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setQuietTimeEnabled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetSoundEnabled(value: (Boolean, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSoundEnabled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTags(value: (js.Array[String], js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTags")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetUserNotificationsEnabled(value: (Boolean, js.Function1[/* status */ String, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUserNotificationsEnabled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetVibrateEnabled(value: (Boolean, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVibrateEnabled")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

