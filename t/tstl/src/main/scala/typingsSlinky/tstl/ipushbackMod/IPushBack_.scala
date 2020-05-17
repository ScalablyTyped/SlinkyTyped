package typingsSlinky.tstl.ipushbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPushBack_[T] extends js.Object {
  /**
    * Insert an element at the end.
    *
    * @param val Value to insert.
    */
  def push_back(`val`: T): Unit = js.native
}

object IPushBack_ {
  @scala.inline
  def apply[T](push_back: T => Unit): IPushBack_[T] = {
    val __obj = js.Dynamic.literal(push_back = js.Any.fromFunction1(push_back))
    __obj.asInstanceOf[IPushBack_[T]]
  }
  @scala.inline
  implicit class IPushBack_Ops[Self[t] <: IPushBack_[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPush_back(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push_back")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

