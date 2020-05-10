package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationEventBacklogStatus extends js.Object {
  var eventBacklogStatus: js.Array[EventBacklogStatus] = js.native
  var notificationBacklogStatus: js.Array[NotificationBacklogStatus] = js.native
}

object NotificationEventBacklogStatus {
  @scala.inline
  def apply(
    eventBacklogStatus: js.Array[EventBacklogStatus],
    notificationBacklogStatus: js.Array[NotificationBacklogStatus]
  ): NotificationEventBacklogStatus = {
    val __obj = js.Dynamic.literal(eventBacklogStatus = eventBacklogStatus.asInstanceOf[js.Any], notificationBacklogStatus = notificationBacklogStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventBacklogStatus]
  }
  @scala.inline
  implicit class NotificationEventBacklogStatusOps[Self <: NotificationEventBacklogStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventBacklogStatus(value: js.Array[EventBacklogStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventBacklogStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationBacklogStatus(value: js.Array[NotificationBacklogStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationBacklogStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

