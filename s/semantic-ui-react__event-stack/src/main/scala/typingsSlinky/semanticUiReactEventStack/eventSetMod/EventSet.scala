package typingsSlinky.semanticUiReactEventStack.eventSetMod

import typingsSlinky.semanticUiReactEventStack.typesMod.EventListeners
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSet extends js.Object {
  val handlers: js.Any = js.native
  /**
    * @see https://jsperf.com/suir-eventset-addhandlers
    */
  def addHandlers(additionalHandlers: EventListeners): EventSet = js.native
  /**
    * @see https://jsperf.com/suir-eventset-dispatchsingle
    * @see https://jsperf.com/suir-eventset-dispatchmultiple2
    */
  def dispatchEvent(event: Event_, dispatchAll: Boolean): Unit = js.native
  def hasHandlers(): Boolean = js.native
  /**
    * @see https://jsperf.com/suir-eventset-removehandlers
    */
  def removeHandlers(removalHandlers: EventListeners): EventSet = js.native
}

object EventSet {
  @scala.inline
  def apply(
    addHandlers: EventListeners => EventSet,
    dispatchEvent: (Event_, Boolean) => Unit,
    handlers: js.Any,
    hasHandlers: () => Boolean,
    removeHandlers: EventListeners => EventSet
  ): EventSet = {
    val __obj = js.Dynamic.literal(addHandlers = js.Any.fromFunction1(addHandlers), dispatchEvent = js.Any.fromFunction2(dispatchEvent), handlers = handlers.asInstanceOf[js.Any], hasHandlers = js.Any.fromFunction0(hasHandlers), removeHandlers = js.Any.fromFunction1(removeHandlers))
    __obj.asInstanceOf[EventSet]
  }
  @scala.inline
  implicit class EventSetOps[Self <: EventSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddHandlers(value: EventListeners => EventSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHandlers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDispatchEvent(value: (Event_, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHandlers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasHandlers(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasHandlers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveHandlers(value: EventListeners => EventSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeHandlers")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

