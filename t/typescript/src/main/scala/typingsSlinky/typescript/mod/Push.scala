package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Array that is only intended to be pushed to, never read. */
@js.native
trait Push[T] extends js.Object {
  def push(values: T*): Unit = js.native
}

object Push {
  @scala.inline
  def apply[T](push: /* repeated */ T => Unit): Push[T] = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[Push[T]]
  }
  @scala.inline
  implicit class PushOps[Self[t] <: Push[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPush(value: /* repeated */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

