package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class EventHandlerOps[Self <: EventHandler[_], T] (val x: Self with EventHandler[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSubscribe(value: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[_]): Self = this.set("subscribe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnsubscribe(value: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[_]): Self = this.set("unsubscribe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnsubscribeAll(value: () => EventHandler[_]): Self = this.set("unsubscribeAll", js.Any.fromFunction0(value))
  }
}
