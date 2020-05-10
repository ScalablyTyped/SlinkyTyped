package typingsSlinky.tsmonad.maybeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaybePatterns[T, U] extends js.Object {
  def just(t: T): U = js.native
  def nothing(): U = js.native
}

object MaybePatterns {
  @scala.inline
  def apply[T, U](just: T => U, nothing: () => U): MaybePatterns[T, U] = {
    val __obj = js.Dynamic.literal(just = js.Any.fromFunction1(just), nothing = js.Any.fromFunction0(nothing))
    __obj.asInstanceOf[MaybePatterns[T, U]]
  }
  @scala.inline
  implicit class MaybePatternsOps[Self[t, u] <: MaybePatterns[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withJust(value: T => U): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("just")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNothing(value: () => U): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nothing")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

