package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventBacklogStatus extends js.Object {
  var maxUnprocessedEventAgeMs: Double = js.native
  var publisher: String = js.native
  var timeSinceLastProcessedEventMs: Double = js.native
  var unprocessedEvents: Double = js.native
}

object EventBacklogStatus {
  @scala.inline
  def apply(
    maxUnprocessedEventAgeMs: Double,
    publisher: String,
    timeSinceLastProcessedEventMs: Double,
    unprocessedEvents: Double
  ): EventBacklogStatus = {
    val __obj = js.Dynamic.literal(maxUnprocessedEventAgeMs = maxUnprocessedEventAgeMs.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], timeSinceLastProcessedEventMs = timeSinceLastProcessedEventMs.asInstanceOf[js.Any], unprocessedEvents = unprocessedEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBacklogStatus]
  }
  @scala.inline
  implicit class EventBacklogStatusOps[Self <: EventBacklogStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxUnprocessedEventAgeMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUnprocessedEventAgeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSinceLastProcessedEventMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSinceLastProcessedEventMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprocessedEvents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessedEvents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

