package typingsSlinky.tstl.idequeMod

import typingsSlinky.tstl.ipushfrontMod.IPushFront
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeque[T] extends IPushFront[T] {
  /**
    * Erase the first element.
    */
  def pop_front(): Unit = js.native
}

object IDeque {
  @scala.inline
  def apply[T](pop_front: () => Unit, push_front: T => Unit): IDeque[T] = {
    val __obj = js.Dynamic.literal(pop_front = js.Any.fromFunction0(pop_front), push_front = js.Any.fromFunction1(push_front))
    __obj.asInstanceOf[IDeque[T]]
  }
  @scala.inline
  implicit class IDequeOps[Self[t] <: IDeque[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPop_front(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop_front")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

