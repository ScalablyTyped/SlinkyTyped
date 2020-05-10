package typingsSlinky.xstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalProducer[T] extends js.Object {
  def _start(listener: InternalListener[T]): Unit = js.native
  def _stop(): Unit = js.native
}

object InternalProducer {
  @scala.inline
  def apply[T](_start: InternalListener[T] => Unit, _stop: () => Unit): InternalProducer[T] = {
    val __obj = js.Dynamic.literal(_start = js.Any.fromFunction1(_start), _stop = js.Any.fromFunction0(_stop))
    __obj.asInstanceOf[InternalProducer[T]]
  }
  @scala.inline
  implicit class InternalProducerOps[Self[t] <: InternalProducer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_start(value: InternalListener[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_stop(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

