package typingsSlinky.titanium.Titanium.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iOS {
  /**
    * Fired when the user activity get deleted using the <Titanium.App.iOS.UserActivity.deleteAllSavedUserActivities> or
    * <Titanium.App.iOS.UserActivity.deleteSavedUserActivitiesForPersistentIdentifiers> methods.
    */
  type UserActivityUseractivitydeletedEvent = typingsSlinky.titanium.Titanium.App.iOS.UserActivityBaseEvent
  /**
    * Fired when a property is changed.
    */
  type UserDefaultsChangeEvent = typingsSlinky.titanium.Titanium.App.iOS.UserDefaultsBaseEvent
  /**
    * The top-level App iOS Notification Center module. It is used to control scheduled notifications
    * and receive details about the system-wide notification settings.
    */
  type UserNotificationCenter = typingsSlinky.titanium.Titanium.Module
}
