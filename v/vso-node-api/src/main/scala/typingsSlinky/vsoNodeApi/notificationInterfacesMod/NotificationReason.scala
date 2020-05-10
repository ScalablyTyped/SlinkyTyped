package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationReason extends js.Object {
  var notificationReasonType: NotificationReasonType = js.native
  var targetIdentities: js.Array[IdentityRef] = js.native
}

object NotificationReason {
  @scala.inline
  def apply(notificationReasonType: NotificationReasonType, targetIdentities: js.Array[IdentityRef]): NotificationReason = {
    val __obj = js.Dynamic.literal(notificationReasonType = notificationReasonType.asInstanceOf[js.Any], targetIdentities = targetIdentities.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationReason]
  }
  @scala.inline
  implicit class NotificationReasonOps[Self <: NotificationReason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotificationReasonType(value: NotificationReasonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationReasonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetIdentities(value: js.Array[IdentityRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIdentities")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

