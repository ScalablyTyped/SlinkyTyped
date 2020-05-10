package typingsSlinky.titanium.Titanium.App

import typingsSlinky.titanium.Titanium.App.iOS.UserNotificationCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the user notification settings are registered.
		 */
@js.native
trait iOSUsernotificationsettingsEvent extends iOSBaseEvent {
  /**
  			 * Set of categories of user notification actions the application is registered to use.
  			 */
  var categories: js.Array[UserNotificationCategory] = js.native
  /**
  			 * Notification types the application is registered to use.
  			 */
  var types: js.Array[Double] = js.native
}

object iOSUsernotificationsettingsEvent {
  @scala.inline
  def apply(categories: js.Array[UserNotificationCategory], source: iOS, types: js.Array[Double]): iOSUsernotificationsettingsEvent = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSUsernotificationsettingsEvent]
  }
  @scala.inline
  implicit class iOSUsernotificationsettingsEventOps[Self <: iOSUsernotificationsettingsEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: js.Array[UserNotificationCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

