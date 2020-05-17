package typingsSlinky.sipml.SIPml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTarget[EventSubscriptionType /* <: String */, EventType /* <: Event */] extends js.Object {
  def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[/* e */ EventType, Unit]): Unit = js.native
  def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
}

object EventTarget {
  @scala.inline
  def apply[EventSubscriptionType, EventType](
    addEventListener: (EventSubscriptionType, js.Function1[/* e */ EventType, Unit]) => Unit,
    removeEventListener: EventSubscriptionType => Unit
  ): EventTarget[EventSubscriptionType, EventType] = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[EventTarget[EventSubscriptionType, EventType]]
  }
  @scala.inline
  implicit class EventTargetOps[Self[eventsubscriptiontype, eventtype] <: EventTarget[eventsubscriptiontype, eventtype], EventSubscriptionType, EventType] (val x: Self[EventSubscriptionType, EventType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[EventSubscriptionType, EventType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[EventSubscriptionType, EventType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[EventSubscriptionType, EventType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[EventSubscriptionType, EventType]) with Other]
    @scala.inline
    def withAddEventListener(value: (EventSubscriptionType, js.Function1[/* e */ EventType, Unit]) => Unit): Self[EventSubscriptionType, EventType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: EventSubscriptionType => Unit): Self[EventSubscriptionType, EventType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

