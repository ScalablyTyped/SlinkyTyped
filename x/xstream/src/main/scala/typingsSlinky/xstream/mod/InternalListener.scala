package typingsSlinky.xstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalListener[T] extends js.Object {
  def _c(): Unit = js.native
  def _e(err: js.Any): Unit = js.native
  def _n(v: T): Unit = js.native
}

object InternalListener {
  @scala.inline
  def apply[T](_c: () => Unit, _e: js.Any => Unit, _n: T => Unit): InternalListener[T] = {
    val __obj = js.Dynamic.literal(_c = js.Any.fromFunction0(_c), _e = js.Any.fromFunction1(_e), _n = js.Any.fromFunction1(_n))
    __obj.asInstanceOf[InternalListener[T]]
  }
  @scala.inline
  implicit class InternalListenerOps[Self[t] <: InternalListener[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_c(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_c")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_e(value: js.Any => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_e")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_n(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_n")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

