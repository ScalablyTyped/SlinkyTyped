package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionAdminSettings extends js.Object {
  /**
    * If true, members of the group subscribed to the associated subscription cannot opt (choose not to get notified)
    */
  var blockUserOptOut: Boolean = js.native
}

object SubscriptionAdminSettings {
  @scala.inline
  def apply(blockUserOptOut: Boolean): SubscriptionAdminSettings = {
    val __obj = js.Dynamic.literal(blockUserOptOut = blockUserOptOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionAdminSettings]
  }
  @scala.inline
  implicit class SubscriptionAdminSettingsOps[Self <: SubscriptionAdminSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockUserOptOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockUserOptOut")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

