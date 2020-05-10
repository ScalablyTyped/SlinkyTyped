package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for specifying push notification options to
  * [registerForPushNotifications](Titanium.Network.registerForPushNotifications).
  */
@js.native
trait PushNotificationConfig extends js.Object {
  /**
  	 * Callback function invoked upon receiving a new push notification.
  	 */
  var callback: js.UndefOr[js.Function1[/* param0 */ PushNotificationData, Unit]] = js.native
  /**
  	 * Callback function called when an error occurs during registration.
  	 */
  var error: js.UndefOr[js.Function1[/* param0 */ PushNotificationErrorArg, Unit]] = js.native
  /**
  	 * Callback function called when the push registration is successfully completed.
  	 */
  var success: js.UndefOr[js.Function1[/* param0 */ PushNotificationSuccessArg, Unit]] = js.native
  /**
  	 * Array of `NOTIFICATION_TYPE` constants that the application would like to receive.
  	 */
  var types: js.UndefOr[js.Array[Double]] = js.native
}

object PushNotificationConfig {
  @scala.inline
  def apply(): PushNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushNotificationConfig]
  }
  @scala.inline
  implicit class PushNotificationConfigOps[Self <: PushNotificationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: /* param0 */ PushNotificationData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* param0 */ PushNotificationErrorArg => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* param0 */ PushNotificationSuccessArg => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
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

