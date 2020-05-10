package typingsSlinky.yallist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForEachIterable[T] extends js.Object {
  def forEach(callbackFn: js.Function1[/* item */ T, Unit]): Unit = js.native
}

object ForEachIterable {
  @scala.inline
  def apply[T](forEach: js.Function1[/* item */ T, Unit] => Unit): ForEachIterable[T] = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[ForEachIterable[T]]
  }
  @scala.inline
  implicit class ForEachIterableOps[Self[t] <: ForEachIterable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withForEach(value: js.Function1[/* item */ T, Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

