package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object representing a push notification.
  */
@js.native
trait PushNotificationData extends js.Object {
  /**
  	 * The `userinfo` dictionary passed to the Apple Push Notification Service.
  	 */
  var data: js.UndefOr[js.Any] = js.native
  /**
  	 * Boolean indicating if notification was received while app was in background.
  	 */
  var inBackground: js.UndefOr[Boolean] = js.native
}

object PushNotificationData {
  @scala.inline
  def apply(): PushNotificationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushNotificationData]
  }
  @scala.inline
  implicit class PushNotificationDataOps[Self <: PushNotificationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withInBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inBackground")(js.undefined)
        ret
    }
  }
  
}

