package typingsSlinky.zeroclipboard.ZC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventListenerObject[T /* <: ZeroClipboardEvent */] extends js.Object {
  
  def handleEvent(ev: T): Unit = js.native
}
object EventListenerObject {
  
  @scala.inline
  def apply[T /* <: ZeroClipboardEvent */](handleEvent: T => Unit): EventListenerObject[T] = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[EventListenerObject[T]]
  }
  
  @scala.inline
  implicit class EventListenerObjectOps[Self <: EventListenerObject[_], T /* <: ZeroClipboardEvent */] (val x: Self with EventListenerObject[T]) extends AnyVal {
    
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
    def setHandleEvent(value: T => Unit): Self = this.set("handleEvent", js.Any.fromFunction1(value))
  }
}
