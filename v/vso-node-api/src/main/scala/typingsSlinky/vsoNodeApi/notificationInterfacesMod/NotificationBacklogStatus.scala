package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationBacklogStatus extends js.Object {
  var channel: String = js.native
  var maxUnprocessedNotificationAgeMs: Double = js.native
  var publisher: String = js.native
  var timeSinceLastProcessedNotificationMs: Double = js.native
  var unprocessedNotifications: Double = js.native
}

object NotificationBacklogStatus {
  @scala.inline
  def apply(
    channel: String,
    maxUnprocessedNotificationAgeMs: Double,
    publisher: String,
    timeSinceLastProcessedNotificationMs: Double,
    unprocessedNotifications: Double
  ): NotificationBacklogStatus = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], maxUnprocessedNotificationAgeMs = maxUnprocessedNotificationAgeMs.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], timeSinceLastProcessedNotificationMs = timeSinceLastProcessedNotificationMs.asInstanceOf[js.Any], unprocessedNotifications = unprocessedNotifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationBacklogStatus]
  }
  @scala.inline
  implicit class NotificationBacklogStatusOps[Self <: NotificationBacklogStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxUnprocessedNotificationAgeMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUnprocessedNotificationAgeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSinceLastProcessedNotificationMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSinceLastProcessedNotificationMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprocessedNotifications(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessedNotifications")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

