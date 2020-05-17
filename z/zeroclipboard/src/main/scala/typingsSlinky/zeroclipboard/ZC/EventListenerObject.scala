package typingsSlinky.zeroclipboard.ZC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventListenerObject[T /* <: ZeroClipboardEvent */] extends EventListenerOrEventListenerObject[T] {
  def handleEvent(ev: T): Unit = js.native
}

object EventListenerObject {
  @scala.inline
  def apply[T](handleEvent: T => Unit): EventListenerObject[T] = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[EventListenerObject[T]]
  }
  @scala.inline
  implicit class EventListenerObjectOps[Self[t] <: EventListenerObject[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withHandleEvent(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleEvent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

