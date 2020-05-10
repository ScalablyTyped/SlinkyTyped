package typingsSlinky.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IEnumerator[T] extends js.Object {
  def get_current(): T = js.native
  def moveNext(): Boolean = js.native
  def reset(): Unit = js.native
}

object IEnumerator {
  @scala.inline
  def apply[T](get_current: () => T, moveNext: () => Boolean, reset: () => Unit): IEnumerator[T] = {
    val __obj = js.Dynamic.literal(get_current = js.Any.fromFunction0(get_current), moveNext = js.Any.fromFunction0(moveNext), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[IEnumerator[T]]
  }
  @scala.inline
  implicit class IEnumeratorOps[Self[t] <: IEnumerator[t], T] (val x: Self[T]) extends AnyVal {
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
    def withReset(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

