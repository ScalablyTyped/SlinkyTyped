package typingsSlinky.storybookApi.notificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubState extends js.Object {
  var notifications: js.Array[Notification] = js.native
}

object SubState {
  @scala.inline
  def apply(notifications: js.Array[Notification]): SubState = {
    val __obj = js.Dynamic.literal(notifications = notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubState]
  }
  @scala.inline
  implicit class SubStateOps[Self <: SubState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotifications(value: js.Array[Notification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

