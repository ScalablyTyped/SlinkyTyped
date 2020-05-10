package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchNotificationOperation extends js.Object {
  var notificationOperation: NotificationOperation = js.native
  var notificationQueryConditions: js.Array[NotificationQueryCondition] = js.native
}

object BatchNotificationOperation {
  @scala.inline
  def apply(
    notificationOperation: NotificationOperation,
    notificationQueryConditions: js.Array[NotificationQueryCondition]
  ): BatchNotificationOperation = {
    val __obj = js.Dynamic.literal(notificationOperation = notificationOperation.asInstanceOf[js.Any], notificationQueryConditions = notificationQueryConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchNotificationOperation]
  }
  @scala.inline
  implicit class BatchNotificationOperationOps[Self <: BatchNotificationOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotificationOperation(value: NotificationOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationQueryConditions(value: js.Array[NotificationQueryCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationQueryConditions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

