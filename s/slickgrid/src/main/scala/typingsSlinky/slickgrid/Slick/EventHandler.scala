package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventHandler[T] extends js.Object {
  def subscribe(event: Event[T], handler: js.Function2[/* e */ EventData, /* data */ T, Unit]): EventHandler[_] = js.native
  def unsubscribe(event: Event[T], handler: js.Function2[/* e */ EventData, /* data */ T, Unit]): EventHandler[_] = js.native
  def unsubscribeAll(): EventHandler[_] = js.native
}

object EventHandler {
  @scala.inline
  def apply[T](
    subscribe: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[_],
    unsubscribe: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[_],
    unsubscribeAll: () => EventHandler[_]
  ): EventHandler[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe), unsubscribeAll = js.Any.fromFunction0(unsubscribeAll))
    __obj.asInstanceOf[EventHandler[T]]
  }
  @scala.inline
  implicit class EventHandlerOps[Self[t] <: EventHandler[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSubscribe(value: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnsubscribe(value: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnsubscribeAll(value: () => EventHandler[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribeAll")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

