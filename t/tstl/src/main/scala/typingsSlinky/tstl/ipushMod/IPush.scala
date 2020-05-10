package typingsSlinky.tstl.ipushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPush[T] extends js.Object {
  /**
    * Insert items at the end.
    *
    * @param items Items to insert.
    * @return Number of elements in the container after insertion.
    */
  def push(items: T*): Double = js.native
}

object IPush {
  @scala.inline
  def apply[T](push: /* repeated */ T => Double): IPush[T] = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[IPush[T]]
  }
  @scala.inline
  implicit class IPushOps[Self[t] <: IPush[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPush(value: /* repeated */ T => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

