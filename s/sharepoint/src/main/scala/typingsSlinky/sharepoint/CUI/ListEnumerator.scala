package typingsSlinky.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEnumerator[T] extends js.Object {
  def get_current(): T = js.native
  def moveNext(): Boolean = js.native
  def movePrevious(): Boolean = js.native
  def reset(): scala.Unit = js.native
}

object ListEnumerator {
  @scala.inline
  def apply[T](
    get_current: () => T,
    moveNext: () => Boolean,
    movePrevious: () => Boolean,
    reset: () => scala.Unit
  ): ListEnumerator[T] = {
    val __obj = js.Dynamic.literal(get_current = js.Any.fromFunction0(get_current), moveNext = js.Any.fromFunction0(moveNext), movePrevious = js.Any.fromFunction0(movePrevious), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[ListEnumerator[T]]
  }
  @scala.inline
  implicit class ListEnumeratorOps[Self[t] <: ListEnumerator[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGet_current(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_current")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveNext(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMovePrevious(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movePrevious")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => scala.Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

