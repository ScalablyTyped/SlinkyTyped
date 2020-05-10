package typingsSlinky.typescriptOptional.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cases[T, U] extends js.Object {
  def empty(): U = js.native
  def present(value: T): U = js.native
}

object Cases {
  @scala.inline
  def apply[T, U](empty: () => U, present: T => U): Cases[T, U] = {
    val __obj = js.Dynamic.literal(empty = js.Any.fromFunction0(empty), present = js.Any.fromFunction1(present))
    __obj.asInstanceOf[Cases[T, U]]
  }
  @scala.inline
  implicit class CasesOps[Self[t, u] <: Cases[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withEmpty(value: () => U): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPresent(value: T => U): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("present")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

