package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object passed to the
  * [registerForPushNotifications](Titanium.Network.registerForPushNotifications) error callback.
  */
@js.native
trait PushNotificationErrorArg extends FailureResponse {
  /**
  	 * The value of this string is always "remote".
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.native
}

object PushNotificationErrorArg {
  @scala.inline
  def apply(): PushNotificationErrorArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushNotificationErrorArg]
  }
  @scala.inline
  implicit class PushNotificationErrorArgOps[Self <: PushNotificationErrorArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

