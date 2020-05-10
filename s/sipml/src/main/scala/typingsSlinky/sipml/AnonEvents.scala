package typingsSlinky.sipml

import typingsSlinky.sipml.SIPml.Session.Event
import typingsSlinky.sipml.SIPml.Session.EventSubscriptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEvents extends js.Object {
  var events: EventSubscriptionType | js.Array[EventSubscriptionType] = js.native
  def listener(e: Event): Unit = js.native
}

object AnonEvents {
  @scala.inline
  def apply(events: EventSubscriptionType | js.Array[EventSubscriptionType], listener: Event => Unit): AnonEvents = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], listener = js.Any.fromFunction1(listener))
    __obj.asInstanceOf[AnonEvents]
  }
  @scala.inline
  implicit class AnonEventsOps[Self <: AnonEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: EventSubscriptionType | js.Array[EventSubscriptionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListener(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

