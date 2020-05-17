package typingsSlinky.typescript.mod

import typingsSlinky.typescript.anon.Done
import typingsSlinky.typescript.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ES6 Iterator type. */
@js.native
trait Iterator[T] extends js.Object {
  def next(): Done[T] | `0` = js.native
}

object Iterator {
  @scala.inline
  def apply[T](next: () => Done[T] | `0`): Iterator[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[Iterator[T]]
  }
  @scala.inline
  implicit class IteratorOps[Self[t] <: Iterator[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withNext(value: () => Done[T] | `0`): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

