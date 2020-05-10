package typingsSlinky.subscriptionsTransportWs.clientMod

import typingsSlinky.subscriptionsTransportWs.AnonUnsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable[T] extends js.Object {
  def subscribe(observer: Observer[T]): AnonUnsubscribe = js.native
}

object Observable {
  @scala.inline
  def apply[T](subscribe: Observer[T] => AnonUnsubscribe): Observable[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Observable[T]]
  }
  @scala.inline
  implicit class ObservableOps[Self[t] <: Observable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSubscribe(value: Observer[T] => AnonUnsubscribe): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

