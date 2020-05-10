package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iterator[T] extends js.Object {
  def current(): T = js.native
  def moveNext(): Boolean = js.native
}

object Iterator {
  @scala.inline
  def apply[T](current: () => T, moveNext: () => Boolean): Iterator[T] = {
    val __obj = js.Dynamic.literal(current = js.Any.fromFunction0(current), moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[Iterator[T]]
  }
  @scala.inline
  implicit class IteratorOps[Self[t] <: Iterator[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCurrent(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveNext(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveNext")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

