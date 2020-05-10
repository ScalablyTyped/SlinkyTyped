package typingsSlinky.tstl.ipushfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPushFront[T] extends js.Object {
  /**
    * Insert an element at the first.
    *
    * @param val Value to insert.
    */
  def push_front(`val`: T): Unit = js.native
}

object IPushFront {
  @scala.inline
  def apply[T](push_front: T => Unit): IPushFront[T] = {
    val __obj = js.Dynamic.literal(push_front = js.Any.fromFunction1(push_front))
    __obj.asInstanceOf[IPushFront[T]]
  }
  @scala.inline
  implicit class IPushFrontOps[Self[t] <: IPushFront[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPush_front(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push_front")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

