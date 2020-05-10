package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionUserSettings extends js.Object {
  /**
    * Indicates whether the user will receive notifications for the associated group subscription.
    */
  var optedOut: Boolean = js.native
}

object SubscriptionUserSettings {
  @scala.inline
  def apply(optedOut: Boolean): SubscriptionUserSettings = {
    val __obj = js.Dynamic.literal(optedOut = optedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionUserSettings]
  }
  @scala.inline
  implicit class SubscriptionUserSettingsOps[Self <: SubscriptionUserSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptedOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optedOut")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

